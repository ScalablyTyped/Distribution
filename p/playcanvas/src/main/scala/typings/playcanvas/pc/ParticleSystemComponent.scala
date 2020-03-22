package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @component
  * @class
  * @name pc.ParticleSystemComponent
  * @augments pc.Component
  * @classdesc Used to simulate particles and produce renderable particle mesh on either CPU or GPU.
  * GPU simulation is generally much faster than its CPU counterpart, because it avoids slow CPU-GPU synchronization and takes advantage of many GPU cores.
  * However, it requires client to support reasonable uniform count, reading from multiple textures in vertex shader and OES_texture_float extension, including rendering into float textures.
  * Most mobile devices fail to satisfy these requirements, so it's not recommended to simulate thousands of particles on them. GPU version also can't sort particles, so enabling sorting forces CPU mode too.
  * Particle rotation is specified by a single angle parameter: default billboard particles rotate around camera facing axis, while mesh particles rotate around 2 different view-independent axes.
  * Most of the simulation parameters are specified with pc.Curve or pc.CurveSet. Curves are interpolated based on each particle's lifetime, therefore parameters are able to change over time.
  * Most of the curve parameters can also be specified by 2 minimum/maximum curves, this way each particle will pick a random value in-between.
  * @description Create a new ParticleSystemComponent.
  * @param {pc.ParticleSystemComponentSystem} system - The ComponentSystem that created this Component.
  * @param {pc.Entity} entity - The Entity this Component is attached to.
  * @property {boolean} autoPlay Controls whether the particle system plays automatically on creation. If set to false, it is necessary to call {@link pc.ParticleSystemComponent#play} for the particle system to play. Defaults to true.
  * @property {boolean} loop Enables or disables respawning of particles.
  * @property {boolean} preWarm If enabled, the particle system will be initialized as though it had already completed a full cycle. This only works with looping particle systems.
  * @property {boolean} lighting If enabled, particles will be lit by ambient and directional lights.
  * @property {boolean} halfLambert Enabling Half Lambert lighting avoids particles looking too flat in shadowed areas. It is a completely non-physical lighting model but can give more pleasing visual results.
  * @property {boolean} alignToMotion Orient particles in their direction of motion.
  * @property {boolean} depthWrite If enabled, the particles will write to the depth buffer. If disabled, the depth buffer is left unchanged and particles will be guaranteed to overwrite one another in the order in which they are rendered.
  * @property {boolean} noFog Disable fogging.
  * @property {boolean} localSpace Binds particles to emitter transformation rather then world space.
  * @property {number} numParticles Maximum number of simulated particles.
  * @property {number} rate Minimal interval in seconds between particle births.
  * @property {number} rate2 Maximal interval in seconds between particle births.
  * @property {number} startAngle Minimal initial Euler angle of a particle.
  * @property {number} startAngle2 Maximal initial Euler angle of a particle.
  * @property {number} lifetime The length of time in seconds between a particle's birth and its death.
  * @property {number} stretch A value in world units that controls the amount by which particles are stretched based on their velocity. Particles are stretched from their center towards their previous position.
  * @property {number} intensity Color multiplier.
  * @property {boolean} animLoop Controls whether the sprite sheet animation plays once or loops continuously.
  * @property {number} animTilesX Number of horizontal tiles in the sprite sheet.
  * @property {number} animTilesY Number of vertical tiles in the sprite sheet.
  * @property {number} animStartFrame The zero based sprite sheet frame that the animation should be played from. The animation will play for animNumFrames frames beyond this. AnimStartFrame + AnimNumFrames should not exceed animTilesX * animTilesY.
  * @property {number} animNumFrames Number of sprite sheet frames to play. It is valid to set the number of frames to a value less than animTilesX multiplied by animTilesY.
  * @property {number} animSpeed Sprite sheet animation speed. 1 = particle lifetime, 2 = twice during lifetime etc...
  * @property {number} depthSoftening Controls fading of particles near their intersections with scene geometry. This effect, when it's non-zero, requires scene depth map to be rendered. Multiple depth-dependent effects can share the same map, but if you only use it for particles, bear in mind that it can double engine draw calls.
  * @property {number} initialVelocity Defines magnitude of the initial emitter velocity. Direction is given by emitter shape.
  * @property {pc.Vec3} emitterExtents (Only for EMITTERSHAPE_BOX) The extents of a local space bounding box within which particles are spawned at random positions.
  * @property {pc.Vec3} emitterExtentsInner (Only for EMITTERSHAPE_BOX) The exception of extents of a local space bounding box within which particles are not spawned. Aligned to the center of EmitterExtents.
  * @property {number} emitterRadius (Only for EMITTERSHAPE_SPHERE) The radius within which particles are spawned at random positions.
  * @property {number} emitterRadiusInner (Only for EMITTERSHAPE_SPHERE) The inner radius within which particles are not spawned.
  * @property {pc.Vec3} wrapBounds The half extents of a world space box volume centered on the owner entity's position. If a particle crosses the boundary of one side of the volume, it teleports to the opposite side.
  * @property {pc.Asset} colorMapAsset The {@link pc.Asset} used to set the colorMap.
  * @property {pc.Asset} normalMapAsset The {@link pc.Asset} used to set the normalMap.
  * @property {pc.Asset} meshAsset The {@link pc.Asset} used to set the mesh.
  * @property {pc.Texture} colorMap The color map texture to apply to all particles in the system. If no texture is assigned, a default spot texture is used.
  * @property {pc.Texture} normalMap The normal map texture to apply to all particles in the system. If no texture is assigned, an approximate spherical normal is calculated for each vertex.
  * @property {number} emitterShape Shape of the emitter. Defines the bounds inside which particles are spawned. Also affects the direction of initial velocity.
  *
  * * {@link pc.EMITTERSHAPE_BOX}: Box shape parameterized by emitterExtents. Initial velocity is directed towards local Z axis.
  * * {@link pc.EMITTERSHAPE_SPHERE}: Sphere shape parameterized by emitterRadius. Initial velocity is directed outwards from the center.
  *
  * @property {number} sort Sorting mode. Forces CPU simulation, so be careful.
  *
  * * {@link pc.PARTICLESORT_NONE}: No sorting, particles are drawn in arbitary order. Can be simulated on GPU.
  * * {@link pc.PARTICLESORT_DISTANCE}: Sorting based on distance to the camera. CPU only.
  * * {@link pc.PARTICLESORT_NEWER_FIRST}: Newer particles are drawn first. CPU only.
  * * {@link pc.PARTICLESORT_OLDER_FIRST}: Older particles are drawn first. CPU only.
  *
  * @property {pc.Mesh} mesh Triangular mesh to be used as a particle. Only first vertex/index buffer is used. Vertex buffer must contain local position at first 3 floats of each vertex.
  * @property {number} blend Controls how particles are blended when being written to the currently active render target.
  * Can be:
  *
  * * {@link pc.BLEND_SUBTRACTIVE}: Subtract the color of the source fragment from the destination fragment and write the result to the frame buffer.
  * * {@link pc.BLEND_ADDITIVE}: Add the color of the source fragment to the destination fragment and write the result to the frame buffer.
  * * {@link pc.BLEND_NORMAL}: Enable simple translucency for materials such as glass. This is equivalent to enabling a source blend mode of pc.BLENDMODE_SRC_ALPHA and a destination blend mode of pc.BLENDMODE_ONE_MINUS_SRC_ALPHA.
  * * {@link pc.BLEND_NONE}: Disable blending.
  * * {@link pc.BLEND_PREMULTIPLIED}: Similar to pc.BLEND_NORMAL expect the source fragment is assumed to have already been multiplied by the source alpha value.
  * * {@link pc.BLEND_MULTIPLICATIVE}: Multiply the color of the source fragment by the color of the destination fragment and write the result to the frame buffer.
  * * {@link pc.BLEND_ADDITIVEALPHA}: Same as pc.BLEND_ADDITIVE except the source RGB is multiplied by the source alpha.
  *
  * @property {number} orientation Sorting mode. Forces CPU simulation, so be careful.
  *
  * * {@link pc.PARTICLEORIENTATION_SCREEN}: Particles are facing camera.
  * * {@link pc.PARTICLEORIENTATION_WORLD}: User defines world space normal (particleNormal) to set planes orientation.
  * * {@link pc.PARTICLEORIENTATION_EMITTER}: Similar to previous, but the normal is affected by emitter(entity) transformation.
  *
  * @property {pc.Vec3} particleNormal (Only for PARTICLEORIENTATION_WORLD and PARTICLEORIENTATION_EMITTER) The exception of extents of a local space bounding box within which particles are not spawned. Aligned to the center of EmitterExtents.
  * @property {pc.CurveSet} localVelocityGraph Velocity relative to emitter over lifetime.
  * @property {pc.CurveSet} localVelocityGraph2 If not null, particles pick random values between localVelocityGraph and localVelocityGraph2.
  * @property {pc.CurveSet} velocityGraph World-space velocity over lifetime.
  * @property {pc.CurveSet} velocityGraph2 If not null, particles pick random values between velocityGraph and velocityGraph2.
  * @property {pc.CurveSet} colorGraph Color over lifetime.
  * @property {pc.Curve} rotationSpeedGraph Rotation speed over lifetime.
  * @property {pc.Curve} rotationSpeedGraph2 If not null, particles pick random values between rotationSpeedGraph and rotationSpeedGraph2.
  * @property {pc.Curve} radialSpeedGraph Radial speed over lifetime, velocity vector points from emitter origin to particle pos.
  * @property {pc.Curve} radialSpeedGraph2 If not null, particles pick random values between radialSpeedGraph and radialSpeedGraph2.
  * @property {pc.Curve} scaleGraph Scale over lifetime.
  * @property {pc.Curve} scaleGraph2 If not null, particles pick random values between scaleGraph and scaleGraph2.
  * @property {pc.Curve} alphaGraph Alpha over lifetime.
  * @property {pc.Curve} alphaGraph2 If not null, particles pick random values between alphaGraph and alphaGraph2.
  * @property {number[]} layers An array of layer IDs ({@link pc.Layer#id}) to which this particle system should belong.
  * Don't push/pop/splice or modify this array, if you want to change it - set a new one instead.
  */
@JSGlobal("pc.ParticleSystemComponent")
@js.native
class ParticleSystemComponent protected () extends Component {
  def this(system: ParticleSystemComponentSystem, entity: Entity) = this()
  /**
    * Orient particles in their direction of motion.
    */
  var alignToMotion: Boolean = js.native
  /**
    * Alpha over lifetime.
    */
  var alphaGraph: Curve = js.native
  /**
    * If not null, particles pick random values between alphaGraph and alphaGraph2.
    */
  var alphaGraph2: Curve = js.native
  /**
    * Controls whether the sprite sheet animation plays once or loops continuously.
    */
  var animLoop: Boolean = js.native
  /**
    * Number of sprite sheet frames to play. It is valid to set the number of frames to a value less than animTilesX multiplied by animTilesY.
    */
  var animNumFrames: Double = js.native
  /**
    * Sprite sheet animation speed. 1 = particle lifetime, 2 = twice during lifetime etc...
    */
  var animSpeed: Double = js.native
  /**
    * The zero based sprite sheet frame that the animation should be played from. The animation will play for animNumFrames frames beyond this. AnimStartFrame + AnimNumFrames should not exceed animTilesX * animTilesY.
    */
  var animStartFrame: Double = js.native
  /**
    * Number of horizontal tiles in the sprite sheet.
    */
  var animTilesX: Double = js.native
  /**
    * Number of vertical tiles in the sprite sheet.
    */
  var animTilesY: Double = js.native
  /**
    * Controls whether the particle system plays automatically on creation. If set to false, it is necessary to call {@link pc.ParticleSystemComponent#play} for the particle system to play. Defaults to true.
    */
  var autoPlay: Boolean = js.native
  /**
    * Controls how particles are blended when being written to the currently active render target.
    * Can be:
    * * {@link pc.BLEND_SUBTRACTIVE}: Subtract the color of the source fragment from the destination fragment and write the result to the frame buffer.
    * * {@link pc.BLEND_ADDITIVE}: Add the color of the source fragment to the destination fragment and write the result to the frame buffer.
    * * {@link pc.BLEND_NORMAL}: Enable simple translucency for materials such as glass. This is equivalent to enabling a source blend mode of pc.BLENDMODE_SRC_ALPHA and a destination blend mode of pc.BLENDMODE_ONE_MINUS_SRC_ALPHA.
    * * {@link pc.BLEND_NONE}: Disable blending.
    * * {@link pc.BLEND_PREMULTIPLIED}: Similar to pc.BLEND_NORMAL expect the source fragment is assumed to have already been multiplied by the source alpha value.
    * * {@link pc.BLEND_MULTIPLICATIVE}: Multiply the color of the source fragment by the color of the destination fragment and write the result to the frame buffer.
    * * {@link pc.BLEND_ADDITIVEALPHA}: Same as pc.BLEND_ADDITIVE except the source RGB is multiplied by the source alpha.
    */
  var blend: Double = js.native
  /**
    * Color over lifetime.
    */
  var colorGraph: CurveSet = js.native
  /**
    * The color map texture to apply to all particles in the system. If no texture is assigned, a default spot texture is used.
    */
  var colorMap: Texture = js.native
  /**
    * The {@link pc.Asset} used to set the colorMap.
    */
  var colorMapAsset: Asset = js.native
  /**
    * Controls fading of particles near their intersections with scene geometry. This effect, when it's non-zero, requires scene depth map to be rendered. Multiple depth-dependent effects can share the same map, but if you only use it for particles, bear in mind that it can double engine draw calls.
    */
  var depthSoftening: Double = js.native
  /**
    * If enabled, the particles will write to the depth buffer. If disabled, the depth buffer is left unchanged and particles will be guaranteed to overwrite one another in the order in which they are rendered.
    */
  var depthWrite: Boolean = js.native
  /**
    * (Only for EMITTERSHAPE_BOX) The extents of a local space bounding box within which particles are spawned at random positions.
    */
  var emitterExtents: Vec3 = js.native
  /**
    * (Only for EMITTERSHAPE_BOX) The exception of extents of a local space bounding box within which particles are not spawned. Aligned to the center of EmitterExtents.
    */
  var emitterExtentsInner: Vec3 = js.native
  /**
    * (Only for EMITTERSHAPE_SPHERE) The radius within which particles are spawned at random positions.
    */
  var emitterRadius: Double = js.native
  /**
    * (Only for EMITTERSHAPE_SPHERE) The inner radius within which particles are not spawned.
    */
  var emitterRadiusInner: Double = js.native
  /**
    * Shape of the emitter. Defines the bounds inside which particles are spawned. Also affects the direction of initial velocity.
    * * {@link pc.EMITTERSHAPE_BOX}: Box shape parameterized by emitterExtents. Initial velocity is directed towards local Z axis.
    * * {@link pc.EMITTERSHAPE_SPHERE}: Sphere shape parameterized by emitterRadius. Initial velocity is directed outwards from the center.
    */
  var emitterShape: Double = js.native
  /**
    * Enabling Half Lambert lighting avoids particles looking too flat in shadowed areas. It is a completely non-physical lighting model but can give more pleasing visual results.
    */
  var halfLambert: Boolean = js.native
  /**
    * Defines magnitude of the initial emitter velocity. Direction is given by emitter shape.
    */
  var initialVelocity: Double = js.native
  /**
    * Color multiplier.
    */
  var intensity: Double = js.native
  /**
    * An array of layer IDs ({@link pc.Layer#id}) to which this particle system should belong.
    * Don't push/pop/splice or modify this array, if you want to change it - set a new one instead.
    */
  var layers: js.Array[Double] = js.native
  /**
    * The length of time in seconds between a particle's birth and its death.
    */
  var lifetime: Double = js.native
  /**
    * If enabled, particles will be lit by ambient and directional lights.
    */
  var lighting: Boolean = js.native
  /**
    * Binds particles to emitter transformation rather then world space.
    */
  var localSpace: Boolean = js.native
  /**
    * Velocity relative to emitter over lifetime.
    */
  var localVelocityGraph: CurveSet = js.native
  /**
    * If not null, particles pick random values between localVelocityGraph and localVelocityGraph2.
    */
  var localVelocityGraph2: CurveSet = js.native
  /**
    * Enables or disables respawning of particles.
    */
  var loop: Boolean = js.native
  /**
    * Triangular mesh to be used as a particle. Only first vertex/index buffer is used. Vertex buffer must contain local position at first 3 floats of each vertex.
    */
  var mesh: Mesh = js.native
  /**
    * The {@link pc.Asset} used to set the mesh.
    */
  var meshAsset: Asset = js.native
  /**
    * Disable fogging.
    */
  var noFog: Boolean = js.native
  /**
    * The normal map texture to apply to all particles in the system. If no texture is assigned, an approximate spherical normal is calculated for each vertex.
    */
  var normalMap: Texture = js.native
  /**
    * The {@link pc.Asset} used to set the normalMap.
    */
  var normalMapAsset: Asset = js.native
  /**
    * Maximum number of simulated particles.
    */
  var numParticles: Double = js.native
  /**
    * Sorting mode. Forces CPU simulation, so be careful.
    * * {@link pc.PARTICLEORIENTATION_SCREEN}: Particles are facing camera.
    * * {@link pc.PARTICLEORIENTATION_WORLD}: User defines world space normal (particleNormal) to set planes orientation.
    * * {@link pc.PARTICLEORIENTATION_EMITTER}: Similar to previous, but the normal is affected by emitter(entity) transformation.
    */
  var orientation: Double = js.native
  /**
    * (Only for PARTICLEORIENTATION_WORLD and PARTICLEORIENTATION_EMITTER) The exception of extents of a local space bounding box within which particles are not spawned. Aligned to the center of EmitterExtents.
    */
  var particleNormal: Vec3 = js.native
  /**
    * If enabled, the particle system will be initialized as though it had already completed a full cycle. This only works with looping particle systems.
    */
  var preWarm: Boolean = js.native
  /**
    * Radial speed over lifetime, velocity vector points from emitter origin to particle pos.
    */
  var radialSpeedGraph: Curve = js.native
  /**
    * If not null, particles pick random values between radialSpeedGraph and radialSpeedGraph2.
    */
  var radialSpeedGraph2: Curve = js.native
  /**
    * Minimal interval in seconds between particle births.
    */
  var rate: Double = js.native
  /**
    * Maximal interval in seconds between particle births.
    */
  var rate2: Double = js.native
  /**
    * Rotation speed over lifetime.
    */
  var rotationSpeedGraph: Curve = js.native
  /**
    * If not null, particles pick random values between rotationSpeedGraph and rotationSpeedGraph2.
    */
  var rotationSpeedGraph2: Curve = js.native
  /**
    * Scale over lifetime.
    */
  var scaleGraph: Curve = js.native
  /**
    * If not null, particles pick random values between scaleGraph and scaleGraph2.
    */
  var scaleGraph2: Curve = js.native
  /**
    * Sorting mode. Forces CPU simulation, so be careful.
    * * {@link pc.PARTICLESORT_NONE}: No sorting, particles are drawn in arbitary order. Can be simulated on GPU.
    * * {@link pc.PARTICLESORT_DISTANCE}: Sorting based on distance to the camera. CPU only.
    * * {@link pc.PARTICLESORT_NEWER_FIRST}: Newer particles are drawn first. CPU only.
    * * {@link pc.PARTICLESORT_OLDER_FIRST}: Older particles are drawn first. CPU only.
    */
  var sort: Double = js.native
  /**
    * Minimal initial Euler angle of a particle.
    */
  var startAngle: Double = js.native
  /**
    * Maximal initial Euler angle of a particle.
    */
  var startAngle2: Double = js.native
  /**
    * A value in world units that controls the amount by which particles are stretched based on their velocity. Particles are stretched from their center towards their previous position.
    */
  var stretch: Double = js.native
  /**
    * World-space velocity over lifetime.
    */
  var velocityGraph: CurveSet = js.native
  /**
    * If not null, particles pick random values between velocityGraph and velocityGraph2.
    */
  var velocityGraph2: CurveSet = js.native
  /**
    * The half extents of a world space box volume centered on the owner entity's position. If a particle crosses the boundary of one side of the volume, it teleports to the opposite side.
    */
  var wrapBounds: Vec3 = js.native
  /**
    * @function
    * @name pc.ParticleSystemComponent#isPlaying
    * @description Checks if simulation is in progress.
    * @returns {boolean} True if the particle system is currently playing and false otherwise.
    */
  def isPlaying(): Boolean = js.native
  /**
    * @function
    * @name pc.ParticleSystemComponent#pause
    * @description Freezes the simulation.
    */
  def pause(): Unit = js.native
  /**
    * @function
    * @name pc.ParticleSystemComponent#play
    * @description Enables/unfreezes the simulation.
    */
  def play(): Unit = js.native
  /**
    * @function
    * @name pc.ParticleSystemComponent#reset
    * @description Resets particle state, doesn't affect playing.
    */
  def reset(): Unit = js.native
  /**
    * @function
    * @name pc.ParticleSystemComponent#stop
    * @description Disables the emission of new particles, lets existing to finish their simulation.
    */
  def stop(): Unit = js.native
  /**
    * @function
    * @name pc.ParticleSystemComponent#unpause
    * @description Unfreezes the simulation.
    */
  def unpause(): Unit = js.native
}


package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used to simulate particles and produce renderable particle mesh on either CPU or GPU. GPU
  * simulation is generally much faster than its CPU counterpart, because it avoids slow CPU-GPU
  * synchronization and takes advantage of many GPU cores. However, it requires client to support
  * reasonable uniform count, reading from multiple textures in vertex shader and OES_texture_float
  * extension, including rendering into float textures. Most mobile devices fail to satisfy these
  * requirements, so it's not recommended to simulate thousands of particles on them. GPU version
  * also can't sort particles, so enabling sorting forces CPU mode too. Particle rotation is
  * specified by a single angle parameter: default billboard particles rotate around camera facing
  * axis, while mesh particles rotate around 2 different view-independent axes. Most of the
  * simulation parameters are specified with {@link Curve} or {@link CurveSet}. Curves are
  * interpolated based on each particle's lifetime, therefore parameters are able to change over
  * time. Most of the curve parameters can also be specified by 2 minimum/maximum curves, this way
  * each particle will pick a random value in-between.
  *
  * @property {boolean} autoPlay Controls whether the particle system plays automatically on
  * creation. If set to false, it is necessary to call {@link ParticleSystemComponent#play} for the
  * particle system to play. Defaults to true.
  * @property {boolean} loop Enables or disables respawning of particles.
  * @property {boolean} preWarm If enabled, the particle system will be initialized as though it had
  * already completed a full cycle. This only works with looping particle systems.
  * @property {boolean} lighting If enabled, particles will be lit by ambient and directional
  * lights.
  * @property {boolean} halfLambert Enabling Half Lambert lighting avoids particles looking too flat
  * in shadowed areas. It is a completely non-physical lighting model but can give more pleasing
  * visual results.
  * @property {boolean} alignToMotion Orient particles in their direction of motion.
  * @property {boolean} depthWrite If enabled, the particles will write to the depth buffer. If
  * disabled, the depth buffer is left unchanged and particles will be guaranteed to overwrite one
  * another in the order in which they are rendered.
  * @property {boolean} noFog Disable fogging.
  * @property {boolean} localSpace Binds particles to emitter transformation rather then world
  * space.
  * @property {boolean} screenSpace Renders particles in 2D screen space. This needs to be set when
  * particle system is part of hierarchy with {@link ScreenComponent} as its ancestor, and allows
  * particle system to integrate with the rendering of {@link ElementComponent}s. Note that an
  * entity with ParticleSystem component cannot be parented directly to {@link ScreenComponent}, but
  * has to be a child of a {@link ElementComponent}, for example {@link LayoutGroupComponent}.
  * @property {number} numParticles Maximum number of simulated particles.
  * @property {number} rate Minimal interval in seconds between particle births.
  * @property {number} rate2 Maximal interval in seconds between particle births.
  * @property {number} startAngle Minimal initial Euler angle of a particle.
  * @property {number} startAngle2 Maximal initial Euler angle of a particle.
  * @property {number} lifetime The length of time in seconds between a particle's birth and its
  * death.
  * @property {number} stretch A value in world units that controls the amount by which particles
  * are stretched based on their velocity. Particles are stretched from their center towards their
  * previous position.
  * @property {number} intensity Color multiplier.
  * @property {boolean} animLoop Controls whether the sprite sheet animation plays once or loops
  * continuously.
  * @property {number} animTilesX Number of horizontal tiles in the sprite sheet.
  * @property {number} animTilesY Number of vertical tiles in the sprite sheet.
  * @property {number} animNumAnimations Number of sprite sheet animations contained within the
  * current sprite sheet. The number of animations multiplied by number of frames should be a value
  * less than animTilesX multiplied by animTilesY.
  * @property {number} animNumFrames Number of sprite sheet frames in the current sprite sheet
  * animation. The number of animations multiplied by number of frames should be a value less than
  * animTilesX multiplied by animTilesY.
  * @property {number} animStartFrame The sprite sheet frame that the animation should begin playing
  * from. Indexed from the start of the current animation.
  * @property {number} animIndex When animNumAnimations is greater than 1, the sprite sheet
  * animation index determines which animation the particle system should play.
  * @property {number} randomizeAnimIndex Each particle emitted by the system will play a random
  * animation from the sprite sheet, up to animNumAnimations.
  * @property {number} animSpeed Sprite sheet animation speed. 1 = particle lifetime, 2 = twice
  * during lifetime etc...
  * @property {number} depthSoftening Controls fading of particles near their intersections with
  * scene geometry. This effect, when it's non-zero, requires scene depth map to be rendered.
  * Multiple depth-dependent effects can share the same map, but if you only use it for particles,
  * bear in mind that it can double engine draw calls.
  * @property {number} initialVelocity Defines magnitude of the initial emitter velocity. Direction
  * is given by emitter shape.
  * @property {import('../../../core/math/vec3.js').Vec3} emitterExtents (Only for EMITTERSHAPE_BOX)
  * The extents of a local space bounding box within which particles are spawned at random positions.
  * @property {import('../../../core/math/vec3.js').Vec3} emitterExtentsInner (Only for
  * EMITTERSHAPE_BOX) The exception of extents of a local space bounding box within which particles
  * are not spawned. Aligned to the center of EmitterExtents.
  * @property {number} emitterRadius (Only for EMITTERSHAPE_SPHERE) The radius within which
  * particles are spawned at random positions.
  * @property {number} emitterRadiusInner (Only for EMITTERSHAPE_SPHERE) The inner radius within
  * which particles are not spawned.
  * @property {import('../../../core/math/vec3.js').Vec3} wrapBounds The half extents of a world
  * space box volume centered on the owner entity's position. If a particle crosses the boundary of
  * one side of the volume, it teleports to the opposite side.
  * @property {Asset} colorMapAsset The {@link Asset} used to set the colorMap.
  * @property {Asset} normalMapAsset The {@link Asset} used to set the normalMap.
  * @property {Asset} meshAsset The {@link Asset} used to set the mesh.
  * @property {Asset} renderAsset The Render {@link Asset} used to set the mesh.
  * @property {Texture} colorMap The color map texture to apply to all particles in the system. If
  * no texture is assigned, a default spot texture is used.
  * @property {Texture} normalMap The normal map texture to apply to all particles in the system. If
  * no texture is assigned, an approximate spherical normal is calculated for each vertex.
  * @property {number} emitterShape Shape of the emitter. Defines the bounds inside which particles
  * are spawned. Also affects the direction of initial velocity.
  *
  * - {@link EMITTERSHAPE_BOX}: Box shape parameterized by emitterExtents. Initial velocity is
  * directed towards local Z axis.
  * - {@link EMITTERSHAPE_SPHERE}: Sphere shape parameterized by emitterRadius. Initial velocity is
  * directed outwards from the center.
  *
  * @property {number} sort Sorting mode. Forces CPU simulation, so be careful.
  *
  * - {@link PARTICLESORT_NONE}: No sorting, particles are drawn in arbitrary order. Can be
  * simulated on GPU.
  * - {@link PARTICLESORT_DISTANCE}: Sorting based on distance to the camera. CPU only.
  * - {@link PARTICLESORT_NEWER_FIRST}: Newer particles are drawn first. CPU only.
  * - {@link PARTICLESORT_OLDER_FIRST}: Older particles are drawn first. CPU only.
  *
  * @property {Mesh} mesh Triangular mesh to be used as a particle. Only first vertex/index buffer
  * is used. Vertex buffer must contain local position at first 3 floats of each vertex.
  * @property {number} blendType Controls how particles are blended when being written to the currently
  * active render target. Can be:
  *
  * - {@link BLEND_SUBTRACTIVE}: Subtract the color of the source fragment from the destination
  * fragment and write the result to the frame buffer.
  * - {@link BLEND_ADDITIVE}: Add the color of the source fragment to the destination fragment and
  * write the result to the frame buffer.
  * - {@link BLEND_NORMAL}: Enable simple translucency for materials such as glass. This is
  * equivalent to enabling a source blend mode of {@link BLENDMODE_SRC_ALPHA} and a destination
  * blend mode of {@link BLENDMODE_ONE_MINUS_SRC_ALPHA}.
  * - {@link BLEND_NONE}: Disable blending.
  * - {@link BLEND_PREMULTIPLIED}: Similar to {@link BLEND_NORMAL} expect the source fragment is
  * assumed to have already been multiplied by the source alpha value.
  * - {@link BLEND_MULTIPLICATIVE}: Multiply the color of the source fragment by the color of the
  * destination fragment and write the result to the frame buffer.
  * - {@link BLEND_ADDITIVEALPHA}: Same as {@link BLEND_ADDITIVE} except the source RGB is
  * multiplied by the source alpha.
  *
  * @property {number} orientation Sorting mode. Forces CPU simulation, so be careful.
  *
  * - {@link PARTICLEORIENTATION_SCREEN}: Particles are facing camera.
  * - {@link PARTICLEORIENTATION_WORLD}: User defines world space normal (particleNormal) to set
  * planes orientation.
  * - {@link PARTICLEORIENTATION_EMITTER}: Similar to previous, but the normal is affected by
  * emitter (entity) transformation.
  *
  * @property {import('../../../core/math/vec3.js').Vec3} particleNormal (Only for
  * PARTICLEORIENTATION_WORLD and PARTICLEORIENTATION_EMITTER) The exception of extents of a local
  * space bounding box within which particles are not spawned. Aligned to the center of
  * EmitterExtents.
  * @property {import('../../../core/math/curve-set.js').CurveSet} localVelocityGraph Velocity
  * relative to emitter over lifetime.
  * @property {import('../../../core/math/curve-set.js').CurveSet} localVelocityGraph2 If not null,
  * particles pick random values between localVelocityGraph and localVelocityGraph2.
  * @property {import('../../../core/math/curve-set.js').CurveSet} velocityGraph World-space
  * velocity over lifetime.
  * @property {import('../../../core/math/curve-set.js').CurveSet} velocityGraph2 If not null,
  * particles pick random values between velocityGraph and velocityGraph2.
  * @property {import('../../../core/math/curve-set.js').CurveSet} colorGraph Color over lifetime.
  * @property {import('../../../core/math/curve.js').Curve} rotationSpeedGraph Rotation speed over
  * lifetime.
  * @property {import('../../../core/math/curve.js').Curve} rotationSpeedGraph2 If not null,
  * particles pick random values between rotationSpeedGraph and rotationSpeedGraph2.
  * @property {import('../../../core/math/curve.js').Curve} radialSpeedGraph Radial speed over
  * lifetime, velocity vector points from emitter origin to particle pos.
  * @property {import('../../../core/math/curve.js').Curve} radialSpeedGraph2 If not null, particles
  * pick random values between radialSpeedGraph and radialSpeedGraph2.
  * @property {import('../../../core/math/curve.js').Curve} scaleGraph Scale over lifetime.
  * @property {import('../../../core/math/curve.js').Curve} scaleGraph2 If not null, particles pick
  * random values between scaleGraph and scaleGraph2.
  * @property {import('../../../core/math/curve.js').Curve} alphaGraph Alpha over lifetime.
  * @property {import('../../../core/math/curve.js').Curve} alphaGraph2 If not null, particles pick
  * random values between alphaGraph and alphaGraph2.
  * @property {number[]} layers An array of layer IDs ({@link Layer#id}) to which this particle
  * system should belong. Don't push/pop/splice or modify this array, if you want to change it - set
  * a new one instead.
  * @augments Component
  */
@JSImport("playcanvas", "ParticleSystemComponent")
@js.native
open class ParticleSystemComponent protected () extends Component {
  /**
    * Create a new ParticleSystemComponent.
    *
    * @param {import('./system.js').ParticleSystemComponentSystem} system - The ComponentSystem
    * that created this Component.
    * @param {import('../../entity.js').Entity} entity - The Entity this Component is attached to.
    */
  def this(system: ParticleSystemComponentSystem, entity: Entity) = this()
  
  def _bindColorMapAsset(asset: Any): Unit = js.native
  
  def _bindMeshAsset(asset: Any): Unit = js.native
  
  def _bindNormalMapAsset(asset: Any): Unit = js.native
  
  def _bindRenderAsset(asset: Any): Unit = js.native
  
  /** @private */
  /* private */ var _drawOrder: Any = js.native
  
  def _onColorMapAssetChange(asset: Any): Unit = js.native
  
  def _onColorMapAssetLoad(asset: Any): Unit = js.native
  
  def _onColorMapAssetRemove(asset: Any): Unit = js.native
  
  def _onColorMapAssetUnload(asset: Any): Unit = js.native
  
  def _onMeshAssetChange(asset: Any): Unit = js.native
  
  def _onMeshAssetLoad(asset: Any): Unit = js.native
  
  def _onMeshAssetRemove(asset: Any): Unit = js.native
  
  def _onMeshAssetUnload(asset: Any): Unit = js.native
  
  def _onMeshChanged(mesh: Any): Unit = js.native
  
  def _onNormalMapAssetChange(asset: Any): Unit = js.native
  
  def _onNormalMapAssetLoad(asset: Any): Unit = js.native
  
  def _onNormalMapAssetRemove(asset: Any): Unit = js.native
  
  def _onNormalMapAssetUnload(asset: Any): Unit = js.native
  
  def _onRenderAssetLoad(asset: Any): Unit = js.native
  
  def _onRenderAssetRemove(asset: Any): Unit = js.native
  
  def _onRenderAssetUnload(asset: Any): Unit = js.native
  
  def _onRenderChanged(render: Any): Unit = js.native
  
  def _onRenderSetMeshes(meshes: Any): Unit = js.native
  
  def _releaseDepth(): Unit = js.native
  
  def _requestDepth(): Unit = js.native
  
  /** @private */
  /* private */ var _requestedDepth: Any = js.native
  
  def _unbindColorMapAsset(asset: Any): Unit = js.native
  
  def _unbindMeshAsset(asset: Any): Unit = js.native
  
  def _unbindNormalMapAsset(asset: Any): Unit = js.native
  
  def _unbindRenderAsset(asset: Any): Unit = js.native
  
  def addMeshInstanceToLayers(): Unit = js.native
  
  def alignToMotion: Boolean = js.native
  def alignToMotion_=(arg: Boolean): Unit = js.native
  
  def alphaGraph: Curve = js.native
  
  def alphaGraph2: Curve = js.native
  def alphaGraph2_=(arg: Curve): Unit = js.native
  
  def alphaGraph_=(arg: Curve): Unit = js.native
  
  def animIndex: Double = js.native
  def animIndex_=(arg: Double): Unit = js.native
  
  def animLoop: Boolean = js.native
  def animLoop_=(arg: Boolean): Unit = js.native
  
  def animNumAnimations: Double = js.native
  def animNumAnimations_=(arg: Double): Unit = js.native
  
  def animNumFrames: Double = js.native
  def animNumFrames_=(arg: Double): Unit = js.native
  
  def animSpeed: Double = js.native
  def animSpeed_=(arg: Double): Unit = js.native
  
  def animStartFrame: Double = js.native
  def animStartFrame_=(arg: Double): Unit = js.native
  
  def animTilesX: Double = js.native
  def animTilesX_=(arg: Double): Unit = js.native
  
  def animTilesY: Double = js.native
  def animTilesY_=(arg: Double): Unit = js.native
  
  def autoPlay: Boolean = js.native
  def autoPlay_=(arg: Boolean): Unit = js.native
  
  def blend: Double = js.native
  def blend_=(arg: Double): Unit = js.native
  
  def colorGraph: CurveSet = js.native
  def colorGraph_=(arg: CurveSet): Unit = js.native
  
  var colorMap: Any = js.native
  
  def colorMapAsset: Asset_ = js.native
  def colorMapAsset_=(arg: Asset_): Unit = js.native
  
  def depthSoftening: Double = js.native
  def depthSoftening_=(arg: Double): Unit = js.native
  
  def depthWrite: Boolean = js.native
  def depthWrite_=(arg: Boolean): Unit = js.native
  
  def drawOrder: Double = js.native
  def drawOrder_=(arg: Double): Unit = js.native
  
  var emitter: ParticleEmitter = js.native
  
  def emitterExtents: Vec3 = js.native
  
  def emitterExtentsInner: Vec3 = js.native
  def emitterExtentsInner_=(arg: Vec3): Unit = js.native
  
  def emitterExtents_=(arg: Vec3): Unit = js.native
  
  def emitterRadius: Double = js.native
  
  def emitterRadiusInner: Double = js.native
  def emitterRadiusInner_=(arg: Double): Unit = js.native
  
  def emitterRadius_=(arg: Double): Unit = js.native
  
  def emitterShape: Double = js.native
  def emitterShape_=(arg: Double): Unit = js.native
  
  def halfLambert: Boolean = js.native
  def halfLambert_=(arg: Boolean): Unit = js.native
  
  def initialVelocity: Double = js.native
  def initialVelocity_=(arg: Double): Unit = js.native
  
  def intensity: Double = js.native
  def intensity_=(arg: Double): Unit = js.native
  
  /**
    * Checks if simulation is in progress.
    *
    * @returns {boolean} True if the particle system is currently playing and false otherwise.
    */
  def isPlaying(): Boolean = js.native
  
  def layers: js.Array[Double] = js.native
  def layers_=(arg: js.Array[Double]): Unit = js.native
  
  def lifetime: Double = js.native
  def lifetime_=(arg: Double): Unit = js.native
  
  def lighting: Boolean = js.native
  def lighting_=(arg: Boolean): Unit = js.native
  
  def localSpace: Boolean = js.native
  def localSpace_=(arg: Boolean): Unit = js.native
  
  def localVelocityGraph: CurveSet = js.native
  
  def localVelocityGraph2: CurveSet = js.native
  def localVelocityGraph2_=(arg: CurveSet): Unit = js.native
  
  def localVelocityGraph_=(arg: CurveSet): Unit = js.native
  
  def loop: Boolean = js.native
  def loop_=(arg: Boolean): Unit = js.native
  
  var mesh: Any = js.native
  
  var meshAsset: Any = js.native
  
  def noFog: Boolean = js.native
  def noFog_=(arg: Boolean): Unit = js.native
  
  var normalMap: Any = js.native
  
  def normalMapAsset: Asset_ = js.native
  def normalMapAsset_=(arg: Asset_): Unit = js.native
  
  def numParticles: Double = js.native
  def numParticles_=(arg: Double): Unit = js.native
  
  def onBeforeRemove(): Unit = js.native
  
  def onLayerAdded(layer: Any): Unit = js.native
  
  def onLayerRemoved(layer: Any): Unit = js.native
  
  def onLayersChanged(oldComp: Any, newComp: Any): Unit = js.native
  
  def onSetBlendType(name: Any, oldValue: Any, newValue: Any): Unit = js.native
  
  def onSetColorMapAsset(name: Any, oldValue: Any, newValue: Any): Unit = js.native
  
  def onSetComplexProperty(name: Any, oldValue: Any, newValue: Any): Unit = js.native
  
  def onSetDepthSoftening(name: Any, oldValue: Any, newValue: Any): Unit = js.native
  
  def onSetGraphProperty(name: Any, oldValue: Any, newValue: Any): Unit = js.native
  
  def onSetLayers(name: Any, oldValue: Any, newValue: Any): Unit = js.native
  
  def onSetLoop(name: Any, oldValue: Any, newValue: Any): Unit = js.native
  
  def onSetMesh(name: Any, oldValue: Any, newValue: Any): Unit = js.native
  
  def onSetMeshAsset(name: Any, oldValue: Any, newValue: Any): Unit = js.native
  
  def onSetNormalMapAsset(name: Any, oldValue: Any, newValue: Any): Unit = js.native
  
  def onSetRenderAsset(name: Any, oldValue: Any, newValue: Any): Unit = js.native
  
  def onSetSimpleProperty(name: Any, oldValue: Any, newValue: Any): Unit = js.native
  
  def orientation: Double = js.native
  def orientation_=(arg: Double): Unit = js.native
  
  def particleNormal: Vec3 = js.native
  def particleNormal_=(arg: Vec3): Unit = js.native
  
  /**
    * Freezes the simulation.
    */
  def pause(): Unit = js.native
  
  /**
    * Enables/unfreezes the simulation.
    */
  def play(): Unit = js.native
  
  def preWarm: Boolean = js.native
  def preWarm_=(arg: Boolean): Unit = js.native
  
  def radialSpeedGraph: Curve = js.native
  
  def radialSpeedGraph2: Curve = js.native
  def radialSpeedGraph2_=(arg: Curve): Unit = js.native
  
  def radialSpeedGraph_=(arg: Curve): Unit = js.native
  
  def randomizeAnimIndex: Double = js.native
  def randomizeAnimIndex_=(arg: Double): Unit = js.native
  
  def rate: Double = js.native
  
  def rate2: Double = js.native
  def rate2_=(arg: Double): Unit = js.native
  
  def rate_=(arg: Double): Unit = js.native
  
  /**
    * Rebuilds all data used by this particle system.
    *
    * @private
    */
  /* private */ var rebuild: Any = js.native
  
  def removeMeshInstanceFromLayers(): Unit = js.native
  
  def renderAsset: Asset_ = js.native
  def renderAsset_=(arg: Asset_): Unit = js.native
  
  /**
    * Resets particle state, doesn't affect playing.
    */
  def reset(): Unit = js.native
  
  def rotationSpeedGraph: Curve = js.native
  
  def rotationSpeedGraph2: Curve = js.native
  def rotationSpeedGraph2_=(arg: Curve): Unit = js.native
  
  def rotationSpeedGraph_=(arg: Curve): Unit = js.native
  
  def scaleGraph: Curve = js.native
  
  def scaleGraph2: Curve = js.native
  def scaleGraph2_=(arg: Curve): Unit = js.native
  
  def scaleGraph_=(arg: Curve): Unit = js.native
  
  def screenSpace: Boolean = js.native
  def screenSpace_=(arg: Boolean): Unit = js.native
  
  def sort: Double = js.native
  def sort_=(arg: Double): Unit = js.native
  
  def startAngle: Double = js.native
  
  def startAngle2: Double = js.native
  def startAngle2_=(arg: Double): Unit = js.native
  
  def startAngle_=(arg: Double): Unit = js.native
  
  /**
    * Disables the emission of new particles, lets existing to finish their simulation.
    */
  def stop(): Unit = js.native
  
  def stretch: Double = js.native
  def stretch_=(arg: Double): Unit = js.native
  
  /**
    * Unfreezes the simulation.
    */
  def unpause(): Unit = js.native
  
  def velocityGraph: CurveSet = js.native
  
  def velocityGraph2: CurveSet = js.native
  def velocityGraph2_=(arg: CurveSet): Unit = js.native
  
  def velocityGraph_=(arg: CurveSet): Unit = js.native
  
  def wrapBounds: Vec3 = js.native
  def wrapBounds_=(arg: Vec3): Unit = js.native
}

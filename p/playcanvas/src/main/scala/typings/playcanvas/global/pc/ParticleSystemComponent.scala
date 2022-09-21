package typings.playcanvas.global.pc

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
  * @property {Vec3} emitterExtents (Only for EMITTERSHAPE_BOX) The extents of a local space
  * bounding box within which particles are spawned at random positions.
  * @property {Vec3} emitterExtentsInner (Only for EMITTERSHAPE_BOX) The exception of extents of a
  * local space bounding box within which particles are not spawned. Aligned to the center of
  * EmitterExtents.
  * @property {number} emitterRadius (Only for EMITTERSHAPE_SPHERE) The radius within which
  * particles are spawned at random positions.
  * @property {number} emitterRadiusInner (Only for EMITTERSHAPE_SPHERE) The inner radius within
  * which particles are not spawned.
  * @property {Vec3} wrapBounds The half extents of a world space box volume centered on the owner
  * entity's position. If a particle crosses the boundary of one side of the volume, it teleports to
  * the opposite side.
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
  * @property {number} blend Controls how particles are blended when being written to the currently
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
  * @property {Vec3} particleNormal (Only for PARTICLEORIENTATION_WORLD and
  * PARTICLEORIENTATION_EMITTER) The exception of extents of a local space bounding box within which
  * particles are not spawned. Aligned to the center of EmitterExtents.
  * @property {CurveSet} localVelocityGraph Velocity relative to emitter over lifetime.
  * @property {CurveSet} localVelocityGraph2 If not null, particles pick random values between
  * localVelocityGraph and localVelocityGraph2.
  * @property {CurveSet} velocityGraph World-space velocity over lifetime.
  * @property {CurveSet} velocityGraph2 If not null, particles pick random values between
  * velocityGraph and velocityGraph2.
  * @property {CurveSet} colorGraph Color over lifetime.
  * @property {Curve} rotationSpeedGraph Rotation speed over lifetime.
  * @property {Curve} rotationSpeedGraph2 If not null, particles pick random values between
  * rotationSpeedGraph and rotationSpeedGraph2.
  * @property {Curve} radialSpeedGraph Radial speed over lifetime, velocity vector points from
  * emitter origin to particle pos.
  * @property {Curve} radialSpeedGraph2 If not null, particles pick random values between
  * radialSpeedGraph and radialSpeedGraph2.
  * @property {Curve} scaleGraph Scale over lifetime.
  * @property {Curve} scaleGraph2 If not null, particles pick random values between scaleGraph and
  * scaleGraph2.
  * @property {Curve} alphaGraph Alpha over lifetime.
  * @property {Curve} alphaGraph2 If not null, particles pick random values between alphaGraph and
  * alphaGraph2.
  * @property {number[]} layers An array of layer IDs ({@link Layer#id}) to which this particle
  * system should belong. Don't push/pop/splice or modify this array, if you want to change it - set
  * a new one instead.
  * @augments Component
  */
@JSGlobal("pc.ParticleSystemComponent")
@js.native
open class ParticleSystemComponent protected ()
  extends typings.playcanvas.mod.ParticleSystemComponent {
  /**
    * Create a new ParticleSystemComponent.
    *
    * @param {ParticleSystemComponentSystem} system - The ComponentSystem that created this
    * Component.
    * @param {Entity} entity - The Entity this Component is attached to.
    */
  def this(
    system: typings.playcanvas.mod.ParticleSystemComponentSystem,
    entity: typings.playcanvas.mod.Entity
  ) = this()
}

package typings.phaser.Phaser.Types.GameObjects.Particles

import typings.phaser.Phaser.GameObjects.Particles.Particle
import typings.phaser.Phaser.GameObjects.Particles.ParticleEmitter
import typings.phaser.Phaser.Types.Math.Vector2Like
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type DeathZoneSourceCallback = js.Function2[/* x */ Double, /* y */ Double, Boolean]

type EdgeZoneSourceCallback = js.Function2[/* quantity */ Double, /* stepRate */ js.UndefOr[Double], js.Array[Vector2Like]]

/**
  * The returned value sets what the property will be at the START of the particle's life, on emit.
  */
type EmitterOpOnEmitCallback = js.Function3[/* particle */ Particle, /* key */ String, /* value */ Double, Double]

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - js.Array[scala.Double]
  - typings.phaser.Phaser.Types.GameObjects.Particles.EmitterOpOnEmitCallback
  - typings.phaser.Phaser.Types.GameObjects.Particles.EmitterOpRandomConfig
  - typings.phaser.Phaser.Types.GameObjects.Particles.EmitterOpRandomMinMaxConfig
  - typings.phaser.Phaser.Types.GameObjects.Particles.EmitterOpRandomStartEndConfig
  - typings.phaser.Phaser.Types.GameObjects.Particles.EmitterOpSteppedConfig
  - typings.phaser.Phaser.Types.GameObjects.Particles.EmitterOpCustomEmitConfig
*/
type EmitterOpOnEmitType = _EmitterOpOnEmitType | js.Array[Double] | Double | EmitterOpOnEmitCallback

/**
  * The returned value updates the property for the duration of the particle's life.
  */
type EmitterOpOnUpdateCallback = js.Function4[/* particle */ Particle, /* key */ String, /* t */ Double, /* value */ Double, Double]

/* Rewritten from type alias, can be one of: 
  - typings.phaser.Phaser.Types.GameObjects.Particles.EmitterOpOnUpdateCallback
  - typings.phaser.Phaser.Types.GameObjects.Particles.EmitterOpEaseConfig
  - typings.phaser.Phaser.Types.GameObjects.Particles.EmitterOpCustomUpdateConfig
  - typings.phaser.Phaser.Types.GameObjects.Particles.EmitterOpInterpolationConfig
*/
type EmitterOpOnUpdateType = _EmitterOpOnUpdateType | EmitterOpOnUpdateCallback

type ParticleClassConstructor = js.Function1[/* emitter */ ParticleEmitter, Unit]

type ParticleDeathCallback = js.Function1[/* particle */ Particle, Unit]

type ParticleEmitterCallback = js.Function2[/* particle */ Particle, /* emitter */ ParticleEmitter, Unit]

type ParticleSortCallback = js.Function2[/* a */ Particle, /* b */ Particle, Unit]

type RandomZoneSourceCallback = js.Function1[/* point */ Vector2Like, Unit]

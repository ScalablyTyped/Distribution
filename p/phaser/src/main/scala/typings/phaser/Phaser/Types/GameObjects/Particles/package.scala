package typings.phaser.Phaser.Types.GameObjects

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Particles {
  import typings.phaser.Phaser.GameObjects.Particles.Particle
  import typings.phaser.Phaser.GameObjects.Particles.ParticleEmitter
  import typings.phaser.Phaser.Math.Vector2
  import typings.phaser.integer

  type DeathZoneSourceCallback = js.Function2[/* x */ Double, /* y */ Double, Unit]
  type EdgeZoneSourceCallback = js.Function2[/* quantity */ integer, /* stepRate */ js.UndefOr[Double], Unit]
  /**
    * The returned value sets what the property will be at the START of the particle's life, on emit.
    */
  type EmitterOpOnEmitCallback = js.Function3[/* particle */ Particle, /* key */ String, /* value */ Double, Unit]
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
  type EmitterOpOnUpdateCallback = js.Function4[/* particle */ Particle, /* key */ String, /* t */ Double, /* value */ Double, Unit]
  /* Rewritten from type alias, can be one of: 
    - typings.phaser.Phaser.Types.GameObjects.Particles.EmitterOpOnUpdateCallback
    - typings.phaser.Phaser.Types.GameObjects.Particles.EmitterOpEaseConfig
    - typings.phaser.Phaser.Types.GameObjects.Particles.EmitterOpCustomUpdateConfig
  */
  type EmitterOpOnUpdateType = _EmitterOpOnUpdateType | EmitterOpOnUpdateCallback
  type ParticleDeathCallback = js.Function1[/* particle */ Particle, Unit]
  type ParticleEmitterCallback = js.Function2[/* particle */ Particle, /* emitter */ ParticleEmitter, Unit]
  type RandomZoneSourceCallback = js.Function1[/* point */ Vector2, Unit]
}

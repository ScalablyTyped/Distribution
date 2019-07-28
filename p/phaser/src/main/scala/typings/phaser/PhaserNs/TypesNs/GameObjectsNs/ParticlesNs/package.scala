package typings.phaser.PhaserNs.TypesNs.GameObjectsNs

import typings.phaser.PhaserNs.GameObjectsNs.ParticlesNs.Particle
import typings.phaser.PhaserNs.GameObjectsNs.ParticlesNs.ParticleEmitter
import typings.phaser.PhaserNs.MathNs.Vector2
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ParticlesNs {
  type DeathZoneSourceCallback = js.Function2[/* x */ Double, /* y */ Double, Unit]
  type EdgeZoneSourceCallback = js.Function2[/* quantity */ integer, /* stepRate */ js.UndefOr[Double], Unit]
  /**
    * The returned value sets what the property will be at the START of the particle's life, on emit.
    */
  type EmitterOpOnEmitCallback = js.Function3[/* particle */ Particle, /* key */ String, /* value */ Double, Unit]
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - js.Array[scala.Double]
    - typings.phaser.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.EmitterOpOnEmitCallback
    - typings.phaser.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.EmitterOpRandomConfig
    - typings.phaser.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.EmitterOpRandomMinMaxConfig
    - typings.phaser.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.EmitterOpRandomStartEndConfig
    - typings.phaser.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.EmitterOpSteppedConfig
    - typings.phaser.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.EmitterOpCustomEmitConfig
  */
  type EmitterOpOnEmitType = _EmitterOpOnEmitType | js.Array[Double] | Double | EmitterOpOnEmitCallback
  /**
    * The returned value updates the property for the duration of the particle's life.
    */
  type EmitterOpOnUpdateCallback = js.Function4[/* particle */ Particle, /* key */ String, /* t */ Double, /* value */ Double, Unit]
  /* Rewritten from type alias, can be one of: 
    - typings.phaser.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.EmitterOpOnUpdateCallback
    - typings.phaser.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.EmitterOpEaseConfig
    - typings.phaser.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.EmitterOpCustomUpdateConfig
  */
  type EmitterOpOnUpdateType = _EmitterOpOnUpdateType | EmitterOpOnUpdateCallback
  type ParticleDeathCallback = js.Function1[/* particle */ Particle, Unit]
  type ParticleEmitterCallback = js.Function2[/* particle */ Particle, /* emitter */ ParticleEmitter, Unit]
  type RandomZoneSourceCallback = js.Function1[/* point */ Vector2, Unit]
}

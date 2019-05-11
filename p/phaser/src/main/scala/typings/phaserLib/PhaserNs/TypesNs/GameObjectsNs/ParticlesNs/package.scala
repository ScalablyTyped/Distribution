package typings
package phaserLib.PhaserNs.TypesNs.GameObjectsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ParticlesNs {
  type DeathZoneSourceCallback = js.Function2[/* x */ scala.Double, /* y */ scala.Double, scala.Unit]
  type EdgeZoneSourceCallback = js.Function2[
    /* quantity */ phaserLib.integer, 
    /* stepRate */ js.UndefOr[scala.Double], 
    scala.Unit
  ]
  /**
    * The returned value sets what the property will be at the START of the particle's life, on emit.
    */
  type EmitterOpOnEmitCallback = js.Function3[
    /* particle */ phaserLib.PhaserNs.GameObjectsNs.ParticlesNs.Particle, 
    /* key */ java.lang.String, 
    /* value */ scala.Double, 
    scala.Unit
  ]
  /**
    * The returned value updates the property for the duration of the particle's life.
    */
  type EmitterOpOnUpdateCallback = js.Function4[
    /* particle */ phaserLib.PhaserNs.GameObjectsNs.ParticlesNs.Particle, 
    /* key */ java.lang.String, 
    /* t */ scala.Double, 
    /* value */ scala.Double, 
    scala.Unit
  ]
  type ParticleDeathCallback = js.Function1[/* particle */ phaserLib.PhaserNs.GameObjectsNs.ParticlesNs.Particle, scala.Unit]
  type ParticleEmitterCallback = js.Function2[
    /* particle */ phaserLib.PhaserNs.GameObjectsNs.ParticlesNs.Particle, 
    /* emitter */ phaserLib.PhaserNs.GameObjectsNs.ParticlesNs.ParticleEmitter, 
    scala.Unit
  ]
  type RandomZoneSourceCallback = js.Function1[/* point */ phaserLib.PhaserNs.MathNs.Vector2, scala.Unit]
}

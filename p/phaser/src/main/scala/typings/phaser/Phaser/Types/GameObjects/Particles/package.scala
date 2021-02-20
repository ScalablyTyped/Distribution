package typings.phaser.Phaser.Types.GameObjects

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Particles {
  
  type DeathZoneSourceCallback = js.Function2[/* x */ scala.Double, /* y */ scala.Double, scala.Unit]
  
  type EdgeZoneSourceCallback = js.Function2[
    /* quantity */ typings.phaser.integer, 
    /* stepRate */ js.UndefOr[scala.Double], 
    scala.Unit
  ]
  
  /**
    * The returned value sets what the property will be at the START of the particle's life, on emit.
    */
  type EmitterOpOnEmitCallback = js.Function3[
    /* particle */ typings.phaser.Phaser.GameObjects.Particles.Particle, 
    /* key */ java.lang.String, 
    /* value */ scala.Double, 
    scala.Unit
  ]
  
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
  type EmitterOpOnEmitType = typings.phaser.Phaser.Types.GameObjects.Particles._EmitterOpOnEmitType | js.Array[scala.Double] | scala.Double | typings.phaser.Phaser.Types.GameObjects.Particles.EmitterOpOnEmitCallback
  
  /**
    * The returned value updates the property for the duration of the particle's life.
    */
  type EmitterOpOnUpdateCallback = js.Function4[
    /* particle */ typings.phaser.Phaser.GameObjects.Particles.Particle, 
    /* key */ java.lang.String, 
    /* t */ scala.Double, 
    /* value */ scala.Double, 
    scala.Unit
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.phaser.Phaser.Types.GameObjects.Particles.EmitterOpOnUpdateCallback
    - typings.phaser.Phaser.Types.GameObjects.Particles.EmitterOpEaseConfig
    - typings.phaser.Phaser.Types.GameObjects.Particles.EmitterOpCustomUpdateConfig
  */
  type EmitterOpOnUpdateType = typings.phaser.Phaser.Types.GameObjects.Particles._EmitterOpOnUpdateType | typings.phaser.Phaser.Types.GameObjects.Particles.EmitterOpOnUpdateCallback
  
  type ParticleDeathCallback = js.Function1[/* particle */ typings.phaser.Phaser.GameObjects.Particles.Particle, scala.Unit]
  
  type ParticleEmitterCallback = js.Function2[
    /* particle */ typings.phaser.Phaser.GameObjects.Particles.Particle, 
    /* emitter */ typings.phaser.Phaser.GameObjects.Particles.ParticleEmitter, 
    scala.Unit
  ]
  
  type RandomZoneSourceCallback = js.Function1[/* point */ typings.phaser.Phaser.Math.Vector2, scala.Unit]
}

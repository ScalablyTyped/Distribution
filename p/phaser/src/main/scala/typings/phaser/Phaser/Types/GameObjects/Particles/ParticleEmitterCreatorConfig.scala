package typings.phaser.Phaser.Types.GameObjects.Particles

import typings.phaser.Phaser.Types.GameObjects.GameObjectConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParticleEmitterCreatorConfig
  extends StObject
     with GameObjectConfig {
  
  /**
    * The Particle Emitter configuration object.
    */
  var config: js.UndefOr[ParticleEmitterConfig] = js.undefined
  
  /**
    * The key of the Texture this Emitter will use to render particles, as stored in the Texture Manager.
    */
  var key: js.UndefOr[String] = js.undefined
}
object ParticleEmitterCreatorConfig {
  
  inline def apply(): ParticleEmitterCreatorConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParticleEmitterCreatorConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParticleEmitterCreatorConfig] (val x: Self) extends AnyVal {
    
    inline def setConfig(value: ParticleEmitterConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}

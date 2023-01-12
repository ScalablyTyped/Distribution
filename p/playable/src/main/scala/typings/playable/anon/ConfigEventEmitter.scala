package typings.playable.anon

import typings.playable.distSrcCoreConfigMod.IPlayerConfig
import typings.playable.distSrcModulesEventEmitterTypesMod.IEventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigEventEmitter extends StObject {
  
  var config: IPlayerConfig
  
  var eventEmitter: IEventEmitter
}
object ConfigEventEmitter {
  
  inline def apply(config: IPlayerConfig, eventEmitter: IEventEmitter): ConfigEventEmitter = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], eventEmitter = eventEmitter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigEventEmitter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConfigEventEmitter] (val x: Self) extends AnyVal {
    
    inline def setConfig(value: IPlayerConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setEventEmitter(value: IEventEmitter): Self = StObject.set(x, "eventEmitter", value.asInstanceOf[js.Any])
  }
}

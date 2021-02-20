package typings.playable.anon

import typings.playable.configMod.IPlayerConfig
import typings.playable.eventEmitterTypesMod.IEventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigEventEmitter extends StObject {
  
  var config: IPlayerConfig = js.native
  
  var eventEmitter: IEventEmitter = js.native
}
object ConfigEventEmitter {
  
  @scala.inline
  def apply(config: IPlayerConfig, eventEmitter: IEventEmitter): ConfigEventEmitter = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], eventEmitter = eventEmitter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigEventEmitter]
  }
  
  @scala.inline
  implicit class ConfigEventEmitterMutableBuilder[Self <: ConfigEventEmitter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: IPlayerConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventEmitter(value: IEventEmitter): Self = StObject.set(x, "eventEmitter", value.asInstanceOf[js.Any])
  }
}

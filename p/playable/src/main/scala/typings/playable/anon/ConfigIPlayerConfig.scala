package typings.playable.anon

import typings.playable.configMod.IPlayerConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigIPlayerConfig extends StObject {
  
  var config: IPlayerConfig = js.native
}
object ConfigIPlayerConfig {
  
  @scala.inline
  def apply(config: IPlayerConfig): ConfigIPlayerConfig = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigIPlayerConfig]
  }
  
  @scala.inline
  implicit class ConfigIPlayerConfigMutableBuilder[Self <: ConfigIPlayerConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: IPlayerConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
  }
}

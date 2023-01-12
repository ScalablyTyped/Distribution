package typings.playable.anon

import typings.playable.distSrcCoreConfigMod.IPlayerConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigIPlayerConfig extends StObject {
  
  var config: IPlayerConfig
}
object ConfigIPlayerConfig {
  
  inline def apply(config: IPlayerConfig): ConfigIPlayerConfig = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigIPlayerConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConfigIPlayerConfig] (val x: Self) extends AnyVal {
    
    inline def setConfig(value: IPlayerConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
  }
}

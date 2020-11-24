package typings.playable.anon

import typings.playable.configMod.IPlayerConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigIPlayerConfig extends js.Object {
  
  var config: IPlayerConfig = js.native
}
object ConfigIPlayerConfig {
  
  @scala.inline
  def apply(config: IPlayerConfig): ConfigIPlayerConfig = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigIPlayerConfig]
  }
  
  @scala.inline
  implicit class ConfigIPlayerConfigOps[Self <: ConfigIPlayerConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConfig(value: IPlayerConfig): Self = this.set("config", value.asInstanceOf[js.Any])
  }
}

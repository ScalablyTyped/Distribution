package typings.nodeConfigManager.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var camelCase: Boolean = js.native
  
  var configDir: String = js.native
  
  var env: String = js.native
}
object Options {
  
  @scala.inline
  def apply(camelCase: Boolean, configDir: String, env: String): Options = {
    val __obj = js.Dynamic.literal(camelCase = camelCase.asInstanceOf[js.Any], configDir = configDir.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setCamelCase(value: Boolean): Self = this.set("camelCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigDir(value: String): Self = this.set("configDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnv(value: String): Self = this.set("env", value.asInstanceOf[js.Any])
  }
}

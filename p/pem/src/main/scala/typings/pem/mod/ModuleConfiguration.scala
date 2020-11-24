package typings.pem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModuleConfiguration extends js.Object {
  
  /**
    * Path to OpenSSL binaries
    */
  var pathOpenSSL: String = js.native
}
object ModuleConfiguration {
  
  @scala.inline
  def apply(pathOpenSSL: String): ModuleConfiguration = {
    val __obj = js.Dynamic.literal(pathOpenSSL = pathOpenSSL.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleConfiguration]
  }
  
  @scala.inline
  implicit class ModuleConfigurationOps[Self <: ModuleConfiguration] (val x: Self) extends AnyVal {
    
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
    def setPathOpenSSL(value: String): Self = this.set("pathOpenSSL", value.asInstanceOf[js.Any])
  }
}

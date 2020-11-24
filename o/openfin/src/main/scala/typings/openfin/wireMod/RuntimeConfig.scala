package typings.openfin.wireMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuntimeConfig extends js.Object {
  
  var arguments: js.UndefOr[String] = js.native
  
  var fallbackVersion: js.UndefOr[String] = js.native
  
  var rvmDir: js.UndefOr[String] = js.native
  
  var securityRealm: js.UndefOr[String] = js.native
  
  var verboseLogging: js.UndefOr[Boolean] = js.native
  
  var version: String = js.native
}
object RuntimeConfig {
  
  @scala.inline
  def apply(version: String): RuntimeConfig = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuntimeConfig]
  }
  
  @scala.inline
  implicit class RuntimeConfigOps[Self <: RuntimeConfig] (val x: Self) extends AnyVal {
    
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
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArguments(value: String): Self = this.set("arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArguments: Self = this.set("arguments", js.undefined)
    
    @scala.inline
    def setFallbackVersion(value: String): Self = this.set("fallbackVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallbackVersion: Self = this.set("fallbackVersion", js.undefined)
    
    @scala.inline
    def setRvmDir(value: String): Self = this.set("rvmDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRvmDir: Self = this.set("rvmDir", js.undefined)
    
    @scala.inline
    def setSecurityRealm(value: String): Self = this.set("securityRealm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityRealm: Self = this.set("securityRealm", js.undefined)
    
    @scala.inline
    def setVerboseLogging(value: Boolean): Self = this.set("verboseLogging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerboseLogging: Self = this.set("verboseLogging", js.undefined)
  }
}

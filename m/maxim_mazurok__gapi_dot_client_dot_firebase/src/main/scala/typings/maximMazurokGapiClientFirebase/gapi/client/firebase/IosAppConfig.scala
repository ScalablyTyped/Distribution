package typings.maximMazurokGapiClientFirebase.gapi.client.firebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IosAppConfig extends js.Object {
  
  /** The content of the XML configuration file. */
  var configFileContents: js.UndefOr[String] = js.native
  
  /** The filename that the configuration artifact for the `IosApp` is typically saved as. For example: `GoogleService-Info.plist` */
  var configFilename: js.UndefOr[String] = js.native
}
object IosAppConfig {
  
  @scala.inline
  def apply(): IosAppConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosAppConfig]
  }
  
  @scala.inline
  implicit class IosAppConfigOps[Self <: IosAppConfig] (val x: Self) extends AnyVal {
    
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
    def setConfigFileContents(value: String): Self = this.set("configFileContents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigFileContents: Self = this.set("configFileContents", js.undefined)
    
    @scala.inline
    def setConfigFilename(value: String): Self = this.set("configFilename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigFilename: Self = this.set("configFilename", js.undefined)
  }
}

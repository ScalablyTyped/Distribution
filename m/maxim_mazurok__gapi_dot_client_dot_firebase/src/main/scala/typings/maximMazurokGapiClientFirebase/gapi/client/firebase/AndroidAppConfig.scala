package typings.maximMazurokGapiClientFirebase.gapi.client.firebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AndroidAppConfig extends js.Object {
  
  /** The contents of the JSON configuration file. */
  var configFileContents: js.UndefOr[String] = js.native
  
  /** The filename that the configuration artifact for the `AndroidApp` is typically saved as. For example: `google-services.json` */
  var configFilename: js.UndefOr[String] = js.native
}
object AndroidAppConfig {
  
  @scala.inline
  def apply(): AndroidAppConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidAppConfig]
  }
  
  @scala.inline
  implicit class AndroidAppConfigOps[Self <: AndroidAppConfig] (val x: Self) extends AnyVal {
    
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

package typings.maximMazurokGapiClientFirebase.gapi.client.firebase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AndroidAppConfig extends StObject {
  
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
  implicit class AndroidAppConfigMutableBuilder[Self <: AndroidAppConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigFileContents(value: String): Self = StObject.set(x, "configFileContents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigFileContentsUndefined: Self = StObject.set(x, "configFileContents", js.undefined)
    
    @scala.inline
    def setConfigFilename(value: String): Self = StObject.set(x, "configFilename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigFilenameUndefined: Self = StObject.set(x, "configFilename", js.undefined)
  }
}

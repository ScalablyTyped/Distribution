package typings.maximMazurokGapiClientFirebase.gapi.client.firebase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IosAppConfig extends StObject {
  
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
  implicit class IosAppConfigMutableBuilder[Self <: IosAppConfig] (val x: Self) extends AnyVal {
    
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

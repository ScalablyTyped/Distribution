package typings.maximMazurokGapiClientFirebase.gapi.client.firebase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AndroidAppConfig extends StObject {
  
  /** The contents of the JSON configuration file. */
  var configFileContents: js.UndefOr[String] = js.undefined
  
  /** The filename that the configuration artifact for the `AndroidApp` is typically saved as. For example: `google-services.json` */
  var configFilename: js.UndefOr[String] = js.undefined
}
object AndroidAppConfig {
  
  inline def apply(): AndroidAppConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidAppConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AndroidAppConfig] (val x: Self) extends AnyVal {
    
    inline def setConfigFileContents(value: String): Self = StObject.set(x, "configFileContents", value.asInstanceOf[js.Any])
    
    inline def setConfigFileContentsUndefined: Self = StObject.set(x, "configFileContents", js.undefined)
    
    inline def setConfigFilename(value: String): Self = StObject.set(x, "configFilename", value.asInstanceOf[js.Any])
    
    inline def setConfigFilenameUndefined: Self = StObject.set(x, "configFilename", js.undefined)
  }
}

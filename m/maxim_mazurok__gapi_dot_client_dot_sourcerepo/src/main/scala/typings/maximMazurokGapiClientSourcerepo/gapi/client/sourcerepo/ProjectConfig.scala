package typings.maximMazurokGapiClientSourcerepo.gapi.client.sourcerepo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectConfig extends StObject {
  
  /** Reject a Git push that contains a private key. */
  var enablePrivateKeyCheck: js.UndefOr[Boolean] = js.undefined
  
  /** The name of the project. Values are of the form `projects/`. */
  var name: js.UndefOr[String] = js.undefined
  
  /** How this project publishes a change in the repositories through Cloud Pub/Sub. Keyed by the topic names. */
  var pubsubConfigs: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.sourcerepo.gapi.client.sourcerepo.PubsubConfig} */ js.Any
  ] = js.undefined
}
object ProjectConfig {
  
  inline def apply(): ProjectConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProjectConfig] (val x: Self) extends AnyVal {
    
    inline def setEnablePrivateKeyCheck(value: Boolean): Self = StObject.set(x, "enablePrivateKeyCheck", value.asInstanceOf[js.Any])
    
    inline def setEnablePrivateKeyCheckUndefined: Self = StObject.set(x, "enablePrivateKeyCheck", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPubsubConfigs(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.sourcerepo.gapi.client.sourcerepo.PubsubConfig} */ js.Any
    ): Self = StObject.set(x, "pubsubConfigs", value.asInstanceOf[js.Any])
    
    inline def setPubsubConfigsUndefined: Self = StObject.set(x, "pubsubConfigs", js.undefined)
  }
}

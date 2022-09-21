package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRunV2SecretKeySelector extends StObject {
  
  /**
    * Required. The name of the secret in Cloud Secret Manager. Format: {secret_name} if the secret is in the same project. projects/{project}/secrets/{secret_name} if the secret is in a
    * different project.
    */
  var secret: js.UndefOr[String] = js.undefined
  
  /** The Cloud Secret Manager secret version. Can be 'latest' for the latest value or an integer for a specific version. */
  var version: js.UndefOr[String] = js.undefined
}
object GoogleCloudRunV2SecretKeySelector {
  
  inline def apply(): GoogleCloudRunV2SecretKeySelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRunV2SecretKeySelector]
  }
  
  extension [Self <: GoogleCloudRunV2SecretKeySelector](x: Self) {
    
    inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}

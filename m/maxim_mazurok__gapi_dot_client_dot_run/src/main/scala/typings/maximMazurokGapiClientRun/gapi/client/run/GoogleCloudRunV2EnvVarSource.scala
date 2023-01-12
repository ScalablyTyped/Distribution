package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRunV2EnvVarSource extends StObject {
  
  /** Selects a secret and a specific version from Cloud Secret Manager. */
  var secretKeyRef: js.UndefOr[GoogleCloudRunV2SecretKeySelector] = js.undefined
}
object GoogleCloudRunV2EnvVarSource {
  
  inline def apply(): GoogleCloudRunV2EnvVarSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRunV2EnvVarSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudRunV2EnvVarSource] (val x: Self) extends AnyVal {
    
    inline def setSecretKeyRef(value: GoogleCloudRunV2SecretKeySelector): Self = StObject.set(x, "secretKeyRef", value.asInstanceOf[js.Any])
    
    inline def setSecretKeyRefUndefined: Self = StObject.set(x, "secretKeyRef", js.undefined)
  }
}

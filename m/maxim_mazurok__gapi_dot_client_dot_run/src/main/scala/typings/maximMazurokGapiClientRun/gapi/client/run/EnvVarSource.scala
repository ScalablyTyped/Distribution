package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvVarSource extends StObject {
  
  /** (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported Selects a key of a ConfigMap. */
  var configMapKeyRef: js.UndefOr[ConfigMapKeySelector] = js.undefined
  
  /** (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported Selects a key of a secret in the pod's namespace */
  var secretKeyRef: js.UndefOr[SecretKeySelector] = js.undefined
}
object EnvVarSource {
  
  inline def apply(): EnvVarSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvVarSource]
  }
  
  extension [Self <: EnvVarSource](x: Self) {
    
    inline def setConfigMapKeyRef(value: ConfigMapKeySelector): Self = StObject.set(x, "configMapKeyRef", value.asInstanceOf[js.Any])
    
    inline def setConfigMapKeyRefUndefined: Self = StObject.set(x, "configMapKeyRef", js.undefined)
    
    inline def setSecretKeyRef(value: SecretKeySelector): Self = StObject.set(x, "secretKeyRef", value.asInstanceOf[js.Any])
    
    inline def setSecretKeyRefUndefined: Self = StObject.set(x, "secretKeyRef", js.undefined)
  }
}

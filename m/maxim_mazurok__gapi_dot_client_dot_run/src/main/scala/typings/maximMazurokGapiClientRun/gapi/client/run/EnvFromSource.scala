package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvFromSource extends StObject {
  
  /** (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported The ConfigMap to select from */
  var configMapRef: js.UndefOr[ConfigMapEnvSource] = js.undefined
  
  /** (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported An optional identifier to prepend to each key in the ConfigMap. Must be a C_IDENTIFIER. */
  var prefix: js.UndefOr[String] = js.undefined
  
  /** (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported The Secret to select from */
  var secretRef: js.UndefOr[SecretEnvSource] = js.undefined
}
object EnvFromSource {
  
  inline def apply(): EnvFromSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvFromSource]
  }
  
  extension [Self <: EnvFromSource](x: Self) {
    
    inline def setConfigMapRef(value: ConfigMapEnvSource): Self = StObject.set(x, "configMapRef", value.asInstanceOf[js.Any])
    
    inline def setConfigMapRefUndefined: Self = StObject.set(x, "configMapRef", js.undefined)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setSecretRef(value: SecretEnvSource): Self = StObject.set(x, "secretRef", value.asInstanceOf[js.Any])
    
    inline def setSecretRefUndefined: Self = StObject.set(x, "secretRef", js.undefined)
  }
}

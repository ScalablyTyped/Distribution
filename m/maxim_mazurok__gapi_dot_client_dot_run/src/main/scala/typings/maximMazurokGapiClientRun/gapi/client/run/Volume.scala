package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Volume extends StObject {
  
  /** Cloud Run fully managed: not supported Cloud Run for Anthos: supported */
  var configMap: js.UndefOr[ConfigMapVolumeSource] = js.undefined
  
  /** Cloud Run fully managed: not supported Cloud Run for Anthos: supported Volume's name. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Cloud Run fully managed: not supported Cloud Run for Anthos: supported */
  var secret: js.UndefOr[SecretVolumeSource] = js.undefined
}
object Volume {
  
  inline def apply(): Volume = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Volume]
  }
  
  extension [Self <: Volume](x: Self) {
    
    inline def setConfigMap(value: ConfigMapVolumeSource): Self = StObject.set(x, "configMap", value.asInstanceOf[js.Any])
    
    inline def setConfigMapUndefined: Self = StObject.set(x, "configMap", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSecret(value: SecretVolumeSource): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
  }
}

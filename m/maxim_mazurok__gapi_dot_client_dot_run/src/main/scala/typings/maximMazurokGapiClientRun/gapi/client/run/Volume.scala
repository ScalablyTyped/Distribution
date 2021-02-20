package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Volume extends StObject {
  
  /** Cloud Run fully managed: not supported Cloud Run for Anthos: supported */
  var configMap: js.UndefOr[ConfigMapVolumeSource] = js.native
  
  /** Cloud Run fully managed: not supported Cloud Run for Anthos: supported Volume's name. */
  var name: js.UndefOr[String] = js.native
  
  /** Cloud Run fully managed: not supported Cloud Run for Anthos: supported */
  var secret: js.UndefOr[SecretVolumeSource] = js.native
}
object Volume {
  
  @scala.inline
  def apply(): Volume = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Volume]
  }
  
  @scala.inline
  implicit class VolumeMutableBuilder[Self <: Volume] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigMap(value: ConfigMapVolumeSource): Self = StObject.set(x, "configMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigMapUndefined: Self = StObject.set(x, "configMap", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSecret(value: SecretVolumeSource): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
  }
}

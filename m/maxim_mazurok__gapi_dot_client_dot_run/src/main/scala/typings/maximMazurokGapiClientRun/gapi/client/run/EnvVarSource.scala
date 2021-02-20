package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvVarSource extends StObject {
  
  /** (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported Selects a key of a ConfigMap. */
  var configMapKeyRef: js.UndefOr[ConfigMapKeySelector] = js.native
  
  /** (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported Selects a key of a secret in the pod's namespace */
  var secretKeyRef: js.UndefOr[SecretKeySelector] = js.native
}
object EnvVarSource {
  
  @scala.inline
  def apply(): EnvVarSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvVarSource]
  }
  
  @scala.inline
  implicit class EnvVarSourceMutableBuilder[Self <: EnvVarSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigMapKeyRef(value: ConfigMapKeySelector): Self = StObject.set(x, "configMapKeyRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigMapKeyRefUndefined: Self = StObject.set(x, "configMapKeyRef", js.undefined)
    
    @scala.inline
    def setSecretKeyRef(value: SecretKeySelector): Self = StObject.set(x, "secretKeyRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretKeyRefUndefined: Self = StObject.set(x, "secretKeyRef", js.undefined)
  }
}

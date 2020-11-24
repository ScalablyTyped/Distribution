package typings.maximMazurokGapiClientRun.gapi.client.run

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvVarSource extends js.Object {
  
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
  implicit class EnvVarSourceOps[Self <: EnvVarSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConfigMapKeyRef(value: ConfigMapKeySelector): Self = this.set("configMapKeyRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigMapKeyRef: Self = this.set("configMapKeyRef", js.undefined)
    
    @scala.inline
    def setSecretKeyRef(value: SecretKeySelector): Self = this.set("secretKeyRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecretKeyRef: Self = this.set("secretKeyRef", js.undefined)
  }
}

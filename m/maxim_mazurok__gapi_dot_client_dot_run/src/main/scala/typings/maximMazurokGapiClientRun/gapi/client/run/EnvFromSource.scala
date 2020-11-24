package typings.maximMazurokGapiClientRun.gapi.client.run

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvFromSource extends js.Object {
  
  /** (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported The ConfigMap to select from */
  var configMapRef: js.UndefOr[ConfigMapEnvSource] = js.native
  
  /** (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported An optional identifier to prepend to each key in the ConfigMap. Must be a C_IDENTIFIER. */
  var prefix: js.UndefOr[String] = js.native
  
  /** (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported The Secret to select from */
  var secretRef: js.UndefOr[SecretEnvSource] = js.native
}
object EnvFromSource {
  
  @scala.inline
  def apply(): EnvFromSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvFromSource]
  }
  
  @scala.inline
  implicit class EnvFromSourceOps[Self <: EnvFromSource] (val x: Self) extends AnyVal {
    
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
    def setConfigMapRef(value: ConfigMapEnvSource): Self = this.set("configMapRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigMapRef: Self = this.set("configMapRef", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    
    @scala.inline
    def setSecretRef(value: SecretEnvSource): Self = this.set("secretRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecretRef: Self = this.set("secretRef", js.undefined)
  }
}

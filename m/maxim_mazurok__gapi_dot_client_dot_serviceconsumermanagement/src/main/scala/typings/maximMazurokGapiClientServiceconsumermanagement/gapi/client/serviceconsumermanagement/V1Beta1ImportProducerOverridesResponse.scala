package typings.maximMazurokGapiClientServiceconsumermanagement.gapi.client.serviceconsumermanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait V1Beta1ImportProducerOverridesResponse extends js.Object {
  
  /** The overrides that were created from the imported data. */
  var overrides: js.UndefOr[js.Array[V1Beta1QuotaOverride]] = js.native
}
object V1Beta1ImportProducerOverridesResponse {
  
  @scala.inline
  def apply(): V1Beta1ImportProducerOverridesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[V1Beta1ImportProducerOverridesResponse]
  }
  
  @scala.inline
  implicit class V1Beta1ImportProducerOverridesResponseOps[Self <: V1Beta1ImportProducerOverridesResponse] (val x: Self) extends AnyVal {
    
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
    def setOverridesVarargs(value: V1Beta1QuotaOverride*): Self = this.set("overrides", js.Array(value :_*))
    
    @scala.inline
    def setOverrides(value: js.Array[V1Beta1QuotaOverride]): Self = this.set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
  }
}

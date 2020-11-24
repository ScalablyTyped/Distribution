package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddTargetedSitesRequest extends js.Object {
  
  /** A list of site URLs to target in the pretargeting configuration. These values will be added to the list of targeted URLs in PretargetingConfig.webTargeting.values. */
  var sites: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Required. The targeting mode that should be applied to the list of site URLs. If there are existing targeted sites, must be equal to the existing
    * PretargetingConfig.webTargeting.targetingMode or a 400 bad request error will be returned.
    */
  var targetingMode: js.UndefOr[String] = js.native
}
object AddTargetedSitesRequest {
  
  @scala.inline
  def apply(): AddTargetedSitesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddTargetedSitesRequest]
  }
  
  @scala.inline
  implicit class AddTargetedSitesRequestOps[Self <: AddTargetedSitesRequest] (val x: Self) extends AnyVal {
    
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
    def setSitesVarargs(value: String*): Self = this.set("sites", js.Array(value :_*))
    
    @scala.inline
    def setSites(value: js.Array[String]): Self = this.set("sites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSites: Self = this.set("sites", js.undefined)
    
    @scala.inline
    def setTargetingMode(value: String): Self = this.set("targetingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetingMode: Self = this.set("targetingMode", js.undefined)
  }
}

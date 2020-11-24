package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveTargetedSitesRequest extends js.Object {
  
  /** A list of site URLs to stop targeting in the pretargeting configuration. These values will be removed from the list of targeted URLs in PretargetingConfig.webTargeting.values. */
  var sites: js.UndefOr[js.Array[String]] = js.native
}
object RemoveTargetedSitesRequest {
  
  @scala.inline
  def apply(): RemoveTargetedSitesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveTargetedSitesRequest]
  }
  
  @scala.inline
  implicit class RemoveTargetedSitesRequestOps[Self <: RemoveTargetedSitesRequest] (val x: Self) extends AnyVal {
    
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
  }
}

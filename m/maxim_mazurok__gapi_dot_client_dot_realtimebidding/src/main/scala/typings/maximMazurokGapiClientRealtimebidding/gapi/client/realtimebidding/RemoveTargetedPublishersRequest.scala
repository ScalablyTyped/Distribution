package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveTargetedPublishersRequest extends js.Object {
  
  /**
    * A list of publisher IDs to stop targeting in the pretargeting configuration. These values will be removed from the list of targeted publisher IDs in
    * PretargetingConfig.publisherTargeting.values. Publishers are identified by their publisher ID from ads.txt / app-ads.txt. See https://iabtechlab.com/ads-txt/ and
    * https://iabtechlab.com/app-ads-txt/ for more details.
    */
  var publisherIds: js.UndefOr[js.Array[String]] = js.native
}
object RemoveTargetedPublishersRequest {
  
  @scala.inline
  def apply(): RemoveTargetedPublishersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveTargetedPublishersRequest]
  }
  
  @scala.inline
  implicit class RemoveTargetedPublishersRequestOps[Self <: RemoveTargetedPublishersRequest] (val x: Self) extends AnyVal {
    
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
    def setPublisherIdsVarargs(value: String*): Self = this.set("publisherIds", js.Array(value :_*))
    
    @scala.inline
    def setPublisherIds(value: js.Array[String]): Self = this.set("publisherIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublisherIds: Self = this.set("publisherIds", js.undefined)
  }
}

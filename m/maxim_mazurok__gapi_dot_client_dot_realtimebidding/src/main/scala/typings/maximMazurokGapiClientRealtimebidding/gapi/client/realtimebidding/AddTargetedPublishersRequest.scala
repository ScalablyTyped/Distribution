package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddTargetedPublishersRequest extends StObject {
  
  /**
    * A list of publisher IDs to target in the pretargeting configuration. These values will be added to the list of targeted publisher IDs in
    * PretargetingConfig.publisherTargeting.values. Publishers are identified by their publisher ID from ads.txt / app-ads.txt. See https://iabtechlab.com/ads-txt/ and
    * https://iabtechlab.com/app-ads-txt/ for more details.
    */
  var publisherIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Required. The targeting mode that should be applied to the list of publisher IDs. If are existing publisher IDs, must be equal to the existing
    * PretargetingConfig.publisherTargeting.targetingMode or a 400 bad request error will be returned.
    */
  var targetingMode: js.UndefOr[String] = js.native
}
object AddTargetedPublishersRequest {
  
  @scala.inline
  def apply(): AddTargetedPublishersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddTargetedPublishersRequest]
  }
  
  @scala.inline
  implicit class AddTargetedPublishersRequestMutableBuilder[Self <: AddTargetedPublishersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPublisherIds(value: js.Array[String]): Self = StObject.set(x, "publisherIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherIdsUndefined: Self = StObject.set(x, "publisherIds", js.undefined)
    
    @scala.inline
    def setPublisherIdsVarargs(value: String*): Self = StObject.set(x, "publisherIds", js.Array(value :_*))
    
    @scala.inline
    def setTargetingMode(value: String): Self = StObject.set(x, "targetingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetingModeUndefined: Self = StObject.set(x, "targetingMode", js.undefined)
  }
}

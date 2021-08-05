package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveTargetedPublishersRequest extends StObject {
  
  /**
    * A list of publisher IDs to stop targeting in the pretargeting configuration. These values will be removed from the list of targeted publisher IDs in
    * PretargetingConfig.publisherTargeting.values. Publishers are identified by their publisher ID from ads.txt / app-ads.txt. See https://iabtechlab.com/ads-txt/ and
    * https://iabtechlab.com/app-ads-txt/ for more details.
    */
  var publisherIds: js.UndefOr[js.Array[String]] = js.undefined
}
object RemoveTargetedPublishersRequest {
  
  inline def apply(): RemoveTargetedPublishersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveTargetedPublishersRequest]
  }
  
  extension [Self <: RemoveTargetedPublishersRequest](x: Self) {
    
    inline def setPublisherIds(value: js.Array[String]): Self = StObject.set(x, "publisherIds", value.asInstanceOf[js.Any])
    
    inline def setPublisherIdsUndefined: Self = StObject.set(x, "publisherIds", js.undefined)
    
    inline def setPublisherIdsVarargs(value: String*): Self = StObject.set(x, "publisherIds", js.Array(value :_*))
  }
}

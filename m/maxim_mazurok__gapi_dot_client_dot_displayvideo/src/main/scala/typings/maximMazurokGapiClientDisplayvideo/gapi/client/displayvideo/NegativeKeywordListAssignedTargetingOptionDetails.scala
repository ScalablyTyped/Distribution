package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NegativeKeywordListAssignedTargetingOptionDetails extends StObject {
  
  /** Required. ID of the negative keyword list. Should refer to the negative_keyword_list_id field of a NegativeKeywordList resource. */
  var negativeKeywordListId: js.UndefOr[String] = js.undefined
}
object NegativeKeywordListAssignedTargetingOptionDetails {
  
  inline def apply(): NegativeKeywordListAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NegativeKeywordListAssignedTargetingOptionDetails]
  }
  
  extension [Self <: NegativeKeywordListAssignedTargetingOptionDetails](x: Self) {
    
    inline def setNegativeKeywordListId(value: String): Self = StObject.set(x, "negativeKeywordListId", value.asInstanceOf[js.Any])
    
    inline def setNegativeKeywordListIdUndefined: Self = StObject.set(x, "negativeKeywordListId", js.undefined)
  }
}

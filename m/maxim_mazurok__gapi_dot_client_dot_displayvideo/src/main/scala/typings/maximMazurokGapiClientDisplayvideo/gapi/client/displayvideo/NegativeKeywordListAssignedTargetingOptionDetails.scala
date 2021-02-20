package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NegativeKeywordListAssignedTargetingOptionDetails extends StObject {
  
  /** Required. ID of the negative keyword list. Should refer to the negative_keyword_list_id field of a NegativeKeywordList resource. */
  var negativeKeywordListId: js.UndefOr[String] = js.native
}
object NegativeKeywordListAssignedTargetingOptionDetails {
  
  @scala.inline
  def apply(): NegativeKeywordListAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NegativeKeywordListAssignedTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class NegativeKeywordListAssignedTargetingOptionDetailsMutableBuilder[Self <: NegativeKeywordListAssignedTargetingOptionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNegativeKeywordListId(value: String): Self = StObject.set(x, "negativeKeywordListId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegativeKeywordListIdUndefined: Self = StObject.set(x, "negativeKeywordListId", js.undefined)
  }
}

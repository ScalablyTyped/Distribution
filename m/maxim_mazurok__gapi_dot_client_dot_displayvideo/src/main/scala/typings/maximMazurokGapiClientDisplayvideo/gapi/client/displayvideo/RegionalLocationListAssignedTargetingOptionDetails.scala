package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegionalLocationListAssignedTargetingOptionDetails extends StObject {
  
  /** Indicates if this option is being negatively targeted. */
  var negative: js.UndefOr[Boolean] = js.undefined
  
  /** Required. ID of the regional location list. Should refer to the location_list_id field of a LocationList resource whose type is `TARGETING_LOCATION_TYPE_REGIONAL`. */
  var regionalLocationListId: js.UndefOr[String] = js.undefined
}
object RegionalLocationListAssignedTargetingOptionDetails {
  
  inline def apply(): RegionalLocationListAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegionalLocationListAssignedTargetingOptionDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegionalLocationListAssignedTargetingOptionDetails] (val x: Self) extends AnyVal {
    
    inline def setNegative(value: Boolean): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
    
    inline def setNegativeUndefined: Self = StObject.set(x, "negative", js.undefined)
    
    inline def setRegionalLocationListId(value: String): Self = StObject.set(x, "regionalLocationListId", value.asInstanceOf[js.Any])
    
    inline def setRegionalLocationListIdUndefined: Self = StObject.set(x, "regionalLocationListId", js.undefined)
  }
}

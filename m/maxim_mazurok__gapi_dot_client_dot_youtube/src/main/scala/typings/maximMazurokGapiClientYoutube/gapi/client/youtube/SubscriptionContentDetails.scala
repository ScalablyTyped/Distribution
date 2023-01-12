package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscriptionContentDetails extends StObject {
  
  /** The type of activity this subscription is for (only uploads, everything). */
  var activityType: js.UndefOr[String] = js.undefined
  
  /** The number of new items in the subscription since its content was last read. */
  var newItemCount: js.UndefOr[Double] = js.undefined
  
  /** The approximate number of items that the subscription points to. */
  var totalItemCount: js.UndefOr[Double] = js.undefined
}
object SubscriptionContentDetails {
  
  inline def apply(): SubscriptionContentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscriptionContentDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubscriptionContentDetails] (val x: Self) extends AnyVal {
    
    inline def setActivityType(value: String): Self = StObject.set(x, "activityType", value.asInstanceOf[js.Any])
    
    inline def setActivityTypeUndefined: Self = StObject.set(x, "activityType", js.undefined)
    
    inline def setNewItemCount(value: Double): Self = StObject.set(x, "newItemCount", value.asInstanceOf[js.Any])
    
    inline def setNewItemCountUndefined: Self = StObject.set(x, "newItemCount", js.undefined)
    
    inline def setTotalItemCount(value: Double): Self = StObject.set(x, "totalItemCount", value.asInstanceOf[js.Any])
    
    inline def setTotalItemCountUndefined: Self = StObject.set(x, "totalItemCount", js.undefined)
  }
}

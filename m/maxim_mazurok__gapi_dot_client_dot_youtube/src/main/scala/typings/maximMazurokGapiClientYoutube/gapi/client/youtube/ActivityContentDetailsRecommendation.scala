package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivityContentDetailsRecommendation extends StObject {
  
  /** The reason that the resource is recommended to the user. */
  var reason: js.UndefOr[String] = js.undefined
  
  /** The resourceId object contains information that identifies the recommended resource. */
  var resourceId: js.UndefOr[ResourceId] = js.undefined
  
  /** The seedResourceId object contains information about the resource that caused the recommendation. */
  var seedResourceId: js.UndefOr[ResourceId] = js.undefined
}
object ActivityContentDetailsRecommendation {
  
  inline def apply(): ActivityContentDetailsRecommendation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityContentDetailsRecommendation]
  }
  
  extension [Self <: ActivityContentDetailsRecommendation](x: Self) {
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setResourceId(value: ResourceId): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
    
    inline def setSeedResourceId(value: ResourceId): Self = StObject.set(x, "seedResourceId", value.asInstanceOf[js.Any])
    
    inline def setSeedResourceIdUndefined: Self = StObject.set(x, "seedResourceId", js.undefined)
  }
}

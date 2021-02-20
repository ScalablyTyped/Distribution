package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivityContentDetailsRecommendation extends StObject {
  
  /** The reason that the resource is recommended to the user. */
  var reason: js.UndefOr[String] = js.native
  
  /** The resourceId object contains information that identifies the recommended resource. */
  var resourceId: js.UndefOr[ResourceId] = js.native
  
  /** The seedResourceId object contains information about the resource that caused the recommendation. */
  var seedResourceId: js.UndefOr[ResourceId] = js.native
}
object ActivityContentDetailsRecommendation {
  
  @scala.inline
  def apply(): ActivityContentDetailsRecommendation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityContentDetailsRecommendation]
  }
  
  @scala.inline
  implicit class ActivityContentDetailsRecommendationMutableBuilder[Self <: ActivityContentDetailsRecommendation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    @scala.inline
    def setResourceId(value: ResourceId): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
    
    @scala.inline
    def setSeedResourceId(value: ResourceId): Self = StObject.set(x, "seedResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeedResourceIdUndefined: Self = StObject.set(x, "seedResourceId", js.undefined)
  }
}

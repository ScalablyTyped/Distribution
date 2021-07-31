package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivityContentDetailsSubscription extends StObject {
  
  /** The resourceId object contains information that identifies the resource that the user subscribed to. */
  var resourceId: js.UndefOr[ResourceId] = js.undefined
}
object ActivityContentDetailsSubscription {
  
  @scala.inline
  def apply(): ActivityContentDetailsSubscription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityContentDetailsSubscription]
  }
  
  @scala.inline
  implicit class ActivityContentDetailsSubscriptionMutableBuilder[Self <: ActivityContentDetailsSubscription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceId(value: ResourceId): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
  }
}

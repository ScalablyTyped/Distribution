package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivityContentDetailsChannelItem extends StObject {
  
  /** The resourceId object contains information that identifies the resource that was added to the channel. */
  var resourceId: js.UndefOr[ResourceId] = js.undefined
}
object ActivityContentDetailsChannelItem {
  
  @scala.inline
  def apply(): ActivityContentDetailsChannelItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityContentDetailsChannelItem]
  }
  
  @scala.inline
  implicit class ActivityContentDetailsChannelItemMutableBuilder[Self <: ActivityContentDetailsChannelItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceId(value: ResourceId): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
  }
}

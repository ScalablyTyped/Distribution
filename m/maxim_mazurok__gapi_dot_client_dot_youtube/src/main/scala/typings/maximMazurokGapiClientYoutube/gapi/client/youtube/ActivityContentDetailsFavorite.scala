package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivityContentDetailsFavorite extends StObject {
  
  /** The resourceId object contains information that identifies the resource that was marked as a favorite. */
  var resourceId: js.UndefOr[ResourceId] = js.native
}
object ActivityContentDetailsFavorite {
  
  @scala.inline
  def apply(): ActivityContentDetailsFavorite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityContentDetailsFavorite]
  }
  
  @scala.inline
  implicit class ActivityContentDetailsFavoriteMutableBuilder[Self <: ActivityContentDetailsFavorite] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceId(value: ResourceId): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
  }
}

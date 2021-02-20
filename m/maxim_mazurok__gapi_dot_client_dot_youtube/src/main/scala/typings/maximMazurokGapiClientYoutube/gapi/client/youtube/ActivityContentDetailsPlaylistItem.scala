package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivityContentDetailsPlaylistItem extends StObject {
  
  /** The value that YouTube uses to uniquely identify the playlist. */
  var playlistId: js.UndefOr[String] = js.native
  
  /** ID of the item within the playlist. */
  var playlistItemId: js.UndefOr[String] = js.native
  
  /** The resourceId object contains information about the resource that was added to the playlist. */
  var resourceId: js.UndefOr[ResourceId] = js.native
}
object ActivityContentDetailsPlaylistItem {
  
  @scala.inline
  def apply(): ActivityContentDetailsPlaylistItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityContentDetailsPlaylistItem]
  }
  
  @scala.inline
  implicit class ActivityContentDetailsPlaylistItemMutableBuilder[Self <: ActivityContentDetailsPlaylistItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlaylistId(value: String): Self = StObject.set(x, "playlistId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaylistIdUndefined: Self = StObject.set(x, "playlistId", js.undefined)
    
    @scala.inline
    def setPlaylistItemId(value: String): Self = StObject.set(x, "playlistItemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaylistItemIdUndefined: Self = StObject.set(x, "playlistItemId", js.undefined)
    
    @scala.inline
    def setResourceId(value: ResourceId): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
  }
}

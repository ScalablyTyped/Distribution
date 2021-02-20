package typings.maximMazurokGapiClientYoutube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Favorites extends StObject {
  
  /** The ID of the playlist that contains the channel"s favorite videos. Use the playlistItems.insert and playlistItems.delete to add or remove items from that list. */
  var favorites: js.UndefOr[String] = js.native
  
  /** The ID of the playlist that contains the channel"s liked videos. Use the playlistItems.insert and playlistItems.delete to add or remove items from that list. */
  var likes: js.UndefOr[String] = js.native
  
  /**
    * The ID of the playlist that contains the channel"s uploaded videos. Use the videos.insert method to upload new videos and the videos.delete method to delete previously uploaded
    * videos.
    */
  var uploads: js.UndefOr[String] = js.native
  
  /** The ID of the playlist that contains the channel"s watch history. Use the playlistItems.insert and playlistItems.delete to add or remove items from that list. */
  var watchHistory: js.UndefOr[String] = js.native
  
  /** The ID of the playlist that contains the channel"s watch later playlist. Use the playlistItems.insert and playlistItems.delete to add or remove items from that list. */
  var watchLater: js.UndefOr[String] = js.native
}
object Favorites {
  
  @scala.inline
  def apply(): Favorites = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Favorites]
  }
  
  @scala.inline
  implicit class FavoritesMutableBuilder[Self <: Favorites] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFavorites(value: String): Self = StObject.set(x, "favorites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFavoritesUndefined: Self = StObject.set(x, "favorites", js.undefined)
    
    @scala.inline
    def setLikes(value: String): Self = StObject.set(x, "likes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLikesUndefined: Self = StObject.set(x, "likes", js.undefined)
    
    @scala.inline
    def setUploads(value: String): Self = StObject.set(x, "uploads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadsUndefined: Self = StObject.set(x, "uploads", js.undefined)
    
    @scala.inline
    def setWatchHistory(value: String): Self = StObject.set(x, "watchHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWatchHistoryUndefined: Self = StObject.set(x, "watchHistory", js.undefined)
    
    @scala.inline
    def setWatchLater(value: String): Self = StObject.set(x, "watchLater", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWatchLaterUndefined: Self = StObject.set(x, "watchLater", js.undefined)
  }
}

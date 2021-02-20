package typings.playerframework.PlayerFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaylistItem extends StObject {
  
  var src: String = js.native
  
  var tracks: js.UndefOr[js.Array[_]] = js.native
}
object PlaylistItem {
  
  @scala.inline
  def apply(src: String): PlaylistItem = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaylistItem]
  }
  
  @scala.inline
  implicit class PlaylistItemMutableBuilder[Self <: PlaylistItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracks(value: js.Array[_]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracksUndefined: Self = StObject.set(x, "tracks", js.undefined)
    
    @scala.inline
    def setTracksVarargs(value: js.Any*): Self = StObject.set(x, "tracks", js.Array(value :_*))
  }
}

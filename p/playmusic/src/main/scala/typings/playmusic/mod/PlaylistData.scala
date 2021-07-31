package typings.playmusic.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaylistData extends StObject {
  
  var items: js.UndefOr[js.Array[PlaylistItem]] = js.undefined
}
object PlaylistData {
  
  @scala.inline
  def apply(): PlaylistData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaylistData]
  }
  
  @scala.inline
  implicit class PlaylistDataMutableBuilder[Self <: PlaylistData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[PlaylistItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: PlaylistItem*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}

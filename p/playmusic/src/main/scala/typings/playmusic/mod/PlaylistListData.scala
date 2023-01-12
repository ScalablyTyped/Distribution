package typings.playmusic.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaylistListData extends StObject {
  
  var items: js.UndefOr[js.Array[PlaylistListItem]] = js.undefined
}
object PlaylistListData {
  
  inline def apply(): PlaylistListData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaylistListData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlaylistListData] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[PlaylistListItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: PlaylistListItem*): Self = StObject.set(x, "items", js.Array(value*))
  }
}

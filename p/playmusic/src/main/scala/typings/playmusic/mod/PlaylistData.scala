package typings.playmusic.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaylistData extends StObject {
  
  var items: js.UndefOr[js.Array[PlaylistItem]] = js.undefined
}
object PlaylistData {
  
  inline def apply(): PlaylistData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaylistData]
  }
  
  extension [Self <: PlaylistData](x: Self) {
    
    inline def setItems(value: js.Array[PlaylistItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: PlaylistItem*): Self = StObject.set(x, "items", js.Array(value*))
  }
}

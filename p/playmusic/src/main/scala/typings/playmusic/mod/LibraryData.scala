package typings.playmusic.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LibraryData extends StObject {
  
  var items: js.UndefOr[js.Array[LibraryItem]] = js.undefined
}
object LibraryData {
  
  inline def apply(): LibraryData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LibraryData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LibraryData] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[LibraryItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: LibraryItem*): Self = StObject.set(x, "items", js.Array(value*))
  }
}

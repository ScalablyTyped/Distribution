package typings.playmusic.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LibraryData extends StObject {
  
  var items: js.UndefOr[js.Array[LibraryItem]] = js.native
}
object LibraryData {
  
  @scala.inline
  def apply(): LibraryData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LibraryData]
  }
  
  @scala.inline
  implicit class LibraryDataMutableBuilder[Self <: LibraryData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[LibraryItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: LibraryItem*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}

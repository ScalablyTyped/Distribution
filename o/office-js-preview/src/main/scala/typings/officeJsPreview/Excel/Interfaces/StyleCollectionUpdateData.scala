package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the StyleCollection object, for use in `styleCollection.set({ ... })`. */
@js.native
trait StyleCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[StyleData]] = js.native
}
object StyleCollectionUpdateData {
  
  @scala.inline
  def apply(): StyleCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleCollectionUpdateData]
  }
  
  @scala.inline
  implicit class StyleCollectionUpdateDataMutableBuilder[Self <: StyleCollectionUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[StyleData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: StyleData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}

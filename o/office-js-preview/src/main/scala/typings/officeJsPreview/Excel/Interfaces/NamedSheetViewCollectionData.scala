package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `namedSheetViewCollection.toJSON()`. */
@js.native
trait NamedSheetViewCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[NamedSheetViewData]] = js.native
}
object NamedSheetViewCollectionData {
  
  @scala.inline
  def apply(): NamedSheetViewCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamedSheetViewCollectionData]
  }
  
  @scala.inline
  implicit class NamedSheetViewCollectionDataMutableBuilder[Self <: NamedSheetViewCollectionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[NamedSheetViewData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: NamedSheetViewData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}

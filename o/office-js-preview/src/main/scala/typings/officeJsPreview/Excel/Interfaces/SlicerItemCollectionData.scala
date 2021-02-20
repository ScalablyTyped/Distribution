package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `slicerItemCollection.toJSON()`. */
@js.native
trait SlicerItemCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[SlicerItemData]] = js.native
}
object SlicerItemCollectionData {
  
  @scala.inline
  def apply(): SlicerItemCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlicerItemCollectionData]
  }
  
  @scala.inline
  implicit class SlicerItemCollectionDataMutableBuilder[Self <: SlicerItemCollectionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[SlicerItemData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SlicerItemData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}

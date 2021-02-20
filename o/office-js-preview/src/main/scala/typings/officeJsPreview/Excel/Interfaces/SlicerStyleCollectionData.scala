package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `slicerStyleCollection.toJSON()`. */
@js.native
trait SlicerStyleCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[SlicerStyleData]] = js.native
}
object SlicerStyleCollectionData {
  
  @scala.inline
  def apply(): SlicerStyleCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlicerStyleCollectionData]
  }
  
  @scala.inline
  implicit class SlicerStyleCollectionDataMutableBuilder[Self <: SlicerStyleCollectionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[SlicerStyleData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SlicerStyleData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}

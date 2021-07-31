package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `slicerCollection.toJSON()`. */
trait SlicerCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[SlicerData]] = js.undefined
}
object SlicerCollectionData {
  
  @scala.inline
  def apply(): SlicerCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlicerCollectionData]
  }
  
  @scala.inline
  implicit class SlicerCollectionDataMutableBuilder[Self <: SlicerCollectionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[SlicerData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SlicerData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}

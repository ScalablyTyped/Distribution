package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `slicerStyleCollection.toJSON()`. */
trait SlicerStyleCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[SlicerStyleData]] = js.undefined
}
object SlicerStyleCollectionData {
  
  inline def apply(): SlicerStyleCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlicerStyleCollectionData]
  }
  
  extension [Self <: SlicerStyleCollectionData](x: Self) {
    
    inline def setItems(value: js.Array[SlicerStyleData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SlicerStyleData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}

package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `pivotTableStyleCollection.toJSON()`. */
trait PivotTableStyleCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[PivotTableStyleData]] = js.undefined
}
object PivotTableStyleCollectionData {
  
  inline def apply(): PivotTableStyleCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotTableStyleCollectionData]
  }
  
  extension [Self <: PivotTableStyleCollectionData](x: Self) {
    
    inline def setItems(value: js.Array[PivotTableStyleData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: PivotTableStyleData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}

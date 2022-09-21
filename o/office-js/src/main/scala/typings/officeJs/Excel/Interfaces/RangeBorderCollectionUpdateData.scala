package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the RangeBorderCollection object, for use in `rangeBorderCollection.set({ ... })`. */
trait RangeBorderCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[RangeBorderData]] = js.undefined
  
  /**
    * Specifies a double that lightens or darkens a color for range borders. The value is between -1 (darkest) and 1 (brightest), with 0 for the original color.
    A `null` value indicates that the entire border collection doesn't have a uniform `tintAndShade` setting.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var tintAndShade: js.UndefOr[Double] = js.undefined
}
object RangeBorderCollectionUpdateData {
  
  inline def apply(): RangeBorderCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeBorderCollectionUpdateData]
  }
  
  extension [Self <: RangeBorderCollectionUpdateData](x: Self) {
    
    inline def setItems(value: js.Array[RangeBorderData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: RangeBorderData*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setTintAndShade(value: Double): Self = StObject.set(x, "tintAndShade", value.asInstanceOf[js.Any])
    
    inline def setTintAndShadeUndefined: Self = StObject.set(x, "tintAndShade", js.undefined)
  }
}

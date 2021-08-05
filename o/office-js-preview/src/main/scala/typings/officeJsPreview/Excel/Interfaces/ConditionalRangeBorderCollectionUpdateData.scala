package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ConditionalRangeBorderCollection object, for use in `conditionalRangeBorderCollection.set({ ... })`. */
trait ConditionalRangeBorderCollectionUpdateData extends StObject {
  
  /**
    *
    * Gets the bottom border.
    *
    * [Api set: ExcelApi 1.6]
    */
  var bottom: js.UndefOr[ConditionalRangeBorderUpdateData] = js.undefined
  
  var items: js.UndefOr[js.Array[ConditionalRangeBorderData]] = js.undefined
  
  /**
    *
    * Gets the left border.
    *
    * [Api set: ExcelApi 1.6]
    */
  var left: js.UndefOr[ConditionalRangeBorderUpdateData] = js.undefined
  
  /**
    *
    * Gets the right border.
    *
    * [Api set: ExcelApi 1.6]
    */
  var right: js.UndefOr[ConditionalRangeBorderUpdateData] = js.undefined
  
  /**
    *
    * Gets the top border.
    *
    * [Api set: ExcelApi 1.6]
    */
  var top: js.UndefOr[ConditionalRangeBorderUpdateData] = js.undefined
}
object ConditionalRangeBorderCollectionUpdateData {
  
  inline def apply(): ConditionalRangeBorderCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalRangeBorderCollectionUpdateData]
  }
  
  extension [Self <: ConditionalRangeBorderCollectionUpdateData](x: Self) {
    
    inline def setBottom(value: ConditionalRangeBorderUpdateData): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    inline def setItems(value: js.Array[ConditionalRangeBorderData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: ConditionalRangeBorderData*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setLeft(value: ConditionalRangeBorderUpdateData): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setRight(value: ConditionalRangeBorderUpdateData): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setTop(value: ConditionalRangeBorderUpdateData): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}

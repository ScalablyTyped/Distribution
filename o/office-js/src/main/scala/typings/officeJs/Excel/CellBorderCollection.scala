package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the `format.borders` properties of `getCellProperties`, `getRowProperties`, and `getColumnProperties` or the `format.borders` input parameter of `setCellProperties`, `setRowProperties`, and `setColumnProperties`.
  *
  * [Api set: ExcelApi 1.9]
  */
trait CellBorderCollection extends StObject {
  
  /**
    *
    * Represents the `format.borders.bottom` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var bottom: js.UndefOr[CellBorder] = js.undefined
  
  /**
    *
    * Represents the `format.borders.diagonalDown` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var diagonalDown: js.UndefOr[CellBorder] = js.undefined
  
  /**
    *
    * Represents the `format.borders.diagonalUp` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var diagonalUp: js.UndefOr[CellBorder] = js.undefined
  
  /**
    *
    * Represents the `format.borders.horizontal` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var horizontal: js.UndefOr[CellBorder] = js.undefined
  
  /**
    *
    * Represents the `format.borders.left` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var left: js.UndefOr[CellBorder] = js.undefined
  
  /**
    *
    * Represents the `format.borders.right` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var right: js.UndefOr[CellBorder] = js.undefined
  
  /**
    *
    * Represents the `format.borders.top` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var top: js.UndefOr[CellBorder] = js.undefined
  
  /**
    *
    * Represents the `format.borders.vertical` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var vertical: js.UndefOr[CellBorder] = js.undefined
}
object CellBorderCollection {
  
  inline def apply(): CellBorderCollection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellBorderCollection]
  }
  
  extension [Self <: CellBorderCollection](x: Self) {
    
    inline def setBottom(value: CellBorder): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    inline def setDiagonalDown(value: CellBorder): Self = StObject.set(x, "diagonalDown", value.asInstanceOf[js.Any])
    
    inline def setDiagonalDownUndefined: Self = StObject.set(x, "diagonalDown", js.undefined)
    
    inline def setDiagonalUp(value: CellBorder): Self = StObject.set(x, "diagonalUp", value.asInstanceOf[js.Any])
    
    inline def setDiagonalUpUndefined: Self = StObject.set(x, "diagonalUp", js.undefined)
    
    inline def setHorizontal(value: CellBorder): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
    
    inline def setLeft(value: CellBorder): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setRight(value: CellBorder): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setTop(value: CellBorder): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setVertical(value: CellBorder): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
  }
}

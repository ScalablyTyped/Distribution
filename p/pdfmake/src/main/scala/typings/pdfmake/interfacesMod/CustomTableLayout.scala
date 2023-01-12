package typings.pdfmake.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomTableLayout
  extends StObject
     with _TableLayout {
  
  /**
    * Controls whether the table has any borders by default.
    *
    * If set to `false`, borders can only be added to cells via their `border` property.
    *
    * Defaults to `true`.
    */
  var defaultBorder: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Background color the table's cells are filled with.
    *
    * Supports well-known color names like `blue` or hexadecimal color strings like `#ccffcc`,
    * as well as a reference to a pattern.
    */
  var fillColor: js.UndefOr[String | PatternFill | (DynamicCellLayout[String | PatternFill])] = js.undefined
  
  /**
    * Opacity of the {@link fillColor}.
    * Must be between 0 (fully transparent) and 1 (fully opaque).
    *
    * Defaults to `1`.
    */
  var fillOpacity: js.UndefOr[Double | DynamicCellLayout[Double]] = js.undefined
  
  /**
    * Color of horizontal lines, optionally depending on the row (0 = line above
    * the top row) and column number (0 = left-most column).
    *
    * Can be overridden for each cell via {@link TableCellProperties.borderColor}.
    *
    * Defaults to `black`.
    */
  var hLineColor: js.UndefOr[String | DynamicCellLayout[String]] = js.undefined
  
  /**
    * Style of horizontal lines depending on the row number
    * (0 = line above the top row).
    *
    * **Note**: Does not allow an explicit value of `undefined`.
    *
    * Defaults to a solid line.
    */
  var hLineStyle: js.UndefOr[DynamicLayout[LineStyle]] = js.undefined
  
  /**
    * Width of horizontal lines in `pt` depending on the row number
    * (0 = line above the first row).
    *
    * **Note**: Does not allow an explicit value of `undefined`.
    *
    * Defaults to `1`.
    */
  var hLineWidth: js.UndefOr[DynamicLayout[Double]] = js.undefined
  
  /**
    * Padding in `pt` at the bottom of each cell of a row
    * (0 = top row).
    *
    * **Note**: Does not allow an explicit value of `undefined`.
    *
    * Defaults to `2`.
    */
  var paddingBottom: js.UndefOr[DynamicLayout[Double]] = js.undefined
  
  /**
    * Padding in `pt` to the left of each column
    * (0 = left-most column).
    *
    * **Note**: Does not allow an explicit value of `undefined`.
    *
    * Defaults to `4`.
    */
  var paddingLeft: js.UndefOr[VerticalDynamicLayout[Double]] = js.undefined
  
  /**
    * Padding in `pt` to the right of each column
    * (0 = left-most column).
    *
    * **Note**: Does not allow an explicit value of `undefined`.
    *
    * Defaults to `4`.
    */
  var paddingRight: js.UndefOr[VerticalDynamicLayout[Double]] = js.undefined
  
  /**
    * Padding in `pt` at the top of each cell of a row
    * (0 = top row).
    *
    * **Note**: Does not allow an explicit value of `undefined`.
    *
    * Defaults to `2`.
    */
  var paddingTop: js.UndefOr[DynamicLayout[Double]] = js.undefined
  
  /**
    * Color of vertical lines, optionally depending on the column (0 = line left
    * of the left-most column) and row number (0 = top row).
    *
    * Can be overridden for each cell via {@link TableCellProperties.borderColor}.
    *
    * Defaults to `black`.
    */
  var vLineColor: js.UndefOr[String | VerticalDynamicCellLayout[String]] = js.undefined
  
  /**
    * Style of vertical lines depending on the column number
    * (0 = line to the left of the left-most column).
    *
    * **Note**: Does not allow an explicit value of `undefined`.
    *
    * Defaults to a solid line.
    */
  var vLineStyle: js.UndefOr[VerticalDynamicLayout[LineStyle]] = js.undefined
  
  /**
    * Width of vertical lines in `pt` depending on the column number
    * (0 = line to the left of the left-most column).
    *
    * **Note**: Does not allow an explicit value of `undefined`.
    *
    * Defaults to `1`.
    */
  var vLineWidth: js.UndefOr[VerticalDynamicLayout[Double]] = js.undefined
}
object CustomTableLayout {
  
  inline def apply(): CustomTableLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomTableLayout]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomTableLayout] (val x: Self) extends AnyVal {
    
    inline def setDefaultBorder(value: Boolean): Self = StObject.set(x, "defaultBorder", value.asInstanceOf[js.Any])
    
    inline def setDefaultBorderUndefined: Self = StObject.set(x, "defaultBorder", js.undefined)
    
    inline def setFillColor(value: String | PatternFill | (DynamicCellLayout[String | PatternFill])): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    inline def setFillColorFunction3(
      value: (/* rowIndex */ Double, /* node */ ContentTable, /* columnIndex */ Double) => (String | PatternFill) | Null
    ): Self = StObject.set(x, "fillColor", js.Any.fromFunction3(value))
    
    inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    inline def setFillOpacity(value: Double | DynamicCellLayout[Double]): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    inline def setFillOpacityFunction3(value: (/* rowIndex */ Double, /* node */ ContentTable, /* columnIndex */ Double) => Double | Null): Self = StObject.set(x, "fillOpacity", js.Any.fromFunction3(value))
    
    inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
    
    inline def setHLineColor(value: String | DynamicCellLayout[String]): Self = StObject.set(x, "hLineColor", value.asInstanceOf[js.Any])
    
    inline def setHLineColorFunction3(value: (/* rowIndex */ Double, /* node */ ContentTable, /* columnIndex */ Double) => String | Null): Self = StObject.set(x, "hLineColor", js.Any.fromFunction3(value))
    
    inline def setHLineColorUndefined: Self = StObject.set(x, "hLineColor", js.undefined)
    
    inline def setHLineStyle(value: (/* rowIndex */ Double, /* node */ ContentTable) => LineStyle | Null): Self = StObject.set(x, "hLineStyle", js.Any.fromFunction2(value))
    
    inline def setHLineStyleUndefined: Self = StObject.set(x, "hLineStyle", js.undefined)
    
    inline def setHLineWidth(value: (/* rowIndex */ Double, /* node */ ContentTable) => Double | Null): Self = StObject.set(x, "hLineWidth", js.Any.fromFunction2(value))
    
    inline def setHLineWidthUndefined: Self = StObject.set(x, "hLineWidth", js.undefined)
    
    inline def setPaddingBottom(value: (/* rowIndex */ Double, /* node */ ContentTable) => Double | Null): Self = StObject.set(x, "paddingBottom", js.Any.fromFunction2(value))
    
    inline def setPaddingBottomUndefined: Self = StObject.set(x, "paddingBottom", js.undefined)
    
    inline def setPaddingLeft(value: (/* columnIndex */ Double, /* node */ ContentTable) => Double | Null): Self = StObject.set(x, "paddingLeft", js.Any.fromFunction2(value))
    
    inline def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
    
    inline def setPaddingRight(value: (/* columnIndex */ Double, /* node */ ContentTable) => Double | Null): Self = StObject.set(x, "paddingRight", js.Any.fromFunction2(value))
    
    inline def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
    
    inline def setPaddingTop(value: (/* rowIndex */ Double, /* node */ ContentTable) => Double | Null): Self = StObject.set(x, "paddingTop", js.Any.fromFunction2(value))
    
    inline def setPaddingTopUndefined: Self = StObject.set(x, "paddingTop", js.undefined)
    
    inline def setVLineColor(value: String | VerticalDynamicCellLayout[String]): Self = StObject.set(x, "vLineColor", value.asInstanceOf[js.Any])
    
    inline def setVLineColorFunction3(value: (/* columnIndex */ Double, /* node */ ContentTable, /* rowIndex */ Double) => String | Null): Self = StObject.set(x, "vLineColor", js.Any.fromFunction3(value))
    
    inline def setVLineColorUndefined: Self = StObject.set(x, "vLineColor", js.undefined)
    
    inline def setVLineStyle(value: (/* columnIndex */ Double, /* node */ ContentTable) => LineStyle | Null): Self = StObject.set(x, "vLineStyle", js.Any.fromFunction2(value))
    
    inline def setVLineStyleUndefined: Self = StObject.set(x, "vLineStyle", js.undefined)
    
    inline def setVLineWidth(value: (/* columnIndex */ Double, /* node */ ContentTable) => Double | Null): Self = StObject.set(x, "vLineWidth", js.Any.fromFunction2(value))
    
    inline def setVLineWidthUndefined: Self = StObject.set(x, "vLineWidth", js.undefined)
  }
}

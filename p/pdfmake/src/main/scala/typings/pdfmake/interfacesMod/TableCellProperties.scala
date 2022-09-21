package typings.pdfmake.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableCellProperties extends StObject {
  
  /**
    * Controls on which sides the cell has borders.
    *
    * Tuple order: `[left, top, right, bottom]`
    *
    * Defaults to `[true, true, true, true]`.
    */
  var border: js.UndefOr[js.Tuple4[Boolean, Boolean, Boolean, Boolean]] = js.undefined
  
  /**
    * Color of the border on each side of the cell.
    *
    * Tuple order: `[left, top, right, bottom]`
    *
    * Supports well-known color names like `blue` or hexadecimal color strings like `#ccffcc`.
    *
    * Defaults to the border color defined by the given table layout, or `black` on all sides.
    */
  var borderColor: js.UndefOr[js.Tuple4[String, String, String, String]] = js.undefined
  
  /**
    * Number of columns the cell spans.
    *
    * Cells covered by this cell still need to be declared. They should be
    * filled with an empty object placeholder (`{}`).
    *
    * Defaults to `1`.
    */
  var colSpan: js.UndefOr[Double] = js.undefined
  
  /**
    * Opacity of the given {@link overlayPattern}.
    * Must be between 0 (fully transparent) and 1 (fully opaque).
    *
    * Defaults to `1`.
    */
  var overlayOpacity: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Overlays the cell with the given pattern.
    */
  var overlayPattern: js.UndefOr[PatternFill] = js.undefined
  
  /**
    * Number of rows the cell spans.
    *
    * Cells covered by this cell still need to be declared. They should be
    * filled with an empty object placeholder (`{}`).
    *
    * Defaults to `1`.
    */
  var rowSpan: js.UndefOr[Double] = js.undefined
}
object TableCellProperties {
  
  inline def apply(): TableCellProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableCellProperties]
  }
  
  extension [Self <: TableCellProperties](x: Self) {
    
    inline def setBorder(value: js.Tuple4[Boolean, Boolean, Boolean, Boolean]): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderColor(value: js.Tuple4[String, String, String, String]): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
    
    inline def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
    
    inline def setOverlayOpacity(value: Double): Self = StObject.set(x, "overlayOpacity", value.asInstanceOf[js.Any])
    
    inline def setOverlayOpacityNull: Self = StObject.set(x, "overlayOpacity", null)
    
    inline def setOverlayOpacityUndefined: Self = StObject.set(x, "overlayOpacity", js.undefined)
    
    inline def setOverlayPattern(value: PatternFill): Self = StObject.set(x, "overlayPattern", value.asInstanceOf[js.Any])
    
    inline def setOverlayPatternUndefined: Self = StObject.set(x, "overlayPattern", js.undefined)
    
    inline def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
    
    inline def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
  }
}

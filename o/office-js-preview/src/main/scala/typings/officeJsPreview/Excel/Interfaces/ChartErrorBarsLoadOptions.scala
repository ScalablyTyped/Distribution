package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This object represents the attributes for a chart's error bars.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
trait ChartErrorBarsLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies if error bars have an end style cap.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var endStyleCap: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the formatting type of the error bars.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var format: js.UndefOr[ChartErrorBarsFormatLoadOptions] = js.undefined
  
  /**
    * Specifies which parts of the error bars to include.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var include: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The type of range marked by the error bars.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var `type`: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether the error bars are displayed.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object ChartErrorBarsLoadOptions {
  
  inline def apply(): ChartErrorBarsLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartErrorBarsLoadOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChartErrorBarsLoadOptions] (val x: Self) extends AnyVal {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setEndStyleCap(value: Boolean): Self = StObject.set(x, "endStyleCap", value.asInstanceOf[js.Any])
    
    inline def setEndStyleCapUndefined: Self = StObject.set(x, "endStyleCap", js.undefined)
    
    inline def setFormat(value: ChartErrorBarsFormatLoadOptions): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setInclude(value: Boolean): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setType(value: Boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}

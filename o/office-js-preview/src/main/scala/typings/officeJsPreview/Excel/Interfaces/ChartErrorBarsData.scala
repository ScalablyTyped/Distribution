package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.ChartErrorBarsInclude
import typings.officeJsPreview.Excel.ChartErrorBarsType
import typings.officeJsPreview.officeJsPreviewStrings.Both
import typings.officeJsPreview.officeJsPreviewStrings.Custom
import typings.officeJsPreview.officeJsPreviewStrings.FixedValue
import typings.officeJsPreview.officeJsPreviewStrings.MinusValues
import typings.officeJsPreview.officeJsPreviewStrings.Percent
import typings.officeJsPreview.officeJsPreviewStrings.PlusValues
import typings.officeJsPreview.officeJsPreviewStrings.StDev
import typings.officeJsPreview.officeJsPreviewStrings.StError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `chartErrorBars.toJSON()`. */
trait ChartErrorBarsData extends StObject {
  
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
  var format: js.UndefOr[ChartErrorBarsFormatData] = js.undefined
  
  /**
    * Specifies which parts of the error bars to include.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var include: js.UndefOr[ChartErrorBarsInclude | Both | MinusValues | PlusValues] = js.undefined
  
  /**
    * The type of range marked by the error bars.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var `type`: js.UndefOr[ChartErrorBarsType | FixedValue | Percent | StDev | StError | Custom] = js.undefined
  
  /**
    * Specifies whether the error bars are displayed.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object ChartErrorBarsData {
  
  inline def apply(): ChartErrorBarsData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartErrorBarsData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChartErrorBarsData] (val x: Self) extends AnyVal {
    
    inline def setEndStyleCap(value: Boolean): Self = StObject.set(x, "endStyleCap", value.asInstanceOf[js.Any])
    
    inline def setEndStyleCapUndefined: Self = StObject.set(x, "endStyleCap", js.undefined)
    
    inline def setFormat(value: ChartErrorBarsFormatData): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setInclude(value: ChartErrorBarsInclude | Both | MinusValues | PlusValues): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setType(value: ChartErrorBarsType | FixedValue | Percent | StDev | StError | Custom): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}

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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ChartErrorBars object, for use in `chartErrorBars.set({ ... })`. */
@js.native
trait ChartErrorBarsUpdateData extends StObject {
  
  /**
    *
    * Specifies if error bars have an end style cap.
    *
    * [Api set: ExcelApi 1.9]
    */
  var endStyleCap: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies the formatting type of the error bars.
    *
    * [Api set: ExcelApi 1.9]
    */
  var format: js.UndefOr[ChartErrorBarsFormatUpdateData] = js.native
  
  /**
    *
    * Specifies which parts of the error bars to include.
    *
    * [Api set: ExcelApi 1.9]
    */
  var include: js.UndefOr[ChartErrorBarsInclude | Both | MinusValues | PlusValues] = js.native
  
  /**
    *
    * The type of range marked by the error bars.
    *
    * [Api set: ExcelApi 1.9]
    */
  var `type`: js.UndefOr[ChartErrorBarsType | FixedValue | Percent | StDev | StError | Custom] = js.native
  
  /**
    *
    * Specifies whether the error bars are displayed.
    *
    * [Api set: ExcelApi 1.9]
    */
  var visible: js.UndefOr[Boolean] = js.native
}
object ChartErrorBarsUpdateData {
  
  @scala.inline
  def apply(): ChartErrorBarsUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartErrorBarsUpdateData]
  }
  
  @scala.inline
  implicit class ChartErrorBarsUpdateDataMutableBuilder[Self <: ChartErrorBarsUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndStyleCap(value: Boolean): Self = StObject.set(x, "endStyleCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndStyleCapUndefined: Self = StObject.set(x, "endStyleCap", js.undefined)
    
    @scala.inline
    def setFormat(value: ChartErrorBarsFormatUpdateData): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setInclude(value: ChartErrorBarsInclude | Both | MinusValues | PlusValues): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    @scala.inline
    def setType(value: ChartErrorBarsType | FixedValue | Percent | StDev | StError | Custom): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}

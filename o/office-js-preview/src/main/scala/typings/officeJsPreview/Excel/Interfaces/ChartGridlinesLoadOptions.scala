package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents major or minor gridlines on a chart axis.
  *
  * [Api set: ExcelApi 1.1]
  */
trait ChartGridlinesLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Represents the formatting of chart gridlines.
    *
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[ChartGridlinesFormatLoadOptions] = js.undefined
  
  /**
    *
    * Specifies if the axis gridlines are visible.
    *
    * [Api set: ExcelApi 1.1]
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object ChartGridlinesLoadOptions {
  
  @scala.inline
  def apply(): ChartGridlinesLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartGridlinesLoadOptions]
  }
  
  @scala.inline
  implicit class ChartGridlinesLoadOptionsMutableBuilder[Self <: ChartGridlinesLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    @scala.inline
    def setFormat(value: ChartGridlinesFormatLoadOptions): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}

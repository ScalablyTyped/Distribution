package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the legendEntry in legendEntryCollection.
  *
  * [Api set: ExcelApi 1.7]
  */
trait ChartLegendEntryLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies the height of the legendEntry on the chart legend.
    *
    * [Api set: ExcelApi 1.8]
    */
  var height: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies the index of the legendEntry in the chart legend.
    *
    * [Api set: ExcelApi 1.8]
    */
  var index: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies the left of a chart legendEntry.
    *
    * [Api set: ExcelApi 1.8]
    */
  var left: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies the top of a chart legendEntry.
    *
    * [Api set: ExcelApi 1.8]
    */
  var top: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Represents the visible of a chart legend entry.
    *
    * [Api set: ExcelApi 1.7]
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Represents the width of the legendEntry on the chart Legend.
    *
    * [Api set: ExcelApi 1.8]
    */
  var width: js.UndefOr[Boolean] = js.undefined
}
object ChartLegendEntryLoadOptions {
  
  @scala.inline
  def apply(): ChartLegendEntryLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartLegendEntryLoadOptions]
  }
  
  @scala.inline
  implicit class ChartLegendEntryLoadOptionsMutableBuilder[Self <: ChartLegendEntryLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    @scala.inline
    def setHeight(value: Boolean): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setIndex(value: Boolean): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setLeft(value: Boolean): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    @scala.inline
    def setWidth(value: Boolean): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}

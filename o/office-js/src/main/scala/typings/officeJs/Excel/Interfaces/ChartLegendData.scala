package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.ChartLegendPosition
import typings.officeJs.officeJsStrings.Bottom
import typings.officeJs.officeJsStrings.Corner
import typings.officeJs.officeJsStrings.Custom
import typings.officeJs.officeJsStrings.Invalid
import typings.officeJs.officeJsStrings.Left
import typings.officeJs.officeJsStrings.Right
import typings.officeJs.officeJsStrings.Top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `chartLegend.toJSON()`. */
@js.native
trait ChartLegendData extends StObject {
  
  /**
    *
    * Represents the formatting of a chart legend, which includes fill and font formatting.
    *
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[ChartLegendFormatData] = js.native
  
  /**
    *
    * Specifies the height, in points, of the legend on the chart. Null if legend is not visible.
    *
    * [Api set: ExcelApi 1.7]
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    *
    * Specifies the left, in points, of the legend on the chart. Null if legend is not visible.
    *
    * [Api set: ExcelApi 1.7]
    */
  var left: js.UndefOr[Double] = js.native
  
  /**
    *
    * Represents a collection of legendEntries in the legend.
    *
    * [Api set: ExcelApi 1.7]
    */
  var legendEntries: js.UndefOr[js.Array[ChartLegendEntryData]] = js.native
  
  /**
    *
    * Specifies if the chart legend should overlap with the main body of the chart.
    *
    * [Api set: ExcelApi 1.1]
    */
  var overlay: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies the position of the legend on the chart. See Excel.ChartLegendPosition for details.
    *
    * [Api set: ExcelApi 1.1]
    */
  var position: js.UndefOr[ChartLegendPosition | Invalid | Top | Bottom | Left | Right | Corner | Custom] = js.native
  
  /**
    *
    * Specifies if the legend has a shadow on the chart.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showShadow: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies the top of a chart legend.
    *
    * [Api set: ExcelApi 1.7]
    */
  var top: js.UndefOr[Double] = js.native
  
  /**
    *
    * Specifies if the ChartLegend is visible.
    *
    * [Api set: ExcelApi 1.1]
    */
  var visible: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies the width, in points, of the legend on the chart. Null if legend is not visible.
    *
    * [Api set: ExcelApi 1.7]
    */
  var width: js.UndefOr[Double] = js.native
}
object ChartLegendData {
  
  @scala.inline
  def apply(): ChartLegendData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartLegendData]
  }
  
  @scala.inline
  implicit class ChartLegendDataMutableBuilder[Self <: ChartLegendData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: ChartLegendFormatData): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setLegendEntries(value: js.Array[ChartLegendEntryData]): Self = StObject.set(x, "legendEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendEntriesUndefined: Self = StObject.set(x, "legendEntries", js.undefined)
    
    @scala.inline
    def setLegendEntriesVarargs(value: ChartLegendEntryData*): Self = StObject.set(x, "legendEntries", js.Array(value :_*))
    
    @scala.inline
    def setOverlay(value: Boolean): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
    
    @scala.inline
    def setPosition(value: ChartLegendPosition | Invalid | Top | Bottom | Left | Right | Corner | Custom): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setShowShadow(value: Boolean): Self = StObject.set(x, "showShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowShadowUndefined: Self = StObject.set(x, "showShadow", js.undefined)
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}

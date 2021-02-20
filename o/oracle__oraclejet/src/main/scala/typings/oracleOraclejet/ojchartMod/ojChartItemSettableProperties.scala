package typings.oracleOraclejet.ojchartMod

import typings.oracleOraclejet.anon.MedianSvgStyle
import typings.oracleOraclejet.mod.JetSettableProperties
import typings.oracleOraclejet.oracleOraclejetStrings.aboveMarker
import typings.oracleOraclejet.oracleOraclejetStrings.afterMarker
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.beforeMarker
import typings.oracleOraclejet.oracleOraclejetStrings.belowMarker
import typings.oracleOraclejet.oracleOraclejetStrings.center
import typings.oracleOraclejet.oracleOraclejetStrings.circle
import typings.oracleOraclejet.oracleOraclejetStrings.diamond
import typings.oracleOraclejet.oracleOraclejetStrings.human
import typings.oracleOraclejet.oracleOraclejetStrings.inherit
import typings.oracleOraclejet.oracleOraclejetStrings.insideBarEdge
import typings.oracleOraclejet.oracleOraclejetStrings.largeChecker
import typings.oracleOraclejet.oracleOraclejetStrings.largeCrosshatch
import typings.oracleOraclejet.oracleOraclejetStrings.largeDiagonalLeft
import typings.oracleOraclejet.oracleOraclejetStrings.largeDiagonalRight
import typings.oracleOraclejet.oracleOraclejetStrings.largeDiamond
import typings.oracleOraclejet.oracleOraclejetStrings.largeTriangle
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.outsideBarEdge
import typings.oracleOraclejet.oracleOraclejetStrings.outsideSlice
import typings.oracleOraclejet.oracleOraclejetStrings.plus
import typings.oracleOraclejet.oracleOraclejetStrings.smallChecker
import typings.oracleOraclejet.oracleOraclejetStrings.smallCrosshatch
import typings.oracleOraclejet.oracleOraclejetStrings.smallDiagonalLeft
import typings.oracleOraclejet.oracleOraclejetStrings.smallDiagonalRight
import typings.oracleOraclejet.oracleOraclejetStrings.smallDiamond
import typings.oracleOraclejet.oracleOraclejetStrings.smallTriangle
import typings.oracleOraclejet.oracleOraclejetStrings.square
import typings.oracleOraclejet.oracleOraclejetStrings.star
import typings.oracleOraclejet.oracleOraclejetStrings.triangleDown
import typings.oracleOraclejet.oracleOraclejetStrings.triangleUp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojChartItemSettableProperties extends JetSettableProperties {
  
  var borderColor: js.UndefOr[String] = js.native
  
  var borderWidth: js.UndefOr[Double] = js.native
  
  var boxPlot: js.UndefOr[MedianSvgStyle] = js.native
  
  var categories: js.UndefOr[js.Array[String]] = js.native
  
  var close: js.UndefOr[Double] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var drilling: js.UndefOr[on | off | inherit] = js.native
  
  var groupId: js.Array[String | Double] = js.native
  
  var high: js.UndefOr[Double] = js.native
  
  var items: js.UndefOr[js.Array[Double | js.Object]] = js.native
  
  var label: js.UndefOr[String | js.Array[String]] = js.native
  
  var labelPosition: js.UndefOr[
    center | outsideSlice | aboveMarker | belowMarker | beforeMarker | afterMarker | insideBarEdge | outsideBarEdge | none | auto
  ] = js.native
  
  var labelStyle: js.UndefOr[js.Object | js.Array[js.Object]] = js.native
  
  var low: js.UndefOr[Double] = js.native
  
  var markerDisplayed: js.UndefOr[on | off | auto] = js.native
  
  var markerShape: js.UndefOr[
    circle | diamond | human | plus | square | star | triangleDown | triangleUp | auto | String
  ] = js.native
  
  var markerSize: js.UndefOr[Double] = js.native
  
  var open: js.UndefOr[Double] = js.native
  
  var pattern: js.UndefOr[
    smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle | largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | auto
  ] = js.native
  
  var q1: js.UndefOr[Double] = js.native
  
  var q2: js.UndefOr[Double] = js.native
  
  var q3: js.UndefOr[Double] = js.native
  
  var seriesId: String | Double = js.native
  
  var shortDesc: js.UndefOr[String] = js.native
  
  var source: js.UndefOr[String] = js.native
  
  var sourceHover: js.UndefOr[String] = js.native
  
  var sourceHoverSelected: js.UndefOr[String] = js.native
  
  var sourceSelected: js.UndefOr[String] = js.native
  
  var svgClassName: js.UndefOr[String] = js.native
  
  var svgStyle: js.UndefOr[js.Object] = js.native
  
  var targetValue: js.UndefOr[Double] = js.native
  
  var value: js.UndefOr[Double] = js.native
  
  var volume: js.UndefOr[Double] = js.native
  
  var x: js.UndefOr[Double | String] = js.native
  
  var y: js.UndefOr[Double] = js.native
  
  var z: js.UndefOr[Double] = js.native
}
object ojChartItemSettableProperties {
  
  @scala.inline
  def apply(groupId: js.Array[String | Double], seriesId: String | Double): ojChartItemSettableProperties = {
    val __obj = js.Dynamic.literal(groupId = groupId.asInstanceOf[js.Any], seriesId = seriesId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojChartItemSettableProperties]
  }
  
  @scala.inline
  implicit class ojChartItemSettablePropertiesMutableBuilder[Self <: ojChartItemSettableProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    @scala.inline
    def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    @scala.inline
    def setBoxPlot(value: MedianSvgStyle): Self = StObject.set(x, "boxPlot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoxPlotUndefined: Self = StObject.set(x, "boxPlot", js.undefined)
    
    @scala.inline
    def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    @scala.inline
    def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value :_*))
    
    @scala.inline
    def setClose(value: Double): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDrilling(value: on | off | inherit): Self = StObject.set(x, "drilling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrillingUndefined: Self = StObject.set(x, "drilling", js.undefined)
    
    @scala.inline
    def setGroupId(value: js.Array[String | Double]): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupIdVarargs(value: (String | Double)*): Self = StObject.set(x, "groupId", js.Array(value :_*))
    
    @scala.inline
    def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[Double | js.Object]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: (Double | js.Object)*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setLabel(value: String | js.Array[String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelPosition(
      value: center | outsideSlice | aboveMarker | belowMarker | beforeMarker | afterMarker | insideBarEdge | outsideBarEdge | none | auto
    ): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelPositionUndefined: Self = StObject.set(x, "labelPosition", js.undefined)
    
    @scala.inline
    def setLabelStyle(value: js.Object | js.Array[js.Object]): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
    
    @scala.inline
    def setLabelStyleVarargs(value: js.Object*): Self = StObject.set(x, "labelStyle", js.Array(value :_*))
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setLabelVarargs(value: String*): Self = StObject.set(x, "label", js.Array(value :_*))
    
    @scala.inline
    def setLow(value: Double): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowUndefined: Self = StObject.set(x, "low", js.undefined)
    
    @scala.inline
    def setMarkerDisplayed(value: on | off | auto): Self = StObject.set(x, "markerDisplayed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerDisplayedUndefined: Self = StObject.set(x, "markerDisplayed", js.undefined)
    
    @scala.inline
    def setMarkerShape(value: circle | diamond | human | plus | square | star | triangleDown | triangleUp | auto | String): Self = StObject.set(x, "markerShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerShapeUndefined: Self = StObject.set(x, "markerShape", js.undefined)
    
    @scala.inline
    def setMarkerSize(value: Double): Self = StObject.set(x, "markerSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerSizeUndefined: Self = StObject.set(x, "markerSize", js.undefined)
    
    @scala.inline
    def setOpen(value: Double): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    @scala.inline
    def setPattern(
      value: smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle | largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | auto
    ): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    @scala.inline
    def setQ1(value: Double): Self = StObject.set(x, "q1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQ1Undefined: Self = StObject.set(x, "q1", js.undefined)
    
    @scala.inline
    def setQ2(value: Double): Self = StObject.set(x, "q2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQ2Undefined: Self = StObject.set(x, "q2", js.undefined)
    
    @scala.inline
    def setQ3(value: Double): Self = StObject.set(x, "q3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQ3Undefined: Self = StObject.set(x, "q3", js.undefined)
    
    @scala.inline
    def setSeriesId(value: String | Double): Self = StObject.set(x, "seriesId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortDesc(value: String): Self = StObject.set(x, "shortDesc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortDescUndefined: Self = StObject.set(x, "shortDesc", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceHover(value: String): Self = StObject.set(x, "sourceHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceHoverSelected(value: String): Self = StObject.set(x, "sourceHoverSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceHoverSelectedUndefined: Self = StObject.set(x, "sourceHoverSelected", js.undefined)
    
    @scala.inline
    def setSourceHoverUndefined: Self = StObject.set(x, "sourceHover", js.undefined)
    
    @scala.inline
    def setSourceSelected(value: String): Self = StObject.set(x, "sourceSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceSelectedUndefined: Self = StObject.set(x, "sourceSelected", js.undefined)
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setSvgClassName(value: String): Self = StObject.set(x, "svgClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSvgClassNameUndefined: Self = StObject.set(x, "svgClassName", js.undefined)
    
    @scala.inline
    def setSvgStyle(value: js.Object): Self = StObject.set(x, "svgStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSvgStyleUndefined: Self = StObject.set(x, "svgStyle", js.undefined)
    
    @scala.inline
    def setTargetValue(value: Double): Self = StObject.set(x, "targetValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetValueUndefined: Self = StObject.set(x, "targetValue", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
    
    @scala.inline
    def setX(value: Double | String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    @scala.inline
    def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZUndefined: Self = StObject.set(x, "z", js.undefined)
  }
}

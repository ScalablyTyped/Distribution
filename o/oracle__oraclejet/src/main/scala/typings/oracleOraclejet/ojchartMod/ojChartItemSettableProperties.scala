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
  implicit class ojChartItemSettablePropertiesOps[Self <: ojChartItemSettableProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGroupIdVarargs(value: (String | Double)*): Self = this.set("groupId", js.Array(value :_*))
    
    @scala.inline
    def setGroupId(value: js.Array[String | Double]): Self = this.set("groupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesId(value: String | Double): Self = this.set("seriesId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    
    @scala.inline
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    
    @scala.inline
    def setBoxPlot(value: MedianSvgStyle): Self = this.set("boxPlot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoxPlot: Self = this.set("boxPlot", js.undefined)
    
    @scala.inline
    def setCategoriesVarargs(value: String*): Self = this.set("categories", js.Array(value :_*))
    
    @scala.inline
    def setCategories(value: js.Array[String]): Self = this.set("categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategories: Self = this.set("categories", js.undefined)
    
    @scala.inline
    def setClose(value: Double): Self = this.set("close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setDrilling(value: on | off | inherit): Self = this.set("drilling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrilling: Self = this.set("drilling", js.undefined)
    
    @scala.inline
    def setHigh(value: Double): Self = this.set("high", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHigh: Self = this.set("high", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: (Double | js.Object)*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[Double | js.Object]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setLabelVarargs(value: String*): Self = this.set("label", js.Array(value :_*))
    
    @scala.inline
    def setLabel(value: String | js.Array[String]): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLabelPosition(
      value: center | outsideSlice | aboveMarker | belowMarker | beforeMarker | afterMarker | insideBarEdge | outsideBarEdge | none | auto
    ): Self = this.set("labelPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelPosition: Self = this.set("labelPosition", js.undefined)
    
    @scala.inline
    def setLabelStyleVarargs(value: js.Object*): Self = this.set("labelStyle", js.Array(value :_*))
    
    @scala.inline
    def setLabelStyle(value: js.Object | js.Array[js.Object]): Self = this.set("labelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelStyle: Self = this.set("labelStyle", js.undefined)
    
    @scala.inline
    def setLow(value: Double): Self = this.set("low", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLow: Self = this.set("low", js.undefined)
    
    @scala.inline
    def setMarkerDisplayed(value: on | off | auto): Self = this.set("markerDisplayed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerDisplayed: Self = this.set("markerDisplayed", js.undefined)
    
    @scala.inline
    def setMarkerShape(value: circle | diamond | human | plus | square | star | triangleDown | triangleUp | auto | String): Self = this.set("markerShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerShape: Self = this.set("markerShape", js.undefined)
    
    @scala.inline
    def setMarkerSize(value: Double): Self = this.set("markerSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerSize: Self = this.set("markerSize", js.undefined)
    
    @scala.inline
    def setOpen(value: Double): Self = this.set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    
    @scala.inline
    def setPattern(
      value: smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle | largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | auto
    ): Self = this.set("pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
    
    @scala.inline
    def setQ1(value: Double): Self = this.set("q1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQ1: Self = this.set("q1", js.undefined)
    
    @scala.inline
    def setQ2(value: Double): Self = this.set("q2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQ2: Self = this.set("q2", js.undefined)
    
    @scala.inline
    def setQ3(value: Double): Self = this.set("q3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQ3: Self = this.set("q3", js.undefined)
    
    @scala.inline
    def setShortDesc(value: String): Self = this.set("shortDesc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShortDesc: Self = this.set("shortDesc", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setSourceHover(value: String): Self = this.set("sourceHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceHover: Self = this.set("sourceHover", js.undefined)
    
    @scala.inline
    def setSourceHoverSelected(value: String): Self = this.set("sourceHoverSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceHoverSelected: Self = this.set("sourceHoverSelected", js.undefined)
    
    @scala.inline
    def setSourceSelected(value: String): Self = this.set("sourceSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceSelected: Self = this.set("sourceSelected", js.undefined)
    
    @scala.inline
    def setSvgClassName(value: String): Self = this.set("svgClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSvgClassName: Self = this.set("svgClassName", js.undefined)
    
    @scala.inline
    def setSvgStyle(value: js.Object): Self = this.set("svgStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSvgStyle: Self = this.set("svgStyle", js.undefined)
    
    @scala.inline
    def setTargetValue(value: Double): Self = this.set("targetValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetValue: Self = this.set("targetValue", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setVolume(value: Double): Self = this.set("volume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolume: Self = this.set("volume", js.undefined)
    
    @scala.inline
    def setX(value: Double | String): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
    
    @scala.inline
    def setZ(value: Double): Self = this.set("z", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZ: Self = this.set("z", js.undefined)
  }
}

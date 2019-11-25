package typings.atOracleOraclejet

import typings.atOracleOraclejet.atOracleOraclejetStrings.aboveMarker
import typings.atOracleOraclejet.atOracleOraclejetStrings.afterMarker
import typings.atOracleOraclejet.atOracleOraclejetStrings.all
import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.beforeMarker
import typings.atOracleOraclejet.atOracleOraclejetStrings.belowMarker
import typings.atOracleOraclejet.atOracleOraclejetStrings.center
import typings.atOracleOraclejet.atOracleOraclejetStrings.centeredSegmented
import typings.atOracleOraclejet.atOracleOraclejetStrings.centeredStepped
import typings.atOracleOraclejet.atOracleOraclejetStrings.circle
import typings.atOracleOraclejet.atOracleOraclejetStrings.color
import typings.atOracleOraclejet.atOracleOraclejetStrings.curved
import typings.atOracleOraclejet.atOracleOraclejetStrings.dashed
import typings.atOracleOraclejet.atOracleOraclejetStrings.diamond
import typings.atOracleOraclejet.atOracleOraclejetStrings.dotted
import typings.atOracleOraclejet.atOracleOraclejetStrings.explode
import typings.atOracleOraclejet.atOracleOraclejetStrings.gradient
import typings.atOracleOraclejet.atOracleOraclejetStrings.highlight
import typings.atOracleOraclejet.atOracleOraclejetStrings.highlightAndExplode
import typings.atOracleOraclejet.atOracleOraclejetStrings.human
import typings.atOracleOraclejet.atOracleOraclejetStrings.insideBarEdge
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import typings.atOracleOraclejet.atOracleOraclejetStrings.on
import typings.atOracleOraclejet.atOracleOraclejetStrings.outsideBarEdge
import typings.atOracleOraclejet.atOracleOraclejetStrings.outsideSlice
import typings.atOracleOraclejet.atOracleOraclejetStrings.pattern
import typings.atOracleOraclejet.atOracleOraclejetStrings.plus
import typings.atOracleOraclejet.atOracleOraclejetStrings.segmented
import typings.atOracleOraclejet.atOracleOraclejetStrings.solid
import typings.atOracleOraclejet.atOracleOraclejetStrings.square
import typings.atOracleOraclejet.atOracleOraclejetStrings.star
import typings.atOracleOraclejet.atOracleOraclejetStrings.stepped
import typings.atOracleOraclejet.atOracleOraclejetStrings.straight
import typings.atOracleOraclejet.atOracleOraclejetStrings.triangleDown
import typings.atOracleOraclejet.atOracleOraclejetStrings.triangleUp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AboveMarker extends js.Object {
  var animationDownColor: String
  var animationDuration: Double
  var animationIndicators: none | all
  var animationUpColor: String
  var barGapRatio: Double
  var borderColor: String
  var borderWidth: Double
  var boxPlot: Anon_MedianSvgClassName
  var colors: js.Array[String]
  var dataCursor: Anon_Dashed
  var dataItemGaps: String
  var dataLabelPosition: center | outsideSlice | aboveMarker | belowMarker | beforeMarker | afterMarker | insideBarEdge | outsideBarEdge | none | auto
  var dataLabelStyle: js.Object | js.Array[js.Object]
  var funnelBackgroundColor: String
  var groupSeparators: Anon_AutoColor
  var hoverBehaviorDelay: Double
  var lineStyle: dotted | dashed | solid
  var lineType: straight | curved | stepped | centeredStepped | segmented | centeredSegmented | none | auto
  var lineWidth: Double
  var markerColor: String
  var markerDisplayed: on | off | auto
  var markerShape: js.UndefOr[
    auto | circle | diamond | human | plus | square | star | triangleDown | triangleUp | String
  ] = js.undefined
  var markerSize: Double
  var marqueeBorderColor: String
  var marqueeColor: String
  var maxBarWidth: Double
  var otherColor: String
  var patterns: js.Array[String]
  var pieFeelerColor: String
  var pieInnerRadius: Double
  var selectionEffect: explode | highlightAndExplode | highlight
  var seriesEffect: color | pattern | gradient
  var shapes: js.Array[String]
  var stackLabelStyle: js.Object
  var stockFallingColor: String
  var stockRangeColor: String
  var stockRisingColor: String
  var stockVolumeColor: String
  var threeDEffect: on | off
  var tooltipLabelStyle: js.Object
  var tooltipValueStyle: js.Object
}

object Anon_AboveMarker {
  @scala.inline
  def apply(
    animationDownColor: String,
    animationDuration: Double,
    animationIndicators: none | all,
    animationUpColor: String,
    barGapRatio: Double,
    borderColor: String,
    borderWidth: Double,
    boxPlot: Anon_MedianSvgClassName,
    colors: js.Array[String],
    dataCursor: Anon_Dashed,
    dataItemGaps: String,
    dataLabelPosition: center | outsideSlice | aboveMarker | belowMarker | beforeMarker | afterMarker | insideBarEdge | outsideBarEdge | none | auto,
    dataLabelStyle: js.Object | js.Array[js.Object],
    funnelBackgroundColor: String,
    groupSeparators: Anon_AutoColor,
    hoverBehaviorDelay: Double,
    lineStyle: dotted | dashed | solid,
    lineType: straight | curved | stepped | centeredStepped | segmented | centeredSegmented | none | auto,
    lineWidth: Double,
    markerColor: String,
    markerDisplayed: on | off | auto,
    markerSize: Double,
    marqueeBorderColor: String,
    marqueeColor: String,
    maxBarWidth: Double,
    otherColor: String,
    patterns: js.Array[String],
    pieFeelerColor: String,
    pieInnerRadius: Double,
    selectionEffect: explode | highlightAndExplode | highlight,
    seriesEffect: color | pattern | gradient,
    shapes: js.Array[String],
    stackLabelStyle: js.Object,
    stockFallingColor: String,
    stockRangeColor: String,
    stockRisingColor: String,
    stockVolumeColor: String,
    threeDEffect: on | off,
    tooltipLabelStyle: js.Object,
    tooltipValueStyle: js.Object,
    markerShape: auto | circle | diamond | human | plus | square | star | triangleDown | triangleUp | String = null
  ): Anon_AboveMarker = {
    val __obj = js.Dynamic.literal(animationDownColor = animationDownColor.asInstanceOf[js.Any], animationDuration = animationDuration.asInstanceOf[js.Any], animationIndicators = animationIndicators.asInstanceOf[js.Any], animationUpColor = animationUpColor.asInstanceOf[js.Any], barGapRatio = barGapRatio.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], boxPlot = boxPlot.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], dataCursor = dataCursor.asInstanceOf[js.Any], dataItemGaps = dataItemGaps.asInstanceOf[js.Any], dataLabelPosition = dataLabelPosition.asInstanceOf[js.Any], dataLabelStyle = dataLabelStyle.asInstanceOf[js.Any], funnelBackgroundColor = funnelBackgroundColor.asInstanceOf[js.Any], groupSeparators = groupSeparators.asInstanceOf[js.Any], hoverBehaviorDelay = hoverBehaviorDelay.asInstanceOf[js.Any], lineStyle = lineStyle.asInstanceOf[js.Any], lineType = lineType.asInstanceOf[js.Any], lineWidth = lineWidth.asInstanceOf[js.Any], markerColor = markerColor.asInstanceOf[js.Any], markerDisplayed = markerDisplayed.asInstanceOf[js.Any], markerSize = markerSize.asInstanceOf[js.Any], marqueeBorderColor = marqueeBorderColor.asInstanceOf[js.Any], marqueeColor = marqueeColor.asInstanceOf[js.Any], maxBarWidth = maxBarWidth.asInstanceOf[js.Any], otherColor = otherColor.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any], pieFeelerColor = pieFeelerColor.asInstanceOf[js.Any], pieInnerRadius = pieInnerRadius.asInstanceOf[js.Any], selectionEffect = selectionEffect.asInstanceOf[js.Any], seriesEffect = seriesEffect.asInstanceOf[js.Any], shapes = shapes.asInstanceOf[js.Any], stackLabelStyle = stackLabelStyle.asInstanceOf[js.Any], stockFallingColor = stockFallingColor.asInstanceOf[js.Any], stockRangeColor = stockRangeColor.asInstanceOf[js.Any], stockRisingColor = stockRisingColor.asInstanceOf[js.Any], stockVolumeColor = stockVolumeColor.asInstanceOf[js.Any], threeDEffect = threeDEffect.asInstanceOf[js.Any], tooltipLabelStyle = tooltipLabelStyle.asInstanceOf[js.Any], tooltipValueStyle = tooltipValueStyle.asInstanceOf[js.Any])
    if (markerShape != null) __obj.updateDynamic("markerShape")(markerShape.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AboveMarker]
  }
}


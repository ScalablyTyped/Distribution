package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.aboveMarker
import typings.oracleOraclejet.oracleOraclejetStrings.afterMarker
import typings.oracleOraclejet.oracleOraclejetStrings.all
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.beforeMarker
import typings.oracleOraclejet.oracleOraclejetStrings.belowMarker
import typings.oracleOraclejet.oracleOraclejetStrings.center
import typings.oracleOraclejet.oracleOraclejetStrings.centeredSegmented
import typings.oracleOraclejet.oracleOraclejetStrings.centeredStepped
import typings.oracleOraclejet.oracleOraclejetStrings.circle
import typings.oracleOraclejet.oracleOraclejetStrings.color
import typings.oracleOraclejet.oracleOraclejetStrings.curved
import typings.oracleOraclejet.oracleOraclejetStrings.dashed
import typings.oracleOraclejet.oracleOraclejetStrings.diamond
import typings.oracleOraclejet.oracleOraclejetStrings.dotted
import typings.oracleOraclejet.oracleOraclejetStrings.explode
import typings.oracleOraclejet.oracleOraclejetStrings.gradient
import typings.oracleOraclejet.oracleOraclejetStrings.highlight
import typings.oracleOraclejet.oracleOraclejetStrings.highlightAndExplode
import typings.oracleOraclejet.oracleOraclejetStrings.human
import typings.oracleOraclejet.oracleOraclejetStrings.insideBarEdge
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.outsideBarEdge
import typings.oracleOraclejet.oracleOraclejetStrings.outsideSlice
import typings.oracleOraclejet.oracleOraclejetStrings.pattern
import typings.oracleOraclejet.oracleOraclejetStrings.plus
import typings.oracleOraclejet.oracleOraclejetStrings.segmented
import typings.oracleOraclejet.oracleOraclejetStrings.solid
import typings.oracleOraclejet.oracleOraclejetStrings.square
import typings.oracleOraclejet.oracleOraclejetStrings.star
import typings.oracleOraclejet.oracleOraclejetStrings.stepped
import typings.oracleOraclejet.oracleOraclejetStrings.straight
import typings.oracleOraclejet.oracleOraclejetStrings.triangleDown
import typings.oracleOraclejet.oracleOraclejetStrings.triangleUp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationDownColor extends js.Object {
  var animationDownColor: String
  var animationDuration: Double
  var animationIndicators: none | all
  var animationUpColor: String
  var barGapRatio: Double
  var borderColor: String
  var borderWidth: Double
  var boxPlot: MedianSvgClassName
  var colors: js.Array[String]
  var dataCursor: LineColor
  var dataItemGaps: String
  var dataLabelPosition: center | outsideSlice | aboveMarker | belowMarker | beforeMarker | afterMarker | insideBarEdge | outsideBarEdge | none | auto
  var dataLabelStyle: js.Object | js.Array[js.Object]
  var funnelBackgroundColor: String
  var groupSeparators: Rendered
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

object AnimationDownColor {
  @scala.inline
  def apply(
    animationDownColor: String,
    animationDuration: Double,
    animationIndicators: none | all,
    animationUpColor: String,
    barGapRatio: Double,
    borderColor: String,
    borderWidth: Double,
    boxPlot: MedianSvgClassName,
    colors: js.Array[String],
    dataCursor: LineColor,
    dataItemGaps: String,
    dataLabelPosition: center | outsideSlice | aboveMarker | belowMarker | beforeMarker | afterMarker | insideBarEdge | outsideBarEdge | none | auto,
    dataLabelStyle: js.Object | js.Array[js.Object],
    funnelBackgroundColor: String,
    groupSeparators: Rendered,
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
  ): AnimationDownColor = {
    val __obj = js.Dynamic.literal(animationDownColor = animationDownColor.asInstanceOf[js.Any], animationDuration = animationDuration.asInstanceOf[js.Any], animationIndicators = animationIndicators.asInstanceOf[js.Any], animationUpColor = animationUpColor.asInstanceOf[js.Any], barGapRatio = barGapRatio.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], boxPlot = boxPlot.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], dataCursor = dataCursor.asInstanceOf[js.Any], dataItemGaps = dataItemGaps.asInstanceOf[js.Any], dataLabelPosition = dataLabelPosition.asInstanceOf[js.Any], dataLabelStyle = dataLabelStyle.asInstanceOf[js.Any], funnelBackgroundColor = funnelBackgroundColor.asInstanceOf[js.Any], groupSeparators = groupSeparators.asInstanceOf[js.Any], hoverBehaviorDelay = hoverBehaviorDelay.asInstanceOf[js.Any], lineStyle = lineStyle.asInstanceOf[js.Any], lineType = lineType.asInstanceOf[js.Any], lineWidth = lineWidth.asInstanceOf[js.Any], markerColor = markerColor.asInstanceOf[js.Any], markerDisplayed = markerDisplayed.asInstanceOf[js.Any], markerSize = markerSize.asInstanceOf[js.Any], marqueeBorderColor = marqueeBorderColor.asInstanceOf[js.Any], marqueeColor = marqueeColor.asInstanceOf[js.Any], maxBarWidth = maxBarWidth.asInstanceOf[js.Any], otherColor = otherColor.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any], pieFeelerColor = pieFeelerColor.asInstanceOf[js.Any], pieInnerRadius = pieInnerRadius.asInstanceOf[js.Any], selectionEffect = selectionEffect.asInstanceOf[js.Any], seriesEffect = seriesEffect.asInstanceOf[js.Any], shapes = shapes.asInstanceOf[js.Any], stackLabelStyle = stackLabelStyle.asInstanceOf[js.Any], stockFallingColor = stockFallingColor.asInstanceOf[js.Any], stockRangeColor = stockRangeColor.asInstanceOf[js.Any], stockRisingColor = stockRisingColor.asInstanceOf[js.Any], stockVolumeColor = stockVolumeColor.asInstanceOf[js.Any], threeDEffect = threeDEffect.asInstanceOf[js.Any], tooltipLabelStyle = tooltipLabelStyle.asInstanceOf[js.Any], tooltipValueStyle = tooltipValueStyle.asInstanceOf[js.Any])
    if (markerShape != null) __obj.updateDynamic("markerShape")(markerShape.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationDownColor]
  }
}


package typings.atNivoWaffle

import typings.atNivoColors.atNivoColorsMod.InheritedColorProp
import typings.atNivoCore.atNivoCoreMod.Box
import typings.atNivoCore.atNivoCoreMod.Colors
import typings.atNivoCore.atNivoCoreMod.GetColor
import typings.atNivoCore.atNivoCoreMod.Theme
import typings.atNivoWaffle.atNivoWaffleMod.ValueFormatter
import typings.atNivoWaffle.atNivoWaffleMod.WaffleDatum
import typings.atNivoWaffle.atNivoWaffleMod.WaffleFillDirection
import typings.atNivoWaffle.atNivoWaffleMod.WaffleTooltipData
import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.StatelessComponent
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @nivo/waffle.@nivo/waffle.WaffleHtmlProps & @nivo/core.@nivo/core.Dimensions */
trait WaffleHtmlPropsDimensions extends js.Object {
  var animate: js.UndefOr[Boolean] = js.undefined
  var borderColor: js.UndefOr[InheritedColorProp[WaffleDatum]] = js.undefined
  var borderWidth: js.UndefOr[Double] = js.undefined
  var colorBy: js.UndefOr[String | GetColor[WaffleDatum]] = js.undefined
  var colors: js.UndefOr[Colors] = js.undefined
  var columns: Double
  var data: js.Array[js.Object]
  var emptyColor: js.UndefOr[String] = js.undefined
  var emptyOpacity: js.UndefOr[Double] = js.undefined
  var enableLabels: js.UndefOr[Boolean] = js.undefined
  var fillDirection: js.UndefOr[WaffleFillDirection] = js.undefined
  var height: Double
  var isInteractive: js.UndefOr[Boolean] = js.undefined
  var margin: js.UndefOr[Box] = js.undefined
  var motionDamping: js.UndefOr[Double] = js.undefined
  var motionStiffness: js.UndefOr[Double] = js.undefined
  var onClick: js.UndefOr[
    js.Function2[
      /* datum */ WaffleDatum, 
      /* event */ MouseEvent[HTMLCanvasElement, NativeMouseEvent], 
      Unit
    ]
  ] = js.undefined
  var padding: js.UndefOr[Double] = js.undefined
  var rows: Double
  var theme: js.UndefOr[Theme] = js.undefined
  var tooltip: js.UndefOr[StatelessComponent[WaffleTooltipData]] = js.undefined
  var tooltipFormat: js.UndefOr[String | ValueFormatter] = js.undefined
  var total: Double
  var width: Double
}

object WaffleHtmlPropsDimensions {
  @scala.inline
  def apply(
    columns: Double,
    data: js.Array[js.Object],
    height: Double,
    rows: Double,
    total: Double,
    width: Double,
    animate: js.UndefOr[Boolean] = js.undefined,
    borderColor: InheritedColorProp[WaffleDatum] = null,
    borderWidth: Int | Double = null,
    colorBy: String | GetColor[WaffleDatum] = null,
    colors: Colors = null,
    emptyColor: String = null,
    emptyOpacity: Int | Double = null,
    enableLabels: js.UndefOr[Boolean] = js.undefined,
    fillDirection: WaffleFillDirection = null,
    isInteractive: js.UndefOr[Boolean] = js.undefined,
    margin: Box = null,
    motionDamping: Int | Double = null,
    motionStiffness: Int | Double = null,
    onClick: (/* datum */ WaffleDatum, /* event */ MouseEvent[HTMLCanvasElement, NativeMouseEvent]) => Unit = null,
    padding: Int | Double = null,
    theme: Theme = null,
    tooltip: StatelessComponent[WaffleTooltipData] = null,
    tooltipFormat: String | ValueFormatter = null
  ): WaffleHtmlPropsDimensions = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (colorBy != null) __obj.updateDynamic("colorBy")(colorBy.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (emptyColor != null) __obj.updateDynamic("emptyColor")(emptyColor.asInstanceOf[js.Any])
    if (emptyOpacity != null) __obj.updateDynamic("emptyOpacity")(emptyOpacity.asInstanceOf[js.Any])
    if (!js.isUndefined(enableLabels)) __obj.updateDynamic("enableLabels")(enableLabels.asInstanceOf[js.Any])
    if (fillDirection != null) __obj.updateDynamic("fillDirection")(fillDirection.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteractive)) __obj.updateDynamic("isInteractive")(isInteractive.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (motionDamping != null) __obj.updateDynamic("motionDamping")(motionDamping.asInstanceOf[js.Any])
    if (motionStiffness != null) __obj.updateDynamic("motionStiffness")(motionStiffness.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipFormat != null) __obj.updateDynamic("tooltipFormat")(tooltipFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaffleHtmlPropsDimensions]
  }
}


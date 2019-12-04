package typings.atNivoCalendar.atNivoCalendarMod

import typings.atNivoLegends.Anon_Color
import typings.atNivoLegends.atNivoLegendsMod.Box
import typings.atNivoLegends.atNivoLegendsMod.LegendAnchor
import typings.atNivoLegends.atNivoLegendsMod.LegendDirection
import typings.atNivoLegends.atNivoLegendsMod.LegendEffect
import typings.atNivoLegends.atNivoLegendsMod.LegendItemDirection
import typings.atNivoLegends.atNivoLegendsMod.LegendMouseHandler
import typings.atNivoLegends.atNivoLegendsMod.LegendMouseHandlerData
import typings.atNivoLegends.atNivoLegendsMod.LegendSymbolShape
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.NativeMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @nivo/legends.@nivo/legends.LegendProps & {  itemCount  :number} */
trait CalendarLegend extends js.Object {
  var anchor: LegendAnchor
  var data: js.UndefOr[js.Array[Anon_Color]] = js.undefined
  var direction: LegendDirection
  var effects: js.UndefOr[js.Array[LegendEffect]] = js.undefined
  var itemBackground: js.UndefOr[String] = js.undefined
  var itemCount: Double
  var itemDirection: js.UndefOr[LegendItemDirection] = js.undefined
  var itemHeight: Double
  var itemOpacity: js.UndefOr[Double] = js.undefined
  var itemTextColor: js.UndefOr[String] = js.undefined
  var itemWidth: Double
  var itemsSpacing: js.UndefOr[Double] = js.undefined
  var justify: js.UndefOr[Boolean] = js.undefined
  var onClick: js.UndefOr[LegendMouseHandler] = js.undefined
  var onMouseEnter: js.UndefOr[LegendMouseHandler] = js.undefined
  var onMouseLeave: js.UndefOr[LegendMouseHandler] = js.undefined
  var padding: js.UndefOr[Double | Box] = js.undefined
  var symbolBorderColor: js.UndefOr[String] = js.undefined
  var symbolShape: js.UndefOr[LegendSymbolShape | js.Any] = js.undefined
  var symbolSize: js.UndefOr[Double] = js.undefined
  var symbolSpacing: js.UndefOr[Double] = js.undefined
  var textColor: js.UndefOr[String] = js.undefined
  var translateX: js.UndefOr[Double] = js.undefined
  var translateY: js.UndefOr[Double] = js.undefined
}

object CalendarLegend {
  @scala.inline
  def apply(
    anchor: LegendAnchor,
    direction: LegendDirection,
    itemCount: Double,
    itemHeight: Double,
    itemWidth: Double,
    data: js.Array[Anon_Color] = null,
    effects: js.Array[LegendEffect] = null,
    itemBackground: String = null,
    itemDirection: LegendItemDirection = null,
    itemOpacity: Int | Double = null,
    itemTextColor: String = null,
    itemsSpacing: Int | Double = null,
    justify: js.UndefOr[Boolean] = js.undefined,
    onClick: (/* data */ LegendMouseHandlerData, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit = null,
    onMouseEnter: (/* data */ LegendMouseHandlerData, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit = null,
    onMouseLeave: (/* data */ LegendMouseHandlerData, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit = null,
    padding: Double | Box = null,
    symbolBorderColor: String = null,
    symbolShape: LegendSymbolShape | js.Any = null,
    symbolSize: Int | Double = null,
    symbolSpacing: Int | Double = null,
    textColor: String = null,
    translateX: Int | Double = null,
    translateY: Int | Double = null
  ): CalendarLegend = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], itemCount = itemCount.asInstanceOf[js.Any], itemHeight = itemHeight.asInstanceOf[js.Any], itemWidth = itemWidth.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (effects != null) __obj.updateDynamic("effects")(effects.asInstanceOf[js.Any])
    if (itemBackground != null) __obj.updateDynamic("itemBackground")(itemBackground.asInstanceOf[js.Any])
    if (itemDirection != null) __obj.updateDynamic("itemDirection")(itemDirection.asInstanceOf[js.Any])
    if (itemOpacity != null) __obj.updateDynamic("itemOpacity")(itemOpacity.asInstanceOf[js.Any])
    if (itemTextColor != null) __obj.updateDynamic("itemTextColor")(itemTextColor.asInstanceOf[js.Any])
    if (itemsSpacing != null) __obj.updateDynamic("itemsSpacing")(itemsSpacing.asInstanceOf[js.Any])
    if (!js.isUndefined(justify)) __obj.updateDynamic("justify")(justify.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction2(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction2(onMouseLeave))
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (symbolBorderColor != null) __obj.updateDynamic("symbolBorderColor")(symbolBorderColor.asInstanceOf[js.Any])
    if (symbolShape != null) __obj.updateDynamic("symbolShape")(symbolShape.asInstanceOf[js.Any])
    if (symbolSize != null) __obj.updateDynamic("symbolSize")(symbolSize.asInstanceOf[js.Any])
    if (symbolSpacing != null) __obj.updateDynamic("symbolSpacing")(symbolSpacing.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    if (translateX != null) __obj.updateDynamic("translateX")(translateX.asInstanceOf[js.Any])
    if (translateY != null) __obj.updateDynamic("translateY")(translateY.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarLegend]
  }
}


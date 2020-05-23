package typings.nivoBar.anon

import typings.nivoBar.nivoBarStrings.indexes
import typings.nivoBar.nivoBarStrings.keys
import typings.nivoLegends.anon.Color
import typings.nivoLegends.mod.Box
import typings.nivoLegends.mod.LegendAnchor
import typings.nivoLegends.mod.LegendDirection
import typings.nivoLegends.mod.LegendEffect
import typings.nivoLegends.mod.LegendItemDirection
import typings.nivoLegends.mod.LegendMouseHandler
import typings.nivoLegends.mod.LegendMouseHandlerData
import typings.nivoLegends.mod.LegendSymbolShape
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  dataFrom  :'indexes' | 'keys'} & @nivo/legends.@nivo/legends.LegendProps */
trait dataFromindexeskeysLegend extends js.Object {
  var anchor: LegendAnchor
  var data: js.UndefOr[js.Array[Color]] = js.undefined
  var dataFrom: indexes | keys
  var direction: LegendDirection
  var effects: js.UndefOr[js.Array[LegendEffect]] = js.undefined
  var itemBackground: js.UndefOr[String] = js.undefined
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

object dataFromindexeskeysLegend {
  @scala.inline
  def apply(
    anchor: LegendAnchor,
    dataFrom: indexes | keys,
    direction: LegendDirection,
    itemHeight: Double,
    itemWidth: Double,
    data: js.Array[Color] = null,
    effects: js.Array[LegendEffect] = null,
    itemBackground: String = null,
    itemDirection: LegendItemDirection = null,
    itemOpacity: js.UndefOr[Double] = js.undefined,
    itemTextColor: String = null,
    itemsSpacing: js.UndefOr[Double] = js.undefined,
    justify: js.UndefOr[Boolean] = js.undefined,
    onClick: (/* data */ LegendMouseHandlerData, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit = null,
    onMouseEnter: (/* data */ LegendMouseHandlerData, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit = null,
    onMouseLeave: (/* data */ LegendMouseHandlerData, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit = null,
    padding: Double | Box = null,
    symbolBorderColor: String = null,
    symbolShape: LegendSymbolShape | js.Any = null,
    symbolSize: js.UndefOr[Double] = js.undefined,
    symbolSpacing: js.UndefOr[Double] = js.undefined,
    textColor: String = null,
    translateX: js.UndefOr[Double] = js.undefined,
    translateY: js.UndefOr[Double] = js.undefined
  ): dataFromindexeskeysLegend = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], dataFrom = dataFrom.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], itemHeight = itemHeight.asInstanceOf[js.Any], itemWidth = itemWidth.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (effects != null) __obj.updateDynamic("effects")(effects.asInstanceOf[js.Any])
    if (itemBackground != null) __obj.updateDynamic("itemBackground")(itemBackground.asInstanceOf[js.Any])
    if (itemDirection != null) __obj.updateDynamic("itemDirection")(itemDirection.asInstanceOf[js.Any])
    if (!js.isUndefined(itemOpacity)) __obj.updateDynamic("itemOpacity")(itemOpacity.get.asInstanceOf[js.Any])
    if (itemTextColor != null) __obj.updateDynamic("itemTextColor")(itemTextColor.asInstanceOf[js.Any])
    if (!js.isUndefined(itemsSpacing)) __obj.updateDynamic("itemsSpacing")(itemsSpacing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(justify)) __obj.updateDynamic("justify")(justify.get.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction2(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction2(onMouseLeave))
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (symbolBorderColor != null) __obj.updateDynamic("symbolBorderColor")(symbolBorderColor.asInstanceOf[js.Any])
    if (symbolShape != null) __obj.updateDynamic("symbolShape")(symbolShape.asInstanceOf[js.Any])
    if (!js.isUndefined(symbolSize)) __obj.updateDynamic("symbolSize")(symbolSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(symbolSpacing)) __obj.updateDynamic("symbolSpacing")(symbolSpacing.get.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    if (!js.isUndefined(translateX)) __obj.updateDynamic("translateX")(translateX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(translateY)) __obj.updateDynamic("translateY")(translateY.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[dataFromindexeskeysLegend]
  }
}


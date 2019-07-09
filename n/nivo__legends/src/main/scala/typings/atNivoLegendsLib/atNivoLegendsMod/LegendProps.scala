package typings
package atNivoLegendsLib.atNivoLegendsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendProps extends js.Object {
  var anchor: LegendAnchor
  var data: js.UndefOr[js.Array[atNivoLegendsLib.Anon_Color]] = js.undefined
  var direction: LegendDirection
  var effects: js.UndefOr[js.Array[LegendEffect]] = js.undefined
  var itemBackground: js.UndefOr[java.lang.String] = js.undefined
  var itemDirection: js.UndefOr[LegendItemDirection] = js.undefined
  var itemHeight: scala.Double
  var itemOpacity: js.UndefOr[scala.Double] = js.undefined
  var itemTextColor: js.UndefOr[java.lang.String] = js.undefined
  var itemWidth: scala.Double
  var itemsSpacing: js.UndefOr[scala.Double] = js.undefined
  var justify: js.UndefOr[scala.Boolean] = js.undefined
  var onClick: js.UndefOr[LegendMouseHandler] = js.undefined
  var onMouseEnter: js.UndefOr[LegendMouseHandler] = js.undefined
  var onMouseLeave: js.UndefOr[LegendMouseHandler] = js.undefined
  var padding: js.UndefOr[scala.Double | Box] = js.undefined
  var symbolBorderColor: js.UndefOr[java.lang.String] = js.undefined
  var symbolShape: js.UndefOr[LegendSymbolShape | js.Any] = js.undefined
  var symbolSize: js.UndefOr[scala.Double] = js.undefined
  var symbolSpacing: js.UndefOr[scala.Double] = js.undefined
  var textColor: js.UndefOr[java.lang.String] = js.undefined
  var translateX: js.UndefOr[scala.Double] = js.undefined
  var translateY: js.UndefOr[scala.Double] = js.undefined
}

object LegendProps {
  @scala.inline
  def apply(
    anchor: LegendAnchor,
    direction: LegendDirection,
    itemHeight: scala.Double,
    itemWidth: scala.Double,
    data: js.Array[atNivoLegendsLib.Anon_Color] = null,
    effects: js.Array[LegendEffect] = null,
    itemBackground: java.lang.String = null,
    itemDirection: LegendItemDirection = null,
    itemOpacity: scala.Int | scala.Double = null,
    itemTextColor: java.lang.String = null,
    itemsSpacing: scala.Int | scala.Double = null,
    justify: js.UndefOr[scala.Boolean] = js.undefined,
    onClick: LegendMouseHandler = null,
    onMouseEnter: LegendMouseHandler = null,
    onMouseLeave: LegendMouseHandler = null,
    padding: scala.Double | Box = null,
    symbolBorderColor: java.lang.String = null,
    symbolShape: LegendSymbolShape | js.Any = null,
    symbolSize: scala.Int | scala.Double = null,
    symbolSpacing: scala.Int | scala.Double = null,
    textColor: java.lang.String = null,
    translateX: scala.Int | scala.Double = null,
    translateY: scala.Int | scala.Double = null
  ): LegendProps = {
    val __obj = js.Dynamic.literal(anchor = anchor, direction = direction, itemHeight = itemHeight, itemWidth = itemWidth)
    if (data != null) __obj.updateDynamic("data")(data)
    if (effects != null) __obj.updateDynamic("effects")(effects)
    if (itemBackground != null) __obj.updateDynamic("itemBackground")(itemBackground)
    if (itemDirection != null) __obj.updateDynamic("itemDirection")(itemDirection)
    if (itemOpacity != null) __obj.updateDynamic("itemOpacity")(itemOpacity.asInstanceOf[js.Any])
    if (itemTextColor != null) __obj.updateDynamic("itemTextColor")(itemTextColor)
    if (itemsSpacing != null) __obj.updateDynamic("itemsSpacing")(itemsSpacing.asInstanceOf[js.Any])
    if (!js.isUndefined(justify)) __obj.updateDynamic("justify")(justify)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter)
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (symbolBorderColor != null) __obj.updateDynamic("symbolBorderColor")(symbolBorderColor)
    if (symbolShape != null) __obj.updateDynamic("symbolShape")(symbolShape.asInstanceOf[js.Any])
    if (symbolSize != null) __obj.updateDynamic("symbolSize")(symbolSize.asInstanceOf[js.Any])
    if (symbolSpacing != null) __obj.updateDynamic("symbolSpacing")(symbolSpacing.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor)
    if (translateX != null) __obj.updateDynamic("translateX")(translateX.asInstanceOf[js.Any])
    if (translateY != null) __obj.updateDynamic("translateY")(translateY.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendProps]
  }
}


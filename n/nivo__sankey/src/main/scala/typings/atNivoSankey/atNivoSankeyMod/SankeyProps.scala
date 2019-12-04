package typings.atNivoSankey.atNivoSankeyMod

import typings.atNivoColors.atNivoColorsMod.InheritedColorProp
import typings.atNivoColors.atNivoColorsMod.OrdinalColorsInstruction
import typings.atNivoCore.atNivoCoreMod.Box
import typings.atNivoCore.atNivoCoreMod.CssMixBlendMode
import typings.atNivoCore.atNivoCoreMod.Theme
import typings.atNivoLegends.atNivoLegendsMod.LegendProps
import typings.atNivoSankey.atNivoSankeyStrings.ascending
import typings.atNivoSankey.atNivoSankeyStrings.auto
import typings.atNivoSankey.atNivoSankeyStrings.center
import typings.atNivoSankey.atNivoSankeyStrings.descending
import typings.atNivoSankey.atNivoSankeyStrings.end
import typings.atNivoSankey.atNivoSankeyStrings.horizontal
import typings.atNivoSankey.atNivoSankeyStrings.input
import typings.atNivoSankey.atNivoSankeyStrings.inside
import typings.atNivoSankey.atNivoSankeyStrings.justify
import typings.atNivoSankey.atNivoSankeyStrings.outside
import typings.atNivoSankey.atNivoSankeyStrings.start
import typings.atNivoSankey.atNivoSankeyStrings.vertical
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.NativeMouseEvent
import typings.react.reactMod.ReactNode
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  align  :'center' | 'justify' | 'start' | 'end',   sort  :'auto' | 'input' | 'ascending' | 'descending' | @nivo/sankey.@nivo/sankey.SankeySortFunction,   margin  :@nivo/core.@nivo/core.Box,   nodeOpacity  :number,   nodeHoverOpacity  :number,   nodeHoverOthersOpacity  :number,   nodeThickness  :number,   nodeSpacing  :number,   nodeInnerPadding  :number,   nodeBorderWidth  :number,   nodeBorderColor  :@nivo/colors.@nivo/colors.InheritedColorProp<@nivo/sankey.@nivo/sankey.SankeyNodeDatum>,   linkOpacity  :number,   linkHoverOpacity  :number,   linkHoverOthersOpacity  :number,   linkContract  :number,   linkBlendMode  :@nivo/core.@nivo/core.CssMixBlendMode,   enableLinkGradient  :boolean,   enableLabels  :boolean,   label  :string | @nivo/sankey.@nivo/sankey.AccessorFunc,   labelPosition  :'inside' | 'outside',   labelPadding  :number,   labelOrientation  :'horizontal' | 'vertical',   labelTextColor  :@nivo/colors.@nivo/colors.InheritedColorProp<@nivo/sankey.@nivo/sankey.SankeyNodeDatum>,   labelFormat  :string | @nivo/sankey.@nivo/sankey.LabelFormatter,   isInteractive  :boolean,   onClick  :@nivo/sankey.@nivo/sankey.SankeyMouseHandler,   tooltipFormat  :@nivo/sankey.@nivo/sankey.TooltipFormat,   nodeTooltip  :@nivo/sankey.@nivo/sankey.TooltipRenderer<@nivo/sankey.@nivo/sankey.SankeyNodeProps>,   linkTooltip  :@nivo/sankey.@nivo/sankey.TooltipRenderer<@nivo/sankey.@nivo/sankey.SankeyLinkProps>,   colors  :@nivo/colors.@nivo/colors.OrdinalColorsInstruction<any>,   theme  :@nivo/core.@nivo/core.Theme,   legends  :std.Array<@nivo/legends.@nivo/legends.LegendProps>}> */
trait SankeyProps extends js.Object {
  var align: js.UndefOr[center | justify | start | end] = js.undefined
  var colors: js.UndefOr[OrdinalColorsInstruction[_]] = js.undefined
  var enableLabels: js.UndefOr[Boolean] = js.undefined
  var enableLinkGradient: js.UndefOr[Boolean] = js.undefined
  var isInteractive: js.UndefOr[Boolean] = js.undefined
  var label: js.UndefOr[String | AccessorFunc] = js.undefined
  var labelFormat: js.UndefOr[String | LabelFormatter] = js.undefined
  var labelOrientation: js.UndefOr[horizontal | vertical] = js.undefined
  var labelPadding: js.UndefOr[Double] = js.undefined
  var labelPosition: js.UndefOr[inside | outside] = js.undefined
  var labelTextColor: js.UndefOr[InheritedColorProp[SankeyNodeDatum]] = js.undefined
  var legends: js.UndefOr[js.Array[LegendProps]] = js.undefined
  var linkBlendMode: js.UndefOr[CssMixBlendMode] = js.undefined
  var linkContract: js.UndefOr[Double] = js.undefined
  var linkHoverOpacity: js.UndefOr[Double] = js.undefined
  var linkHoverOthersOpacity: js.UndefOr[Double] = js.undefined
  var linkOpacity: js.UndefOr[Double] = js.undefined
  var linkTooltip: js.UndefOr[TooltipRenderer[SankeyLinkProps]] = js.undefined
  var margin: js.UndefOr[Box] = js.undefined
  var nodeBorderColor: js.UndefOr[InheritedColorProp[SankeyNodeDatum]] = js.undefined
  var nodeBorderWidth: js.UndefOr[Double] = js.undefined
  var nodeHoverOpacity: js.UndefOr[Double] = js.undefined
  var nodeHoverOthersOpacity: js.UndefOr[Double] = js.undefined
  var nodeInnerPadding: js.UndefOr[Double] = js.undefined
  var nodeOpacity: js.UndefOr[Double] = js.undefined
  var nodeSpacing: js.UndefOr[Double] = js.undefined
  var nodeThickness: js.UndefOr[Double] = js.undefined
  var nodeTooltip: js.UndefOr[TooltipRenderer[SankeyNodeProps]] = js.undefined
  var onClick: js.UndefOr[SankeyMouseHandler] = js.undefined
  var sort: js.UndefOr[auto | input | ascending | descending | SankeySortFunction] = js.undefined
  var theme: js.UndefOr[Theme] = js.undefined
  var tooltipFormat: js.UndefOr[TooltipFormat] = js.undefined
}

object SankeyProps {
  @scala.inline
  def apply(
    align: center | justify | start | end = null,
    colors: OrdinalColorsInstruction[_] = null,
    enableLabels: js.UndefOr[Boolean] = js.undefined,
    enableLinkGradient: js.UndefOr[Boolean] = js.undefined,
    isInteractive: js.UndefOr[Boolean] = js.undefined,
    label: String | AccessorFunc = null,
    labelFormat: String | LabelFormatter = null,
    labelOrientation: horizontal | vertical = null,
    labelPadding: Int | Double = null,
    labelPosition: inside | outside = null,
    labelTextColor: InheritedColorProp[SankeyNodeDatum] = null,
    legends: js.Array[LegendProps] = null,
    linkBlendMode: CssMixBlendMode = null,
    linkContract: Int | Double = null,
    linkHoverOpacity: Int | Double = null,
    linkHoverOthersOpacity: Int | Double = null,
    linkOpacity: Int | Double = null,
    linkTooltip: SankeyLinkProps => ReactNode = null,
    margin: Box = null,
    nodeBorderColor: InheritedColorProp[SankeyNodeDatum] = null,
    nodeBorderWidth: Int | Double = null,
    nodeHoverOpacity: Int | Double = null,
    nodeHoverOthersOpacity: Int | Double = null,
    nodeInnerPadding: Int | Double = null,
    nodeOpacity: Int | Double = null,
    nodeSpacing: Int | Double = null,
    nodeThickness: Int | Double = null,
    nodeTooltip: SankeyNodeProps => ReactNode = null,
    onClick: (/* data */ SankeyNodeDatum | SankeyLinkDatum, /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit = null,
    sort: auto | input | ascending | descending | SankeySortFunction = null,
    theme: Theme = null,
    tooltipFormat: /* value */ Double => ReactNode = null
  ): SankeyProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(enableLabels)) __obj.updateDynamic("enableLabels")(enableLabels.asInstanceOf[js.Any])
    if (!js.isUndefined(enableLinkGradient)) __obj.updateDynamic("enableLinkGradient")(enableLinkGradient.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteractive)) __obj.updateDynamic("isInteractive")(isInteractive.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelFormat != null) __obj.updateDynamic("labelFormat")(labelFormat.asInstanceOf[js.Any])
    if (labelOrientation != null) __obj.updateDynamic("labelOrientation")(labelOrientation.asInstanceOf[js.Any])
    if (labelPadding != null) __obj.updateDynamic("labelPadding")(labelPadding.asInstanceOf[js.Any])
    if (labelPosition != null) __obj.updateDynamic("labelPosition")(labelPosition.asInstanceOf[js.Any])
    if (labelTextColor != null) __obj.updateDynamic("labelTextColor")(labelTextColor.asInstanceOf[js.Any])
    if (legends != null) __obj.updateDynamic("legends")(legends.asInstanceOf[js.Any])
    if (linkBlendMode != null) __obj.updateDynamic("linkBlendMode")(linkBlendMode.asInstanceOf[js.Any])
    if (linkContract != null) __obj.updateDynamic("linkContract")(linkContract.asInstanceOf[js.Any])
    if (linkHoverOpacity != null) __obj.updateDynamic("linkHoverOpacity")(linkHoverOpacity.asInstanceOf[js.Any])
    if (linkHoverOthersOpacity != null) __obj.updateDynamic("linkHoverOthersOpacity")(linkHoverOthersOpacity.asInstanceOf[js.Any])
    if (linkOpacity != null) __obj.updateDynamic("linkOpacity")(linkOpacity.asInstanceOf[js.Any])
    if (linkTooltip != null) __obj.updateDynamic("linkTooltip")(js.Any.fromFunction1(linkTooltip))
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (nodeBorderColor != null) __obj.updateDynamic("nodeBorderColor")(nodeBorderColor.asInstanceOf[js.Any])
    if (nodeBorderWidth != null) __obj.updateDynamic("nodeBorderWidth")(nodeBorderWidth.asInstanceOf[js.Any])
    if (nodeHoverOpacity != null) __obj.updateDynamic("nodeHoverOpacity")(nodeHoverOpacity.asInstanceOf[js.Any])
    if (nodeHoverOthersOpacity != null) __obj.updateDynamic("nodeHoverOthersOpacity")(nodeHoverOthersOpacity.asInstanceOf[js.Any])
    if (nodeInnerPadding != null) __obj.updateDynamic("nodeInnerPadding")(nodeInnerPadding.asInstanceOf[js.Any])
    if (nodeOpacity != null) __obj.updateDynamic("nodeOpacity")(nodeOpacity.asInstanceOf[js.Any])
    if (nodeSpacing != null) __obj.updateDynamic("nodeSpacing")(nodeSpacing.asInstanceOf[js.Any])
    if (nodeThickness != null) __obj.updateDynamic("nodeThickness")(nodeThickness.asInstanceOf[js.Any])
    if (nodeTooltip != null) __obj.updateDynamic("nodeTooltip")(js.Any.fromFunction1(nodeTooltip))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (tooltipFormat != null) __obj.updateDynamic("tooltipFormat")(js.Any.fromFunction1(tooltipFormat))
    __obj.asInstanceOf[SankeyProps]
  }
}


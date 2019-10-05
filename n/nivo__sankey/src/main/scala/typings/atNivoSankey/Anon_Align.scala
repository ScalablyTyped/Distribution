package typings.atNivoSankey

import typings.atNivoColors.atNivoColorsMod.InheritedColorProp
import typings.atNivoColors.atNivoColorsMod.OrdinalColorsInstruction
import typings.atNivoCore.atNivoCoreMod.Box
import typings.atNivoCore.atNivoCoreMod.CssMixBlendMode
import typings.atNivoCore.atNivoCoreMod.Theme
import typings.atNivoLegends.atNivoLegendsMod.LegendProps
import typings.atNivoSankey.atNivoSankeyMod.AccessorFunc
import typings.atNivoSankey.atNivoSankeyMod.LabelFormatter
import typings.atNivoSankey.atNivoSankeyMod.SankeyLinkDatum
import typings.atNivoSankey.atNivoSankeyMod.SankeyLinkProps
import typings.atNivoSankey.atNivoSankeyMod.SankeyMouseHandler
import typings.atNivoSankey.atNivoSankeyMod.SankeyNodeDatum
import typings.atNivoSankey.atNivoSankeyMod.SankeyNodeProps
import typings.atNivoSankey.atNivoSankeyMod.SankeySortFunction
import typings.atNivoSankey.atNivoSankeyMod.TooltipFormat
import typings.atNivoSankey.atNivoSankeyMod.TooltipRenderer
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
import typings.react.Element
import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Align extends js.Object {
  var align: center | justify | start | end
  var colors: OrdinalColorsInstruction[_]
  var enableLabels: Boolean
  var enableLinkGradient: Boolean
  var isInteractive: Boolean
  var label: String | AccessorFunc
  var labelFormat: String | LabelFormatter
  var labelOrientation: horizontal | vertical
  var labelPadding: Double
  var labelPosition: inside | outside
  var labelTextColor: InheritedColorProp[SankeyNodeDatum]
  var legends: js.Array[LegendProps]
  var linkBlendMode: CssMixBlendMode
  var linkContract: Double
  var linkHoverOpacity: Double
  var linkHoverOthersOpacity: Double
  var linkOpacity: Double
  var linkTooltip: TooltipRenderer[SankeyLinkProps]
  var margin: Box
  var nodeBorderColor: InheritedColorProp[SankeyNodeDatum]
  var nodeBorderWidth: Double
  var nodeHoverOpacity: Double
  var nodeHoverOthersOpacity: Double
  var nodeInnerPadding: Double
  var nodeOpacity: Double
  var nodeSpacing: Double
  var nodeThickness: Double
  var nodeTooltip: TooltipRenderer[SankeyNodeProps]
  var onClick: SankeyMouseHandler
  var sort: auto | input | ascending | descending | SankeySortFunction
  var theme: Theme
  var tooltipFormat: TooltipFormat
}

object Anon_Align {
  @scala.inline
  def apply(
    align: center | justify | start | end,
    colors: OrdinalColorsInstruction[_],
    enableLabels: Boolean,
    enableLinkGradient: Boolean,
    isInteractive: Boolean,
    label: String | AccessorFunc,
    labelFormat: String | LabelFormatter,
    labelOrientation: horizontal | vertical,
    labelPadding: Double,
    labelPosition: inside | outside,
    labelTextColor: InheritedColorProp[SankeyNodeDatum],
    legends: js.Array[LegendProps],
    linkBlendMode: CssMixBlendMode,
    linkContract: Double,
    linkHoverOpacity: Double,
    linkHoverOthersOpacity: Double,
    linkOpacity: Double,
    linkTooltip: SankeyLinkProps => ReactNode,
    margin: Box,
    nodeBorderColor: InheritedColorProp[SankeyNodeDatum],
    nodeBorderWidth: Double,
    nodeHoverOpacity: Double,
    nodeHoverOthersOpacity: Double,
    nodeInnerPadding: Double,
    nodeOpacity: Double,
    nodeSpacing: Double,
    nodeThickness: Double,
    nodeTooltip: SankeyNodeProps => ReactNode,
    onClick: (/* data */ SankeyNodeDatum | SankeyLinkDatum, /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit,
    sort: auto | input | ascending | descending | SankeySortFunction,
    theme: Theme,
    tooltipFormat: /* value */ Double => ReactNode
  ): Anon_Align = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], enableLabels = enableLabels, enableLinkGradient = enableLinkGradient, isInteractive = isInteractive, label = label.asInstanceOf[js.Any], labelFormat = labelFormat.asInstanceOf[js.Any], labelOrientation = labelOrientation.asInstanceOf[js.Any], labelPadding = labelPadding, labelPosition = labelPosition.asInstanceOf[js.Any], labelTextColor = labelTextColor.asInstanceOf[js.Any], legends = legends, linkBlendMode = linkBlendMode, linkContract = linkContract, linkHoverOpacity = linkHoverOpacity, linkHoverOthersOpacity = linkHoverOthersOpacity, linkOpacity = linkOpacity, linkTooltip = js.Any.fromFunction1(linkTooltip), margin = margin, nodeBorderColor = nodeBorderColor.asInstanceOf[js.Any], nodeBorderWidth = nodeBorderWidth, nodeHoverOpacity = nodeHoverOpacity, nodeHoverOthersOpacity = nodeHoverOthersOpacity, nodeInnerPadding = nodeInnerPadding, nodeOpacity = nodeOpacity, nodeSpacing = nodeSpacing, nodeThickness = nodeThickness, nodeTooltip = js.Any.fromFunction1(nodeTooltip), onClick = js.Any.fromFunction2(onClick), sort = sort.asInstanceOf[js.Any], theme = theme, tooltipFormat = js.Any.fromFunction1(tooltipFormat))
  
    __obj.asInstanceOf[Anon_Align]
  }
}


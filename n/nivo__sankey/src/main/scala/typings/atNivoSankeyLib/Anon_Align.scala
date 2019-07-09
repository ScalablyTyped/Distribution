package typings
package atNivoSankeyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Align extends js.Object {
  var align: atNivoSankeyLib.atNivoSankeyLibStrings.center | atNivoSankeyLib.atNivoSankeyLibStrings.justify | atNivoSankeyLib.atNivoSankeyLibStrings.start | atNivoSankeyLib.atNivoSankeyLibStrings.end
  var colors: atNivoColorsLib.atNivoColorsMod.OrdinalColorsInstruction[_]
  var enableLabels: scala.Boolean
  var enableLinkGradient: scala.Boolean
  var isInteractive: scala.Boolean
  var label: java.lang.String | atNivoSankeyLib.atNivoSankeyMod.AccessorFunc
  var labelFormat: java.lang.String | atNivoSankeyLib.atNivoSankeyMod.LabelFormatter
  var labelOrientation: atNivoSankeyLib.atNivoSankeyLibStrings.horizontal | atNivoSankeyLib.atNivoSankeyLibStrings.vertical
  var labelPadding: scala.Double
  var labelPosition: atNivoSankeyLib.atNivoSankeyLibStrings.inside | atNivoSankeyLib.atNivoSankeyLibStrings.outside
  var labelTextColor: atNivoColorsLib.atNivoColorsMod.InheritedColorProp[atNivoSankeyLib.atNivoSankeyMod.SankeyNodeDatum]
  var legends: js.Array[atNivoLegendsLib.atNivoLegendsMod.LegendProps]
  var linkBlendMode: atNivoCoreLib.atNivoCoreMod.CssMixBlendMode
  var linkContract: scala.Double
  var linkHoverOpacity: scala.Double
  var linkHoverOthersOpacity: scala.Double
  var linkOpacity: scala.Double
  var linkTooltip: atNivoSankeyLib.atNivoSankeyMod.TooltipRenderer[atNivoSankeyLib.atNivoSankeyMod.SankeyLinkProps]
  var margin: atNivoCoreLib.atNivoCoreMod.Box
  var nodeBorderColor: atNivoColorsLib.atNivoColorsMod.InheritedColorProp[atNivoSankeyLib.atNivoSankeyMod.SankeyNodeDatum]
  var nodeBorderWidth: scala.Double
  var nodeHoverOpacity: scala.Double
  var nodeHoverOthersOpacity: scala.Double
  var nodeInnerPadding: scala.Double
  var nodeOpacity: scala.Double
  var nodeSpacing: scala.Double
  var nodeThickness: scala.Double
  var nodeTooltip: atNivoSankeyLib.atNivoSankeyMod.TooltipRenderer[atNivoSankeyLib.atNivoSankeyMod.SankeyNodeProps]
  var onClick: atNivoSankeyLib.atNivoSankeyMod.SankeyMouseHandler
  var sort: atNivoSankeyLib.atNivoSankeyLibStrings.auto | atNivoSankeyLib.atNivoSankeyLibStrings.input | atNivoSankeyLib.atNivoSankeyLibStrings.ascending | atNivoSankeyLib.atNivoSankeyLibStrings.descending | atNivoSankeyLib.atNivoSankeyMod.SankeySortFunction
  var theme: atNivoCoreLib.atNivoCoreMod.Theme
  var tooltipFormat: atNivoSankeyLib.atNivoSankeyMod.TooltipFormat
}

object Anon_Align {
  @scala.inline
  def apply(
    align: atNivoSankeyLib.atNivoSankeyLibStrings.center | atNivoSankeyLib.atNivoSankeyLibStrings.justify | atNivoSankeyLib.atNivoSankeyLibStrings.start | atNivoSankeyLib.atNivoSankeyLibStrings.end,
    colors: atNivoColorsLib.atNivoColorsMod.OrdinalColorsInstruction[_],
    enableLabels: scala.Boolean,
    enableLinkGradient: scala.Boolean,
    isInteractive: scala.Boolean,
    label: java.lang.String | atNivoSankeyLib.atNivoSankeyMod.AccessorFunc,
    labelFormat: java.lang.String | atNivoSankeyLib.atNivoSankeyMod.LabelFormatter,
    labelOrientation: atNivoSankeyLib.atNivoSankeyLibStrings.horizontal | atNivoSankeyLib.atNivoSankeyLibStrings.vertical,
    labelPadding: scala.Double,
    labelPosition: atNivoSankeyLib.atNivoSankeyLibStrings.inside | atNivoSankeyLib.atNivoSankeyLibStrings.outside,
    labelTextColor: atNivoColorsLib.atNivoColorsMod.InheritedColorProp[atNivoSankeyLib.atNivoSankeyMod.SankeyNodeDatum],
    legends: js.Array[atNivoLegendsLib.atNivoLegendsMod.LegendProps],
    linkBlendMode: atNivoCoreLib.atNivoCoreMod.CssMixBlendMode,
    linkContract: scala.Double,
    linkHoverOpacity: scala.Double,
    linkHoverOthersOpacity: scala.Double,
    linkOpacity: scala.Double,
    linkTooltip: atNivoSankeyLib.atNivoSankeyMod.TooltipRenderer[atNivoSankeyLib.atNivoSankeyMod.SankeyLinkProps],
    margin: atNivoCoreLib.atNivoCoreMod.Box,
    nodeBorderColor: atNivoColorsLib.atNivoColorsMod.InheritedColorProp[atNivoSankeyLib.atNivoSankeyMod.SankeyNodeDatum],
    nodeBorderWidth: scala.Double,
    nodeHoverOpacity: scala.Double,
    nodeHoverOthersOpacity: scala.Double,
    nodeInnerPadding: scala.Double,
    nodeOpacity: scala.Double,
    nodeSpacing: scala.Double,
    nodeThickness: scala.Double,
    nodeTooltip: atNivoSankeyLib.atNivoSankeyMod.TooltipRenderer[atNivoSankeyLib.atNivoSankeyMod.SankeyNodeProps],
    onClick: atNivoSankeyLib.atNivoSankeyMod.SankeyMouseHandler,
    sort: atNivoSankeyLib.atNivoSankeyLibStrings.auto | atNivoSankeyLib.atNivoSankeyLibStrings.input | atNivoSankeyLib.atNivoSankeyLibStrings.ascending | atNivoSankeyLib.atNivoSankeyLibStrings.descending | atNivoSankeyLib.atNivoSankeyMod.SankeySortFunction,
    theme: atNivoCoreLib.atNivoCoreMod.Theme,
    tooltipFormat: atNivoSankeyLib.atNivoSankeyMod.TooltipFormat
  ): Anon_Align = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], enableLabels = enableLabels, enableLinkGradient = enableLinkGradient, isInteractive = isInteractive, label = label.asInstanceOf[js.Any], labelFormat = labelFormat.asInstanceOf[js.Any], labelOrientation = labelOrientation.asInstanceOf[js.Any], labelPadding = labelPadding, labelPosition = labelPosition.asInstanceOf[js.Any], labelTextColor = labelTextColor.asInstanceOf[js.Any], legends = legends, linkBlendMode = linkBlendMode, linkContract = linkContract, linkHoverOpacity = linkHoverOpacity, linkHoverOthersOpacity = linkHoverOthersOpacity, linkOpacity = linkOpacity, linkTooltip = linkTooltip, margin = margin, nodeBorderColor = nodeBorderColor.asInstanceOf[js.Any], nodeBorderWidth = nodeBorderWidth, nodeHoverOpacity = nodeHoverOpacity, nodeHoverOthersOpacity = nodeHoverOthersOpacity, nodeInnerPadding = nodeInnerPadding, nodeOpacity = nodeOpacity, nodeSpacing = nodeSpacing, nodeThickness = nodeThickness, nodeTooltip = nodeTooltip, onClick = onClick, sort = sort.asInstanceOf[js.Any], theme = theme, tooltipFormat = tooltipFormat)
  
    __obj.asInstanceOf[Anon_Align]
  }
}


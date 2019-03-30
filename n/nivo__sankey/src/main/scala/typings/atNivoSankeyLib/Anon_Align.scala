package typings
package atNivoSankeyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Align extends js.Object {
  var align: atNivoSankeyLib.atNivoSankeyLibStrings.center | atNivoSankeyLib.atNivoSankeyLibStrings.justify | atNivoSankeyLib.atNivoSankeyLibStrings.start | atNivoSankeyLib.atNivoSankeyLibStrings.end
  var enableLabels: scala.Boolean
  var enableLinkGradient: scala.Boolean
  var isInteractive: scala.Boolean
  var label: js.Any
  var labelFormat: js.Any
  var labelOrientation: atNivoSankeyLib.atNivoSankeyLibStrings.horizontal | atNivoSankeyLib.atNivoSankeyLibStrings.vertical
  var labelPadding: scala.Double
  var labelPosition: atNivoSankeyLib.atNivoSankeyLibStrings.inside | atNivoSankeyLib.atNivoSankeyLibStrings.outside
  var labelTextColor: js.Any
  var legends: js.Array[atNivoLegendsLib.atNivoLegendsMod.LegendProps]
  var linkBlendMode: atNivoSankeyLib.atNivoSankeyMod.CssMixBlendMode
  var linkContract: scala.Double
  var linkHoverOpacity: scala.Double
  var linkHoverOthersOpacity: scala.Double
  var linkOpacity: scala.Double
  var linkTooltip: js.Any
  var nodeBorderColor: js.Any
  var nodeBorderWidth: scala.Double
  var nodeHoverOpacity: scala.Double
  var nodeHoverOthersOpacity: scala.Double
  var nodeInnerPadding: scala.Double
  var nodeOpacity: scala.Double
  var nodeSpacing: scala.Double
  var nodeThickness: scala.Double
  var nodeTooltip: js.Any
  var onClick: js.Any
  var sort: atNivoSankeyLib.atNivoSankeyLibStrings.auto | atNivoSankeyLib.atNivoSankeyLibStrings.input | atNivoSankeyLib.atNivoSankeyLibStrings.ascending | atNivoSankeyLib.atNivoSankeyLibStrings.descending | atNivoSankeyLib.atNivoSankeyMod.SankeySortFunction
  var theme: atNivoCoreLib.atNivoCoreMod.Theme
  var tooltipFormat: js.Any
}

object Anon_Align {
  @scala.inline
  def apply(
    align: atNivoSankeyLib.atNivoSankeyLibStrings.center | atNivoSankeyLib.atNivoSankeyLibStrings.justify | atNivoSankeyLib.atNivoSankeyLibStrings.start | atNivoSankeyLib.atNivoSankeyLibStrings.end,
    enableLabels: scala.Boolean,
    enableLinkGradient: scala.Boolean,
    isInteractive: scala.Boolean,
    label: js.Any,
    labelFormat: js.Any,
    labelOrientation: atNivoSankeyLib.atNivoSankeyLibStrings.horizontal | atNivoSankeyLib.atNivoSankeyLibStrings.vertical,
    labelPadding: scala.Double,
    labelPosition: atNivoSankeyLib.atNivoSankeyLibStrings.inside | atNivoSankeyLib.atNivoSankeyLibStrings.outside,
    labelTextColor: js.Any,
    legends: js.Array[atNivoLegendsLib.atNivoLegendsMod.LegendProps],
    linkBlendMode: atNivoSankeyLib.atNivoSankeyMod.CssMixBlendMode,
    linkContract: scala.Double,
    linkHoverOpacity: scala.Double,
    linkHoverOthersOpacity: scala.Double,
    linkOpacity: scala.Double,
    linkTooltip: js.Any,
    nodeBorderColor: js.Any,
    nodeBorderWidth: scala.Double,
    nodeHoverOpacity: scala.Double,
    nodeHoverOthersOpacity: scala.Double,
    nodeInnerPadding: scala.Double,
    nodeOpacity: scala.Double,
    nodeSpacing: scala.Double,
    nodeThickness: scala.Double,
    nodeTooltip: js.Any,
    onClick: js.Any,
    sort: atNivoSankeyLib.atNivoSankeyLibStrings.auto | atNivoSankeyLib.atNivoSankeyLibStrings.input | atNivoSankeyLib.atNivoSankeyLibStrings.ascending | atNivoSankeyLib.atNivoSankeyLibStrings.descending | atNivoSankeyLib.atNivoSankeyMod.SankeySortFunction,
    theme: atNivoCoreLib.atNivoCoreMod.Theme,
    tooltipFormat: js.Any
  ): Anon_Align = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], enableLabels = enableLabels, enableLinkGradient = enableLinkGradient, isInteractive = isInteractive, label = label, labelFormat = labelFormat, labelOrientation = labelOrientation.asInstanceOf[js.Any], labelPadding = labelPadding, labelPosition = labelPosition.asInstanceOf[js.Any], labelTextColor = labelTextColor, legends = legends, linkBlendMode = linkBlendMode, linkContract = linkContract, linkHoverOpacity = linkHoverOpacity, linkHoverOthersOpacity = linkHoverOthersOpacity, linkOpacity = linkOpacity, linkTooltip = linkTooltip, nodeBorderColor = nodeBorderColor, nodeBorderWidth = nodeBorderWidth, nodeHoverOpacity = nodeHoverOpacity, nodeHoverOthersOpacity = nodeHoverOthersOpacity, nodeInnerPadding = nodeInnerPadding, nodeOpacity = nodeOpacity, nodeSpacing = nodeSpacing, nodeThickness = nodeThickness, nodeTooltip = nodeTooltip, onClick = onClick, sort = sort.asInstanceOf[js.Any], theme = theme, tooltipFormat = tooltipFormat)
  
    __obj.asInstanceOf[Anon_Align]
  }
}


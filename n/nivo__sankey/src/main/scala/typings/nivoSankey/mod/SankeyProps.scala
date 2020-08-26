package typings.nivoSankey.mod

import typings.nivoColors.mod.InheritedColorProp
import typings.nivoColors.mod.OrdinalColorsInstruction
import typings.nivoCore.mod.Box
import typings.nivoCore.mod.CssMixBlendMode
import typings.nivoCore.mod.Theme
import typings.nivoLegends.mod.LegendProps
import typings.nivoSankey.nivoSankeyStrings.ascending
import typings.nivoSankey.nivoSankeyStrings.auto
import typings.nivoSankey.nivoSankeyStrings.center
import typings.nivoSankey.nivoSankeyStrings.descending
import typings.nivoSankey.nivoSankeyStrings.end
import typings.nivoSankey.nivoSankeyStrings.horizontal
import typings.nivoSankey.nivoSankeyStrings.input
import typings.nivoSankey.nivoSankeyStrings.inside
import typings.nivoSankey.nivoSankeyStrings.justify
import typings.nivoSankey.nivoSankeyStrings.outside
import typings.nivoSankey.nivoSankeyStrings.start
import typings.nivoSankey.nivoSankeyStrings.vertical
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  align :'center' | 'justify' | 'start' | 'end',   sort :'auto' | 'input' | 'ascending' | 'descending' | @nivo/sankey.@nivo/sankey.SankeySortFunction,   margin :@nivo/core.@nivo/core.Box,   nodeOpacity :number,   nodeHoverOpacity :number,   nodeHoverOthersOpacity :number,   nodeThickness :number,   nodeSpacing :number,   nodeInnerPadding :number,   nodeBorderWidth :number,   nodeBorderColor :@nivo/colors.@nivo/colors.InheritedColorProp<@nivo/sankey.@nivo/sankey.SankeyNodeDatum>,   linkOpacity :number,   linkHoverOpacity :number,   linkHoverOthersOpacity :number,   linkContract :number,   linkBlendMode :@nivo/core.@nivo/core.CssMixBlendMode,   enableLinkGradient :boolean,   enableLabels :boolean,   label :string | @nivo/sankey.@nivo/sankey.AccessorFunc,   labelPosition :'inside' | 'outside',   labelPadding :number,   labelOrientation :'horizontal' | 'vertical',   labelTextColor :@nivo/colors.@nivo/colors.InheritedColorProp<@nivo/sankey.@nivo/sankey.SankeyNodeDatum>,   labelFormat :string | @nivo/sankey.@nivo/sankey.LabelFormatter,   isInteractive :boolean,   onClick :@nivo/sankey.@nivo/sankey.SankeyMouseHandler,   tooltipFormat :@nivo/sankey.@nivo/sankey.TooltipFormat,   nodeTooltip :@nivo/sankey.@nivo/sankey.TooltipRenderer<@nivo/sankey.@nivo/sankey.SankeyNodeDatum>,   linkTooltip :@nivo/sankey.@nivo/sankey.TooltipRenderer<@nivo/sankey.@nivo/sankey.SankeyLinkDatum>,   colors :@nivo/colors.@nivo/colors.OrdinalColorsInstruction<any>,   theme :@nivo/core.@nivo/core.Theme,   legends :std.Array<@nivo/legends.@nivo/legends.LegendProps>}> */
@js.native
trait SankeyProps extends js.Object {
  var align: js.UndefOr[center | justify | start | end] = js.native
  var colors: js.UndefOr[OrdinalColorsInstruction[_]] = js.native
  var enableLabels: js.UndefOr[Boolean] = js.native
  var enableLinkGradient: js.UndefOr[Boolean] = js.native
  var isInteractive: js.UndefOr[Boolean] = js.native
  var label: js.UndefOr[String | AccessorFunc] = js.native
  var labelFormat: js.UndefOr[String | LabelFormatter] = js.native
  var labelOrientation: js.UndefOr[horizontal | vertical] = js.native
  var labelPadding: js.UndefOr[Double] = js.native
  var labelPosition: js.UndefOr[inside | outside] = js.native
  var labelTextColor: js.UndefOr[InheritedColorProp[SankeyNodeDatum]] = js.native
  var legends: js.UndefOr[js.Array[LegendProps]] = js.native
  var linkBlendMode: js.UndefOr[CssMixBlendMode] = js.native
  var linkContract: js.UndefOr[Double] = js.native
  var linkHoverOpacity: js.UndefOr[Double] = js.native
  var linkHoverOthersOpacity: js.UndefOr[Double] = js.native
  var linkOpacity: js.UndefOr[Double] = js.native
  var linkTooltip: js.UndefOr[TooltipRenderer[SankeyLinkDatum]] = js.native
  var margin: js.UndefOr[Box] = js.native
  var nodeBorderColor: js.UndefOr[InheritedColorProp[SankeyNodeDatum]] = js.native
  var nodeBorderWidth: js.UndefOr[Double] = js.native
  var nodeHoverOpacity: js.UndefOr[Double] = js.native
  var nodeHoverOthersOpacity: js.UndefOr[Double] = js.native
  var nodeInnerPadding: js.UndefOr[Double] = js.native
  var nodeOpacity: js.UndefOr[Double] = js.native
  var nodeSpacing: js.UndefOr[Double] = js.native
  var nodeThickness: js.UndefOr[Double] = js.native
  var nodeTooltip: js.UndefOr[TooltipRenderer[SankeyNodeDatum]] = js.native
  var onClick: js.UndefOr[SankeyMouseHandler] = js.native
  var sort: js.UndefOr[auto | input | ascending | descending | SankeySortFunction] = js.native
  var theme: js.UndefOr[Theme] = js.native
  var tooltipFormat: js.UndefOr[TooltipFormat] = js.native
}

object SankeyProps {
  @scala.inline
  def apply(): SankeyProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SankeyProps]
  }
  @scala.inline
  implicit class SankeyPropsOps[Self <: SankeyProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlign(value: center | justify | start | end): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setColorsVarargs(value: String*): Self = this.set("colors", js.Array(value :_*))
    @scala.inline
    def setColorsFunction1(value: _ => String): Self = this.set("colors", js.Any.fromFunction1(value))
    @scala.inline
    def setColors(value: OrdinalColorsInstruction[_]): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    @scala.inline
    def setEnableLabels(value: Boolean): Self = this.set("enableLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableLabels: Self = this.set("enableLabels", js.undefined)
    @scala.inline
    def setEnableLinkGradient(value: Boolean): Self = this.set("enableLinkGradient", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableLinkGradient: Self = this.set("enableLinkGradient", js.undefined)
    @scala.inline
    def setIsInteractive(value: Boolean): Self = this.set("isInteractive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsInteractive: Self = this.set("isInteractive", js.undefined)
    @scala.inline
    def setLabelFunction1(value: /* datum */ SankeyNodeDatum => String): Self = this.set("label", js.Any.fromFunction1(value))
    @scala.inline
    def setLabel(value: String | AccessorFunc): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLabelFormatFunction1(value: /* label */ String | Double => String | Double): Self = this.set("labelFormat", js.Any.fromFunction1(value))
    @scala.inline
    def setLabelFormat(value: String | LabelFormatter): Self = this.set("labelFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelFormat: Self = this.set("labelFormat", js.undefined)
    @scala.inline
    def setLabelOrientation(value: horizontal | vertical): Self = this.set("labelOrientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelOrientation: Self = this.set("labelOrientation", js.undefined)
    @scala.inline
    def setLabelPadding(value: Double): Self = this.set("labelPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelPadding: Self = this.set("labelPadding", js.undefined)
    @scala.inline
    def setLabelPosition(value: inside | outside): Self = this.set("labelPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelPosition: Self = this.set("labelPosition", js.undefined)
    @scala.inline
    def setLabelTextColorFunction1(value: SankeyNodeDatum => String): Self = this.set("labelTextColor", js.Any.fromFunction1(value))
    @scala.inline
    def setLabelTextColor(value: InheritedColorProp[SankeyNodeDatum]): Self = this.set("labelTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelTextColor: Self = this.set("labelTextColor", js.undefined)
    @scala.inline
    def setLegendsVarargs(value: LegendProps*): Self = this.set("legends", js.Array(value :_*))
    @scala.inline
    def setLegends(value: js.Array[LegendProps]): Self = this.set("legends", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegends: Self = this.set("legends", js.undefined)
    @scala.inline
    def setLinkBlendMode(value: CssMixBlendMode): Self = this.set("linkBlendMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkBlendMode: Self = this.set("linkBlendMode", js.undefined)
    @scala.inline
    def setLinkContract(value: Double): Self = this.set("linkContract", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkContract: Self = this.set("linkContract", js.undefined)
    @scala.inline
    def setLinkHoverOpacity(value: Double): Self = this.set("linkHoverOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkHoverOpacity: Self = this.set("linkHoverOpacity", js.undefined)
    @scala.inline
    def setLinkHoverOthersOpacity(value: Double): Self = this.set("linkHoverOthersOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkHoverOthersOpacity: Self = this.set("linkHoverOthersOpacity", js.undefined)
    @scala.inline
    def setLinkOpacity(value: Double): Self = this.set("linkOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkOpacity: Self = this.set("linkOpacity", js.undefined)
    @scala.inline
    def setLinkTooltip(value: SankeyLinkDatum => ReactNode): Self = this.set("linkTooltip", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLinkTooltip: Self = this.set("linkTooltip", js.undefined)
    @scala.inline
    def setMargin(value: Box): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setNodeBorderColorFunction1(value: SankeyNodeDatum => String): Self = this.set("nodeBorderColor", js.Any.fromFunction1(value))
    @scala.inline
    def setNodeBorderColor(value: InheritedColorProp[SankeyNodeDatum]): Self = this.set("nodeBorderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeBorderColor: Self = this.set("nodeBorderColor", js.undefined)
    @scala.inline
    def setNodeBorderWidth(value: Double): Self = this.set("nodeBorderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeBorderWidth: Self = this.set("nodeBorderWidth", js.undefined)
    @scala.inline
    def setNodeHoverOpacity(value: Double): Self = this.set("nodeHoverOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeHoverOpacity: Self = this.set("nodeHoverOpacity", js.undefined)
    @scala.inline
    def setNodeHoverOthersOpacity(value: Double): Self = this.set("nodeHoverOthersOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeHoverOthersOpacity: Self = this.set("nodeHoverOthersOpacity", js.undefined)
    @scala.inline
    def setNodeInnerPadding(value: Double): Self = this.set("nodeInnerPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeInnerPadding: Self = this.set("nodeInnerPadding", js.undefined)
    @scala.inline
    def setNodeOpacity(value: Double): Self = this.set("nodeOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeOpacity: Self = this.set("nodeOpacity", js.undefined)
    @scala.inline
    def setNodeSpacing(value: Double): Self = this.set("nodeSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeSpacing: Self = this.set("nodeSpacing", js.undefined)
    @scala.inline
    def setNodeThickness(value: Double): Self = this.set("nodeThickness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeThickness: Self = this.set("nodeThickness", js.undefined)
    @scala.inline
    def setNodeTooltip(value: SankeyNodeDatum => ReactNode): Self = this.set("nodeTooltip", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNodeTooltip: Self = this.set("nodeTooltip", js.undefined)
    @scala.inline
    def setOnClick(
      value: (/* data */ SankeyNodeDatum | SankeyLinkDatum, /* event */ MouseEvent[Element, NativeMouseEvent]) => Unit
    ): Self = this.set("onClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setSortFunction2(value: (/* nodeA */ SankeyDataNode, /* nodeB */ SankeyDataNode) => Double): Self = this.set("sort", js.Any.fromFunction2(value))
    @scala.inline
    def setSort(value: auto | input | ascending | descending | SankeySortFunction): Self = this.set("sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    @scala.inline
    def setTheme(value: Theme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setTooltipFormat(value: /* value */ Double => ReactNode): Self = this.set("tooltipFormat", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTooltipFormat: Self = this.set("tooltipFormat", js.undefined)
  }
  
}


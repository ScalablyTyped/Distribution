package typings.nivoPie.mod

import typings.nivoColors.mod.InheritedColorProp
import typings.nivoColors.mod.OrdinalColorsInstruction
import typings.nivoCore.anon.Dictkey
import typings.nivoCore.anon.Id
import typings.nivoCore.mod.Box
import typings.nivoCore.mod.Theme
import typings.nivoLegends.mod.LegendProps
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.StatelessComponent
import typings.std.SVGPathElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @nivo/pie.@nivo/pie.Data & @nivo/pie.@nivo/pie.CommonPieProps & @nivo/core.@nivo/core.SvgDefsAndFill<@nivo/pie.@nivo/pie.PieDatum> & std.Partial<{  onClick :@nivo/pie.@nivo/pie.PieMouseEventHandler<std.SVGPathElement>,   onMouseEnter :@nivo/pie.@nivo/pie.PieMouseEventHandler<std.SVGPathElement>,   onMouseLeave :@nivo/pie.@nivo/pie.PieMouseEventHandler<std.SVGPathElement>}> */
@js.native
trait PieSvgProps extends js.Object {
  var animate: js.UndefOr[Boolean] = js.native
  var borderColor: js.UndefOr[InheritedColorProp[PieDatum]] = js.native
  var borderWidth: js.UndefOr[Double] = js.native
  var colors: js.UndefOr[OrdinalColorsInstruction[PieDatum]] = js.native
  var cornerRadius: js.UndefOr[Double] = js.native
  var data: js.Array[PieDatum] = js.native
  var defs: js.UndefOr[js.Array[Dictkey]] = js.native
  var enableRadialLabels: js.UndefOr[Boolean] = js.native
  var enableSlicesLabels: js.UndefOr[Boolean] = js.native
  var endAngle: js.UndefOr[Double] = js.native
  var fill: js.UndefOr[js.Array[Id[PieDatum]]] = js.native
  var fit: js.UndefOr[Boolean] = js.native
  var innerRadius: js.UndefOr[Double] = js.native
  var isInteractive: js.UndefOr[Boolean] = js.native
  var legends: js.UndefOr[js.Array[LegendProps]] = js.native
  var margin: js.UndefOr[Box] = js.native
  var motionDamping: js.UndefOr[Double] = js.native
  var motionStiffness: js.UndefOr[Double] = js.native
  var onClick: js.UndefOr[PieMouseEventHandler[SVGPathElement]] = js.native
  var onMouseEnter: js.UndefOr[PieMouseEventHandler[SVGPathElement]] = js.native
  var onMouseLeave: js.UndefOr[PieMouseEventHandler[SVGPathElement]] = js.native
  var padAngle: js.UndefOr[Double] = js.native
  var radialLabel: js.UndefOr[String | AccessorFunc] = js.native
  var radialLabelsLinkColor: js.UndefOr[InheritedColorProp[PieDatumWithColor]] = js.native
  var radialLabelsLinkDiagonalLength: js.UndefOr[Double] = js.native
  var radialLabelsLinkHorizontalLength: js.UndefOr[Double] = js.native
  var radialLabelsLinkOffset: js.UndefOr[Double] = js.native
  var radialLabelsLinkStrokeWidth: js.UndefOr[Double] = js.native
  var radialLabelsSkipAngle: js.UndefOr[Double] = js.native
  var radialLabelsTextColor: js.UndefOr[InheritedColorProp[PieDatumWithColor]] = js.native
  var radialLabelsTextXOffset: js.UndefOr[Double] = js.native
  var sliceLabel: js.UndefOr[String | AccessorFunc] = js.native
  var slicesLabelsSkipAngle: js.UndefOr[Double] = js.native
  var slicesLabelsTextColor: js.UndefOr[InheritedColorProp[PieDatumWithColor]] = js.native
  var sortByValue: js.UndefOr[Boolean] = js.native
  var startAngle: js.UndefOr[Double] = js.native
  var theme: js.UndefOr[Theme] = js.native
  var tooltip: js.UndefOr[StatelessComponent[PieDatumWithColor]] = js.native
  var tooltipFormat: js.UndefOr[String | ValueFormatter] = js.native
}

object PieSvgProps {
  @scala.inline
  def apply(data: js.Array[PieDatum]): PieSvgProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[PieSvgProps]
  }
  @scala.inline
  implicit class PieSvgPropsOps[Self <: PieSvgProps] (val x: Self) extends AnyVal {
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
    def setDataVarargs(value: PieDatum*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[PieDatum]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimate(value: Boolean): Self = this.set("animate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    @scala.inline
    def setBorderColorFunction1(value: PieDatum => String): Self = this.set("borderColor", js.Any.fromFunction1(value))
    @scala.inline
    def setBorderColor(value: InheritedColorProp[PieDatum]): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    @scala.inline
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    @scala.inline
    def setColorsVarargs(value: String*): Self = this.set("colors", js.Array(value :_*))
    @scala.inline
    def setColorsFunction1(value: PieDatum => String): Self = this.set("colors", js.Any.fromFunction1(value))
    @scala.inline
    def setColors(value: OrdinalColorsInstruction[PieDatum]): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    @scala.inline
    def setCornerRadius(value: Double): Self = this.set("cornerRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCornerRadius: Self = this.set("cornerRadius", js.undefined)
    @scala.inline
    def setDefsVarargs(value: Dictkey*): Self = this.set("defs", js.Array(value :_*))
    @scala.inline
    def setDefs(value: js.Array[Dictkey]): Self = this.set("defs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefs: Self = this.set("defs", js.undefined)
    @scala.inline
    def setEnableRadialLabels(value: Boolean): Self = this.set("enableRadialLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableRadialLabels: Self = this.set("enableRadialLabels", js.undefined)
    @scala.inline
    def setEnableSlicesLabels(value: Boolean): Self = this.set("enableSlicesLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableSlicesLabels: Self = this.set("enableSlicesLabels", js.undefined)
    @scala.inline
    def setEndAngle(value: Double): Self = this.set("endAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndAngle: Self = this.set("endAngle", js.undefined)
    @scala.inline
    def setFillVarargs(value: Id[PieDatum]*): Self = this.set("fill", js.Array(value :_*))
    @scala.inline
    def setFill(value: js.Array[Id[PieDatum]]): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setFit(value: Boolean): Self = this.set("fit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFit: Self = this.set("fit", js.undefined)
    @scala.inline
    def setInnerRadius(value: Double): Self = this.set("innerRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerRadius: Self = this.set("innerRadius", js.undefined)
    @scala.inline
    def setIsInteractive(value: Boolean): Self = this.set("isInteractive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsInteractive: Self = this.set("isInteractive", js.undefined)
    @scala.inline
    def setLegendsVarargs(value: LegendProps*): Self = this.set("legends", js.Array(value :_*))
    @scala.inline
    def setLegends(value: js.Array[LegendProps]): Self = this.set("legends", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegends: Self = this.set("legends", js.undefined)
    @scala.inline
    def setMargin(value: Box): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setMotionDamping(value: Double): Self = this.set("motionDamping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMotionDamping: Self = this.set("motionDamping", js.undefined)
    @scala.inline
    def setMotionStiffness(value: Double): Self = this.set("motionStiffness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMotionStiffness: Self = this.set("motionStiffness", js.undefined)
    @scala.inline
    def setOnClick(value: (/* datum */ PieDatum, /* event */ MouseEvent[SVGPathElement, NativeMouseEvent]) => Unit): Self = this.set("onClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnMouseEnter(value: (/* datum */ PieDatum, /* event */ MouseEvent[SVGPathElement, NativeMouseEvent]) => Unit): Self = this.set("onMouseEnter", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    @scala.inline
    def setOnMouseLeave(value: (/* datum */ PieDatum, /* event */ MouseEvent[SVGPathElement, NativeMouseEvent]) => Unit): Self = this.set("onMouseLeave", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    @scala.inline
    def setPadAngle(value: Double): Self = this.set("padAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadAngle: Self = this.set("padAngle", js.undefined)
    @scala.inline
    def setRadialLabelFunction1(value: /* datum */ PieDatum => String): Self = this.set("radialLabel", js.Any.fromFunction1(value))
    @scala.inline
    def setRadialLabel(value: String | AccessorFunc): Self = this.set("radialLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadialLabel: Self = this.set("radialLabel", js.undefined)
    @scala.inline
    def setRadialLabelsLinkColorFunction1(value: PieDatumWithColor => String): Self = this.set("radialLabelsLinkColor", js.Any.fromFunction1(value))
    @scala.inline
    def setRadialLabelsLinkColor(value: InheritedColorProp[PieDatumWithColor]): Self = this.set("radialLabelsLinkColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadialLabelsLinkColor: Self = this.set("radialLabelsLinkColor", js.undefined)
    @scala.inline
    def setRadialLabelsLinkDiagonalLength(value: Double): Self = this.set("radialLabelsLinkDiagonalLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadialLabelsLinkDiagonalLength: Self = this.set("radialLabelsLinkDiagonalLength", js.undefined)
    @scala.inline
    def setRadialLabelsLinkHorizontalLength(value: Double): Self = this.set("radialLabelsLinkHorizontalLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadialLabelsLinkHorizontalLength: Self = this.set("radialLabelsLinkHorizontalLength", js.undefined)
    @scala.inline
    def setRadialLabelsLinkOffset(value: Double): Self = this.set("radialLabelsLinkOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadialLabelsLinkOffset: Self = this.set("radialLabelsLinkOffset", js.undefined)
    @scala.inline
    def setRadialLabelsLinkStrokeWidth(value: Double): Self = this.set("radialLabelsLinkStrokeWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadialLabelsLinkStrokeWidth: Self = this.set("radialLabelsLinkStrokeWidth", js.undefined)
    @scala.inline
    def setRadialLabelsSkipAngle(value: Double): Self = this.set("radialLabelsSkipAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadialLabelsSkipAngle: Self = this.set("radialLabelsSkipAngle", js.undefined)
    @scala.inline
    def setRadialLabelsTextColorFunction1(value: PieDatumWithColor => String): Self = this.set("radialLabelsTextColor", js.Any.fromFunction1(value))
    @scala.inline
    def setRadialLabelsTextColor(value: InheritedColorProp[PieDatumWithColor]): Self = this.set("radialLabelsTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadialLabelsTextColor: Self = this.set("radialLabelsTextColor", js.undefined)
    @scala.inline
    def setRadialLabelsTextXOffset(value: Double): Self = this.set("radialLabelsTextXOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadialLabelsTextXOffset: Self = this.set("radialLabelsTextXOffset", js.undefined)
    @scala.inline
    def setSliceLabelFunction1(value: /* datum */ PieDatum => String): Self = this.set("sliceLabel", js.Any.fromFunction1(value))
    @scala.inline
    def setSliceLabel(value: String | AccessorFunc): Self = this.set("sliceLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSliceLabel: Self = this.set("sliceLabel", js.undefined)
    @scala.inline
    def setSlicesLabelsSkipAngle(value: Double): Self = this.set("slicesLabelsSkipAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlicesLabelsSkipAngle: Self = this.set("slicesLabelsSkipAngle", js.undefined)
    @scala.inline
    def setSlicesLabelsTextColorFunction1(value: PieDatumWithColor => String): Self = this.set("slicesLabelsTextColor", js.Any.fromFunction1(value))
    @scala.inline
    def setSlicesLabelsTextColor(value: InheritedColorProp[PieDatumWithColor]): Self = this.set("slicesLabelsTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlicesLabelsTextColor: Self = this.set("slicesLabelsTextColor", js.undefined)
    @scala.inline
    def setSortByValue(value: Boolean): Self = this.set("sortByValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortByValue: Self = this.set("sortByValue", js.undefined)
    @scala.inline
    def setStartAngle(value: Double): Self = this.set("startAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartAngle: Self = this.set("startAngle", js.undefined)
    @scala.inline
    def setTheme(value: Theme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setTooltip(value: StatelessComponent[PieDatumWithColor]): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setTooltipFormatFunction1(value: /* value */ Double => String | Double): Self = this.set("tooltipFormat", js.Any.fromFunction1(value))
    @scala.inline
    def setTooltipFormat(value: String | ValueFormatter): Self = this.set("tooltipFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipFormat: Self = this.set("tooltipFormat", js.undefined)
  }
  
}


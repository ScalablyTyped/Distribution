package typings.nivoStream.mod

import typings.nivoAxes.mod.AxisProps
import typings.nivoColors.mod.InheritedColorProp
import typings.nivoColors.mod.OrdinalColorsInstruction
import typings.nivoCore.anon.Dictkey
import typings.nivoCore.anon.Id
import typings.nivoCore.mod.AreaCurve
import typings.nivoCore.mod.Box
import typings.nivoCore.mod.StackOffset
import typings.nivoCore.mod.StackOrder
import typings.nivoCore.mod.Theme
import typings.nivoLegends.mod.LegendProps
import typings.nivoScales.mod.Scale
import typings.nivoStream.anon.`0`
import typings.nivoStream.nivoStreamStrings.center
import typings.nivoStream.nivoStreamStrings.end
import typings.nivoStream.nivoStreamStrings.start
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@nivo/stream.@nivo/stream.OptionalStreamProps<T>> */
@js.native
trait StreamProps[T] extends js.Object {
  var animate: js.UndefOr[Boolean] = js.native
  var axisBottom: js.UndefOr[AxisProps | Null] = js.native
  var axisLeft: js.UndefOr[AxisProps | Null] = js.native
  var axisRight: js.UndefOr[AxisProps | Null] = js.native
  var axisTop: js.UndefOr[AxisProps | Null] = js.native
  var borderColor: js.UndefOr[InheritedColorProp[_]] = js.native
  var borderWidth: js.UndefOr[Double] = js.native
  var colors: js.UndefOr[OrdinalColorsInstruction[_]] = js.native
  var curve: js.UndefOr[AreaCurve] = js.native
  var data: js.Array[T] = js.native
  var defs: js.UndefOr[js.Array[Dictkey]] = js.native
  var dotBorderColor: js.UndefOr[InheritedColorProp[_]] = js.native
  var dotBorderWidth: js.UndefOr[DatumToNumber | Double] = js.native
  var dotColor: js.UndefOr[InheritedColorProp[_]] = js.native
  var dotPosition: js.UndefOr[start | center | end] = js.native
  var dotSize: js.UndefOr[DatumToNumber | Double] = js.native
  var enableDots: js.UndefOr[Boolean] = js.native
  var enableGridX: js.UndefOr[Boolean] = js.native
  var enableGridY: js.UndefOr[Boolean] = js.native
  var enableStackTooltip: js.UndefOr[Boolean] = js.native
  var fill: js.UndefOr[js.Array[Id[T]]] = js.native
  var fillOpacity: js.UndefOr[Double] = js.native
  var isInteractive: js.UndefOr[Boolean] = js.native
  var keys: js.Array[String] = js.native
  var legends: js.UndefOr[js.Array[LegendProps]] = js.native
  var margin: js.UndefOr[Box] = js.native
  var motionDamping: js.UndefOr[Double] = js.native
  var motionStiffness: js.UndefOr[Double] = js.native
  var offsetType: js.UndefOr[StackOffset] = js.native
  var order: js.UndefOr[StackOrder] = js.native
  var renderDot: js.UndefOr[StreamDotsItem] = js.native
  var stack: js.UndefOr[StackFunc[T]] = js.native
  var theme: js.UndefOr[Theme] = js.native
  var tooltipFormat: js.UndefOr[TooltipFormatter[T] | String] = js.native
  var tooltipLabel: js.UndefOr[TooltipLabel[T]] = js.native
  var xScale: js.UndefOr[Scale] = js.native
  var yScale: js.UndefOr[Scale] = js.native
}

object StreamProps {
  @scala.inline
  def apply[T](data: js.Array[T], keys: js.Array[String]): StreamProps[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamProps[T]]
  }
  @scala.inline
  implicit class StreamPropsOps[Self <: StreamProps[_], T] (val x: Self with StreamProps[T]) extends AnyVal {
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
    def setDataVarargs(value: T*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[T]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeysVarargs(value: String*): Self = this.set("keys", js.Array(value :_*))
    @scala.inline
    def setKeys(value: js.Array[String]): Self = this.set("keys", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimate(value: Boolean): Self = this.set("animate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    @scala.inline
    def setAxisBottom(value: AxisProps): Self = this.set("axisBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxisBottom: Self = this.set("axisBottom", js.undefined)
    @scala.inline
    def setAxisBottomNull: Self = this.set("axisBottom", null)
    @scala.inline
    def setAxisLeft(value: AxisProps): Self = this.set("axisLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxisLeft: Self = this.set("axisLeft", js.undefined)
    @scala.inline
    def setAxisLeftNull: Self = this.set("axisLeft", null)
    @scala.inline
    def setAxisRight(value: AxisProps): Self = this.set("axisRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxisRight: Self = this.set("axisRight", js.undefined)
    @scala.inline
    def setAxisRightNull: Self = this.set("axisRight", null)
    @scala.inline
    def setAxisTop(value: AxisProps): Self = this.set("axisTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxisTop: Self = this.set("axisTop", js.undefined)
    @scala.inline
    def setAxisTopNull: Self = this.set("axisTop", null)
    @scala.inline
    def setBorderColorFunction1(value: _ => String): Self = this.set("borderColor", js.Any.fromFunction1(value))
    @scala.inline
    def setBorderColor(value: InheritedColorProp[_]): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    @scala.inline
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    @scala.inline
    def setColorsVarargs(value: String*): Self = this.set("colors", js.Array(value :_*))
    @scala.inline
    def setColorsFunction1(value: _ => String): Self = this.set("colors", js.Any.fromFunction1(value))
    @scala.inline
    def setColors(value: OrdinalColorsInstruction[_]): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    @scala.inline
    def setCurve(value: AreaCurve): Self = this.set("curve", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurve: Self = this.set("curve", js.undefined)
    @scala.inline
    def setDefsVarargs(value: Dictkey*): Self = this.set("defs", js.Array(value :_*))
    @scala.inline
    def setDefs(value: js.Array[Dictkey]): Self = this.set("defs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefs: Self = this.set("defs", js.undefined)
    @scala.inline
    def setDotBorderColorFunction1(value: _ => String): Self = this.set("dotBorderColor", js.Any.fromFunction1(value))
    @scala.inline
    def setDotBorderColor(value: InheritedColorProp[_]): Self = this.set("dotBorderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDotBorderColor: Self = this.set("dotBorderColor", js.undefined)
    @scala.inline
    def setDotBorderWidthFunction1(value: /* datum */ Datum => Double): Self = this.set("dotBorderWidth", js.Any.fromFunction1(value))
    @scala.inline
    def setDotBorderWidth(value: DatumToNumber | Double): Self = this.set("dotBorderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDotBorderWidth: Self = this.set("dotBorderWidth", js.undefined)
    @scala.inline
    def setDotColorFunction1(value: _ => String): Self = this.set("dotColor", js.Any.fromFunction1(value))
    @scala.inline
    def setDotColor(value: InheritedColorProp[_]): Self = this.set("dotColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDotColor: Self = this.set("dotColor", js.undefined)
    @scala.inline
    def setDotPosition(value: start | center | end): Self = this.set("dotPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDotPosition: Self = this.set("dotPosition", js.undefined)
    @scala.inline
    def setDotSizeFunction1(value: /* datum */ Datum => Double): Self = this.set("dotSize", js.Any.fromFunction1(value))
    @scala.inline
    def setDotSize(value: DatumToNumber | Double): Self = this.set("dotSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDotSize: Self = this.set("dotSize", js.undefined)
    @scala.inline
    def setEnableDots(value: Boolean): Self = this.set("enableDots", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableDots: Self = this.set("enableDots", js.undefined)
    @scala.inline
    def setEnableGridX(value: Boolean): Self = this.set("enableGridX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableGridX: Self = this.set("enableGridX", js.undefined)
    @scala.inline
    def setEnableGridY(value: Boolean): Self = this.set("enableGridY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableGridY: Self = this.set("enableGridY", js.undefined)
    @scala.inline
    def setEnableStackTooltip(value: Boolean): Self = this.set("enableStackTooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableStackTooltip: Self = this.set("enableStackTooltip", js.undefined)
    @scala.inline
    def setFillVarargs(value: Id[T]*): Self = this.set("fill", js.Array(value :_*))
    @scala.inline
    def setFill(value: js.Array[Id[T]]): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setFillOpacity(value: Double): Self = this.set("fillOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillOpacity: Self = this.set("fillOpacity", js.undefined)
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
    def setOffsetType(value: StackOffset): Self = this.set("offsetType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetType: Self = this.set("offsetType", js.undefined)
    @scala.inline
    def setOrder(value: StackOrder): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    @scala.inline
    def setRenderDot(value: StreamDotsItem): Self = this.set("renderDot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderDot: Self = this.set("renderDot", js.undefined)
    @scala.inline
    def setStack(value: /* data */ js.Array[T] => js.Array[js.Array[`0`[T]]]): Self = this.set("stack", js.Any.fromFunction1(value))
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
    @scala.inline
    def setTheme(value: Theme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setTooltipFormatFunction1(value: T => ReactNode): Self = this.set("tooltipFormat", js.Any.fromFunction1(value))
    @scala.inline
    def setTooltipFormat(value: TooltipFormatter[T] | String): Self = this.set("tooltipFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipFormat: Self = this.set("tooltipFormat", js.undefined)
    @scala.inline
    def setTooltipLabel(value: T => String): Self = this.set("tooltipLabel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTooltipLabel: Self = this.set("tooltipLabel", js.undefined)
    @scala.inline
    def setXScale(value: Scale): Self = this.set("xScale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXScale: Self = this.set("xScale", js.undefined)
    @scala.inline
    def setYScale(value: Scale): Self = this.set("yScale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYScale: Self = this.set("yScale", js.undefined)
  }
  
}


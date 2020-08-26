package typings.nivoBar.mod

import typings.nivoBar.anon.Id
import typings.nivoCore.mod.Theme
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BarItemProps extends js.Object {
  var borderColor: String = js.native
  var borderRadius: Double = js.native
  var borderWidth: Double = js.native
  var color: String = js.native
  var data: Id = js.native
  var height: Double = js.native
  var label: String = js.native
  var labelColor: String = js.native
  var onClick: BarMouseEventHandler[HTMLCanvasElement] = js.native
  var onMouseEnter: BarMouseEventHandler[HTMLCanvasElement] = js.native
  var onMouseLeave: BarMouseEventHandler[HTMLCanvasElement] = js.native
  var shouldRenderLabel: Boolean = js.native
  var theme: Theme = js.native
  var tooltip: TooltipProp = js.native
  var tooltipFormat: String | ValueFormatter = js.native
  var width: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  def hideTooltip(): Unit = js.native
  def showTooltip(tooltip: ReactNode, event: MouseEvent[HTMLCanvasElement, NativeMouseEvent]): Unit = js.native
}

object BarItemProps {
  @scala.inline
  def apply(
    borderColor: String,
    borderRadius: Double,
    borderWidth: Double,
    color: String,
    data: Id,
    height: Double,
    hideTooltip: () => Unit,
    label: String,
    labelColor: String,
    onClick: (/* datum */ BarExtendedDatum, /* event */ MouseEvent[HTMLCanvasElement, NativeMouseEvent]) => Unit,
    onMouseEnter: (/* datum */ BarExtendedDatum, /* event */ MouseEvent[HTMLCanvasElement, NativeMouseEvent]) => Unit,
    onMouseLeave: (/* datum */ BarExtendedDatum, /* event */ MouseEvent[HTMLCanvasElement, NativeMouseEvent]) => Unit,
    shouldRenderLabel: Boolean,
    showTooltip: (ReactNode, MouseEvent[HTMLCanvasElement, NativeMouseEvent]) => Unit,
    theme: Theme,
    tooltip: TooltipProp,
    tooltipFormat: String | ValueFormatter,
    width: Double,
    x: Double,
    y: Double
  ): BarItemProps = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderRadius = borderRadius.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], hideTooltip = js.Any.fromFunction0(hideTooltip), label = label.asInstanceOf[js.Any], labelColor = labelColor.asInstanceOf[js.Any], onClick = js.Any.fromFunction2(onClick), onMouseEnter = js.Any.fromFunction2(onMouseEnter), onMouseLeave = js.Any.fromFunction2(onMouseLeave), shouldRenderLabel = shouldRenderLabel.asInstanceOf[js.Any], showTooltip = js.Any.fromFunction2(showTooltip), theme = theme.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], tooltipFormat = tooltipFormat.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarItemProps]
  }
  @scala.inline
  implicit class BarItemPropsOps[Self <: BarItemProps] (val x: Self) extends AnyVal {
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
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderRadius(value: Double): Self = this.set("borderRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: Id): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setHideTooltip(value: () => Unit): Self = this.set("hideTooltip", js.Any.fromFunction0(value))
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelColor(value: String): Self = this.set("labelColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnClick(
      value: (/* datum */ BarExtendedDatum, /* event */ MouseEvent[HTMLCanvasElement, NativeMouseEvent]) => Unit
    ): Self = this.set("onClick", js.Any.fromFunction2(value))
    @scala.inline
    def setOnMouseEnter(
      value: (/* datum */ BarExtendedDatum, /* event */ MouseEvent[HTMLCanvasElement, NativeMouseEvent]) => Unit
    ): Self = this.set("onMouseEnter", js.Any.fromFunction2(value))
    @scala.inline
    def setOnMouseLeave(
      value: (/* datum */ BarExtendedDatum, /* event */ MouseEvent[HTMLCanvasElement, NativeMouseEvent]) => Unit
    ): Self = this.set("onMouseLeave", js.Any.fromFunction2(value))
    @scala.inline
    def setShouldRenderLabel(value: Boolean): Self = this.set("shouldRenderLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowTooltip(value: (ReactNode, MouseEvent[HTMLCanvasElement, NativeMouseEvent]) => Unit): Self = this.set("showTooltip", js.Any.fromFunction2(value))
    @scala.inline
    def setTheme(value: Theme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def setTooltip(value: TooltipProp): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def setTooltipFormatFunction1(value: /* value */ Double => String | Double): Self = this.set("tooltipFormat", js.Any.fromFunction1(value))
    @scala.inline
    def setTooltipFormat(value: String | ValueFormatter): Self = this.set("tooltipFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}


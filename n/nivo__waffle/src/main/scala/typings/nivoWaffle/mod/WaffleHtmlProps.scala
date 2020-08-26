package typings.nivoWaffle.mod

import typings.nivoColors.mod.InheritedColorProp
import typings.nivoCore.mod.Box
import typings.nivoCore.mod.Colors
import typings.nivoCore.mod.GetColor
import typings.nivoCore.mod.Theme
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.StatelessComponent
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @nivo/waffle.@nivo/waffle.WaffleBaseProps & @nivo/waffle.@nivo/waffle.WaffleCommonProps & @nivo/core.@nivo/core.MotionProps */
@js.native
trait WaffleHtmlProps extends js.Object {
  var animate: js.UndefOr[Boolean] = js.native
  var borderColor: js.UndefOr[InheritedColorProp[WaffleDatum]] = js.native
  var borderWidth: js.UndefOr[Double] = js.native
  var colorBy: js.UndefOr[String | GetColor[WaffleDatum]] = js.native
  var colors: js.UndefOr[Colors] = js.native
  var columns: Double = js.native
  var data: js.Array[js.Object] = js.native
  var emptyColor: js.UndefOr[String] = js.native
  var emptyOpacity: js.UndefOr[Double] = js.native
  var enableLabels: js.UndefOr[Boolean] = js.native
  var fillDirection: js.UndefOr[WaffleFillDirection] = js.native
  var isInteractive: js.UndefOr[Boolean] = js.native
  var margin: js.UndefOr[Box] = js.native
  var motionDamping: js.UndefOr[Double] = js.native
  var motionStiffness: js.UndefOr[Double] = js.native
  var onClick: js.UndefOr[
    js.Function2[
      /* datum */ WaffleDatum, 
      /* event */ MouseEvent[HTMLCanvasElement, NativeMouseEvent], 
      Unit
    ]
  ] = js.native
  var padding: js.UndefOr[Double] = js.native
  var rows: Double = js.native
  var theme: js.UndefOr[Theme] = js.native
  var tooltip: js.UndefOr[StatelessComponent[WaffleTooltipData]] = js.native
  var tooltipFormat: js.UndefOr[String | ValueFormatter] = js.native
  var total: Double = js.native
}

object WaffleHtmlProps {
  @scala.inline
  def apply(columns: Double, data: js.Array[js.Object], rows: Double, total: Double): WaffleHtmlProps = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaffleHtmlProps]
  }
  @scala.inline
  implicit class WaffleHtmlPropsOps[Self <: WaffleHtmlProps] (val x: Self) extends AnyVal {
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
    def setColumns(value: Double): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataVarargs(value: js.Object*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[js.Object]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setRows(value: Double): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimate(value: Boolean): Self = this.set("animate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    @scala.inline
    def setBorderColorFunction1(value: WaffleDatum => String): Self = this.set("borderColor", js.Any.fromFunction1(value))
    @scala.inline
    def setBorderColor(value: InheritedColorProp[WaffleDatum]): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    @scala.inline
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    @scala.inline
    def setColorByFunction1(value: WaffleDatum => String): Self = this.set("colorBy", js.Any.fromFunction1(value))
    @scala.inline
    def setColorBy(value: String | GetColor[WaffleDatum]): Self = this.set("colorBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorBy: Self = this.set("colorBy", js.undefined)
    @scala.inline
    def setColorsVarargs(value: String*): Self = this.set("colors", js.Array(value :_*))
    @scala.inline
    def setColors(value: Colors): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    @scala.inline
    def setEmptyColor(value: String): Self = this.set("emptyColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmptyColor: Self = this.set("emptyColor", js.undefined)
    @scala.inline
    def setEmptyOpacity(value: Double): Self = this.set("emptyOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmptyOpacity: Self = this.set("emptyOpacity", js.undefined)
    @scala.inline
    def setEnableLabels(value: Boolean): Self = this.set("enableLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableLabels: Self = this.set("enableLabels", js.undefined)
    @scala.inline
    def setFillDirection(value: WaffleFillDirection): Self = this.set("fillDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillDirection: Self = this.set("fillDirection", js.undefined)
    @scala.inline
    def setIsInteractive(value: Boolean): Self = this.set("isInteractive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsInteractive: Self = this.set("isInteractive", js.undefined)
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
    def setOnClick(
      value: (/* datum */ WaffleDatum, /* event */ MouseEvent[HTMLCanvasElement, NativeMouseEvent]) => Unit
    ): Self = this.set("onClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setTheme(value: Theme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setTooltip(value: StatelessComponent[WaffleTooltipData]): Self = this.set("tooltip", value.asInstanceOf[js.Any])
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


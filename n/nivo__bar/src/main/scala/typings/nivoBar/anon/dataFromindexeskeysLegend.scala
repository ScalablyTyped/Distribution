package typings.nivoBar.anon

import typings.nivoBar.nivoBarStrings.indexes
import typings.nivoBar.nivoBarStrings.keys
import typings.nivoLegends.anon.Color
import typings.nivoLegends.mod.Box
import typings.nivoLegends.mod.LegendAnchor
import typings.nivoLegends.mod.LegendDirection
import typings.nivoLegends.mod.LegendEffect
import typings.nivoLegends.mod.LegendItemDirection
import typings.nivoLegends.mod.LegendMouseHandler
import typings.nivoLegends.mod.LegendMouseHandlerData
import typings.nivoLegends.mod.LegendSymbolShape
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  dataFrom :'indexes' | 'keys'} & @nivo/legends.@nivo/legends.LegendProps */
@js.native
trait dataFromindexeskeysLegend extends js.Object {
  var anchor: LegendAnchor = js.native
  var data: js.UndefOr[js.Array[Color]] = js.native
  var dataFrom: indexes | keys = js.native
  var direction: LegendDirection = js.native
  var effects: js.UndefOr[js.Array[LegendEffect]] = js.native
  var itemBackground: js.UndefOr[String] = js.native
  var itemDirection: js.UndefOr[LegendItemDirection] = js.native
  var itemHeight: Double = js.native
  var itemOpacity: js.UndefOr[Double] = js.native
  var itemTextColor: js.UndefOr[String] = js.native
  var itemWidth: Double = js.native
  var itemsSpacing: js.UndefOr[Double] = js.native
  var justify: js.UndefOr[Boolean] = js.native
  var onClick: js.UndefOr[LegendMouseHandler] = js.native
  var onMouseEnter: js.UndefOr[LegendMouseHandler] = js.native
  var onMouseLeave: js.UndefOr[LegendMouseHandler] = js.native
  var padding: js.UndefOr[Double | Box] = js.native
  var symbolBorderColor: js.UndefOr[String] = js.native
  var symbolShape: js.UndefOr[LegendSymbolShape | js.Any] = js.native
  var symbolSize: js.UndefOr[Double] = js.native
  var symbolSpacing: js.UndefOr[Double] = js.native
  var textColor: js.UndefOr[String] = js.native
  var translateX: js.UndefOr[Double] = js.native
  var translateY: js.UndefOr[Double] = js.native
}

object dataFromindexeskeysLegend {
  @scala.inline
  def apply(
    anchor: LegendAnchor,
    dataFrom: indexes | keys,
    direction: LegendDirection,
    itemHeight: Double,
    itemWidth: Double
  ): dataFromindexeskeysLegend = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], dataFrom = dataFrom.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], itemHeight = itemHeight.asInstanceOf[js.Any], itemWidth = itemWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[dataFromindexeskeysLegend]
  }
  @scala.inline
  implicit class dataFromindexeskeysLegendOps[Self <: dataFromindexeskeysLegend] (val x: Self) extends AnyVal {
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
    def setAnchor(value: LegendAnchor): Self = this.set("anchor", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataFrom(value: indexes | keys): Self = this.set("dataFrom", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirection(value: LegendDirection): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemHeight(value: Double): Self = this.set("itemHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemWidth(value: Double): Self = this.set("itemWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataVarargs(value: Color*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[Color]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setEffectsVarargs(value: LegendEffect*): Self = this.set("effects", js.Array(value :_*))
    @scala.inline
    def setEffects(value: js.Array[LegendEffect]): Self = this.set("effects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEffects: Self = this.set("effects", js.undefined)
    @scala.inline
    def setItemBackground(value: String): Self = this.set("itemBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemBackground: Self = this.set("itemBackground", js.undefined)
    @scala.inline
    def setItemDirection(value: LegendItemDirection): Self = this.set("itemDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemDirection: Self = this.set("itemDirection", js.undefined)
    @scala.inline
    def setItemOpacity(value: Double): Self = this.set("itemOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemOpacity: Self = this.set("itemOpacity", js.undefined)
    @scala.inline
    def setItemTextColor(value: String): Self = this.set("itemTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemTextColor: Self = this.set("itemTextColor", js.undefined)
    @scala.inline
    def setItemsSpacing(value: Double): Self = this.set("itemsSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemsSpacing: Self = this.set("itemsSpacing", js.undefined)
    @scala.inline
    def setJustify(value: Boolean): Self = this.set("justify", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJustify: Self = this.set("justify", js.undefined)
    @scala.inline
    def setOnClick(
      value: (/* data */ LegendMouseHandlerData, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit
    ): Self = this.set("onClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnMouseEnter(
      value: (/* data */ LegendMouseHandlerData, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit
    ): Self = this.set("onMouseEnter", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    @scala.inline
    def setOnMouseLeave(
      value: (/* data */ LegendMouseHandlerData, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit
    ): Self = this.set("onMouseLeave", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    @scala.inline
    def setPadding(value: Double | Box): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setSymbolBorderColor(value: String): Self = this.set("symbolBorderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbolBorderColor: Self = this.set("symbolBorderColor", js.undefined)
    @scala.inline
    def setSymbolShape(value: LegendSymbolShape | js.Any): Self = this.set("symbolShape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbolShape: Self = this.set("symbolShape", js.undefined)
    @scala.inline
    def setSymbolSize(value: Double): Self = this.set("symbolSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbolSize: Self = this.set("symbolSize", js.undefined)
    @scala.inline
    def setSymbolSpacing(value: Double): Self = this.set("symbolSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbolSpacing: Self = this.set("symbolSpacing", js.undefined)
    @scala.inline
    def setTextColor(value: String): Self = this.set("textColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextColor: Self = this.set("textColor", js.undefined)
    @scala.inline
    def setTranslateX(value: Double): Self = this.set("translateX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslateX: Self = this.set("translateX", js.undefined)
    @scala.inline
    def setTranslateY(value: Double): Self = this.set("translateY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslateY: Self = this.set("translateY", js.undefined)
  }
  
}


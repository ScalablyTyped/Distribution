package typings.openlayers.mod.olx.control

import typings.openlayers.mod.Collection
import typings.openlayers.mod.MapEvent
import typings.openlayers.mod.View
import typings.openlayers.mod.layer.Layer
import typings.std.Element
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverviewMapOptions extends js.Object {
  var collapseLabel: js.UndefOr[String | Node] = js.native
  var collapsed: js.UndefOr[Boolean] = js.native
  var collapsible: js.UndefOr[Boolean] = js.native
  var label: js.UndefOr[String | Node] = js.native
  var layers: js.UndefOr[js.Array[Layer] | Collection[Layer]] = js.native
  var render: js.UndefOr[js.Function1[/* event */ MapEvent, _]] = js.native
  var target: js.UndefOr[Element] = js.native
  var tipLabel: js.UndefOr[String] = js.native
  var view: js.UndefOr[View] = js.native
}

object OverviewMapOptions {
  @scala.inline
  def apply(): OverviewMapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverviewMapOptions]
  }
  @scala.inline
  implicit class OverviewMapOptionsOps[Self <: OverviewMapOptions] (val x: Self) extends AnyVal {
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
    def setCollapseLabel(value: String | Node): Self = this.set("collapseLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapseLabel: Self = this.set("collapseLabel", js.undefined)
    @scala.inline
    def setCollapsed(value: Boolean): Self = this.set("collapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapsed: Self = this.set("collapsed", js.undefined)
    @scala.inline
    def setCollapsible(value: Boolean): Self = this.set("collapsible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapsible: Self = this.set("collapsible", js.undefined)
    @scala.inline
    def setLabel(value: String | Node): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLayersVarargs(value: Layer*): Self = this.set("layers", js.Array(value :_*))
    @scala.inline
    def setLayers(value: js.Array[Layer] | Collection[Layer]): Self = this.set("layers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayers: Self = this.set("layers", js.undefined)
    @scala.inline
    def setRender(value: /* event */ MapEvent => _): Self = this.set("render", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    @scala.inline
    def setTarget(value: Element): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setTipLabel(value: String): Self = this.set("tipLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTipLabel: Self = this.set("tipLabel", js.undefined)
    @scala.inline
    def setView(value: View): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
  
}


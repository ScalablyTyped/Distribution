package typings.oracleOraclejet.ojgaugeMod.ojStatusMeterGauge

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
@js.native
trait TooltipContext extends js.Object {
  var color: String = js.native
  var componentElement: Element = js.native
  var label: String = js.native
  var parentElement: Element = js.native
}

object TooltipContext {
  @scala.inline
  def apply(color: String, componentElement: Element, label: String, parentElement: Element): TooltipContext = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], componentElement = componentElement.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipContext]
  }
  @scala.inline
  implicit class TooltipContextOps[Self <: TooltipContext] (val x: Self) extends AnyVal {
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setComponentElement(value: Element): Self = this.set("componentElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentElement(value: Element): Self = this.set("parentElement", value.asInstanceOf[js.Any])
  }
  
}


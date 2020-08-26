package typings.oracleOraclejet.ojradiosetMod.ojRadioset

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
@js.native
trait OptionContext[D] extends js.Object {
  var component: Element = js.native
  var data: D = js.native
  var index: Double = js.native
}

object OptionContext {
  @scala.inline
  def apply[D](component: Element, data: D, index: Double): OptionContext[D] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionContext[D]]
  }
  @scala.inline
  implicit class OptionContextOps[Self <: OptionContext[_], D] (val x: Self with OptionContext[D]) extends AnyVal {
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
    def setComponent(value: Element): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: D): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
  }
  
}


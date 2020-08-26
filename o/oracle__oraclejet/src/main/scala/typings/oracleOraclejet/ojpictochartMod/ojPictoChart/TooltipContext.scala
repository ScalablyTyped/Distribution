package typings.oracleOraclejet.ojpictochartMod.ojPictoChart

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
@js.native
trait TooltipContext[K] extends js.Object {
  var color: String = js.native
  var componentElement: Element = js.native
  var count: Double = js.native
  var id: K = js.native
  var name: String = js.native
  var parentElement: Element = js.native
}

object TooltipContext {
  @scala.inline
  def apply[K](
    color: String,
    componentElement: Element,
    count: Double,
    id: K,
    name: String,
    parentElement: Element
  ): TooltipContext[K] = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], componentElement = componentElement.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipContext[K]]
  }
  @scala.inline
  implicit class TooltipContextOps[Self <: TooltipContext[_], K] (val x: Self with TooltipContext[K]) extends AnyVal {
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: K): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentElement(value: Element): Self = this.set("parentElement", value.asInstanceOf[js.Any])
  }
  
}


package typings.oracleOraclejet.ojselectcomboboxMod.ojSelect

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
@js.native
trait OptionContext extends js.Object {
  var component: Element = js.native
  var data: js.Object = js.native
  var depth: Double = js.native
  var index: Double = js.native
  var leaf: Boolean = js.native
  var parent: Element = js.native
  var parentElement: Element = js.native
}

object OptionContext {
  @scala.inline
  def apply(
    component: Element,
    data: js.Object,
    depth: Double,
    index: Double,
    leaf: Boolean,
    parent: Element,
    parentElement: Element
  ): OptionContext = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], leaf = leaf.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionContext]
  }
  @scala.inline
  implicit class OptionContextOps[Self <: OptionContext] (val x: Self) extends AnyVal {
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
    def setData(value: js.Object): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeaf(value: Boolean): Self = this.set("leaf", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: Element): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentElement(value: Element): Self = this.set("parentElement", value.asInstanceOf[js.Any])
  }
  
}


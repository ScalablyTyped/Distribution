package typings.moonjs.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VDomElement extends js.Object {
  var children: js.Array[VDomElement] = js.native
  var meta: js.Object = js.native
  var props: Record[String, _] = js.native
  var `type`: String = js.native
  var `val`: String = js.native
}

object VDomElement {
  @scala.inline
  def apply(
    children: js.Array[VDomElement],
    meta: js.Object,
    props: Record[String, _],
    `type`: String,
    `val`: String
  ): VDomElement = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VDomElement]
  }
  @scala.inline
  implicit class VDomElementOps[Self <: VDomElement] (val x: Self) extends AnyVal {
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
    def setChildrenVarargs(value: VDomElement*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[VDomElement]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setMeta(value: js.Object): Self = this.set("meta", value.asInstanceOf[js.Any])
    @scala.inline
    def setProps(value: Record[String, _]): Self = this.set("props", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setVal(value: String): Self = this.set("val", value.asInstanceOf[js.Any])
  }
  
}


package typings.moonjs.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VDomElement extends js.Object {
  var children: js.Array[VDomElement]
  var meta: js.Object
  var props: Record[String, _]
  var `type`: String
  var `val`: String
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
}


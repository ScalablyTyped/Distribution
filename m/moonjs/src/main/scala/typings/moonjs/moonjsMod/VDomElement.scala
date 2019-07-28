package typings.moonjs.moonjsMod

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
    val __obj = js.Dynamic.literal(children = children, meta = meta, props = props)
    __obj.updateDynamic("type")(`type`)
    __obj.updateDynamic("val")(`val`)
    __obj.asInstanceOf[VDomElement]
  }
}


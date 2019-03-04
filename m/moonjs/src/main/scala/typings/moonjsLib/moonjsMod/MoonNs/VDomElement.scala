package typings
package moonjsLib.moonjsMod.MoonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VDomElement extends js.Object {
  var children: js.Array[VDomElement]
  var meta: js.Object
  var props: stdLib.Record[java.lang.String, _]
  var `type`: java.lang.String
  var `val`: java.lang.String
}

object VDomElement {
  @scala.inline
  def apply(
    children: js.Array[VDomElement],
    meta: js.Object,
    props: stdLib.Record[java.lang.String, _],
    `type`: java.lang.String,
    `val`: java.lang.String
  ): VDomElement = {
    val __obj = js.Dynamic.literal(children = children, meta = meta, props = props)
    __obj.updateDynamic("type")(`type`)
    __obj.updateDynamic("val")(`val`)
    __obj.asInstanceOf[VDomElement]
  }
}


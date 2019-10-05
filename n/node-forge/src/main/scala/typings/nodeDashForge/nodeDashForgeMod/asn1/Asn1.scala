package typings.nodeDashForge.nodeDashForgeMod.asn1

import typings.nodeDashForge.nodeDashForgeMod.Bytes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Asn1 extends js.Object {
  var composed: Boolean
  var constructed: Boolean
  var tagClass: Class
  var `type`: Type
  var value: Bytes | js.Array[Asn1]
}

object Asn1 {
  @scala.inline
  def apply(
    composed: Boolean,
    constructed: Boolean,
    tagClass: Class,
    `type`: Type,
    value: Bytes | js.Array[Asn1]
  ): Asn1 = {
    val __obj = js.Dynamic.literal(composed = composed, constructed = constructed, tagClass = tagClass, value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Asn1]
  }
}


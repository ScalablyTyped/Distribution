package typings.nodeForge.mod.asn1

import typings.nodeForge.mod.Bytes
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
    val __obj = js.Dynamic.literal(composed = composed.asInstanceOf[js.Any], constructed = constructed.asInstanceOf[js.Any], tagClass = tagClass.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Asn1]
  }
}


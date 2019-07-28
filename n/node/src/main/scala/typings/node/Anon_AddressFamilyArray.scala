package typings.node

import typings.node.dnsMod.LookupAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddressFamilyArray extends js.Object {
  var address: java.lang.String | js.Array[LookupAddress]
  var family: js.UndefOr[Double] = js.undefined
}

object Anon_AddressFamilyArray {
  @scala.inline
  def apply(address: java.lang.String | js.Array[LookupAddress], family: Int | Double = null): Anon_AddressFamilyArray = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AddressFamilyArray]
  }
}


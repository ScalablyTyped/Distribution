package typings.node.dnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LookupAddress extends js.Object {
  var address: String
  var family: Double
}

object LookupAddress {
  @scala.inline
  def apply(address: String, family: Double): LookupAddress = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LookupAddress]
  }
}


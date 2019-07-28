package typings.node.dnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LookupAddress extends js.Object {
  var address: java.lang.String
  var family: Double
}

object LookupAddress {
  @scala.inline
  def apply(address: java.lang.String, family: Double): LookupAddress = {
    val __obj = js.Dynamic.literal(address = address, family = family)
  
    __obj.asInstanceOf[LookupAddress]
  }
}


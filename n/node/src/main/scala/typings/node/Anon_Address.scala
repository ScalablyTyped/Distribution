package typings.node

import typings.node.dnsMod.LookupAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Address extends js.Object {
  var address: js.Array[LookupAddress]
}

object Anon_Address {
  @scala.inline
  def apply(address: js.Array[LookupAddress]): Anon_Address = {
    val __obj = js.Dynamic.literal(address = address)
  
    __obj.asInstanceOf[Anon_Address]
  }
}


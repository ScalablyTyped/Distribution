package typings.nodemailer.libAddressparserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Group extends AddressOrGroup {
  var group: js.Array[AddressOrGroup]
  var name: String
}

object Group {
  @scala.inline
  def apply(group: js.Array[AddressOrGroup], name: String): Group = {
    val __obj = js.Dynamic.literal(group = group, name = name)
  
    __obj.asInstanceOf[Group]
  }
}


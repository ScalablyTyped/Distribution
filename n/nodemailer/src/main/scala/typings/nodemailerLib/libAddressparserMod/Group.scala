package typings
package nodemailerLib.libAddressparserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Group extends AddressOrGroup {
  var group: js.Array[AddressOrGroup]
  var name: java.lang.String
}

object Group {
  @scala.inline
  def apply(group: js.Array[AddressOrGroup], name: java.lang.String): Group = {
    val __obj = js.Dynamic.literal(group = group, name = name)
  
    __obj.asInstanceOf[Group]
  }
}


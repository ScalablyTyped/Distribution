package typings.nodemailer.libAddressparserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodemailer.libAddressparserMod.Address
  - typings.nodemailer.libAddressparserMod.Group
*/
trait AddressOrGroup extends js.Object

object AddressOrGroup {
  @scala.inline
  def Address(address: String, name: String): AddressOrGroup = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AddressOrGroup]
  }
  @scala.inline
  def Group(group: js.Array[AddressOrGroup], name: String): AddressOrGroup = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AddressOrGroup]
  }
}


package typings.nodemailer.addressparserMod

import typings.nodemailer.AnonFalse
import typings.nodemailer.AnonFlatten
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodemailer/lib/addressparser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(address: String): js.Array[AddressOrGroup] = js.native
  def apply(address: String, options: AnonFalse): js.Array[AddressOrGroup] = js.native
  /**
    * Parses structured e-mail addresses from an address field
    *
    * Example:
    *
    *    'Name <address@domain>'
    *
    * will be converted to
    *
    *     [{name: 'Name', address: 'address@domain'}]
    *
    * @return An array of address objects
    */
  def apply(address: String, options: AnonFlatten): js.Array[Address] = js.native
}


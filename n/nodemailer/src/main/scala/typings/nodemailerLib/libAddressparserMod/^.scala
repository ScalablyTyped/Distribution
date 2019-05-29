package typings
package nodemailerLib.libAddressparserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodemailer/lib/addressparser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(address: java.lang.String): js.Array[AddressOrGroup] = js.native
  def apply(address: java.lang.String, options: nodemailerLib.Anon_False): js.Array[AddressOrGroup] = js.native
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
  def apply(address: java.lang.String, options: nodemailerLib.Anon_Flatten): js.Array[Address] = js.native
}


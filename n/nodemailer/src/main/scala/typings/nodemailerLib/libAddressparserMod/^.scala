package typings
package nodemailerLib.libAddressparserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodemailer/lib/addressparser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
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
  def apply(address: java.lang.String): js.Array[nodemailerLib.libAddressparserMod.addressparserNs.Address] = js.native
}


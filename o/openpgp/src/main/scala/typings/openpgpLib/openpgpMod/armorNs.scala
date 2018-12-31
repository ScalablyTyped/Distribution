package typings
package openpgpLib.openpgpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "armor")
@js.native
object armorNs extends js.Object {
  /** Armor an OpenPGP binary packet block
    @param messagetype type of the message
    @param body
    @param partindex
    @param parttotal
    */
  def armor(
    messagetype: openpgpLib.openpgpMod.enumsNs.armor,
    body: js.Object,
    partindex: scala.Double,
    parttotal: scala.Double
  ): java.lang.String = js.native
  /** DeArmor an OpenPGP armored message; verify the checksum and return the encoded bytes
    @param text OpenPGP armored message
    */
  def dearmor(text: java.lang.String): js.Object = js.native
}


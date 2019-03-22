package typings
package openpgpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Keyid extends js.Object {
  var keyid: openpgpLib.openpgpMod.typeNs.keyidNs.Keyid
  var valid: scala.Boolean
}

object Anon_Keyid {
  @scala.inline
  def apply(keyid: openpgpLib.openpgpMod.typeNs.keyidNs.Keyid, valid: scala.Boolean): Anon_Keyid = {
    val __obj = js.Dynamic.literal(keyid = keyid, valid = valid)
  
    __obj.asInstanceOf[Anon_Keyid]
  }
}


package typings
package openpgpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyidUserid extends js.Object {
  var keyid: openpgpLib.openpgpMod.typeNs.keyidNs.Keyid
  var userid: java.lang.String
  var valid: scala.Boolean
}

object Anon_KeyidUserid {
  @scala.inline
  def apply(keyid: openpgpLib.openpgpMod.typeNs.keyidNs.Keyid, userid: java.lang.String, valid: scala.Boolean): Anon_KeyidUserid = {
    val __obj = js.Dynamic.literal(keyid = keyid, userid = userid, valid = valid)
  
    __obj.asInstanceOf[Anon_KeyidUserid]
  }
}


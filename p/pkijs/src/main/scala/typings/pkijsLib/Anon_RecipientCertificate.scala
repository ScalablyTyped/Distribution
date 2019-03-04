package typings
package pkijsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RecipientCertificate extends js.Object {
  var recipientCertificate: pkijsLib.srcCertificateMod.default
  var recipientPrivateKey: stdLib.ArrayBuffer
}

object Anon_RecipientCertificate {
  @scala.inline
  def apply(recipientCertificate: pkijsLib.srcCertificateMod.default, recipientPrivateKey: stdLib.ArrayBuffer): Anon_RecipientCertificate = {
    val __obj = js.Dynamic.literal(recipientCertificate = recipientCertificate, recipientPrivateKey = recipientPrivateKey)
  
    __obj.asInstanceOf[Anon_RecipientCertificate]
  }
}


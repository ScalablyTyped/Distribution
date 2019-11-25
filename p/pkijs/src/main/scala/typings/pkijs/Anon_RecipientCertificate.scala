package typings.pkijs

import typings.pkijs.srcCertificateMod.default
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RecipientCertificate extends js.Object {
  var recipientCertificate: default
  var recipientPrivateKey: ArrayBuffer
}

object Anon_RecipientCertificate {
  @scala.inline
  def apply(recipientCertificate: default, recipientPrivateKey: ArrayBuffer): Anon_RecipientCertificate = {
    val __obj = js.Dynamic.literal(recipientCertificate = recipientCertificate.asInstanceOf[js.Any], recipientPrivateKey = recipientPrivateKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_RecipientCertificate]
  }
}


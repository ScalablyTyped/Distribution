package typings.pkijs

import typings.pkijs.certificateMod.default
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRecipientCertificate extends js.Object {
  var recipientCertificate: default
  var recipientPrivateKey: ArrayBuffer
}

object AnonRecipientCertificate {
  @scala.inline
  def apply(recipientCertificate: default, recipientPrivateKey: ArrayBuffer): AnonRecipientCertificate = {
    val __obj = js.Dynamic.literal(recipientCertificate = recipientCertificate.asInstanceOf[js.Any], recipientPrivateKey = recipientPrivateKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRecipientCertificate]
  }
}


package typings.nodeForge

import typings.nodeForge.mod.pkcs12.Bag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEncrypted extends js.Object {
  var encrypted: Boolean
  var safeBags: js.Array[Bag]
}

object AnonEncrypted {
  @scala.inline
  def apply(encrypted: Boolean, safeBags: js.Array[Bag]): AnonEncrypted = {
    val __obj = js.Dynamic.literal(encrypted = encrypted.asInstanceOf[js.Any], safeBags = safeBags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEncrypted]
  }
}


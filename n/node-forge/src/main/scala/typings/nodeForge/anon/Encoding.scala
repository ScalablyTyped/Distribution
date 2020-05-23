package typings.nodeForge.anon

import typings.nodeForge.mod.pki.ed25519.ToNativeBufferParameters
import typings.nodeForge.nodeForgeStrings.binary
import typings.nodeForge.nodeForgeStrings.utf8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Encoding extends ToNativeBufferParameters {
  var encoding: binary | utf8
  var message: String
}

object Encoding {
  @scala.inline
  def apply(encoding: binary | utf8, message: String): Encoding = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encoding]
  }
}


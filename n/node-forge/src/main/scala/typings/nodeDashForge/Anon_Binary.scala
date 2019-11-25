package typings.nodeDashForge

import typings.nodeDashForge.nodeDashForgeMod.pki.ed25519.ToNativeBufferParameters
import typings.nodeDashForge.nodeDashForgeStrings.binary
import typings.nodeDashForge.nodeDashForgeStrings.utf8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Binary extends ToNativeBufferParameters {
  var encoding: binary | utf8
  var message: String
}

object Anon_Binary {
  @scala.inline
  def apply(encoding: binary | utf8, message: String): Anon_Binary = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Binary]
  }
}


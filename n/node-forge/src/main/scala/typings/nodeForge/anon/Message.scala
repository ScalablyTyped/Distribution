package typings.nodeForge.anon

import typings.nodeForge.mod.pki.ed25519.NativeBuffer
import typings.nodeForge.mod.pki.ed25519.ToNativeBufferParameters
import typings.nodeForge.mod.util.ByteBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends ToNativeBufferParameters {
  var message: NativeBuffer | ByteBuffer
}

object Message {
  @scala.inline
  def apply(message: NativeBuffer | ByteBuffer): Message = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
}


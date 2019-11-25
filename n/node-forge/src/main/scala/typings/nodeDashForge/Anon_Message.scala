package typings.nodeDashForge

import typings.nodeDashForge.nodeDashForgeMod.pki.ed25519.NativeBuffer
import typings.nodeDashForge.nodeDashForgeMod.pki.ed25519.ToNativeBufferParameters
import typings.nodeDashForge.nodeDashForgeMod.util.ByteBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Message extends ToNativeBufferParameters {
  var message: NativeBuffer | ByteBuffer
}

object Anon_Message {
  @scala.inline
  def apply(message: NativeBuffer | ByteBuffer): Anon_Message = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Message]
  }
}


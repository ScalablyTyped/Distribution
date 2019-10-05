package typings.nodeDashForge.nodeDashForgeMod.pki.ed25519

import typings.nodeDashForge.nodeDashForgeMod.util.ByteBuffer
import typings.nodeDashForge.nodeDashForgeStrings.binary
import typings.nodeDashForge.nodeDashForgeStrings.utf8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToNativeBufferParameters extends js.Object {
  var encoding: js.UndefOr[binary | utf8] = js.undefined
  var message: js.UndefOr[ByteBuffer | NativeBuffer | String] = js.undefined
}

object ToNativeBufferParameters {
  @scala.inline
  def apply(encoding: binary | utf8 = null, message: NativeBuffer | ByteBuffer = null): ToNativeBufferParameters = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToNativeBufferParameters]
  }
}


package typings.nodeDashForge

import typings.node.Buffer
import typings.nodeDashForge.nodeDashForgeMod.pkiNs.ed25519Ns.NativeBuffer
import typings.nodeDashForge.nodeDashForgeMod.utilNs.ByteBuffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncodingMessage extends js.Object {
  var encoding: String
  var message: String
  var publicKey: NativeBuffer
  var signature: Buffer | Uint8Array | ByteBuffer | String
}

object Anon_EncodingMessage {
  @scala.inline
  def apply(
    encoding: String,
    message: String,
    publicKey: NativeBuffer,
    signature: Buffer | Uint8Array | ByteBuffer | String
  ): Anon_EncodingMessage = {
    val __obj = js.Dynamic.literal(encoding = encoding, message = message, publicKey = publicKey.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_EncodingMessage]
  }
}


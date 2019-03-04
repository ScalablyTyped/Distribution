package typings
package nodeDashForgeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncodingMessage extends js.Object {
  var encoding: java.lang.String
  var message: java.lang.String
  var publicKey: nodeDashForgeLib.nodeDashForgeMod.pkiNs.ed25519Ns.NativeBuffer
  var signature: nodeLib.Buffer | stdLib.Uint8Array | nodeDashForgeLib.nodeDashForgeMod.utilNs.ByteBuffer | java.lang.String
}

object Anon_EncodingMessage {
  @scala.inline
  def apply(
    encoding: java.lang.String,
    message: java.lang.String,
    publicKey: nodeDashForgeLib.nodeDashForgeMod.pkiNs.ed25519Ns.NativeBuffer,
    signature: nodeLib.Buffer | stdLib.Uint8Array | nodeDashForgeLib.nodeDashForgeMod.utilNs.ByteBuffer | java.lang.String
  ): Anon_EncodingMessage = {
    val __obj = js.Dynamic.literal(encoding = encoding, message = message, publicKey = publicKey.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_EncodingMessage]
  }
}


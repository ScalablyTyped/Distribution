package typings.node.cryptoMod

import typings.node.NodeJS.ArrayBufferView
import typings.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("crypto", "Verify")
@js.native
/* private */ class Verify_ () extends Writable {
  
  def update(data: String, input_encoding: Utf8AsciiLatin1Encoding): Verify_ = js.native
  def update(data: BinaryLike): Verify_ = js.native
  
  def verify(`object`: KeyLike, signature: String): Boolean = js.native
  def verify(`object`: KeyLike, signature: String, signature_format: HexBase64Latin1Encoding): Boolean = js.native
  def verify(`object`: KeyLike, signature: ArrayBufferView): Boolean = js.native
  def verify(`object`: VerifyKeyObjectInput, signature: String): Boolean = js.native
  def verify(`object`: VerifyKeyObjectInput, signature: String, signature_format: HexBase64Latin1Encoding): Boolean = js.native
  def verify(`object`: VerifyKeyObjectInput, signature: ArrayBufferView): Boolean = js.native
  def verify(`object`: VerifyPublicKeyInput, signature: String): Boolean = js.native
  def verify(`object`: VerifyPublicKeyInput, signature: String, signature_format: HexBase64Latin1Encoding): Boolean = js.native
  def verify(`object`: VerifyPublicKeyInput, signature: ArrayBufferView): Boolean = js.native
}

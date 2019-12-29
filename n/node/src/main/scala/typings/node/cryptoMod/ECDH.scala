package typings.node.cryptoMod

import typings.node.Buffer
import typings.node.NodeJS.ArrayBufferView
import typings.node.nodeStrings.base64
import typings.node.nodeStrings.compressed
import typings.node.nodeStrings.hex
import typings.node.nodeStrings.hybrid
import typings.node.nodeStrings.latin1
import typings.node.nodeStrings.uncompressed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", "ECDH")
@js.native
class ECDH protected () extends js.Object {
  def computeSecret(other_public_key: String, input_encoding: HexBase64Latin1Encoding): Buffer = js.native
  def computeSecret(
    other_public_key: String,
    input_encoding: HexBase64Latin1Encoding,
    output_encoding: HexBase64Latin1Encoding
  ): String = js.native
  def computeSecret(other_public_key: ArrayBufferView): Buffer = js.native
  def computeSecret(other_public_key: ArrayBufferView, output_encoding: HexBase64Latin1Encoding): String = js.native
  def generateKeys(): Buffer = js.native
  def generateKeys(encoding: HexBase64Latin1Encoding): String = js.native
  def generateKeys(encoding: HexBase64Latin1Encoding, format: ECDHKeyFormat): String = js.native
  def getPrivateKey(): Buffer = js.native
  def getPrivateKey(encoding: HexBase64Latin1Encoding): String = js.native
  def getPublicKey(): Buffer = js.native
  def getPublicKey(encoding: HexBase64Latin1Encoding): String = js.native
  def getPublicKey(encoding: HexBase64Latin1Encoding, format: ECDHKeyFormat): String = js.native
  def setPrivateKey(private_key: String, encoding: HexBase64Latin1Encoding): Unit = js.native
  def setPrivateKey(private_key: ArrayBufferView): Unit = js.native
}

/* static members */
@JSImport("crypto", "ECDH")
@js.native
object ECDH extends js.Object {
  def convertKey(key: BinaryLike, curve: String): Buffer | String = js.native
  def convertKey(key: BinaryLike, curve: String, inputEncoding: HexBase64Latin1Encoding): Buffer | String = js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: HexBase64Latin1Encoding,
    outputEncoding: base64,
    format: compressed
  ): Buffer | String = js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: HexBase64Latin1Encoding,
    outputEncoding: base64,
    format: hybrid
  ): Buffer | String = js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: HexBase64Latin1Encoding,
    outputEncoding: base64,
    format: uncompressed
  ): Buffer | String = js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: HexBase64Latin1Encoding,
    outputEncoding: hex,
    format: compressed
  ): Buffer | String = js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: HexBase64Latin1Encoding,
    outputEncoding: hex,
    format: hybrid
  ): Buffer | String = js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: HexBase64Latin1Encoding,
    outputEncoding: hex,
    format: uncompressed
  ): Buffer | String = js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: HexBase64Latin1Encoding,
    outputEncoding: latin1,
    format: compressed
  ): Buffer | String = js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: HexBase64Latin1Encoding,
    outputEncoding: latin1,
    format: hybrid
  ): Buffer | String = js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: HexBase64Latin1Encoding,
    outputEncoding: latin1,
    format: uncompressed
  ): Buffer | String = js.native
  @JSName("convertKey")
  def convertKey_base64(key: BinaryLike, curve: String, inputEncoding: HexBase64Latin1Encoding, outputEncoding: base64): Buffer | String = js.native
  @JSName("convertKey")
  def convertKey_hex(key: BinaryLike, curve: String, inputEncoding: HexBase64Latin1Encoding, outputEncoding: hex): Buffer | String = js.native
  @JSName("convertKey")
  def convertKey_latin1(key: BinaryLike, curve: String, inputEncoding: HexBase64Latin1Encoding, outputEncoding: latin1): Buffer | String = js.native
}


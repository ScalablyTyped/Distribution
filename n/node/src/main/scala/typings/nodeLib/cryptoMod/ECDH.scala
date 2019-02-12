package typings
package nodeLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", "ECDH")
@js.native
class ECDH () extends js.Object {
  def computeSecret(other_public_key: java.lang.String, input_encoding: HexBase64Latin1Encoding): nodeLib.Buffer = js.native
  def computeSecret(
    other_public_key: java.lang.String,
    input_encoding: HexBase64Latin1Encoding,
    output_encoding: HexBase64Latin1Encoding
  ): java.lang.String = js.native
  def computeSecret(other_public_key: Binary): nodeLib.Buffer = js.native
  def computeSecret(other_public_key: Binary, output_encoding: HexBase64Latin1Encoding): java.lang.String = js.native
  def generateKeys(): nodeLib.Buffer = js.native
  def generateKeys(encoding: HexBase64Latin1Encoding): java.lang.String = js.native
  def generateKeys(encoding: HexBase64Latin1Encoding, format: ECDHKeyFormat): java.lang.String = js.native
  def getPrivateKey(): nodeLib.Buffer = js.native
  def getPrivateKey(encoding: HexBase64Latin1Encoding): java.lang.String = js.native
  def getPublicKey(): nodeLib.Buffer = js.native
  def getPublicKey(encoding: HexBase64Latin1Encoding): java.lang.String = js.native
  def getPublicKey(encoding: HexBase64Latin1Encoding, format: ECDHKeyFormat): java.lang.String = js.native
  def setPrivateKey(private_key: java.lang.String, encoding: HexBase64Latin1Encoding): scala.Unit = js.native
  def setPrivateKey(private_key: Binary): scala.Unit = js.native
}

/* static members */
@JSImport("crypto", "ECDH")
@js.native
object ECDH extends js.Object {
  def convertKey(key: nodeLib.cryptoMod.BinaryLike, curve: java.lang.String): nodeLib.Buffer | java.lang.String = js.native
  def convertKey(
    key: nodeLib.cryptoMod.BinaryLike,
    curve: java.lang.String,
    inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding
  ): nodeLib.Buffer | java.lang.String = js.native
  def convertKey(
    key: nodeLib.cryptoMod.BinaryLike,
    curve: java.lang.String,
    inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
    outputEncoding: nodeLib.nodeLibStrings.base64,
    format: nodeLib.nodeLibStrings.compressed
  ): nodeLib.Buffer | java.lang.String = js.native
  def convertKey(
    key: nodeLib.cryptoMod.BinaryLike,
    curve: java.lang.String,
    inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
    outputEncoding: nodeLib.nodeLibStrings.base64,
    format: nodeLib.nodeLibStrings.hybrid
  ): nodeLib.Buffer | java.lang.String = js.native
  def convertKey(
    key: nodeLib.cryptoMod.BinaryLike,
    curve: java.lang.String,
    inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
    outputEncoding: nodeLib.nodeLibStrings.base64,
    format: nodeLib.nodeLibStrings.uncompressed
  ): nodeLib.Buffer | java.lang.String = js.native
  def convertKey(
    key: nodeLib.cryptoMod.BinaryLike,
    curve: java.lang.String,
    inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
    outputEncoding: nodeLib.nodeLibStrings.hex,
    format: nodeLib.nodeLibStrings.compressed
  ): nodeLib.Buffer | java.lang.String = js.native
  def convertKey(
    key: nodeLib.cryptoMod.BinaryLike,
    curve: java.lang.String,
    inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
    outputEncoding: nodeLib.nodeLibStrings.hex,
    format: nodeLib.nodeLibStrings.hybrid
  ): nodeLib.Buffer | java.lang.String = js.native
  def convertKey(
    key: nodeLib.cryptoMod.BinaryLike,
    curve: java.lang.String,
    inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
    outputEncoding: nodeLib.nodeLibStrings.hex,
    format: nodeLib.nodeLibStrings.uncompressed
  ): nodeLib.Buffer | java.lang.String = js.native
  def convertKey(
    key: nodeLib.cryptoMod.BinaryLike,
    curve: java.lang.String,
    inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
    outputEncoding: nodeLib.nodeLibStrings.latin1,
    format: nodeLib.nodeLibStrings.compressed
  ): nodeLib.Buffer | java.lang.String = js.native
  def convertKey(
    key: nodeLib.cryptoMod.BinaryLike,
    curve: java.lang.String,
    inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
    outputEncoding: nodeLib.nodeLibStrings.latin1,
    format: nodeLib.nodeLibStrings.hybrid
  ): nodeLib.Buffer | java.lang.String = js.native
  def convertKey(
    key: nodeLib.cryptoMod.BinaryLike,
    curve: java.lang.String,
    inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
    outputEncoding: nodeLib.nodeLibStrings.latin1,
    format: nodeLib.nodeLibStrings.uncompressed
  ): nodeLib.Buffer | java.lang.String = js.native
  @JSName("convertKey")
  def convertKey_base64(
    key: nodeLib.cryptoMod.BinaryLike,
    curve: java.lang.String,
    inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
    outputEncoding: nodeLib.nodeLibStrings.base64
  ): nodeLib.Buffer | java.lang.String = js.native
  @JSName("convertKey")
  def convertKey_hex(
    key: nodeLib.cryptoMod.BinaryLike,
    curve: java.lang.String,
    inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
    outputEncoding: nodeLib.nodeLibStrings.hex
  ): nodeLib.Buffer | java.lang.String = js.native
  @JSName("convertKey")
  def convertKey_latin1(
    key: nodeLib.cryptoMod.BinaryLike,
    curve: java.lang.String,
    inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
    outputEncoding: nodeLib.nodeLibStrings.latin1
  ): nodeLib.Buffer | java.lang.String = js.native
}


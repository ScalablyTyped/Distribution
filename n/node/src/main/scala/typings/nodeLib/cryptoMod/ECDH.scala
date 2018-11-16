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
  def computeSecret(other_public_key: nodeLib.Buffer): nodeLib.Buffer = js.native
  def computeSecret(other_public_key: nodeLib.Buffer, output_encoding: HexBase64Latin1Encoding): java.lang.String = js.native
  def computeSecret(other_public_key: nodeLib.NodeJSNs.TypedArray): nodeLib.Buffer = js.native
  def computeSecret(other_public_key: nodeLib.NodeJSNs.TypedArray, output_encoding: HexBase64Latin1Encoding): java.lang.String = js.native
  def computeSecret(other_public_key: stdLib.DataView): nodeLib.Buffer = js.native
  def computeSecret(other_public_key: stdLib.DataView, output_encoding: HexBase64Latin1Encoding): java.lang.String = js.native
  def generateKeys(): nodeLib.Buffer = js.native
  def generateKeys(encoding: HexBase64Latin1Encoding): java.lang.String = js.native
  def generateKeys(encoding: HexBase64Latin1Encoding, format: ECDHKeyFormat): java.lang.String = js.native
  def getPrivateKey(): nodeLib.Buffer = js.native
  def getPrivateKey(encoding: HexBase64Latin1Encoding): java.lang.String = js.native
  def getPublicKey(): nodeLib.Buffer = js.native
  def getPublicKey(encoding: HexBase64Latin1Encoding): java.lang.String = js.native
  def getPublicKey(encoding: HexBase64Latin1Encoding, format: ECDHKeyFormat): java.lang.String = js.native
  def setPrivateKey(private_key: java.lang.String, encoding: HexBase64Latin1Encoding): scala.Unit = js.native
  def setPrivateKey(private_key: nodeLib.Buffer): scala.Unit = js.native
  def setPrivateKey(private_key: nodeLib.NodeJSNs.TypedArray): scala.Unit = js.native
  def setPrivateKey(private_key: stdLib.DataView): scala.Unit = js.native
}

@JSImport("crypto", "ECDH")
@js.native
object ECDH extends js.Object {
  def convertKey(
    key: java.lang.String | nodeLib.Buffer | nodeLib.NodeJSNs.TypedArray | stdLib.DataView,
    curve: java.lang.String
  ): nodeLib.Buffer | java.lang.String = js.native
  def convertKey(
    key: java.lang.String | nodeLib.Buffer | nodeLib.NodeJSNs.TypedArray | stdLib.DataView,
    curve: java.lang.String,
    inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding
  ): nodeLib.Buffer | java.lang.String = js.native
  def convertKey(
    key: java.lang.String | nodeLib.Buffer | nodeLib.NodeJSNs.TypedArray | stdLib.DataView,
    curve: java.lang.String,
    inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
    outputEncoding: nodeLib.nodeLibStrings.latin1 | nodeLib.nodeLibStrings.hex | nodeLib.nodeLibStrings.base64
  ): nodeLib.Buffer | java.lang.String = js.native
  def convertKey(
    key: java.lang.String | nodeLib.Buffer | nodeLib.NodeJSNs.TypedArray | stdLib.DataView,
    curve: java.lang.String,
    inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
    outputEncoding: nodeLib.nodeLibStrings.latin1 | nodeLib.nodeLibStrings.hex | nodeLib.nodeLibStrings.base64,
    format: nodeLib.nodeLibStrings.uncompressed | nodeLib.nodeLibStrings.compressed | nodeLib.nodeLibStrings.hybrid
  ): nodeLib.Buffer | java.lang.String = js.native
}


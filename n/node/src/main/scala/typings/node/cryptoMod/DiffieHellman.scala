package typings.node.cryptoMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", "DiffieHellman")
@js.native
class DiffieHellman protected () extends js.Object {
  var verifyError: Double = js.native
  def computeSecret(other_public_key: java.lang.String, input_encoding: HexBase64Latin1Encoding): Buffer = js.native
  def computeSecret(
    other_public_key: java.lang.String,
    input_encoding: HexBase64Latin1Encoding,
    output_encoding: HexBase64Latin1Encoding
  ): java.lang.String = js.native
  def computeSecret(other_public_key: Binary): Buffer = js.native
  def computeSecret(other_public_key: Binary, output_encoding: HexBase64Latin1Encoding): java.lang.String = js.native
  def generateKeys(): Buffer = js.native
  def generateKeys(encoding: HexBase64Latin1Encoding): java.lang.String = js.native
  def getGenerator(): Buffer = js.native
  def getGenerator(encoding: HexBase64Latin1Encoding): java.lang.String = js.native
  def getPrime(): Buffer = js.native
  def getPrime(encoding: HexBase64Latin1Encoding): java.lang.String = js.native
  def getPrivateKey(): Buffer = js.native
  def getPrivateKey(encoding: HexBase64Latin1Encoding): java.lang.String = js.native
  def getPublicKey(): Buffer = js.native
  def getPublicKey(encoding: HexBase64Latin1Encoding): java.lang.String = js.native
  def setPrivateKey(private_key: java.lang.String, encoding: java.lang.String): Unit = js.native
  def setPrivateKey(private_key: Binary): Unit = js.native
  def setPublicKey(public_key: java.lang.String, encoding: java.lang.String): Unit = js.native
  def setPublicKey(public_key: Binary): Unit = js.native
}


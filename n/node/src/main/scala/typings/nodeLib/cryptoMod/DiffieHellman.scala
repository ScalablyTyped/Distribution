package typings
package nodeLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiffieHellman extends js.Object {
  var verifyError: scala.Double = js.native
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
  def getGenerator(): nodeLib.Buffer = js.native
  def getGenerator(encoding: HexBase64Latin1Encoding): java.lang.String = js.native
  def getPrime(): nodeLib.Buffer = js.native
  def getPrime(encoding: HexBase64Latin1Encoding): java.lang.String = js.native
  def getPrivateKey(): nodeLib.Buffer = js.native
  def getPrivateKey(encoding: HexBase64Latin1Encoding): java.lang.String = js.native
  def getPublicKey(): nodeLib.Buffer = js.native
  def getPublicKey(encoding: HexBase64Latin1Encoding): java.lang.String = js.native
  def setPrivateKey(private_key: java.lang.String, encoding: java.lang.String): scala.Unit = js.native
  def setPrivateKey(private_key: Binary): scala.Unit = js.native
  def setPublicKey(public_key: java.lang.String, encoding: java.lang.String): scala.Unit = js.native
  def setPublicKey(public_key: Binary): scala.Unit = js.native
}


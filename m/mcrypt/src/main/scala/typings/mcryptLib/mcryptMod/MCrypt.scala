package typings
package mcryptLib.mcryptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mcrypt", "MCrypt")
@js.native
class MCrypt protected () extends js.Object {
  def this(algorithm: java.lang.String, mode: java.lang.String) = this()
  def decrypt(ciphertext: nodeLib.Buffer): nodeLib.Buffer = js.native
  def encrypt(plaintext: java.lang.String): nodeLib.Buffer = js.native
  def encrypt(plaintext: nodeLib.Buffer): nodeLib.Buffer = js.native
  def generateIv(): nodeLib.Buffer = js.native
  def getAlgorithmName(): java.lang.String = js.native
  def getBlockSize(): scala.Double = js.native
  def getIvSize(): scala.Double = js.native
  def getKeySize(): scala.Double = js.native
  def getModeName(): java.lang.String = js.native
  def getSupportedKeySizes(): js.Array[scala.Double] = js.native
  def hasIv(): scala.Boolean = js.native
  def isBlockAlgorithm(): scala.Boolean = js.native
  def isBlockAlgorithmMode(): scala.Boolean = js.native
  def isBlockMode(): scala.Boolean = js.native
  def open(key: java.lang.String): scala.Unit = js.native
  def open(key: java.lang.String, iv: java.lang.String): scala.Unit = js.native
  def open(key: java.lang.String, iv: nodeLib.Buffer): scala.Unit = js.native
  def open(key: nodeLib.Buffer): scala.Unit = js.native
  def open(key: nodeLib.Buffer, iv: java.lang.String): scala.Unit = js.native
  def open(key: nodeLib.Buffer, iv: nodeLib.Buffer): scala.Unit = js.native
  def selfTest(): scala.Boolean = js.native
  def validateIvSize(validate: scala.Boolean): scala.Unit = js.native
  def validateKeySize(validate: scala.Boolean): scala.Unit = js.native
}


package typings.mcrypt.mcryptMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mcrypt", "MCrypt")
@js.native
class MCrypt protected () extends js.Object {
  def this(algorithm: String, mode: String) = this()
  def decrypt(ciphertext: Buffer): Buffer = js.native
  def encrypt(plaintext: String): Buffer = js.native
  def encrypt(plaintext: Buffer): Buffer = js.native
  def generateIv(): Buffer = js.native
  def getAlgorithmName(): String = js.native
  def getBlockSize(): Double = js.native
  def getIvSize(): Double = js.native
  def getKeySize(): Double = js.native
  def getModeName(): String = js.native
  def getSupportedKeySizes(): js.Array[Double] = js.native
  def hasIv(): Boolean = js.native
  def isBlockAlgorithm(): Boolean = js.native
  def isBlockAlgorithmMode(): Boolean = js.native
  def isBlockMode(): Boolean = js.native
  def open(key: String): Unit = js.native
  def open(key: String, iv: String): Unit = js.native
  def open(key: String, iv: Buffer): Unit = js.native
  def open(key: Buffer): Unit = js.native
  def open(key: Buffer, iv: String): Unit = js.native
  def open(key: Buffer, iv: Buffer): Unit = js.native
  def selfTest(): Boolean = js.native
  def validateIvSize(validate: Boolean): Unit = js.native
  def validateKeySize(validate: Boolean): Unit = js.native
}


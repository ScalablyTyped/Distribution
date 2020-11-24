package typings.nodeRsa.mod

import typings.node.Buffer
import typings.nodeRsa.nodeRsaStrings.buffer
import typings.nodeRsa.nodeRsaStrings.json
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeRSA extends js.Object {
  
  def decrypt(data: String): Buffer = js.native
  def decrypt(data: String, encoding: Encoding): String = js.native
  def decrypt(data: Buffer): Buffer = js.native
  def decrypt(data: Buffer, encoding: Encoding): String = js.native
  
  def decryptPublic(data: String): Buffer = js.native
  def decryptPublic(data: String, encoding: Encoding): String = js.native
  def decryptPublic(data: Buffer): Buffer = js.native
  def decryptPublic(data: Buffer, encoding: Encoding): String = js.native
  @JSName("decryptPublic")
  def decryptPublic_buffer(data: String, encoding: buffer): Buffer = js.native
  @JSName("decryptPublic")
  def decryptPublic_buffer(data: Buffer, encoding: buffer): Buffer = js.native
  @JSName("decryptPublic")
  def decryptPublic_json[T /* <: js.Object */](data: String, encoding: json): T = js.native
  @JSName("decryptPublic")
  def decryptPublic_json[T /* <: js.Object */](data: Buffer, encoding: json): T = js.native
  
  @JSName("decrypt")
  def decrypt_buffer(data: String, encoding: buffer): Buffer = js.native
  @JSName("decrypt")
  def decrypt_buffer(data: Buffer, encoding: buffer): Buffer = js.native
  @JSName("decrypt")
  def decrypt_json[T /* <: js.Object */](data: String, encoding: json): T = js.native
  @JSName("decrypt")
  def decrypt_json[T /* <: js.Object */](data: Buffer, encoding: json): T = js.native
  
  def encrypt(data: Buffer, encoding: Encoding): String = js.native
  def encrypt(data: Buffer, encoding: Encoding, sourceEncoding: Encoding): String = js.native
  def encrypt(data: Data): Buffer = js.native
  def encrypt(data: Data, encoding: Encoding): String = js.native
  
  def encryptPrivate(data: Buffer, encoding: Encoding): String = js.native
  def encryptPrivate(data: Buffer, encoding: Encoding, sourceEncoding: Encoding): String = js.native
  def encryptPrivate(data: Data): Buffer = js.native
  def encryptPrivate(data: Data, encoding: Encoding): String = js.native
  @JSName("encryptPrivate")
  def encryptPrivate_buffer(data: Buffer, encoding: buffer): Buffer = js.native
  @JSName("encryptPrivate")
  def encryptPrivate_buffer(data: Buffer, encoding: buffer, sourceEncoding: Encoding): Buffer = js.native
  @JSName("encryptPrivate")
  def encryptPrivate_buffer(data: Data, encoding: buffer): Buffer = js.native
  
  @JSName("encrypt")
  def encrypt_buffer(data: Buffer, encoding: buffer): Buffer = js.native
  @JSName("encrypt")
  def encrypt_buffer(data: Buffer, encoding: buffer, sourceEncoding: Encoding): Buffer = js.native
  @JSName("encrypt")
  def encrypt_buffer(data: Data, encoding: buffer): Buffer = js.native
  
  /**
    * Export key to PEM string, PEM/DER Buffer or components.
    */
  def exportKey(): String = js.native
  def exportKey(format: FormatComponentsPrivate): KeyComponentsPrivate = js.native
  def exportKey(format: FormatComponentsPublic): KeyComponentsPublic = js.native
  def exportKey(format: FormatDer): Buffer = js.native
  def exportKey(format: FormatPem): String = js.native
  
  /**
    * @param bits Key size in bits. 2048 by default.
    * @param exponent public exponent. 65537 by default.
    */
  def generateKeyPair(): NodeRSA = js.native
  def generateKeyPair(bits: js.UndefOr[scala.Nothing], exponent: Double): NodeRSA = js.native
  def generateKeyPair(bits: Double): NodeRSA = js.native
  def generateKeyPair(bits: Double, exponent: Double): NodeRSA = js.native
  
  /**
    * Return key size in bits.
    */
  def getKeySize(): Double = js.native
  
  /**
    * Return max data size for encrypt in bytes.
    */
  def getMaxMessageSize(): Double = js.native
  
  /**
    * Import key from PEM string, PEM/DER Buffer or components.
    */
  def importKey(key: Key): NodeRSA = js.native
  def importKey(key: Key, format: Format): NodeRSA = js.native
  
  /**
    * Return true if key pair doesn't have any data.
    */
  def isEmpty(): Boolean = js.native
  
  def isPrivate(): Boolean = js.native
  
  /**
    * @param strict if true method will return false if key pair have private exponent. Default false.
    */
  def isPublic(): Boolean = js.native
  def isPublic(strict: Boolean): Boolean = js.native
  
  /**
    * Set and validate options for key instance.
    */
  def setOptions(options: Options): Unit = js.native
  
  def sign(data: Buffer, encoding: Encoding): String = js.native
  def sign(data: Buffer, encoding: Encoding, sourceEncoding: Encoding): String = js.native
  def sign(data: Data): Buffer = js.native
  def sign(data: Data, encoding: Encoding): String = js.native
  @JSName("sign")
  def sign_buffer(data: Buffer, encoding: buffer): Buffer = js.native
  @JSName("sign")
  def sign_buffer(data: Buffer, encoding: buffer, sourceEncoding: Encoding): Buffer = js.native
  @JSName("sign")
  def sign_buffer(data: Data, encoding: buffer): Buffer = js.native
  
  def verify(data: Buffer, signature: String, sourceEncoding: Encoding, signatureEncoding: Encoding): Boolean = js.native
  def verify(data: Buffer, signature: Buffer): Boolean = js.native
  def verify(data: Buffer, signature: Buffer, sourceEncoding: Encoding): Boolean = js.native
  def verify(
    data: Data,
    signature: String,
    sourceEncoding: js.UndefOr[scala.Nothing],
    signatureEncoding: Encoding
  ): Boolean = js.native
  def verify(data: Data, signature: Buffer): Boolean = js.native
}

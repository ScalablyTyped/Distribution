package typings
package nodeDashRsaLib.nodeDashRsaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeRSA extends js.Object {
  def decrypt(data: java.lang.String): nodeLib.Buffer = js.native
  def decrypt(data: java.lang.String, encoding: Encoding): java.lang.String = js.native
  def decrypt(data: nodeLib.Buffer): nodeLib.Buffer = js.native
  def decrypt(data: nodeLib.Buffer, encoding: Encoding): java.lang.String = js.native
  def decryptPublic(data: java.lang.String): nodeLib.Buffer = js.native
  def decryptPublic(data: java.lang.String, encoding: Encoding): java.lang.String = js.native
  def decryptPublic(data: nodeLib.Buffer): nodeLib.Buffer = js.native
  def decryptPublic(data: nodeLib.Buffer, encoding: Encoding): java.lang.String = js.native
  @JSName("decryptPublic")
  def decryptPublic_buffer(data: java.lang.String, encoding: nodeDashRsaLib.nodeDashRsaLibStrings.buffer): nodeLib.Buffer = js.native
  @JSName("decryptPublic")
  def decryptPublic_buffer(data: nodeLib.Buffer, encoding: nodeDashRsaLib.nodeDashRsaLibStrings.buffer): nodeLib.Buffer = js.native
  @JSName("decryptPublic")
  def decryptPublic_json[T /* <: js.Object */](data: java.lang.String, encoding: nodeDashRsaLib.nodeDashRsaLibStrings.json): T = js.native
  @JSName("decryptPublic")
  def decryptPublic_json[T /* <: js.Object */](data: nodeLib.Buffer, encoding: nodeDashRsaLib.nodeDashRsaLibStrings.json): T = js.native
  @JSName("decrypt")
  def decrypt_buffer(data: java.lang.String, encoding: nodeDashRsaLib.nodeDashRsaLibStrings.buffer): nodeLib.Buffer = js.native
  @JSName("decrypt")
  def decrypt_buffer(data: nodeLib.Buffer, encoding: nodeDashRsaLib.nodeDashRsaLibStrings.buffer): nodeLib.Buffer = js.native
  @JSName("decrypt")
  def decrypt_json[T /* <: js.Object */](data: java.lang.String, encoding: nodeDashRsaLib.nodeDashRsaLibStrings.json): T = js.native
  @JSName("decrypt")
  def decrypt_json[T /* <: js.Object */](data: nodeLib.Buffer, encoding: nodeDashRsaLib.nodeDashRsaLibStrings.json): T = js.native
  def encrypt(data: Data): nodeLib.Buffer = js.native
  def encrypt(data: Data, encoding: Encoding): java.lang.String = js.native
  def encrypt(data: nodeLib.Buffer, encoding: Encoding): java.lang.String = js.native
  def encrypt(data: nodeLib.Buffer, encoding: Encoding, sourceEncoding: Encoding): java.lang.String = js.native
  def encryptPrivate(data: Data): nodeLib.Buffer = js.native
  def encryptPrivate(data: Data, encoding: Encoding): java.lang.String = js.native
  def encryptPrivate(data: nodeLib.Buffer, encoding: Encoding): java.lang.String = js.native
  def encryptPrivate(data: nodeLib.Buffer, encoding: Encoding, sourceEncoding: Encoding): java.lang.String = js.native
  @JSName("encryptPrivate")
  def encryptPrivate_buffer(data: Data, encoding: nodeDashRsaLib.nodeDashRsaLibStrings.buffer): nodeLib.Buffer = js.native
  @JSName("encryptPrivate")
  def encryptPrivate_buffer(data: nodeLib.Buffer, encoding: nodeDashRsaLib.nodeDashRsaLibStrings.buffer): nodeLib.Buffer = js.native
  @JSName("encryptPrivate")
  def encryptPrivate_buffer(
    data: nodeLib.Buffer,
    encoding: nodeDashRsaLib.nodeDashRsaLibStrings.buffer,
    sourceEncoding: Encoding
  ): nodeLib.Buffer = js.native
  @JSName("encrypt")
  def encrypt_buffer(data: Data, encoding: nodeDashRsaLib.nodeDashRsaLibStrings.buffer): nodeLib.Buffer = js.native
  @JSName("encrypt")
  def encrypt_buffer(data: nodeLib.Buffer, encoding: nodeDashRsaLib.nodeDashRsaLibStrings.buffer): nodeLib.Buffer = js.native
  @JSName("encrypt")
  def encrypt_buffer(
    data: nodeLib.Buffer,
    encoding: nodeDashRsaLib.nodeDashRsaLibStrings.buffer,
    sourceEncoding: Encoding
  ): nodeLib.Buffer = js.native
  /**
    * Export key to PEM string, PEM/DER Buffer or components.
    */
  def exportKey(): java.lang.String = js.native
  def exportKey(format: FormatComponentsPrivate): KeyComponentsPrivate = js.native
  def exportKey(format: FormatComponentsPublic): KeyComponentsPublic = js.native
  def exportKey(format: FormatDer): nodeLib.Buffer = js.native
  def exportKey(format: FormatPem): java.lang.String = js.native
  /**
    * @param bits Key size in bits. 2048 by default.
    * @param exponent public exponent. 65537 by default.
    */
  def generateKeyPair(): NodeRSA = js.native
  def generateKeyPair(bits: scala.Double): NodeRSA = js.native
  def generateKeyPair(bits: scala.Double, exponent: scala.Double): NodeRSA = js.native
  /**
    * Return key size in bits.
    */
  def getKeySize(): scala.Double = js.native
  /**
    * Return max data size for encrypt in bytes.
    */
  def getMaxMessageSize(): scala.Double = js.native
  /**
    * Import key from PEM string, PEM/DER Buffer or components.
    */
  def importKey(key: Key): NodeRSA = js.native
  def importKey(key: Key, format: Format): NodeRSA = js.native
  /**
    * Return true if key pair doesn't have any data.
    */
  def isEmpty(): scala.Boolean = js.native
  def isPrivate(): scala.Boolean = js.native
  /**
    * @param strict if true method will return false if key pair have private exponent. Default false.
    */
  def isPublic(): scala.Boolean = js.native
  def isPublic(strict: scala.Boolean): scala.Boolean = js.native
  /**
    * Set and validate options for key instance.
    */
  def setOptions(options: Options): scala.Unit = js.native
  def sign(data: Data): nodeLib.Buffer = js.native
  def sign(data: Data, encoding: Encoding): java.lang.String = js.native
  def sign(data: nodeLib.Buffer, encoding: Encoding): java.lang.String = js.native
  def sign(data: nodeLib.Buffer, encoding: Encoding, sourceEncoding: Encoding): java.lang.String = js.native
  @JSName("sign")
  def sign_buffer(data: Data, encoding: nodeDashRsaLib.nodeDashRsaLibStrings.buffer): nodeLib.Buffer = js.native
  @JSName("sign")
  def sign_buffer(data: nodeLib.Buffer, encoding: nodeDashRsaLib.nodeDashRsaLibStrings.buffer): nodeLib.Buffer = js.native
  @JSName("sign")
  def sign_buffer(
    data: nodeLib.Buffer,
    encoding: nodeDashRsaLib.nodeDashRsaLibStrings.buffer,
    sourceEncoding: Encoding
  ): nodeLib.Buffer = js.native
  def verify(
    data: Data,
    signature: java.lang.String,
    sourceEncoding: js.UndefOr[scala.Nothing],
    signatureEncoding: Encoding
  ): scala.Boolean = js.native
  def verify(data: Data, signature: nodeLib.Buffer): scala.Boolean = js.native
  def verify(
    data: nodeLib.Buffer,
    signature: java.lang.String,
    sourceEncoding: Encoding,
    signatureEncoding: Encoding
  ): scala.Boolean = js.native
  def verify(data: nodeLib.Buffer, signature: nodeLib.Buffer): scala.Boolean = js.native
  def verify(data: nodeLib.Buffer, signature: nodeLib.Buffer, sourceEncoding: Encoding): scala.Boolean = js.native
}


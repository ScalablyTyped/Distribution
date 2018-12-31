package typings
package nodeDashRsaLib.nodeDashRsaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeRSA extends js.Object {
  def decrypt(data: java.lang.String): nodeLib.Buffer = js.native
  def decrypt(data: java.lang.String, encoding: nodeDashRsaLib.nodeDashRsaMod.NodeRSANs.Encoding): java.lang.String = js.native
  def decrypt(data: nodeLib.Buffer): nodeLib.Buffer = js.native
  def decrypt(data: nodeLib.Buffer, encoding: nodeDashRsaLib.nodeDashRsaMod.NodeRSANs.Encoding): java.lang.String = js.native
  def decryptPublic(data: java.lang.String): nodeLib.Buffer = js.native
  def decryptPublic(data: java.lang.String, encoding: nodeDashRsaLib.nodeDashRsaMod.NodeRSANs.Encoding): java.lang.String = js.native
  def decryptPublic(data: nodeLib.Buffer): nodeLib.Buffer = js.native
  def decryptPublic(data: nodeLib.Buffer, encoding: nodeDashRsaLib.nodeDashRsaMod.NodeRSANs.Encoding): java.lang.String = js.native
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
  def encrypt(data: nodeDashRsaLib.nodeDashRsaMod.NodeRSANs.Data): nodeLib.Buffer = js.native
  def encrypt(
    data: nodeDashRsaLib.nodeDashRsaMod.NodeRSANs.Data,
    encoding: nodeDashRsaLib.nodeDashRsaMod.NodeRSANs.Encoding
  ): java.lang.String = js.native
  def encrypt(data: nodeLib.Buffer, encoding: nodeDashRsaLib.nodeDashRsaMod.NodeRSANs.Encoding): java.lang.String = js.native
  def encrypt(
    data: nodeLib.Buffer,
    encoding: nodeDashRsaLib.nodeDashRsaMod.NodeRSANs.Encoding,
    sourceEncoding: nodeDashRsaLib.nodeDashRsaMod.NodeRSANs.Encoding
  ): java.lang.String = js.native
  def encryptPrivate(data: nodeDashRsaLib.nodeDashRsaMod.NodeRSANs.Data): nodeLib.Buffer = js.native
  def encryptPrivate(
    data: nodeDashRsaLib.nodeDashRsaMod.NodeRSANs.Data,
    encoding: nodeDashRsaLib.nodeDashRsaMod.NodeRSANs.Encoding
  ): java.lang.String = js.native
  def encryptPrivate(data: nodeLib.Buffer, encoding: nodeDashRsaLib.nodeDashRsaMod.NodeRSANs.Encoding): java.lang.String = js.native
  def encryptPrivate(
    data: nodeLib.Buffer,
    encoding: nodeDashRsaLib.nodeDashRsaMod.NodeRSANs.Encoding,
    sourceEncoding: nodeDashRsaLib.nodeDashRsaMod.NodeRSANs.Encoding
  ): java.lang.String = js.native
  @JSName("encryptPrivate")
  def encryptPrivate_buffer(
    data: nodeDashRsaLib.nodeDashRsaMod.NodeRSANs.Data,
    encoding: nodeDashRsaLib.nodeDashRsaLibStrings.buffer
  ): nodeLib.Buffer = js.native
  @JSName("encryptPrivate")
  def encryptPrivate_buffer(data: nodeLib.Buffer, encoding: nodeDashRsaLib.nodeDashRsaLibStrings.buffer): nodeLib.Buffer = js.native
  @JSName("encryptPrivate")
  def encryptPrivate_buffer(
    data: nodeLib.Buffer,
    encoding: nodeDashRsaLib.nodeDashRsaLibStrings.buffer,
    sourceEncoding: nodeDashRsaLib.nodeDashRsaMod.NodeRSANs.Encoding
  ): nodeLib.Buffer = js.native
  @JSName("encrypt")
  def encrypt_buffer(
    data: nodeDashRsaLib.nodeDashRsaMod.NodeRSANs.Data,
    encoding: nodeDashRsaLib.nodeDashRsaLibStrings.buffer
  ): nodeLib.Buffer = js.native
  @JSName("encrypt")
  def encrypt_buffer(data: nodeLib.Buffer, encoding: nodeDashRsaLib.nodeDashRsaLibStrings.buffer): nodeLib.Buffer = js.native
  @JSName("encrypt")
  def encrypt_buffer(
    data: nodeLib.Buffer,
    encoding: nodeDashRsaLib.nodeDashRsaLibStrings.buffer,
    sourceEncoding: nodeDashRsaLib.nodeDashRsaMod.NodeRSANs.Encoding
  ): nodeLib.Buffer = js.native
  /**
    * Export key to PEM string, PEM/DER Buffer or components.
    */
  def exportKey(): java.lang.String = js.native
  def exportKey(format: nodeDashRsaLib.nodeDashRsaMod.NodeRSANs.FormatComponentsPrivate): nodeDashRsaLib.nodeDashRsaMod.NodeRSANs.KeyComponentsPrivate = js.native
  @JSName("exportKey")
  def exportKey_Buffer(format: nodeDashRsaLib.nodeDashRsaMod.NodeRSANs.FormatDer): nodeLib.Buffer = js.native
  @JSName("exportKey")
  def exportKey_KeyComponentsPublic(format: nodeDashRsaLib.nodeDashRsaMod.NodeRSANs.FormatComponentsPublic): nodeDashRsaLib.nodeDashRsaMod.NodeRSANs.KeyComponentsPublic = js.native
  @JSName("exportKey")
  def exportKey_String(format: nodeDashRsaLib.nodeDashRsaMod.NodeRSANs.FormatPem): java.lang.String = js.native
  /**
    * @param bits Key size in bits. 2048 by default.
    * @param exponent public exponent. 65537 by default.
    */
  def generateKeyPair(): scala.Unit = js.native
  def generateKeyPair(bits: scala.Double): scala.Unit = js.native
  def generateKeyPair(bits: scala.Double, exponent: scala.Double): scala.Unit = js.native
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
  def importKey(key: nodeDashRsaLib.nodeDashRsaMod.NodeRSANs.Key): scala.Unit = js.native
  def importKey(
    key: nodeDashRsaLib.nodeDashRsaMod.NodeRSANs.Key,
    format: nodeDashRsaLib.nodeDashRsaMod.NodeRSANs.Format
  ): scala.Unit = js.native
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
  def setOptions(options: nodeDashRsaLib.nodeDashRsaMod.NodeRSANs.Options): scala.Unit = js.native
  def sign(data: nodeDashRsaLib.nodeDashRsaMod.NodeRSANs.Data): nodeLib.Buffer = js.native
  def sign(
    data: nodeDashRsaLib.nodeDashRsaMod.NodeRSANs.Data,
    encoding: nodeDashRsaLib.nodeDashRsaMod.NodeRSANs.Encoding
  ): java.lang.String = js.native
  def sign(data: nodeLib.Buffer, encoding: nodeDashRsaLib.nodeDashRsaMod.NodeRSANs.Encoding): java.lang.String = js.native
  def sign(
    data: nodeLib.Buffer,
    encoding: nodeDashRsaLib.nodeDashRsaMod.NodeRSANs.Encoding,
    sourceEncoding: nodeDashRsaLib.nodeDashRsaMod.NodeRSANs.Encoding
  ): java.lang.String = js.native
  @JSName("sign")
  def sign_buffer(
    data: nodeDashRsaLib.nodeDashRsaMod.NodeRSANs.Data,
    encoding: nodeDashRsaLib.nodeDashRsaLibStrings.buffer
  ): nodeLib.Buffer = js.native
  @JSName("sign")
  def sign_buffer(data: nodeLib.Buffer, encoding: nodeDashRsaLib.nodeDashRsaLibStrings.buffer): nodeLib.Buffer = js.native
  @JSName("sign")
  def sign_buffer(
    data: nodeLib.Buffer,
    encoding: nodeDashRsaLib.nodeDashRsaLibStrings.buffer,
    sourceEncoding: nodeDashRsaLib.nodeDashRsaMod.NodeRSANs.Encoding
  ): nodeLib.Buffer = js.native
  def verify(
    data: nodeDashRsaLib.nodeDashRsaMod.NodeRSANs.Data,
    signature: java.lang.String,
    sourceEncoding: js.UndefOr[scala.Nothing],
    signatureEncoding: nodeDashRsaLib.nodeDashRsaMod.NodeRSANs.Encoding
  ): scala.Boolean = js.native
  def verify(data: nodeDashRsaLib.nodeDashRsaMod.NodeRSANs.Data, signature: nodeLib.Buffer): scala.Boolean = js.native
  def verify(
    data: nodeLib.Buffer,
    signature: java.lang.String,
    sourceEncoding: nodeDashRsaLib.nodeDashRsaMod.NodeRSANs.Encoding,
    signatureEncoding: nodeDashRsaLib.nodeDashRsaMod.NodeRSANs.Encoding
  ): scala.Boolean = js.native
  def verify(data: nodeLib.Buffer, signature: nodeLib.Buffer): scala.Boolean = js.native
  def verify(
    data: nodeLib.Buffer,
    signature: nodeLib.Buffer,
    sourceEncoding: nodeDashRsaLib.nodeDashRsaMod.NodeRSANs.Encoding
  ): scala.Boolean = js.native
}


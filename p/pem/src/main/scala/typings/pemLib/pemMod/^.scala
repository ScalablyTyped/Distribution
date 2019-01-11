package typings
package pemLib.pemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pem", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def config(options: pemLib.pemMod.ModuleConfiguration): scala.Unit = js.native
  def createCSR(callback: pemLib.pemMod.Callback[pemLib.Anon_ClientKey]): scala.Unit = js.native
  def createCSR(options: pemLib.pemMod.CSRCreationOptions, callback: pemLib.pemMod.Callback[pemLib.Anon_ClientKey]): scala.Unit = js.native
  def createCertificate(callback: pemLib.pemMod.Callback[pemLib.pemMod.CertificateCreationResult]): scala.Unit = js.native
  def createCertificate(
    options: pemLib.pemMod.CertificateCreationOptions,
    callback: pemLib.pemMod.Callback[pemLib.pemMod.CertificateCreationResult]
  ): scala.Unit = js.native
  def createDhparam(callback: pemLib.pemMod.Callback[pemLib.Anon_Dhparam]): scala.Unit = js.native
  def createDhparam(keyBitsize: scala.Double, callback: pemLib.pemMod.Callback[pemLib.Anon_Dhparam]): scala.Unit = js.native
  def createPkcs12(
    key: java.lang.String,
    certificate: java.lang.String,
    password: java.lang.String,
    callback: pemLib.pemMod.Callback[pemLib.Anon_Pkcs12]
  ): scala.Unit = js.native
  def createPkcs12(
    key: java.lang.String,
    certificate: java.lang.String,
    password: java.lang.String,
    options: pemLib.pemMod.Pkcs12CreationOptions,
    callback: pemLib.pemMod.Callback[pemLib.Anon_Pkcs12]
  ): scala.Unit = js.native
  def createPrivateKey(callback: pemLib.pemMod.Callback[pemLib.Anon_Key]): scala.Unit = js.native
  def createPrivateKey(
    keyBitsize: scala.Double,
    options: pemLib.pemMod.PrivateKeyCreationOptions,
    callback: pemLib.pemMod.Callback[pemLib.Anon_Key]
  ): scala.Unit = js.native
  def createPrivateKey(
    optionsOrKeyBitsize: pemLib.pemMod.PrivateKeyCreationOptions,
    callback: pemLib.pemMod.Callback[pemLib.Anon_Key]
  ): scala.Unit = js.native
  def createPrivateKey(optionsOrKeyBitsize: scala.Double, callback: pemLib.pemMod.Callback[pemLib.Anon_Key]): scala.Unit = js.native
  def getDhparamInfo(dh: java.lang.String, callback: pemLib.pemMod.Callback[pemLib.Anon_Prime]): scala.Unit = js.native
  def getFingerprint(callback: pemLib.pemMod.Callback[pemLib.Anon_Fingerprint]): scala.Unit = js.native
  def getFingerprint(certificate: java.lang.String, callback: pemLib.pemMod.Callback[pemLib.Anon_Fingerprint]): scala.Unit = js.native
  def getFingerprint(
    certificate: java.lang.String,
    hash: pemLib.pemMod.HashFunction,
    callback: pemLib.pemMod.Callback[pemLib.Anon_Fingerprint]
  ): scala.Unit = js.native
  def getModulus(certificate: java.lang.String, callback: pemLib.pemMod.Callback[pemLib.Anon_Modulus]): scala.Unit = js.native
  def getModulus(
    certificate: java.lang.String,
    password: java.lang.String,
    callback: pemLib.pemMod.Callback[pemLib.Anon_Modulus]
  ): scala.Unit = js.native
  def getPublicKey(callback: pemLib.pemMod.Callback[pemLib.Anon_PublicKey]): scala.Unit = js.native
  def getPublicKey(certificate: java.lang.String, callback: pemLib.pemMod.Callback[pemLib.Anon_PublicKey]): scala.Unit = js.native
  def readCertificateInfo(callback: pemLib.pemMod.Callback[pemLib.pemMod.CertificateSubjectReadResult]): scala.Unit = js.native
  def readCertificateInfo(
    certificate: java.lang.String,
    callback: pemLib.pemMod.Callback[pemLib.pemMod.CertificateSubjectReadResult]
  ): scala.Unit = js.native
  def readPkcs12(bufferOrPath: java.lang.String, callback: pemLib.pemMod.Callback[pemLib.pemMod.Pkcs12ReadResult]): js.Any = js.native
  def readPkcs12(
    bufferOrPath: java.lang.String,
    options: pemLib.pemMod.Pkcs12ReadOptions,
    callback: pemLib.pemMod.Callback[pemLib.pemMod.Pkcs12ReadResult]
  ): js.Any = js.native
  def readPkcs12(bufferOrPath: nodeLib.Buffer, callback: pemLib.pemMod.Callback[pemLib.pemMod.Pkcs12ReadResult]): js.Any = js.native
  def readPkcs12(
    bufferOrPath: nodeLib.Buffer,
    options: pemLib.pemMod.Pkcs12ReadOptions,
    callback: pemLib.pemMod.Callback[pemLib.pemMod.Pkcs12ReadResult]
  ): js.Any = js.native
  def verifySigningChain(
    certificate: java.lang.String,
    ca: js.Array[java.lang.String],
    callback: pemLib.pemMod.Callback[scala.Boolean]
  ): scala.Unit = js.native
}


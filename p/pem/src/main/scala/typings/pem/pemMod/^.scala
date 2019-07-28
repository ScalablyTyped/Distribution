package typings.pem.pemMod

import typings.node.Buffer
import typings.pem.Anon_ClientKey
import typings.pem.Anon_Dhparam
import typings.pem.Anon_Fingerprint
import typings.pem.Anon_Key
import typings.pem.Anon_Modulus
import typings.pem.Anon_Pkcs12
import typings.pem.Anon_Prime
import typings.pem.Anon_PublicKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pem", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def config(options: ModuleConfiguration): Unit = js.native
  def createCSR(callback: Callback[Anon_ClientKey]): Unit = js.native
  def createCSR(options: CSRCreationOptions, callback: Callback[Anon_ClientKey]): Unit = js.native
  def createCertificate(callback: Callback[CertificateCreationResult]): Unit = js.native
  def createCertificate(options: CertificateCreationOptions, callback: Callback[CertificateCreationResult]): Unit = js.native
  def createDhparam(callback: Callback[Anon_Dhparam]): Unit = js.native
  def createDhparam(keyBitsize: Double, callback: Callback[Anon_Dhparam]): Unit = js.native
  def createPkcs12(key: String, certificate: String, password: String, callback: Callback[Anon_Pkcs12]): Unit = js.native
  def createPkcs12(
    key: String,
    certificate: String,
    password: String,
    options: Pkcs12CreationOptions,
    callback: Callback[Anon_Pkcs12]
  ): Unit = js.native
  def createPrivateKey(callback: Callback[Anon_Key]): Unit = js.native
  def createPrivateKey(keyBitsize: Double, options: PrivateKeyCreationOptions, callback: Callback[Anon_Key]): Unit = js.native
  def createPrivateKey(optionsOrKeyBitsize: Double, callback: Callback[Anon_Key]): Unit = js.native
  def createPrivateKey(optionsOrKeyBitsize: PrivateKeyCreationOptions, callback: Callback[Anon_Key]): Unit = js.native
  def getDhparamInfo(dh: String, callback: Callback[Anon_Prime]): Unit = js.native
  def getFingerprint(callback: Callback[Anon_Fingerprint]): Unit = js.native
  def getFingerprint(certificate: String, callback: Callback[Anon_Fingerprint]): Unit = js.native
  def getFingerprint(certificate: String, hash: HashFunction, callback: Callback[Anon_Fingerprint]): Unit = js.native
  def getModulus(certificate: String, callback: Callback[Anon_Modulus]): Unit = js.native
  def getModulus(certificate: String, password: String, callback: Callback[Anon_Modulus]): Unit = js.native
  def getPublicKey(callback: Callback[Anon_PublicKey]): Unit = js.native
  def getPublicKey(certificate: String, callback: Callback[Anon_PublicKey]): Unit = js.native
  def readCertificateInfo(callback: Callback[CertificateSubjectReadResult]): Unit = js.native
  def readCertificateInfo(certificate: String, callback: Callback[CertificateSubjectReadResult]): Unit = js.native
  def readPkcs12(bufferOrPath: String, callback: Callback[Pkcs12ReadResult]): js.Any = js.native
  def readPkcs12(bufferOrPath: String, options: Pkcs12ReadOptions, callback: Callback[Pkcs12ReadResult]): js.Any = js.native
  def readPkcs12(bufferOrPath: Buffer, callback: Callback[Pkcs12ReadResult]): js.Any = js.native
  def readPkcs12(bufferOrPath: Buffer, options: Pkcs12ReadOptions, callback: Callback[Pkcs12ReadResult]): js.Any = js.native
  def verifySigningChain(certificate: String, ca: js.Array[String], callback: Callback[Boolean]): Unit = js.native
}


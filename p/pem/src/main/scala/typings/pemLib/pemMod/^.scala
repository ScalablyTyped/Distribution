package typings
package pemLib.pemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pem", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def config(options: ModuleConfiguration): scala.Unit = js.native
  def createCSR(callback: Callback[pemLib.Anon_ClientKey]): scala.Unit = js.native
  def createCSR(options: CSRCreationOptions, callback: Callback[pemLib.Anon_ClientKey]): scala.Unit = js.native
  def createCertificate(callback: Callback[CertificateCreationResult]): scala.Unit = js.native
  def createCertificate(options: CertificateCreationOptions, callback: Callback[CertificateCreationResult]): scala.Unit = js.native
  def createDhparam(callback: Callback[pemLib.Anon_Dhparam]): scala.Unit = js.native
  def createDhparam(keyBitsize: scala.Double, callback: Callback[pemLib.Anon_Dhparam]): scala.Unit = js.native
  def createPkcs12(
    key: java.lang.String,
    certificate: java.lang.String,
    password: java.lang.String,
    callback: Callback[pemLib.Anon_Pkcs12]
  ): scala.Unit = js.native
  def createPkcs12(
    key: java.lang.String,
    certificate: java.lang.String,
    password: java.lang.String,
    options: Pkcs12CreationOptions,
    callback: Callback[pemLib.Anon_Pkcs12]
  ): scala.Unit = js.native
  def createPrivateKey(callback: Callback[pemLib.Anon_Key]): scala.Unit = js.native
  def createPrivateKey(keyBitsize: scala.Double, options: PrivateKeyCreationOptions, callback: Callback[pemLib.Anon_Key]): scala.Unit = js.native
  def createPrivateKey(optionsOrKeyBitsize: PrivateKeyCreationOptions, callback: Callback[pemLib.Anon_Key]): scala.Unit = js.native
  def createPrivateKey(optionsOrKeyBitsize: scala.Double, callback: Callback[pemLib.Anon_Key]): scala.Unit = js.native
  def getDhparamInfo(dh: java.lang.String, callback: Callback[pemLib.Anon_Prime]): scala.Unit = js.native
  def getFingerprint(callback: Callback[pemLib.Anon_Fingerprint]): scala.Unit = js.native
  def getFingerprint(certificate: java.lang.String, callback: Callback[pemLib.Anon_Fingerprint]): scala.Unit = js.native
  def getFingerprint(certificate: java.lang.String, hash: HashFunction, callback: Callback[pemLib.Anon_Fingerprint]): scala.Unit = js.native
  def getModulus(certificate: java.lang.String, callback: Callback[pemLib.Anon_Modulus]): scala.Unit = js.native
  def getModulus(certificate: java.lang.String, password: java.lang.String, callback: Callback[pemLib.Anon_Modulus]): scala.Unit = js.native
  def getPublicKey(callback: Callback[pemLib.Anon_PublicKey]): scala.Unit = js.native
  def getPublicKey(certificate: java.lang.String, callback: Callback[pemLib.Anon_PublicKey]): scala.Unit = js.native
  def readCertificateInfo(callback: Callback[CertificateSubjectReadResult]): scala.Unit = js.native
  def readCertificateInfo(certificate: java.lang.String, callback: Callback[CertificateSubjectReadResult]): scala.Unit = js.native
  def readPkcs12(bufferOrPath: java.lang.String, callback: Callback[Pkcs12ReadResult]): js.Any = js.native
  def readPkcs12(bufferOrPath: java.lang.String, options: Pkcs12ReadOptions, callback: Callback[Pkcs12ReadResult]): js.Any = js.native
  def readPkcs12(bufferOrPath: nodeLib.Buffer, callback: Callback[Pkcs12ReadResult]): js.Any = js.native
  def readPkcs12(bufferOrPath: nodeLib.Buffer, options: Pkcs12ReadOptions, callback: Callback[Pkcs12ReadResult]): js.Any = js.native
  def verifySigningChain(certificate: java.lang.String, ca: js.Array[java.lang.String], callback: Callback[scala.Boolean]): scala.Unit = js.native
}


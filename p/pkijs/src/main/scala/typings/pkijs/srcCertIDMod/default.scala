package typings.pkijs.srcCertIDMod

import typings.asn1js.asn1jsMod.Integer
import typings.asn1js.asn1jsMod.OctetString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/CertID", JSImport.Default)
@js.native
class default () extends CertID {
  def this(params: js.Any) = this()
  /* CompleteClass */
  override var hashAlgorithm: typings.pkijs.srcAlgorithmIdentifierMod.default = js.native
  /* CompleteClass */
  override var issuerKeyHash: OctetString = js.native
  /* CompleteClass */
  override var issuerNameHash: OctetString = js.native
  /* CompleteClass */
  override var serialNumber: Integer = js.native
  /**
    * Making OCSP certificate identifier for specific certificate
    * @param {Certificate} certificate Certificate making OCSP Request for
    * @param {CreateFroCertificateParams} parameters Additional parameters
    * @returns {Promise}
    */
  /* CompleteClass */
  override def createForCertificate(certificate: typings.pkijs.srcCertificateMod.default, parameters: CreateFroCertificateParams): js.Thenable[Unit] = js.native
  /* CompleteClass */
  override def fromSchema(schema: js.Any): Unit = js.native
  /**
    * Check that two "CertIDs" are equal
    * @param {CertID} certificateID Identifier of the certificate to be checked
    * @returns {boolean}
    */
  /* CompleteClass */
  override def isEqual(certificateID: CertID): Boolean = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
  /* CompleteClass */
  override def toSchema(): js.Any = js.native
}

/* static members */
@JSImport("pkijs/src/CertID", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * Compare values with default values for all class members
    * @param {string} memberName String name for a class member
    * @param {*} memberValue Value to compare with default value
    */
  def compareWithDefault(memberName: String, memberValue: js.Any): Boolean = js.native
  def defaultValues(memberName: String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}


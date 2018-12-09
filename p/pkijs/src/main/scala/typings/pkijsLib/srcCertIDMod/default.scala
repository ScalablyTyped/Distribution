package typings
package pkijsLib.srcCertIDMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/CertID", JSImport.Default)
@js.native
class default () extends CertID {
  def this(params: js.Any) = this()
  /* CompleteClass */
  override var hashAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default = js.native
  /* CompleteClass */
  override var issuerKeyHash: asn1jsLib.asn1jsMod.OctetString = js.native
  /* CompleteClass */
  override var issuerNameHash: asn1jsLib.asn1jsMod.OctetString = js.native
  /* CompleteClass */
  override var serialNumber: asn1jsLib.asn1jsMod.Integer = js.native
  /**
           * Making OCSP certificate identifier for specific certificate
           * @param {Certificate} certificate Certificate making OCSP Request for
           * @param {CreateFroCertificateParams} parameters Additional parameters
           * @returns {Promise}
           */
  /* CompleteClass */
  override def createForCertificate(certificate: pkijsLib.srcCertificateMod.default, parameters: CreateFroCertificateParams): js.Thenable[scala.Unit] = js.native
  /* CompleteClass */
  override def fromSchema(schema: js.Any): scala.Unit = js.native
  /**
           * Check that two "CertIDs" are equal
           * @param {CertID} certificateID Identifier of the certificate to be checked
           * @returns {boolean}
           */
  /* CompleteClass */
  override def isEqual(certificateID: CertID): scala.Boolean = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
  /* CompleteClass */
  override def toSchema(): js.Any = js.native
}

@JSImport("pkijs/src/CertID", JSImport.Default)
@js.native
object default extends js.Object {
  /**
           * Compare values with default values for all class members
           * @param {string} memberName String name for a class member
           * @param {*} memberValue Value to compare with default value
           */
  def compareWithDefault(memberName: java.lang.String, memberValue: js.Any): scala.Boolean = js.native
  def defaultValues(memberName: java.lang.String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}


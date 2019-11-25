package typings.pkijs.srcCertIDMod

import typings.asn1js.asn1jsMod.Integer
import typings.asn1js.asn1jsMod.OctetString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertID extends js.Object {
  var hashAlgorithm: typings.pkijs.srcAlgorithmIdentifierMod.default
  var issuerKeyHash: OctetString
  var issuerNameHash: OctetString
  var serialNumber: Integer
  /**
    * Making OCSP certificate identifier for specific certificate
    * @param {Certificate} certificate Certificate making OCSP Request for
    * @param {CreateFroCertificateParams} parameters Additional parameters
    * @returns {Promise}
    */
  def createForCertificate(certificate: typings.pkijs.srcCertificateMod.default, parameters: CreateFroCertificateParams): js.Thenable[Unit]
  def fromSchema(schema: js.Any): Unit
  /**
    * Check that two "CertIDs" are equal
    * @param {CertID} certificateID Identifier of the certificate to be checked
    * @returns {boolean}
    */
  def isEqual(certificateID: CertID): Boolean
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object CertID {
  @scala.inline
  def apply(
    createForCertificate: (typings.pkijs.srcCertificateMod.default, CreateFroCertificateParams) => js.Thenable[Unit],
    fromSchema: js.Any => Unit,
    hashAlgorithm: typings.pkijs.srcAlgorithmIdentifierMod.default,
    isEqual: CertID => Boolean,
    issuerKeyHash: OctetString,
    issuerNameHash: OctetString,
    serialNumber: Integer,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): CertID = {
    val __obj = js.Dynamic.literal(createForCertificate = js.Any.fromFunction2(createForCertificate), fromSchema = js.Any.fromFunction1(fromSchema), hashAlgorithm = hashAlgorithm.asInstanceOf[js.Any], isEqual = js.Any.fromFunction1(isEqual), issuerKeyHash = issuerKeyHash.asInstanceOf[js.Any], issuerNameHash = issuerNameHash.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
  
    __obj.asInstanceOf[CertID]
  }
}


package typings
package pkijsLib.srcCertIDMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertID extends js.Object {
  var hashAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default
  var issuerKeyHash: asn1jsLib.asn1jsMod.OctetString
  var issuerNameHash: asn1jsLib.asn1jsMod.OctetString
  var serialNumber: asn1jsLib.asn1jsMod.Integer
  /**
    * Making OCSP certificate identifier for specific certificate
    * @param {Certificate} certificate Certificate making OCSP Request for
    * @param {CreateFroCertificateParams} parameters Additional parameters
    * @returns {Promise}
    */
  def createForCertificate(certificate: pkijsLib.srcCertificateMod.default, parameters: CreateFroCertificateParams): js.Thenable[scala.Unit]
  def fromSchema(schema: js.Any): scala.Unit
  /**
    * Check that two "CertIDs" are equal
    * @param {CertID} certificateID Identifier of the certificate to be checked
    * @returns {boolean}
    */
  def isEqual(certificateID: CertID): scala.Boolean
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object CertID {
  @scala.inline
  def apply(
    createForCertificate: js.Function2[
      pkijsLib.srcCertificateMod.default, 
      CreateFroCertificateParams, 
      js.Thenable[scala.Unit]
    ],
    fromSchema: js.Function1[js.Any, scala.Unit],
    hashAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default,
    isEqual: js.Function1[CertID, scala.Boolean],
    issuerKeyHash: asn1jsLib.asn1jsMod.OctetString,
    issuerNameHash: asn1jsLib.asn1jsMod.OctetString,
    serialNumber: asn1jsLib.asn1jsMod.Integer,
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any]
  ): CertID = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createForCertificate")(createForCertificate)
    __obj.updateDynamic("fromSchema")(fromSchema)
    __obj.updateDynamic("hashAlgorithm")(hashAlgorithm)
    __obj.updateDynamic("isEqual")(isEqual)
    __obj.updateDynamic("issuerKeyHash")(issuerKeyHash)
    __obj.updateDynamic("issuerNameHash")(issuerNameHash)
    __obj.updateDynamic("serialNumber")(serialNumber)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.updateDynamic("toSchema")(toSchema)
    __obj.asInstanceOf[CertID]
  }
}


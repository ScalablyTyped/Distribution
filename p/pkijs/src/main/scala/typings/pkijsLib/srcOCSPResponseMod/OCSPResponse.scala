package typings
package pkijsLib.srcOCSPResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OCSPResponse extends js.Object {
  var responseBytes: js.UndefOr[pkijsLib.srcResponseBytesMod.default] = js.undefined
  var responseStatus: asn1jsLib.asn1jsMod.Enumerated
  /**
    * Making OCSP Request for specific certificate
    * @param {Certificate} certificate Certificate making OCSP Request for
    * @param {CreateFroCertificateParams} parameters Additional parameters
    * @returns {Promise}
    */
  def createForCertificate(
    certificate: pkijsLib.srcCertificateMod.default,
    parameters: pkijsLib.srcCertIDMod.CreateFroCertificateParams
  ): js.Thenable[scala.Unit]
  def fromSchema(schema: js.Any): scala.Unit
  /**
    * Get OCSP response status for specific certificate
    * @param {Certificate} certificate
    * @param {Certificate} issuerCertificate
    * @returns {*}
    */
  def getCertificateStatus(
    certificate: pkijsLib.srcCertificateMod.default,
    issuerCertificate: pkijsLib.srcCertificateMod.default
  ): js.Thenable[pkijsLib.srcBasicOCSPResponseMod.GetCertificateStatusResult]
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object OCSPResponse {
  @scala.inline
  def apply(
    createForCertificate: js.Function2[
      pkijsLib.srcCertificateMod.default, 
      pkijsLib.srcCertIDMod.CreateFroCertificateParams, 
      js.Thenable[scala.Unit]
    ],
    fromSchema: js.Function1[js.Any, scala.Unit],
    getCertificateStatus: js.Function2[
      pkijsLib.srcCertificateMod.default, 
      pkijsLib.srcCertificateMod.default, 
      js.Thenable[pkijsLib.srcBasicOCSPResponseMod.GetCertificateStatusResult]
    ],
    responseStatus: asn1jsLib.asn1jsMod.Enumerated,
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any],
    responseBytes: pkijsLib.srcResponseBytesMod.default = null
  ): OCSPResponse = {
    val __obj = js.Dynamic.literal(createForCertificate = createForCertificate, fromSchema = fromSchema, getCertificateStatus = getCertificateStatus, responseStatus = responseStatus, toJSON = toJSON, toSchema = toSchema)
    if (responseBytes != null) __obj.updateDynamic("responseBytes")(responseBytes)
    __obj.asInstanceOf[OCSPResponse]
  }
}


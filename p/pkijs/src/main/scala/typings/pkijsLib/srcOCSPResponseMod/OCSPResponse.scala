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
    createForCertificate: (pkijsLib.srcCertificateMod.default, pkijsLib.srcCertIDMod.CreateFroCertificateParams) => js.Thenable[scala.Unit],
    fromSchema: js.Any => scala.Unit,
    getCertificateStatus: (pkijsLib.srcCertificateMod.default, pkijsLib.srcCertificateMod.default) => js.Thenable[pkijsLib.srcBasicOCSPResponseMod.GetCertificateStatusResult],
    responseStatus: asn1jsLib.asn1jsMod.Enumerated,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    responseBytes: pkijsLib.srcResponseBytesMod.default = null
  ): OCSPResponse = {
    val __obj = js.Dynamic.literal(createForCertificate = js.Any.fromFunction2(createForCertificate), fromSchema = js.Any.fromFunction1(fromSchema), getCertificateStatus = js.Any.fromFunction2(getCertificateStatus), responseStatus = responseStatus, toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    if (responseBytes != null) __obj.updateDynamic("responseBytes")(responseBytes)
    __obj.asInstanceOf[OCSPResponse]
  }
}


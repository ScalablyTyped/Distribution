package typings.pkijs.srcOCSPResponseMod

import typings.asn1js.asn1jsMod.Enumerated
import typings.pkijs.srcBasicOCSPResponseMod.GetCertificateStatusResult
import typings.pkijs.srcCertIDMod.CreateFroCertificateParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OCSPResponse extends js.Object {
  var responseBytes: js.UndefOr[typings.pkijs.srcResponseBytesMod.default] = js.undefined
  var responseStatus: Enumerated
  /**
    * Making OCSP Request for specific certificate
    * @param {Certificate} certificate Certificate making OCSP Request for
    * @param {CreateFroCertificateParams} parameters Additional parameters
    * @returns {Promise}
    */
  def createForCertificate(certificate: typings.pkijs.srcCertificateMod.default, parameters: CreateFroCertificateParams): js.Thenable[Unit]
  def fromSchema(schema: js.Any): Unit
  /**
    * Get OCSP response status for specific certificate
    * @param {Certificate} certificate
    * @param {Certificate} issuerCertificate
    * @returns {*}
    */
  def getCertificateStatus(
    certificate: typings.pkijs.srcCertificateMod.default,
    issuerCertificate: typings.pkijs.srcCertificateMod.default
  ): js.Thenable[GetCertificateStatusResult]
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object OCSPResponse {
  @scala.inline
  def apply(
    createForCertificate: (typings.pkijs.srcCertificateMod.default, CreateFroCertificateParams) => js.Thenable[Unit],
    fromSchema: js.Any => Unit,
    getCertificateStatus: (typings.pkijs.srcCertificateMod.default, typings.pkijs.srcCertificateMod.default) => js.Thenable[GetCertificateStatusResult],
    responseStatus: Enumerated,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    responseBytes: typings.pkijs.srcResponseBytesMod.default = null
  ): OCSPResponse = {
    val __obj = js.Dynamic.literal(createForCertificate = js.Any.fromFunction2(createForCertificate), fromSchema = js.Any.fromFunction1(fromSchema), getCertificateStatus = js.Any.fromFunction2(getCertificateStatus), responseStatus = responseStatus.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    if (responseBytes != null) __obj.updateDynamic("responseBytes")(responseBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[OCSPResponse]
  }
}


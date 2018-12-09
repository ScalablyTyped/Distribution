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


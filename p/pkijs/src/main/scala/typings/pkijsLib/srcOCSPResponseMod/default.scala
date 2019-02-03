package typings
package pkijsLib.srcOCSPResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/OCSPResponse", JSImport.Default)
@js.native
class default () extends OCSPResponse {
  def this(params: js.Any) = this()
  /* CompleteClass */
  override var responseStatus: asn1jsLib.asn1jsMod.Enumerated = js.native
  /**
    * Making OCSP Request for specific certificate
    * @param {Certificate} certificate Certificate making OCSP Request for
    * @param {CreateFroCertificateParams} parameters Additional parameters
    * @returns {Promise}
    */
  /* CompleteClass */
  override def createForCertificate(
    certificate: pkijsLib.srcCertificateMod.default,
    parameters: pkijsLib.srcCertIDMod.CreateFroCertificateParams
  ): js.Thenable[scala.Unit] = js.native
  /* CompleteClass */
  override def fromSchema(schema: js.Any): scala.Unit = js.native
  /**
    * Get OCSP response status for specific certificate
    * @param {Certificate} certificate
    * @param {Certificate} issuerCertificate
    * @returns {*}
    */
  /* CompleteClass */
  override def getCertificateStatus(
    certificate: pkijsLib.srcCertificateMod.default,
    issuerCertificate: pkijsLib.srcCertificateMod.default
  ): js.Thenable[pkijsLib.srcBasicOCSPResponseMod.GetCertificateStatusResult] = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
  /* CompleteClass */
  override def toSchema(): js.Any = js.native
}

/* static members */
@JSImport("pkijs/src/OCSPResponse", JSImport.Default)
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


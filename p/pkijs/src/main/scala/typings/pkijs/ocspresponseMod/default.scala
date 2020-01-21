package typings.pkijs.ocspresponseMod

import typings.asn1js.mod.Enumerated
import typings.pkijs.basicOCSPResponseMod.GetCertificateStatusResult
import typings.pkijs.certIDMod.CreateFroCertificateParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/OCSPResponse", JSImport.Default)
@js.native
class default () extends OCSPResponse {
  def this(params: js.Any) = this()
  /* CompleteClass */
  override var responseStatus: Enumerated = js.native
  /**
    * Making OCSP Request for specific certificate
    * @param {Certificate} certificate Certificate making OCSP Request for
    * @param {CreateFroCertificateParams} parameters Additional parameters
    * @returns {Promise}
    */
  /* CompleteClass */
  override def createForCertificate(certificate: typings.pkijs.certificateMod.default, parameters: CreateFroCertificateParams): js.Thenable[Unit] = js.native
  /* CompleteClass */
  override def fromSchema(schema: js.Any): Unit = js.native
  /**
    * Get OCSP response status for specific certificate
    * @param {Certificate} certificate
    * @param {Certificate} issuerCertificate
    * @returns {*}
    */
  /* CompleteClass */
  override def getCertificateStatus(
    certificate: typings.pkijs.certificateMod.default,
    issuerCertificate: typings.pkijs.certificateMod.default
  ): js.Thenable[GetCertificateStatusResult] = js.native
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
  def compareWithDefault(memberName: String, memberValue: js.Any): Boolean = js.native
  def defaultValues(memberName: String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}


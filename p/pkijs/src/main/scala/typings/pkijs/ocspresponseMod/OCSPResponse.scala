package typings.pkijs.ocspresponseMod

import typings.asn1js.mod.Enumerated
import typings.pkijs.basicOCSPResponseMod.GetCertificateStatusResult
import typings.pkijs.certIDMod.CreateFroCertificateParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OCSPResponse extends js.Object {
  
  /**
    * Making OCSP Request for specific certificate
    * @param {Certificate} certificate Certificate making OCSP Request for
    * @param {CreateFroCertificateParams} parameters Additional parameters
    * @returns {Promise}
    */
  def createForCertificate(certificate: typings.pkijs.certificateMod.default, parameters: CreateFroCertificateParams): js.Thenable[Unit] = js.native
  
  def fromSchema(schema: js.Any): Unit = js.native
  
  /**
    * Get OCSP response status for specific certificate
    * @param {Certificate} certificate
    * @param {Certificate} issuerCertificate
    * @returns {*}
    */
  def getCertificateStatus(
    certificate: typings.pkijs.certificateMod.default,
    issuerCertificate: typings.pkijs.certificateMod.default
  ): js.Thenable[GetCertificateStatusResult] = js.native
  
  var responseBytes: js.UndefOr[typings.pkijs.responseBytesMod.default] = js.native
  
  var responseStatus: Enumerated = js.native
  
  def toJSON(): js.Any = js.native
  
  def toSchema(): js.Any = js.native
}
object OCSPResponse {
  
  @scala.inline
  def apply(
    createForCertificate: (typings.pkijs.certificateMod.default, CreateFroCertificateParams) => js.Thenable[Unit],
    fromSchema: js.Any => Unit,
    getCertificateStatus: (typings.pkijs.certificateMod.default, typings.pkijs.certificateMod.default) => js.Thenable[GetCertificateStatusResult],
    responseStatus: Enumerated,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): OCSPResponse = {
    val __obj = js.Dynamic.literal(createForCertificate = js.Any.fromFunction2(createForCertificate), fromSchema = js.Any.fromFunction1(fromSchema), getCertificateStatus = js.Any.fromFunction2(getCertificateStatus), responseStatus = responseStatus.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[OCSPResponse]
  }
  
  @scala.inline
  implicit class OCSPResponseOps[Self <: OCSPResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreateForCertificate(value: (typings.pkijs.certificateMod.default, CreateFroCertificateParams) => js.Thenable[Unit]): Self = this.set("createForCertificate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFromSchema(value: js.Any => Unit): Self = this.set("fromSchema", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCertificateStatus(
      value: (typings.pkijs.certificateMod.default, typings.pkijs.certificateMod.default) => js.Thenable[GetCertificateStatusResult]
    ): Self = this.set("getCertificateStatus", js.Any.fromFunction2(value))
    
    @scala.inline
    def setResponseStatus(value: Enumerated): Self = this.set("responseStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToSchema(value: () => js.Any): Self = this.set("toSchema", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResponseBytes(value: typings.pkijs.responseBytesMod.default): Self = this.set("responseBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseBytes: Self = this.set("responseBytes", js.undefined)
  }
}

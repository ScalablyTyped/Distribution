package typings.pkijs.certIDMod

import typings.asn1js.mod.Integer
import typings.asn1js.mod.OctetString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CertID extends js.Object {
  
  /**
    * Making OCSP certificate identifier for specific certificate
    * @param {Certificate} certificate Certificate making OCSP Request for
    * @param {CreateFroCertificateParams} parameters Additional parameters
    * @returns {Promise}
    */
  def createForCertificate(certificate: typings.pkijs.certificateMod.default, parameters: CreateFroCertificateParams): js.Thenable[Unit] = js.native
  
  def fromSchema(schema: js.Any): Unit = js.native
  
  var hashAlgorithm: typings.pkijs.algorithmIdentifierMod.default = js.native
  
  /**
    * Check that two "CertIDs" are equal
    * @param {CertID} certificateID Identifier of the certificate to be checked
    * @returns {boolean}
    */
  def isEqual(certificateID: CertID): Boolean = js.native
  
  var issuerKeyHash: OctetString = js.native
  
  var issuerNameHash: OctetString = js.native
  
  var serialNumber: Integer = js.native
  
  def toJSON(): js.Any = js.native
  
  def toSchema(): js.Any = js.native
}
object CertID {
  
  @scala.inline
  def apply(
    createForCertificate: (typings.pkijs.certificateMod.default, CreateFroCertificateParams) => js.Thenable[Unit],
    fromSchema: js.Any => Unit,
    hashAlgorithm: typings.pkijs.algorithmIdentifierMod.default,
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
  
  @scala.inline
  implicit class CertIDOps[Self <: CertID] (val x: Self) extends AnyVal {
    
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
    def setHashAlgorithm(value: typings.pkijs.algorithmIdentifierMod.default): Self = this.set("hashAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEqual(value: CertID => Boolean): Self = this.set("isEqual", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIssuerKeyHash(value: OctetString): Self = this.set("issuerKeyHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuerNameHash(value: OctetString): Self = this.set("issuerNameHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerialNumber(value: Integer): Self = this.set("serialNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToSchema(value: () => js.Any): Self = this.set("toSchema", js.Any.fromFunction0(value))
  }
}

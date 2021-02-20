package typings.pkijs

import typings.asn1js.mod.Integer
import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object certIDMod {
  
  @JSImport("pkijs/src/CertID", JSImport.Default)
  @js.native
  class default () extends CertID {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    /**
      * Compare values with default values for all class members
      * @param {string} memberName String name for a class member
      * @param {*} memberValue Value to compare with default value
      */
    @JSImport("pkijs/src/CertID", "default.compareWithDefault")
    @js.native
    def compareWithDefault(memberName: String, memberValue: js.Any): Boolean = js.native
    
    @JSImport("pkijs/src/CertID", "default.defaultValues")
    @js.native
    def defaultValues(memberName: String): js.Any = js.native
    
    @JSImport("pkijs/src/CertID", "default.schema")
    @js.native
    def schema(): js.Any = js.native
    @JSImport("pkijs/src/CertID", "default.schema")
    @js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
  @js.native
  trait CertID extends StObject {
    
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
    implicit class CertIDMutableBuilder[Self <: CertID] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateForCertificate(value: (typings.pkijs.certificateMod.default, CreateFroCertificateParams) => js.Thenable[Unit]): Self = StObject.set(x, "createForCertificate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHashAlgorithm(value: typings.pkijs.algorithmIdentifierMod.default): Self = StObject.set(x, "hashAlgorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEqual(value: CertID => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIssuerKeyHash(value: OctetString): Self = StObject.set(x, "issuerKeyHash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIssuerNameHash(value: OctetString): Self = StObject.set(x, "issuerNameHash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerialNumber(value: Integer): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait CreateFroCertificateParams extends StObject {
    
    var hashAlgorithm: String = js.native
    
    var issuerCertificate: typings.pkijs.certificateMod.default = js.native
  }
  object CreateFroCertificateParams {
    
    @scala.inline
    def apply(hashAlgorithm: String, issuerCertificate: typings.pkijs.certificateMod.default): CreateFroCertificateParams = {
      val __obj = js.Dynamic.literal(hashAlgorithm = hashAlgorithm.asInstanceOf[js.Any], issuerCertificate = issuerCertificate.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateFroCertificateParams]
    }
    
    @scala.inline
    implicit class CreateFroCertificateParamsMutableBuilder[Self <: CreateFroCertificateParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHashAlgorithm(value: String): Self = StObject.set(x, "hashAlgorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIssuerCertificate(value: typings.pkijs.certificateMod.default): Self = StObject.set(x, "issuerCertificate", value.asInstanceOf[js.Any])
    }
  }
}

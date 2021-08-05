package typings.pkijs

import typings.asn1js.mod.Integer
import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object certIDMod {
  
  @JSImport("pkijs/src/CertID", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with CertID {
    def this(params: js.Any) = this()
    
    /**
      * Making OCSP certificate identifier for specific certificate
      * @param {Certificate} certificate Certificate making OCSP Request for
      * @param {CreateFroCertificateParams} parameters Additional parameters
      * @returns {Promise}
      */
    /* CompleteClass */
    override def createForCertificate(certificate: typings.pkijs.certificateMod.default, parameters: CreateFroCertificateParams): js.Thenable[Unit] = js.native
    
    /* CompleteClass */
    override def fromSchema(schema: js.Any): Unit = js.native
    
    /* CompleteClass */
    var hashAlgorithm: typings.pkijs.algorithmIdentifierMod.default = js.native
    
    /**
      * Check that two "CertIDs" are equal
      * @param {CertID} certificateID Identifier of the certificate to be checked
      * @returns {boolean}
      */
    /* CompleteClass */
    override def isEqual(certificateID: CertID): Boolean = js.native
    
    /* CompleteClass */
    var issuerKeyHash: OctetString = js.native
    
    /* CompleteClass */
    var issuerNameHash: OctetString = js.native
    
    /* CompleteClass */
    var serialNumber: Integer = js.native
    
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
    
    /* CompleteClass */
    override def toSchema(): js.Any = js.native
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/CertID", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Compare values with default values for all class members
      * @param {string} memberName String name for a class member
      * @param {*} memberValue Value to compare with default value
      */
    inline def compareWithDefault(memberName: String, memberValue: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareWithDefault")(memberName.asInstanceOf[js.Any], memberValue.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def defaultValues(memberName: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def schema(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[js.Any]
    inline def schema(parameters: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  trait CertID extends StObject {
    
    /**
      * Making OCSP certificate identifier for specific certificate
      * @param {Certificate} certificate Certificate making OCSP Request for
      * @param {CreateFroCertificateParams} parameters Additional parameters
      * @returns {Promise}
      */
    def createForCertificate(certificate: typings.pkijs.certificateMod.default, parameters: CreateFroCertificateParams): js.Thenable[Unit]
    
    def fromSchema(schema: js.Any): Unit
    
    var hashAlgorithm: typings.pkijs.algorithmIdentifierMod.default
    
    /**
      * Check that two "CertIDs" are equal
      * @param {CertID} certificateID Identifier of the certificate to be checked
      * @returns {boolean}
      */
    def isEqual(certificateID: CertID): Boolean
    
    var issuerKeyHash: OctetString
    
    var issuerNameHash: OctetString
    
    var serialNumber: Integer
    
    def toJSON(): js.Any
    
    def toSchema(): js.Any
  }
  object CertID {
    
    inline def apply(
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
    
    extension [Self <: CertID](x: Self) {
      
      inline def setCreateForCertificate(value: (typings.pkijs.certificateMod.default, CreateFroCertificateParams) => js.Thenable[Unit]): Self = StObject.set(x, "createForCertificate", js.Any.fromFunction2(value))
      
      inline def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      inline def setHashAlgorithm(value: typings.pkijs.algorithmIdentifierMod.default): Self = StObject.set(x, "hashAlgorithm", value.asInstanceOf[js.Any])
      
      inline def setIsEqual(value: CertID => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
      
      inline def setIssuerKeyHash(value: OctetString): Self = StObject.set(x, "issuerKeyHash", value.asInstanceOf[js.Any])
      
      inline def setIssuerNameHash(value: OctetString): Self = StObject.set(x, "issuerNameHash", value.asInstanceOf[js.Any])
      
      inline def setSerialNumber(value: Integer): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
      
      inline def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      inline def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
  
  trait CreateFroCertificateParams extends StObject {
    
    var hashAlgorithm: String
    
    var issuerCertificate: typings.pkijs.certificateMod.default
  }
  object CreateFroCertificateParams {
    
    inline def apply(hashAlgorithm: String, issuerCertificate: typings.pkijs.certificateMod.default): CreateFroCertificateParams = {
      val __obj = js.Dynamic.literal(hashAlgorithm = hashAlgorithm.asInstanceOf[js.Any], issuerCertificate = issuerCertificate.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateFroCertificateParams]
    }
    
    extension [Self <: CreateFroCertificateParams](x: Self) {
      
      inline def setHashAlgorithm(value: String): Self = StObject.set(x, "hashAlgorithm", value.asInstanceOf[js.Any])
      
      inline def setIssuerCertificate(value: typings.pkijs.certificateMod.default): Self = StObject.set(x, "issuerCertificate", value.asInstanceOf[js.Any])
    }
  }
}

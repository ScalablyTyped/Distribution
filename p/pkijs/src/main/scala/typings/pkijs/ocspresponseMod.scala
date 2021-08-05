package typings.pkijs

import typings.asn1js.mod.Enumerated
import typings.pkijs.basicOCSPResponseMod.GetCertificateStatusResult
import typings.pkijs.certIDMod.CreateFroCertificateParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ocspresponseMod {
  
  @JSImport("pkijs/src/OCSPResponse", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with OCSPResponse {
    def this(params: js.Any) = this()
    
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
    var responseStatus: Enumerated = js.native
    
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
    
    /* CompleteClass */
    override def toSchema(): js.Any = js.native
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/OCSPResponse", JSImport.Default)
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
  
  trait OCSPResponse extends StObject {
    
    /**
      * Making OCSP Request for specific certificate
      * @param {Certificate} certificate Certificate making OCSP Request for
      * @param {CreateFroCertificateParams} parameters Additional parameters
      * @returns {Promise}
      */
    def createForCertificate(certificate: typings.pkijs.certificateMod.default, parameters: CreateFroCertificateParams): js.Thenable[Unit]
    
    def fromSchema(schema: js.Any): Unit
    
    /**
      * Get OCSP response status for specific certificate
      * @param {Certificate} certificate
      * @param {Certificate} issuerCertificate
      * @returns {*}
      */
    def getCertificateStatus(
      certificate: typings.pkijs.certificateMod.default,
      issuerCertificate: typings.pkijs.certificateMod.default
    ): js.Thenable[GetCertificateStatusResult]
    
    var responseBytes: js.UndefOr[typings.pkijs.responseBytesMod.default] = js.undefined
    
    var responseStatus: Enumerated
    
    def toJSON(): js.Any
    
    def toSchema(): js.Any
  }
  object OCSPResponse {
    
    inline def apply(
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
    
    extension [Self <: OCSPResponse](x: Self) {
      
      inline def setCreateForCertificate(value: (typings.pkijs.certificateMod.default, CreateFroCertificateParams) => js.Thenable[Unit]): Self = StObject.set(x, "createForCertificate", js.Any.fromFunction2(value))
      
      inline def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      inline def setGetCertificateStatus(
        value: (typings.pkijs.certificateMod.default, typings.pkijs.certificateMod.default) => js.Thenable[GetCertificateStatusResult]
      ): Self = StObject.set(x, "getCertificateStatus", js.Any.fromFunction2(value))
      
      inline def setResponseBytes(value: typings.pkijs.responseBytesMod.default): Self = StObject.set(x, "responseBytes", value.asInstanceOf[js.Any])
      
      inline def setResponseBytesUndefined: Self = StObject.set(x, "responseBytes", js.undefined)
      
      inline def setResponseStatus(value: Enumerated): Self = StObject.set(x, "responseStatus", value.asInstanceOf[js.Any])
      
      inline def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      inline def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}

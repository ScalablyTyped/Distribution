package typings.pkijs

import typings.asn1js.mod.Enumerated
import typings.pkijs.basicOCSPResponseMod.GetCertificateStatusResult
import typings.pkijs.certIDMod.CreateFroCertificateParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ocspresponseMod {
  
  @JSImport("pkijs/src/OCSPResponse", JSImport.Default)
  @js.native
  class default () extends OCSPResponse {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    /**
      * Compare values with default values for all class members
      * @param {string} memberName String name for a class member
      * @param {*} memberValue Value to compare with default value
      */
    @JSImport("pkijs/src/OCSPResponse", "default.compareWithDefault")
    @js.native
    def compareWithDefault(memberName: String, memberValue: js.Any): Boolean = js.native
    
    @JSImport("pkijs/src/OCSPResponse", "default.defaultValues")
    @js.native
    def defaultValues(memberName: String): js.Any = js.native
    
    @JSImport("pkijs/src/OCSPResponse", "default.schema")
    @js.native
    def schema(): js.Any = js.native
    @JSImport("pkijs/src/OCSPResponse", "default.schema")
    @js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
  @js.native
  trait OCSPResponse extends StObject {
    
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
    implicit class OCSPResponseMutableBuilder[Self <: OCSPResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateForCertificate(value: (typings.pkijs.certificateMod.default, CreateFroCertificateParams) => js.Thenable[Unit]): Self = StObject.set(x, "createForCertificate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetCertificateStatus(
        value: (typings.pkijs.certificateMod.default, typings.pkijs.certificateMod.default) => js.Thenable[GetCertificateStatusResult]
      ): Self = StObject.set(x, "getCertificateStatus", js.Any.fromFunction2(value))
      
      @scala.inline
      def setResponseBytes(value: typings.pkijs.responseBytesMod.default): Self = StObject.set(x, "responseBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseBytesUndefined: Self = StObject.set(x, "responseBytes", js.undefined)
      
      @scala.inline
      def setResponseStatus(value: Enumerated): Self = StObject.set(x, "responseStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}

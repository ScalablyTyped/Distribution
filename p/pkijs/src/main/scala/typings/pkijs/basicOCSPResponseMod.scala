package typings.pkijs

import typings.asn1js.mod.BitString
import typings.pkijs.anon.TrustedCerts
import typings.std.ArrayBuffer
import typings.std.CryptoKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object basicOCSPResponseMod {
  
  @JSImport("pkijs/src/BasicOCSPResponse", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with BasicOCSPResponse {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/BasicOCSPResponse", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Compare values with default values for all class members
      * @param {string} memberName String name for a class member
      * @param {*} memberValue Value to compare with default value
      */
    @scala.inline
    def compareWithDefault(memberName: String, memberValue: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareWithDefault")(memberName.asInstanceOf[js.Any], memberValue.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def defaultValues(memberName: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def schema(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[js.Any]
    @scala.inline
    def schema(parameters: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  @js.native
  trait BasicOCSPResponse extends StObject {
    
    var certs: js.UndefOr[js.Array[typings.pkijs.certificateMod.default]] = js.native
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    /**
      * Get OCSP response status for specific certificate
      * @param {Certificate} certificate Certificate to be checked
      * @param {Certificate} issuerCertificate Certificate of issuer for certificate to be checked
      * @returns {PromiseLike<GetCertificateStatusResult>}
      */
    def getCertificateStatus(
      certificate: typings.pkijs.certificateMod.default,
      issuerCertificate: typings.pkijs.certificateMod.default
    ): js.Thenable[GetCertificateStatusResult] = js.native
    
    /**
      * Make signature for current OCSP Basic Response
      *
      * @param {CryptoKey} privateKey Private key for "subjectPublicKeyInfo" structure
      * @param {string} [hashAlgorithm] Hashing algorithm. Default SHA-1
      * @returns {PromiseLike<ArrayBuffer>}
      */
    def sign(privateKey: CryptoKey): js.Thenable[ArrayBuffer] = js.native
    def sign(privateKey: CryptoKey, hashAlgorithm: String): js.Thenable[ArrayBuffer] = js.native
    
    var signature: BitString = js.native
    
    var signatureAlgorithm: typings.pkijs.algorithmIdentifierMod.default = js.native
    
    var tbsResponseData: typings.pkijs.responseDataMod.default = js.native
    
    def toJSON(): js.Any = js.native
    
    def toSchema(): js.Any = js.native
    
    /**
      * Verify existing OCSP Basic Response
      *
      * @param {{ trustedCerts?: Certificate[] }} parameters Additional parameters
      * @returns {PromiseLike<boolean>}
      */
    def verify(): js.Thenable[Boolean] = js.native
    def verify(parameters: TrustedCerts): js.Thenable[Boolean] = js.native
  }
  
  trait GetCertificateStatusResult extends StObject {
    
    var isForCertificate: Boolean
    
    /**
      * 0 = good, 1 = revoked, 2 = unknown
      *
      * @type {number}
      * @memberOf GetCertificateStatusResult
      */
    var status: Double
  }
  object GetCertificateStatusResult {
    
    @scala.inline
    def apply(isForCertificate: Boolean, status: Double): GetCertificateStatusResult = {
      val __obj = js.Dynamic.literal(isForCertificate = isForCertificate.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetCertificateStatusResult]
    }
    
    @scala.inline
    implicit class GetCertificateStatusResultMutableBuilder[Self <: GetCertificateStatusResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsForCertificate(value: Boolean): Self = StObject.set(x, "isForCertificate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}

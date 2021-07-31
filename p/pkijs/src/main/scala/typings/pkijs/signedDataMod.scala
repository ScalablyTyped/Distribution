package typings.pkijs

import typings.std.ArrayBuffer
import typings.std.BufferSource
import typings.std.CryptoKey
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object signedDataMod {
  
  @JSImport("pkijs/src/SignedData", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with SignedData {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/SignedData", JSImport.Default)
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
  trait SignedData extends StObject {
    
    var certificates: js.UndefOr[
        js.Array[
          typings.pkijs.certificateMod.default | typings.pkijs.otherCertificateFormatMod.default
        ]
      ] = js.native
    
    var crls: js.UndefOr[
        js.Array[
          typings.pkijs.certificateRevocationListMod.default | typings.pkijs.otherRevocationInfoFormatMod.default
        ]
      ] = js.native
    
    var digestAlgorithms: js.Array[typings.pkijs.algorithmIdentifierMod.default] = js.native
    
    var encapContentInfo: typings.pkijs.encapsulatedContentInfoMod.default = js.native
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    /**
      * Signing current SignedData
      *
      * @param {CryptoKey} privateKey Private key for "subjectPublicKeyInfo" structure
      * @param {number} signerIndex Index number (starting from 0) of signer index to make signature for
      * @param {string} [hashAlgorithm] Hashing algorithm. Default SHA-1
      * @param {BufferSource} [data] Detached data
      * @returns {ArrayBuffer}
      *
      * @memberOf SignedData
      */
    def sign(privateKey: CryptoKey, signerIndex: Double): ArrayBuffer = js.native
    def sign(privateKey: CryptoKey, signerIndex: Double, hashAlgorithm: String): ArrayBuffer = js.native
    def sign(privateKey: CryptoKey, signerIndex: Double, hashAlgorithm: String, data: BufferSource): ArrayBuffer = js.native
    def sign(privateKey: CryptoKey, signerIndex: Double, hashAlgorithm: Unit, data: BufferSource): ArrayBuffer = js.native
    
    var signerInfos: js.Array[typings.pkijs.signerInfoMod.default] = js.native
    
    def toJSON(): js.Any = js.native
    
    /**
      * Convert current object to asn1js object and set correct values
      *
      * @param {boolean} [encodeFlag]
      * @returns {*}
      */
    def toSchema(): js.Any = js.native
    def toSchema(encodeFlag: Boolean): js.Any = js.native
    
    def verify(options: VerifyParams): js.Thenable[VerifyResult] = js.native
    
    var version: Double = js.native
  }
  
  trait VerifyParams extends StObject {
    
    var checkChain: js.UndefOr[Boolean] = js.undefined
    
    var checkDate: js.UndefOr[Date] = js.undefined
    
    var data: js.UndefOr[ArrayBuffer] = js.undefined
    
    var extendedMode: js.UndefOr[Boolean] = js.undefined
    
    var includeSignerCertificate: js.UndefOr[Boolean] = js.undefined
    
    var signer: js.UndefOr[Double] = js.undefined
    
    var trustedCerts: js.UndefOr[js.Array[typings.pkijs.certificateMod.default]] = js.undefined
  }
  object VerifyParams {
    
    @scala.inline
    def apply(): VerifyParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VerifyParams]
    }
    
    @scala.inline
    implicit class VerifyParamsMutableBuilder[Self <: VerifyParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckChain(value: Boolean): Self = StObject.set(x, "checkChain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckChainUndefined: Self = StObject.set(x, "checkChain", js.undefined)
      
      @scala.inline
      def setCheckDate(value: Date): Self = StObject.set(x, "checkDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckDateUndefined: Self = StObject.set(x, "checkDate", js.undefined)
      
      @scala.inline
      def setData(value: ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setExtendedMode(value: Boolean): Self = StObject.set(x, "extendedMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtendedModeUndefined: Self = StObject.set(x, "extendedMode", js.undefined)
      
      @scala.inline
      def setIncludeSignerCertificate(value: Boolean): Self = StObject.set(x, "includeSignerCertificate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeSignerCertificateUndefined: Self = StObject.set(x, "includeSignerCertificate", js.undefined)
      
      @scala.inline
      def setSigner(value: Double): Self = StObject.set(x, "signer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignerUndefined: Self = StObject.set(x, "signer", js.undefined)
      
      @scala.inline
      def setTrustedCerts(value: js.Array[typings.pkijs.certificateMod.default]): Self = StObject.set(x, "trustedCerts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrustedCertsUndefined: Self = StObject.set(x, "trustedCerts", js.undefined)
      
      @scala.inline
      def setTrustedCertsVarargs(value: typings.pkijs.certificateMod.default*): Self = StObject.set(x, "trustedCerts", js.Array(value :_*))
    }
  }
  
  trait VerifyResult extends StObject {
    
    var code: Double
    
    var date: Date
    
    var message: String
    
    var signatureVerified: js.UndefOr[Boolean] = js.undefined
    
    var signerCertificate: js.UndefOr[typings.pkijs.certificateMod.default] = js.undefined
    
    var signerCertificateVerified: js.UndefOr[Boolean] = js.undefined
  }
  object VerifyResult {
    
    @scala.inline
    def apply(code: Double, date: Date, message: String): VerifyResult = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerifyResult]
    }
    
    @scala.inline
    implicit class VerifyResultMutableBuilder[Self <: VerifyResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignatureVerified(value: Boolean): Self = StObject.set(x, "signatureVerified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignatureVerifiedUndefined: Self = StObject.set(x, "signatureVerified", js.undefined)
      
      @scala.inline
      def setSignerCertificate(value: typings.pkijs.certificateMod.default): Self = StObject.set(x, "signerCertificate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignerCertificateUndefined: Self = StObject.set(x, "signerCertificate", js.undefined)
      
      @scala.inline
      def setSignerCertificateVerified(value: Boolean): Self = StObject.set(x, "signerCertificateVerified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignerCertificateVerifiedUndefined: Self = StObject.set(x, "signerCertificateVerified", js.undefined)
    }
  }
}

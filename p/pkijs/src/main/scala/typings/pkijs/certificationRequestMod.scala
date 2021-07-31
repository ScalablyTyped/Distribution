package typings.pkijs

import typings.asn1js.mod.BitString
import typings.asn1js.mod.Sequence
import typings.std.ArrayBuffer
import typings.std.CryptoKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object certificationRequestMod {
  
  @JSImport("pkijs/src/CertificationRequest", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with CertificationRequest {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/CertificationRequest", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def defaultValues(memberName: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def schema(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[js.Any]
    @scala.inline
    def schema(parameters: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  @js.native
  trait CertificationRequest extends StObject {
    
    var attributes: js.UndefOr[js.Array[typings.pkijs.attributeMod.default]] = js.native
    
    /**
      * Aux function making ASN1js Sequence from current TBS
      *
      * @returns {Sequence}
      */
    def encodeTBS(): Sequence = js.native
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    /**
      * Makes signature for currect certification request
      *
      * @param {CryptoKey} privateKey WebCrypto private key
      * @param {string} [hashAlgorithm] String representing current hashing algorithm
      * @returns {PromiseLike<ArrayBuffer>}
      *
      * @memberOf CertificationRequest
      */
    def sign(privateKey: CryptoKey): js.Thenable[ArrayBuffer] = js.native
    def sign(privateKey: CryptoKey, hashAlgorithm: String): js.Thenable[ArrayBuffer] = js.native
    
    var signatureAlgorithm: typings.pkijs.algorithmIdentifierMod.default = js.native
    
    var signatureValue: BitString = js.native
    
    var subject: typings.pkijs.relativeDistinguishedNamesMod.default = js.native
    
    var subjectPublicKeyInfo: typings.pkijs.publicKeyInfoMod.default = js.native
    
    var tbs: ArrayBuffer = js.native
    
    def toJSON(): js.Any = js.native
    
    /**
      * Convert current object to asn1js object and set correct values
      *
      * @param {boolean} [encodeFlag]
      * @returns {*}
      */
    def toSchema(): js.Any = js.native
    def toSchema(encodeFlag: Boolean): js.Any = js.native
    
    /**
      * Verify existing certification request signature
      *
      * @returns {PromiseLike<boolean>}
      *
      * @memberOf CertificationRequest
      */
    def verify(): js.Thenable[Boolean] = js.native
    
    var version: Double = js.native
  }
}

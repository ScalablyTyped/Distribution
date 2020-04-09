package typings.pkijs

import typings.asn1js.mod.BitString
import typings.asn1js.mod.Sequence
import typings.std.ArrayBuffer
import typings.std.CryptoKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/CertificationRequest", JSImport.Namespace)
@js.native
object certificationRequestMod extends js.Object {
  @js.native
  trait CertificationRequest extends js.Object {
    var attributes: js.UndefOr[js.Array[typings.pkijs.attributeMod.default]] = js.native
    var signatureAlgorithm: typings.pkijs.algorithmIdentifierMod.default = js.native
    var signatureValue: BitString = js.native
    var subject: typings.pkijs.relativeDistinguishedNamesMod.default = js.native
    var subjectPublicKeyInfo: typings.pkijs.publicKeyInfoMod.default = js.native
    var tbs: ArrayBuffer = js.native
    var version: Double = js.native
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
  }
  
  @js.native
  class default () extends CertificationRequest {
    def this(params: js.Any) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    def defaultValues(memberName: String): js.Any = js.native
    def schema(): js.Any = js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
}


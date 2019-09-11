package typings.atPanvaJose.atPanvaJoseMod

import typings.atPanvaJose.atPanvaJoseMod.JWKNs.Key
import typings.atPanvaJose.atPanvaJoseMod.JWKSNs.KeyStore
import typings.atPanvaJose.atPanvaJoseMod.JWSNs.FlattenedJWS
import typings.atPanvaJose.atPanvaJoseMod.JWSNs.GeneralJWS
import typings.atPanvaJose.atPanvaJoseMod.JWSNs.JWSJSON
import typings.atPanvaJose.atPanvaJoseMod.JWSNs.JWSRecipient
import typings.atPanvaJose.atPanvaJoseMod.JWSNs.VerifyOptions
import typings.atPanvaJose.atPanvaJoseMod.JWSNs.completeVerification
import typings.atPanvaJose.atPanvaJoseNumbers.`false`
import typings.atPanvaJose.atPanvaJoseNumbers.`true`
import typings.atPanvaJose.atPanvaJoseStrings.compact
import typings.atPanvaJose.atPanvaJoseStrings.flattened
import typings.atPanvaJose.atPanvaJoseStrings.general
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@panva/jose", "JWS")
@js.native
object JWSNs extends js.Object {
  trait FlattenedJWS
    extends JWSRecipient
       with JWSJSON
  
  trait GeneralJWS extends JWSJSON {
    var signatures: js.Array[JWSRecipient]
  }
  
  trait JWSJSON extends js.Object {
    var payload: String
  }
  
  trait JWSRecipient extends js.Object {
    var header: js.UndefOr[js.Object] = js.undefined
    var `protected`: js.UndefOr[String] = js.undefined
    var signature: String
  }
  
  @js.native
  class Sign protected () extends js.Object {
    def this(payload: String) = this()
    def this(payload: js.Object) = this()
    def this(payload: Buffer) = this()
    def recipient(key: Key): Unit = js.native
    def recipient(key: Key, `protected`: js.Object): Unit = js.native
    def recipient(key: Key, `protected`: js.Object, header: js.Object): Unit = js.native
    @JSName("sign")
    def sign_compact(serialization: compact): String = js.native
    @JSName("sign")
    def sign_flattened(serialization: flattened): FlattenedJWS = js.native
    @JSName("sign")
    def sign_general(serialization: general): GeneralJWS = js.native
  }
  
  trait VerifyOptions[komplet] extends js.Object {
    var algorithms: js.UndefOr[js.Array[String]] = js.undefined
    var complete: js.UndefOr[komplet] = js.undefined
    var crit: js.UndefOr[js.Array[String]] = js.undefined
  }
  
  trait completeVerification extends js.Object {
    var header: js.UndefOr[js.Object] = js.undefined
    var key: Key
    var payload: String | js.Object
    var `protected`: js.UndefOr[js.Object] = js.undefined
  }
  
  def sign(payload: String, key: Key): String = js.native
  def sign(payload: String, key: Key, `protected`: js.Object): String = js.native
  def sign(payload: js.Object, key: Key): String = js.native
  def sign(payload: js.Object, key: Key, `protected`: js.Object): String = js.native
  def sign(payload: Buffer, key: Key): String = js.native
  def sign(payload: Buffer, key: Key, `protected`: js.Object): String = js.native
  def verify(jws: String, key: Key): String | js.Object = js.native
  def verify(jws: String, key: KeyStore): String | js.Object = js.native
  def verify(jws: FlattenedJWS, key: Key): String | js.Object = js.native
  def verify(jws: FlattenedJWS, key: KeyStore): String | js.Object = js.native
  def verify(jws: GeneralJWS, key: Key): String | js.Object = js.native
  def verify(jws: GeneralJWS, key: KeyStore): String | js.Object = js.native
  @JSName("verify")
  def verify_completeVerification(jws: String, key: Key): completeVerification = js.native
  @JSName("verify")
  def verify_completeVerification(jws: String, key: KeyStore): completeVerification = js.native
  @JSName("verify")
  def verify_completeVerification(jws: FlattenedJWS, key: Key): completeVerification = js.native
  @JSName("verify")
  def verify_completeVerification(jws: FlattenedJWS, key: KeyStore): completeVerification = js.native
  @JSName("verify")
  def verify_completeVerification(jws: GeneralJWS, key: Key): completeVerification = js.native
  @JSName("verify")
  def verify_completeVerification(jws: GeneralJWS, key: KeyStore): completeVerification = js.native
  @JSName("verify")
  def verify_false(jws: String, key: Key, options: VerifyOptions[`false`]): String | js.Object = js.native
  @JSName("verify")
  def verify_false(jws: String, key: KeyStore, options: VerifyOptions[`false`]): String | js.Object = js.native
  @JSName("verify")
  def verify_false(jws: FlattenedJWS, key: Key, options: VerifyOptions[`false`]): String | js.Object = js.native
  @JSName("verify")
  def verify_false(jws: FlattenedJWS, key: KeyStore, options: VerifyOptions[`false`]): String | js.Object = js.native
  @JSName("verify")
  def verify_false(jws: GeneralJWS, key: Key, options: VerifyOptions[`false`]): String | js.Object = js.native
  @JSName("verify")
  def verify_false(jws: GeneralJWS, key: KeyStore, options: VerifyOptions[`false`]): String | js.Object = js.native
  @JSName("verify")
  def verify_true(jws: String, key: Key, options: VerifyOptions[`true`]): completeVerification = js.native
  @JSName("verify")
  def verify_true(jws: String, key: KeyStore, options: VerifyOptions[`true`]): completeVerification = js.native
  @JSName("verify")
  def verify_true(jws: FlattenedJWS, key: Key, options: VerifyOptions[`true`]): completeVerification = js.native
  @JSName("verify")
  def verify_true(jws: FlattenedJWS, key: KeyStore, options: VerifyOptions[`true`]): completeVerification = js.native
  @JSName("verify")
  def verify_true(jws: GeneralJWS, key: Key, options: VerifyOptions[`true`]): completeVerification = js.native
  @JSName("verify")
  def verify_true(jws: GeneralJWS, key: KeyStore, options: VerifyOptions[`true`]): completeVerification = js.native
  @JSName("sign")
  @js.native
  object signNs extends js.Object {
    def flattened(payload: String, key: Key): FlattenedJWS = js.native
    def flattened(payload: String, key: Key, `protected`: js.Object): FlattenedJWS = js.native
    def flattened(payload: String, key: Key, `protected`: js.Object, header: js.Object): FlattenedJWS = js.native
    def flattened(payload: js.Object, key: Key): FlattenedJWS = js.native
    def flattened(payload: js.Object, key: Key, `protected`: js.Object): FlattenedJWS = js.native
    def flattened(payload: js.Object, key: Key, `protected`: js.Object, header: js.Object): FlattenedJWS = js.native
    def flattened(payload: Buffer, key: Key): FlattenedJWS = js.native
    def flattened(payload: Buffer, key: Key, `protected`: js.Object): FlattenedJWS = js.native
    def flattened(payload: Buffer, key: Key, `protected`: js.Object, header: js.Object): FlattenedJWS = js.native
    def general(payload: String, key: Key): GeneralJWS = js.native
    def general(payload: String, key: Key, `protected`: js.Object): GeneralJWS = js.native
    def general(payload: String, key: Key, `protected`: js.Object, header: js.Object): GeneralJWS = js.native
    def general(payload: js.Object, key: Key): GeneralJWS = js.native
    def general(payload: js.Object, key: Key, `protected`: js.Object): GeneralJWS = js.native
    def general(payload: js.Object, key: Key, `protected`: js.Object, header: js.Object): GeneralJWS = js.native
    def general(payload: Buffer, key: Key): GeneralJWS = js.native
    def general(payload: Buffer, key: Key, `protected`: js.Object): GeneralJWS = js.native
    def general(payload: Buffer, key: Key, `protected`: js.Object, header: js.Object): GeneralJWS = js.native
  }
  
}


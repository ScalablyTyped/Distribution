package typings.atPanvaJose.atPanvaJoseMod

import typings.atPanvaJose.atPanvaJoseMod.JWKNs.Key
import typings.atPanvaJose.atPanvaJoseMod.JWKSNs.KeyStore
import typings.atPanvaJose.atPanvaJoseMod.JWTNs.DecodeOptions
import typings.atPanvaJose.atPanvaJoseMod.JWTNs.SignOptions
import typings.atPanvaJose.atPanvaJoseMod.JWTNs.VerifyOptions
import typings.atPanvaJose.atPanvaJoseMod.JWTNs.completeResult
import typings.atPanvaJose.atPanvaJoseNumbers.`false`
import typings.atPanvaJose.atPanvaJoseNumbers.`true`
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@panva/jose", "JWT")
@js.native
object JWTNs extends js.Object {
  trait DecodeOptions[komplet] extends js.Object {
    var complete: js.UndefOr[komplet] = js.undefined
  }
  
  trait SignOptions extends js.Object {
    var algorithm: js.UndefOr[String] = js.undefined
    var audience: js.UndefOr[String | js.Array[String]] = js.undefined
    var expiresIn: js.UndefOr[String] = js.undefined
    var header: js.UndefOr[js.Object] = js.undefined
    var iat: js.UndefOr[Boolean] = js.undefined
    var issuer: js.UndefOr[String] = js.undefined
    var jti: js.UndefOr[String] = js.undefined
    var kid: js.UndefOr[Boolean] = js.undefined
    var nonce: js.UndefOr[String] = js.undefined
    var notBefore: js.UndefOr[String] = js.undefined
    var now: js.UndefOr[Date] = js.undefined
    var subject: js.UndefOr[String] = js.undefined
  }
  
  trait VerifyOptions[komplet] extends js.Object {
    var algorithms: js.UndefOr[js.Array[String]] = js.undefined
    var audience: js.UndefOr[String | js.Array[String]] = js.undefined
    var clockTolerance: js.UndefOr[String] = js.undefined
    var complete: js.UndefOr[komplet] = js.undefined
    var crit: js.UndefOr[js.Array[String]] = js.undefined
    var ignoreExp: js.UndefOr[Boolean] = js.undefined
    var ignoreIat: js.UndefOr[Boolean] = js.undefined
    var ignoreNbf: js.UndefOr[Boolean] = js.undefined
    var issuer: js.UndefOr[String] = js.undefined
    var jti: js.UndefOr[String] = js.undefined
    var maxAuthAge: js.UndefOr[String] = js.undefined
    var maxTokenAge: js.UndefOr[String] = js.undefined
    var nonce: js.UndefOr[String] = js.undefined
    var now: js.UndefOr[Date] = js.undefined
    var profile: js.UndefOr[JWTProfiles] = js.undefined
    var subject: js.UndefOr[String] = js.undefined
  }
  
  trait completeResult extends js.Object {
    var header: js.Object
    var key: Key
    var payload: js.Object
    var signature: String
  }
  
  def decode(jwt: String): js.Object = js.native
  @JSName("decode")
  def decode_completeResult(jwt: String): completeResult = js.native
  @JSName("decode")
  def decode_false(jwt: String, options: DecodeOptions[`false`]): js.Object = js.native
  @JSName("decode")
  def decode_true(jwt: String, options: DecodeOptions[`true`]): completeResult = js.native
  def sign(payload: js.Object, key: Key): String = js.native
  def sign(payload: js.Object, key: Key, options: SignOptions): String = js.native
  def verify(jwt: String, key: Key): js.Object = js.native
  def verify(jwt: String, key: KeyStore): js.Object = js.native
  @JSName("verify")
  def verify_completeResult(jwt: String, key: Key): completeResult = js.native
  @JSName("verify")
  def verify_completeResult(jwt: String, key: KeyStore): completeResult = js.native
  @JSName("verify")
  def verify_false(jwt: String, key: Key, options: VerifyOptions[`false`]): js.Object = js.native
  @JSName("verify")
  def verify_false(jwt: String, key: KeyStore, options: VerifyOptions[`false`]): js.Object = js.native
  @JSName("verify")
  def verify_true(jwt: String, key: Key, options: VerifyOptions[`true`]): completeResult = js.native
  @JSName("verify")
  def verify_true(jwt: String, key: KeyStore, options: VerifyOptions[`true`]): completeResult = js.native
}


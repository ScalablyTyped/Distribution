package typings.nodeDashJose.nodeDashJoseMod

import typings.node.Buffer
import typings.nodeDashJose.Anon_Alg
import typings.nodeDashJose.Anon_Algorithms
import typings.nodeDashJose.Anon_AllowEmbeddedKey
import typings.nodeDashJose.Anon_Exp
import typings.nodeDashJose.nodeDashJoseMod.JWKNs.Key
import typings.nodeDashJose.nodeDashJoseMod.JWKNs.KeyStore
import typings.nodeDashJose.nodeDashJoseMod.JWSNs.BaseResult
import typings.nodeDashJose.nodeDashJoseMod.JWSNs.CreateSignResult
import typings.nodeDashJose.nodeDashJoseMod.JWSNs.Signer
import typings.nodeDashJose.nodeDashJoseMod.JWSNs.VerificationResult
import typings.nodeDashJose.nodeDashJoseMod.JWSNs.Verifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-jose", "JWS")
@js.native
object JWSNs extends js.Object {
  trait BaseResult extends js.Object {
    /**
      * the combined 'protected' and 'unprotected' header members
      */
    var header: js.Object
    /**
      * The key used to verify the signature
      */
    var key: Key
    /**
      * the signed content
      */
    var payload: Buffer
    var `protected`: js.Array[String]
  }
  
  trait CreateSignResult extends js.Object {
    var signResult: js.Object
  }
  
  trait Exp extends js.Object {
    def complete(jws: js.Any): js.Any
  }
  
  @js.native
  trait Signer extends js.Object {
    def `final`(): js.Promise[CreateSignResult] = js.native
    def update(input: String): this.type = js.native
    def update(input: String, encoding: String): this.type = js.native
    def update(input: Buffer): this.type = js.native
    def update(input: Buffer, encoding: String): this.type = js.native
  }
  
  trait VerificationResult extends BaseResult {
    /**
      * the verified signature
      */
    var signature: Buffer | String
  }
  
  @js.native
  trait Verifier extends js.Object {
    def verify(input: String): js.Promise[VerificationResult] = js.native
    def verify(input: String, opts: Anon_AllowEmbeddedKey): js.Promise[VerificationResult] = js.native
  }
  
  trait VerifyOptions extends js.Object {
    var algorithms: js.UndefOr[js.Array[String]] = js.undefined
    var allowEmbeddedKey: js.UndefOr[Boolean] = js.undefined
    var handlers: Anon_Exp
  }
  
  def createSign(keys: js.Array[Key]): Signer = js.native
  def createSign(keys: Key): Signer = js.native
  def createSign(options: Anon_Alg, key: js.Array[Key]): Signer = js.native
  def createSign(options: Anon_Alg, key: Key): Signer = js.native
  /**
    * Using a keystore.
    */
  def createVerify(): Verifier = js.native
  def createVerify(input: String): Verifier = js.native
  def createVerify(input: String, opts: Anon_Algorithms): Verifier = js.native
  def createVerify(input: js.Object): Verifier = js.native
  def createVerify(input: js.Object, opts: Anon_Algorithms): Verifier = js.native
  def createVerify(input: Key): Verifier = js.native
  def createVerify(input: KeyStore): Verifier = js.native
  def createVerify(input: KeyStore, opts: Anon_Algorithms): Verifier = js.native
  def createVerify(input: Key, opts: Anon_Algorithms): Verifier = js.native
}


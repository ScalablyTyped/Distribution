package typings
package nodeDashJoseLib.nodeDashJoseMod

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
    var key: nodeDashJoseLib.nodeDashJoseMod.JWKNs.Key
    /**
      * the signed content
      */
    var payload: nodeLib.Buffer
    var `protected`: js.Array[java.lang.String]
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
    def update(input: java.lang.String): this.type = js.native
    def update(input: java.lang.String, encoding: java.lang.String): this.type = js.native
    def update(input: nodeLib.Buffer): this.type = js.native
    def update(input: nodeLib.Buffer, encoding: java.lang.String): this.type = js.native
  }
  
  trait VerificationResult extends BaseResult {
    /**
      * the verified signature
      */
    var signature: nodeLib.Buffer | java.lang.String
  }
  
  @js.native
  trait Verifier extends js.Object {
    def verify(input: java.lang.String): js.Promise[VerificationResult] = js.native
    def verify(input: java.lang.String, opts: nodeDashJoseLib.Anon_AllowEmbeddedKey): js.Promise[VerificationResult] = js.native
  }
  
  trait VerifyOptions extends js.Object {
    var algorithms: js.UndefOr[js.Array[java.lang.String]] = js.undefined
    var allowEmbeddedKey: js.UndefOr[scala.Boolean] = js.undefined
    var handlers: nodeDashJoseLib.Anon_Exp
  }
  
  def createSign(keys: js.Array[nodeDashJoseLib.nodeDashJoseMod.JWKNs.Key]): Signer = js.native
  def createSign(keys: nodeDashJoseLib.nodeDashJoseMod.JWKNs.Key): Signer = js.native
  def createSign(options: nodeDashJoseLib.Anon_Alg, key: js.Array[nodeDashJoseLib.nodeDashJoseMod.JWKNs.Key]): Signer = js.native
  def createSign(options: nodeDashJoseLib.Anon_Alg, key: nodeDashJoseLib.nodeDashJoseMod.JWKNs.Key): Signer = js.native
  /**
    * Using a keystore.
    */
  def createVerify(): Verifier = js.native
  def createVerify(input: java.lang.String): Verifier = js.native
  def createVerify(input: java.lang.String, opts: nodeDashJoseLib.Anon_Algorithms): Verifier = js.native
  def createVerify(input: js.Object): Verifier = js.native
  def createVerify(input: js.Object, opts: nodeDashJoseLib.Anon_Algorithms): Verifier = js.native
  def createVerify(input: nodeDashJoseLib.nodeDashJoseMod.JWKNs.Key): Verifier = js.native
  def createVerify(input: nodeDashJoseLib.nodeDashJoseMod.JWKNs.KeyStore): Verifier = js.native
  def createVerify(input: nodeDashJoseLib.nodeDashJoseMod.JWKNs.KeyStore, opts: nodeDashJoseLib.Anon_Algorithms): Verifier = js.native
  def createVerify(input: nodeDashJoseLib.nodeDashJoseMod.JWKNs.Key, opts: nodeDashJoseLib.Anon_Algorithms): Verifier = js.native
}


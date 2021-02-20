package typings.nodeJose.mod

import typings.node.Buffer
import typings.nodeJose.anon.Alg
import typings.nodeJose.anon.Algorithms
import typings.nodeJose.anon.AllowEmbeddedKey
import typings.nodeJose.mod.JWK.Key
import typings.nodeJose.mod.JWK.KeyStore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JWS {
  
  @JSImport("node-jose", "JWS.createSign")
  @js.native
  def createSign(keys: js.Array[Key]): Signer = js.native
  @JSImport("node-jose", "JWS.createSign")
  @js.native
  def createSign(keys: Key): Signer = js.native
  @JSImport("node-jose", "JWS.createSign")
  @js.native
  def createSign(options: Alg, key: js.Array[Key]): Signer = js.native
  @JSImport("node-jose", "JWS.createSign")
  @js.native
  def createSign(options: Alg, key: Key): Signer = js.native
  
  /**
    * Using a keystore.
    */
  @JSImport("node-jose", "JWS.createVerify")
  @js.native
  def createVerify(): Verifier = js.native
  @JSImport("node-jose", "JWS.createVerify")
  @js.native
  def createVerify(input: js.UndefOr[scala.Nothing], opts: Algorithms): Verifier = js.native
  @JSImport("node-jose", "JWS.createVerify")
  @js.native
  def createVerify(input: String): Verifier = js.native
  @JSImport("node-jose", "JWS.createVerify")
  @js.native
  def createVerify(input: String, opts: Algorithms): Verifier = js.native
  @JSImport("node-jose", "JWS.createVerify")
  @js.native
  def createVerify(input: js.Object): Verifier = js.native
  @JSImport("node-jose", "JWS.createVerify")
  @js.native
  def createVerify(input: js.Object, opts: Algorithms): Verifier = js.native
  @JSImport("node-jose", "JWS.createVerify")
  @js.native
  def createVerify(input: Key): Verifier = js.native
  @JSImport("node-jose", "JWS.createVerify")
  @js.native
  def createVerify(input: KeyStore): Verifier = js.native
  @JSImport("node-jose", "JWS.createVerify")
  @js.native
  def createVerify(input: KeyStore, opts: Algorithms): Verifier = js.native
  @JSImport("node-jose", "JWS.createVerify")
  @js.native
  def createVerify(input: Key, opts: Algorithms): Verifier = js.native
  
  @js.native
  trait BaseResult extends StObject {
    
    /**
      * the combined 'protected' and 'unprotected' header members
      */
    var header: js.Object = js.native
    
    /**
      * The key used to verify the signature
      */
    var key: Key = js.native
    
    /**
      * the signed content
      */
    var payload: Buffer = js.native
    
    var `protected`: js.Array[String] = js.native
  }
  object BaseResult {
    
    @scala.inline
    def apply(header: js.Object, key: Key, payload: Buffer, `protected`: js.Array[String]): BaseResult = {
      val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("protected")(`protected`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseResult]
    }
    
    @scala.inline
    implicit class BaseResultMutableBuilder[Self <: BaseResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeader(value: js.Object): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayload(value: Buffer): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtected(value: js.Array[String]): Self = StObject.set(x, "protected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtectedVarargs(value: String*): Self = StObject.set(x, "protected", js.Array(value :_*))
    }
  }
  
  @js.native
  trait CreateSignResult extends StObject {
    
    var signResult: js.Object = js.native
  }
  object CreateSignResult {
    
    @scala.inline
    def apply(signResult: js.Object): CreateSignResult = {
      val __obj = js.Dynamic.literal(signResult = signResult.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateSignResult]
    }
    
    @scala.inline
    implicit class CreateSignResultMutableBuilder[Self <: CreateSignResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSignResult(value: js.Object): Self = StObject.set(x, "signResult", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Exp extends StObject {
    
    def complete(jws: js.Any): js.Any = js.native
  }
  object Exp {
    
    @scala.inline
    def apply(complete: js.Any => js.Any): Exp = {
      val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete))
      __obj.asInstanceOf[Exp]
    }
    
    @scala.inline
    implicit class ExpMutableBuilder[Self <: Exp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComplete(value: js.Any => js.Any): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Signer extends StObject {
    
    def `final`(): js.Promise[CreateSignResult] = js.native
    
    def update(input: String): this.type = js.native
    def update(input: String, encoding: String): this.type = js.native
    def update(input: Buffer): this.type = js.native
    def update(input: Buffer, encoding: String): this.type = js.native
  }
  
  @js.native
  trait VerificationResult extends BaseResult {
    
    /**
      * the verified signature
      */
    var signature: Buffer | String = js.native
  }
  object VerificationResult {
    
    @scala.inline
    def apply(
      header: js.Object,
      key: Key,
      payload: Buffer,
      `protected`: js.Array[String],
      signature: Buffer | String
    ): VerificationResult = {
      val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
      __obj.updateDynamic("protected")(`protected`.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerificationResult]
    }
    
    @scala.inline
    implicit class VerificationResultMutableBuilder[Self <: VerificationResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSignature(value: Buffer | String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Verifier extends StObject {
    
    def verify(input: String): js.Promise[VerificationResult] = js.native
    def verify(input: String, opts: AllowEmbeddedKey): js.Promise[VerificationResult] = js.native
  }
  
  @js.native
  trait VerifyOptions extends StObject {
    
    var algorithms: js.UndefOr[js.Array[String]] = js.native
    
    var allowEmbeddedKey: js.UndefOr[Boolean] = js.native
    
    var handlers: typings.nodeJose.anon.Exp = js.native
  }
  object VerifyOptions {
    
    @scala.inline
    def apply(handlers: typings.nodeJose.anon.Exp): VerifyOptions = {
      val __obj = js.Dynamic.literal(handlers = handlers.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerifyOptions]
    }
    
    @scala.inline
    implicit class VerifyOptionsMutableBuilder[Self <: VerifyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlgorithms(value: js.Array[String]): Self = StObject.set(x, "algorithms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlgorithmsUndefined: Self = StObject.set(x, "algorithms", js.undefined)
      
      @scala.inline
      def setAlgorithmsVarargs(value: String*): Self = StObject.set(x, "algorithms", js.Array(value :_*))
      
      @scala.inline
      def setAllowEmbeddedKey(value: Boolean): Self = StObject.set(x, "allowEmbeddedKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowEmbeddedKeyUndefined: Self = StObject.set(x, "allowEmbeddedKey", js.undefined)
      
      @scala.inline
      def setHandlers(value: typings.nodeJose.anon.Exp): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
    }
  }
}

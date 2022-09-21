package typings.nodeJose.mod

import typings.node.bufferMod.global.Buffer
import typings.nodeJose.anon.Algorithms
import typings.nodeJose.anon.AllowEmbeddedKey
import typings.nodeJose.mod.JWK.Key
import typings.nodeJose.mod.JWK.KeyStore
import typings.nodeJose.nodeJoseStrings.compact
import typings.nodeJose.nodeJoseStrings.flattened
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JWS {
  
  @JSImport("node-jose", "JWS")
  @js.native
  val ^ : js.Any = js.native
  
  inline def createSign(keys: js.Array[Key]): Signer = ^.asInstanceOf[js.Dynamic].applyDynamic("createSign")(keys.asInstanceOf[js.Any]).asInstanceOf[Signer]
  inline def createSign(keys: Key): Signer = ^.asInstanceOf[js.Dynamic].applyDynamic("createSign")(keys.asInstanceOf[js.Any]).asInstanceOf[Signer]
  inline def createSign(options: SignOptions, key: js.Array[Key]): Signer = (^.asInstanceOf[js.Dynamic].applyDynamic("createSign")(options.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Signer]
  inline def createSign(options: SignOptions, key: Key): Signer = (^.asInstanceOf[js.Dynamic].applyDynamic("createSign")(options.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Signer]
  
  /**
    * Using a keystore.
    */
  inline def createVerify(): Verifier = ^.asInstanceOf[js.Dynamic].applyDynamic("createVerify")().asInstanceOf[Verifier]
  inline def createVerify(input: String): Verifier = ^.asInstanceOf[js.Dynamic].applyDynamic("createVerify")(input.asInstanceOf[js.Any]).asInstanceOf[Verifier]
  inline def createVerify(input: String, opts: Algorithms): Verifier = (^.asInstanceOf[js.Dynamic].applyDynamic("createVerify")(input.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Verifier]
  inline def createVerify(input: js.Object): Verifier = ^.asInstanceOf[js.Dynamic].applyDynamic("createVerify")(input.asInstanceOf[js.Any]).asInstanceOf[Verifier]
  inline def createVerify(input: js.Object, opts: Algorithms): Verifier = (^.asInstanceOf[js.Dynamic].applyDynamic("createVerify")(input.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Verifier]
  inline def createVerify(input: Unit, opts: Algorithms): Verifier = (^.asInstanceOf[js.Dynamic].applyDynamic("createVerify")(input.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Verifier]
  inline def createVerify(input: Key): Verifier = ^.asInstanceOf[js.Dynamic].applyDynamic("createVerify")(input.asInstanceOf[js.Any]).asInstanceOf[Verifier]
  inline def createVerify(input: KeyStore): Verifier = ^.asInstanceOf[js.Dynamic].applyDynamic("createVerify")(input.asInstanceOf[js.Any]).asInstanceOf[Verifier]
  inline def createVerify(input: KeyStore, opts: Algorithms): Verifier = (^.asInstanceOf[js.Dynamic].applyDynamic("createVerify")(input.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Verifier]
  inline def createVerify(input: Key, opts: Algorithms): Verifier = (^.asInstanceOf[js.Dynamic].applyDynamic("createVerify")(input.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Verifier]
  
  trait BaseResult extends StObject {
    
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
  object BaseResult {
    
    inline def apply(header: js.Object, key: Key, payload: Buffer, `protected`: js.Array[String]): BaseResult = {
      val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("protected")(`protected`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseResult]
    }
    
    extension [Self <: BaseResult](x: Self) {
      
      inline def setHeader(value: js.Object): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setPayload(value: Buffer): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setProtected(value: js.Array[String]): Self = StObject.set(x, "protected", value.asInstanceOf[js.Any])
      
      inline def setProtectedVarargs(value: String*): Self = StObject.set(x, "protected", js.Array(value*))
    }
  }
  
  trait CreateSignResult extends StObject {
    
    var signResult: js.Object
  }
  object CreateSignResult {
    
    inline def apply(signResult: js.Object): CreateSignResult = {
      val __obj = js.Dynamic.literal(signResult = signResult.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateSignResult]
    }
    
    extension [Self <: CreateSignResult](x: Self) {
      
      inline def setSignResult(value: js.Object): Self = StObject.set(x, "signResult", value.asInstanceOf[js.Any])
    }
  }
  
  trait Exp extends StObject {
    
    def complete(jws: Any): Any
  }
  object Exp {
    
    inline def apply(complete: Any => Any): Exp = {
      val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete))
      __obj.asInstanceOf[Exp]
    }
    
    extension [Self <: Exp](x: Self) {
      
      inline def setComplete(value: Any => Any): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    }
  }
  
  trait SignOptions extends StObject {
    
    var alg: js.UndefOr[String] = js.undefined
    
    var compact: js.UndefOr[Boolean] = js.undefined
    
    var fields: js.UndefOr[js.Object] = js.undefined
    
    var format: js.UndefOr[compact | flattened] = js.undefined
  }
  object SignOptions {
    
    inline def apply(): SignOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SignOptions]
    }
    
    extension [Self <: SignOptions](x: Self) {
      
      inline def setAlg(value: String): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
      
      inline def setAlgUndefined: Self = StObject.set(x, "alg", js.undefined)
      
      inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      inline def setFields(value: js.Object): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setFormat(value: compact | flattened): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
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
  
  trait VerificationResult
    extends StObject
       with BaseResult {
    
    /**
      * the verified signature
      */
    var signature: Buffer | String
  }
  object VerificationResult {
    
    inline def apply(
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
    
    extension [Self <: VerificationResult](x: Self) {
      
      inline def setSignature(value: Buffer | String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Verifier extends StObject {
    
    def verify(input: String): js.Promise[VerificationResult] = js.native
    def verify(input: String, opts: AllowEmbeddedKey): js.Promise[VerificationResult] = js.native
  }
  
  trait VerifyOptions extends StObject {
    
    var algorithms: js.UndefOr[js.Array[String]] = js.undefined
    
    var allowEmbeddedKey: js.UndefOr[Boolean] = js.undefined
    
    var handlers: typings.nodeJose.anon.Exp
  }
  object VerifyOptions {
    
    inline def apply(handlers: typings.nodeJose.anon.Exp): VerifyOptions = {
      val __obj = js.Dynamic.literal(handlers = handlers.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerifyOptions]
    }
    
    extension [Self <: VerifyOptions](x: Self) {
      
      inline def setAlgorithms(value: js.Array[String]): Self = StObject.set(x, "algorithms", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmsUndefined: Self = StObject.set(x, "algorithms", js.undefined)
      
      inline def setAlgorithmsVarargs(value: String*): Self = StObject.set(x, "algorithms", js.Array(value*))
      
      inline def setAllowEmbeddedKey(value: Boolean): Self = StObject.set(x, "allowEmbeddedKey", value.asInstanceOf[js.Any])
      
      inline def setAllowEmbeddedKeyUndefined: Self = StObject.set(x, "allowEmbeddedKey", js.undefined)
      
      inline def setHandlers(value: typings.nodeJose.anon.Exp): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
    }
  }
}

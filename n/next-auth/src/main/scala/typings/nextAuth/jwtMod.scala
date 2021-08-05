package typings.nextAuth

import typings.jose.mod.JWE.DecryptOptions
import typings.jose.mod.JWT.SignOptions
import typings.jose.mod.JWT.VerifyOptions
import typings.nextAuth.anon.CookieName
import typings.nextAuth.anon.JWTDecodeParamstokenstrin
import typings.nextAuth.anon.reqNextApiRequestsecureCo
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jwtMod {
  
  @JSImport("next-auth/jwt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(): js.Promise[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")().asInstanceOf[js.Promise[js.Object]]
  inline def decode(args: JWTDecodeParamstokenstrin): js.Promise[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Object]]
  
  inline def encode(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")().asInstanceOf[js.Promise[String]]
  inline def encode(args: JWTEncodeParams): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def getToken(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getToken")().asInstanceOf[js.Promise[String]]
  inline def getToken(args: CookieName): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getToken")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def getToken(args: reqNextApiRequestsecureCo): js.Promise[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("getToken")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Object]]
  
  trait JWTDecodeParams extends StObject {
    
    var decryptionKey: js.UndefOr[String] = js.undefined
    
    var decryptionOptions: js.UndefOr[DecryptOptions] = js.undefined
    
    var encryption: js.UndefOr[Boolean] = js.undefined
    
    var encryptionKey: js.UndefOr[String] = js.undefined
    
    var maxAge: js.UndefOr[Double] = js.undefined
    
    var secret: String | Buffer
    
    var signingKey: js.UndefOr[String] = js.undefined
    
    var token: js.UndefOr[String] = js.undefined
    
    var verificationKey: js.UndefOr[String] = js.undefined
    
    var verificationOptions: js.UndefOr[VerifyOptions] = js.undefined
  }
  object JWTDecodeParams {
    
    inline def apply(secret: String | Buffer): JWTDecodeParams = {
      val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any])
      __obj.asInstanceOf[JWTDecodeParams]
    }
    
    extension [Self <: JWTDecodeParams](x: Self) {
      
      inline def setDecryptionKey(value: String): Self = StObject.set(x, "decryptionKey", value.asInstanceOf[js.Any])
      
      inline def setDecryptionKeyUndefined: Self = StObject.set(x, "decryptionKey", js.undefined)
      
      inline def setDecryptionOptions(value: DecryptOptions): Self = StObject.set(x, "decryptionOptions", value.asInstanceOf[js.Any])
      
      inline def setDecryptionOptionsUndefined: Self = StObject.set(x, "decryptionOptions", js.undefined)
      
      inline def setEncryption(value: Boolean): Self = StObject.set(x, "encryption", value.asInstanceOf[js.Any])
      
      inline def setEncryptionKey(value: String): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
      
      inline def setEncryptionKeyUndefined: Self = StObject.set(x, "encryptionKey", js.undefined)
      
      inline def setEncryptionUndefined: Self = StObject.set(x, "encryption", js.undefined)
      
      inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      inline def setSecret(value: String | Buffer): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      inline def setSigningKey(value: String): Self = StObject.set(x, "signingKey", value.asInstanceOf[js.Any])
      
      inline def setSigningKeyUndefined: Self = StObject.set(x, "signingKey", js.undefined)
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      
      inline def setVerificationKey(value: String): Self = StObject.set(x, "verificationKey", value.asInstanceOf[js.Any])
      
      inline def setVerificationKeyUndefined: Self = StObject.set(x, "verificationKey", js.undefined)
      
      inline def setVerificationOptions(value: VerifyOptions): Self = StObject.set(x, "verificationOptions", value.asInstanceOf[js.Any])
      
      inline def setVerificationOptionsUndefined: Self = StObject.set(x, "verificationOptions", js.undefined)
    }
  }
  
  trait JWTEncodeParams extends StObject {
    
    var encryption: js.UndefOr[Boolean] = js.undefined
    
    var encryptionKey: js.UndefOr[String] = js.undefined
    
    var encryptionOptions: js.UndefOr[js.Object] = js.undefined
    
    var maxAge: js.UndefOr[Double] = js.undefined
    
    var secret: String | Buffer
    
    var signingKey: js.UndefOr[String] = js.undefined
    
    var signingOptions: js.UndefOr[SignOptions] = js.undefined
    
    var token: js.UndefOr[js.Object] = js.undefined
  }
  object JWTEncodeParams {
    
    inline def apply(secret: String | Buffer): JWTEncodeParams = {
      val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any])
      __obj.asInstanceOf[JWTEncodeParams]
    }
    
    extension [Self <: JWTEncodeParams](x: Self) {
      
      inline def setEncryption(value: Boolean): Self = StObject.set(x, "encryption", value.asInstanceOf[js.Any])
      
      inline def setEncryptionKey(value: String): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
      
      inline def setEncryptionKeyUndefined: Self = StObject.set(x, "encryptionKey", js.undefined)
      
      inline def setEncryptionOptions(value: js.Object): Self = StObject.set(x, "encryptionOptions", value.asInstanceOf[js.Any])
      
      inline def setEncryptionOptionsUndefined: Self = StObject.set(x, "encryptionOptions", js.undefined)
      
      inline def setEncryptionUndefined: Self = StObject.set(x, "encryption", js.undefined)
      
      inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      inline def setSecret(value: String | Buffer): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      inline def setSigningKey(value: String): Self = StObject.set(x, "signingKey", value.asInstanceOf[js.Any])
      
      inline def setSigningKeyUndefined: Self = StObject.set(x, "signingKey", js.undefined)
      
      inline def setSigningOptions(value: SignOptions): Self = StObject.set(x, "signingOptions", value.asInstanceOf[js.Any])
      
      inline def setSigningOptionsUndefined: Self = StObject.set(x, "signingOptions", js.undefined)
      
      inline def setToken(value: js.Object): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    }
  }
}

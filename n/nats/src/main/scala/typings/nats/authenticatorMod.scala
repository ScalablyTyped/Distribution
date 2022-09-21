package typings.nats

import typings.nats.typesMod.ConnectionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authenticatorMod {
  
  @JSImport("nats/lib/nats-base-client/authenticator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildAuthenticator(opts: ConnectionOptions): Authenticator = ^.asInstanceOf[js.Dynamic].applyDynamic("buildAuthenticator")(opts.asInstanceOf[js.Any]).asInstanceOf[Authenticator]
  
  inline def credsAuthenticator(creds: js.typedarray.Uint8Array): Authenticator = ^.asInstanceOf[js.Dynamic].applyDynamic("credsAuthenticator")(creds.asInstanceOf[js.Any]).asInstanceOf[Authenticator]
  
  inline def jwtAuthenticator(ajwt: String): Authenticator = ^.asInstanceOf[js.Dynamic].applyDynamic("jwtAuthenticator")(ajwt.asInstanceOf[js.Any]).asInstanceOf[Authenticator]
  inline def jwtAuthenticator(ajwt: String, seed: js.Function0[js.typedarray.Uint8Array]): Authenticator = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtAuthenticator")(ajwt.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Authenticator]
  inline def jwtAuthenticator(ajwt: String, seed: js.typedarray.Uint8Array): Authenticator = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtAuthenticator")(ajwt.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Authenticator]
  inline def jwtAuthenticator(ajwt: js.Function0[String]): Authenticator = ^.asInstanceOf[js.Dynamic].applyDynamic("jwtAuthenticator")(ajwt.asInstanceOf[js.Any]).asInstanceOf[Authenticator]
  inline def jwtAuthenticator(ajwt: js.Function0[String], seed: js.Function0[js.typedarray.Uint8Array]): Authenticator = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtAuthenticator")(ajwt.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Authenticator]
  inline def jwtAuthenticator(ajwt: js.Function0[String], seed: js.typedarray.Uint8Array): Authenticator = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtAuthenticator")(ajwt.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Authenticator]
  
  inline def nkeyAuthenticator(): Authenticator = ^.asInstanceOf[js.Dynamic].applyDynamic("nkeyAuthenticator")().asInstanceOf[Authenticator]
  inline def nkeyAuthenticator(seed: js.Function0[js.typedarray.Uint8Array]): Authenticator = ^.asInstanceOf[js.Dynamic].applyDynamic("nkeyAuthenticator")(seed.asInstanceOf[js.Any]).asInstanceOf[Authenticator]
  inline def nkeyAuthenticator(seed: js.typedarray.Uint8Array): Authenticator = ^.asInstanceOf[js.Dynamic].applyDynamic("nkeyAuthenticator")(seed.asInstanceOf[js.Any]).asInstanceOf[Authenticator]
  
  inline def noAuthFn(): Authenticator = ^.asInstanceOf[js.Dynamic].applyDynamic("noAuthFn")().asInstanceOf[Authenticator]
  
  inline def tokenAuthenticator(token: String): Authenticator = ^.asInstanceOf[js.Dynamic].applyDynamic("tokenAuthenticator")(token.asInstanceOf[js.Any]).asInstanceOf[Authenticator]
  
  inline def usernamePasswordAuthenticator(user: String): Authenticator = ^.asInstanceOf[js.Dynamic].applyDynamic("usernamePasswordAuthenticator")(user.asInstanceOf[js.Any]).asInstanceOf[Authenticator]
  inline def usernamePasswordAuthenticator(user: String, pass: String): Authenticator = (^.asInstanceOf[js.Dynamic].applyDynamic("usernamePasswordAuthenticator")(user.asInstanceOf[js.Any], pass.asInstanceOf[js.Any])).asInstanceOf[Authenticator]
  
  /* Rewritten from type alias, can be one of: 
    - typings.nats.authenticatorMod.NoAuth
    - typings.nats.authenticatorMod.TokenAuth
    - typings.nats.authenticatorMod.UserPass
    - typings.nats.authenticatorMod.NKeyAuth
    - typings.nats.authenticatorMod.JwtAuth
  */
  type Auth = _Auth | NoAuth
  
  type Authenticator = js.Function1[/* nonce */ js.UndefOr[String], Auth]
  
  trait JwtAuth
    extends StObject
       with _Auth {
    
    var jwt: String
    
    var nkey: js.UndefOr[String] = js.undefined
    
    var sig: js.UndefOr[String] = js.undefined
  }
  object JwtAuth {
    
    inline def apply(jwt: String): JwtAuth = {
      val __obj = js.Dynamic.literal(jwt = jwt.asInstanceOf[js.Any])
      __obj.asInstanceOf[JwtAuth]
    }
    
    extension [Self <: JwtAuth](x: Self) {
      
      inline def setJwt(value: String): Self = StObject.set(x, "jwt", value.asInstanceOf[js.Any])
      
      inline def setNkey(value: String): Self = StObject.set(x, "nkey", value.asInstanceOf[js.Any])
      
      inline def setNkeyUndefined: Self = StObject.set(x, "nkey", js.undefined)
      
      inline def setSig(value: String): Self = StObject.set(x, "sig", value.asInstanceOf[js.Any])
      
      inline def setSigUndefined: Self = StObject.set(x, "sig", js.undefined)
    }
  }
  
  trait NKeyAuth
    extends StObject
       with _Auth {
    
    var nkey: String
    
    var sig: String
  }
  object NKeyAuth {
    
    inline def apply(nkey: String, sig: String): NKeyAuth = {
      val __obj = js.Dynamic.literal(nkey = nkey.asInstanceOf[js.Any], sig = sig.asInstanceOf[js.Any])
      __obj.asInstanceOf[NKeyAuth]
    }
    
    extension [Self <: NKeyAuth](x: Self) {
      
      inline def setNkey(value: String): Self = StObject.set(x, "nkey", value.asInstanceOf[js.Any])
      
      inline def setSig(value: String): Self = StObject.set(x, "sig", value.asInstanceOf[js.Any])
    }
  }
  
  type NoAuth = Unit
  
  trait TokenAuth
    extends StObject
       with _Auth {
    
    var auth_token: String
  }
  object TokenAuth {
    
    inline def apply(auth_token: String): TokenAuth = {
      val __obj = js.Dynamic.literal(auth_token = auth_token.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenAuth]
    }
    
    extension [Self <: TokenAuth](x: Self) {
      
      inline def setAuth_token(value: String): Self = StObject.set(x, "auth_token", value.asInstanceOf[js.Any])
    }
  }
  
  trait UserPass
    extends StObject
       with _Auth {
    
    var pass: js.UndefOr[String] = js.undefined
    
    var user: String
  }
  object UserPass {
    
    inline def apply(user: String): UserPass = {
      val __obj = js.Dynamic.literal(user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserPass]
    }
    
    extension [Self <: UserPass](x: Self) {
      
      inline def setPass(value: String): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
      
      inline def setPassUndefined: Self = StObject.set(x, "pass", js.undefined)
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  trait _Auth extends StObject
  object _Auth {
    
    inline def JwtAuth(jwt: String): typings.nats.authenticatorMod.JwtAuth = {
      val __obj = js.Dynamic.literal(jwt = jwt.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.nats.authenticatorMod.JwtAuth]
    }
    
    inline def NKeyAuth(nkey: String, sig: String): typings.nats.authenticatorMod.NKeyAuth = {
      val __obj = js.Dynamic.literal(nkey = nkey.asInstanceOf[js.Any], sig = sig.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.nats.authenticatorMod.NKeyAuth]
    }
    
    inline def TokenAuth(auth_token: String): typings.nats.authenticatorMod.TokenAuth = {
      val __obj = js.Dynamic.literal(auth_token = auth_token.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.nats.authenticatorMod.TokenAuth]
    }
    
    inline def UserPass(user: String): typings.nats.authenticatorMod.UserPass = {
      val __obj = js.Dynamic.literal(user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.nats.authenticatorMod.UserPass]
    }
  }
}

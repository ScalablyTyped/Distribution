package typings.openidClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CustomHttpOptionsProvider = js.Function1[
    /* options */ typings.openidClient.mod.HttpOptions, 
    typings.openidClient.mod.HttpOptions
  ]
  
  type DPoPInput = typings.node.cryptoMod.KeyObject | typings.node.cryptoMod.PrivateKeyInput | typings.jose.mod.JWKRSAKey | typings.jose.mod.JWKECKey | typings.jose.mod.JWKOKPKey
  
  type HttpOptions = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GotOptions */ js.Any
  
  type RetryFunction = js.Function2[/* retry */ scala.Double, /* error */ typings.std.Error, scala.Double]
  
  type StrategyVerifyCallback[TUser] = js.Function2[
    /* tokenset */ typings.openidClient.mod.TokenSet, 
    /* done */ js.Function2[/* err */ js.Any, /* user */ js.UndefOr[TUser], scala.Unit], 
    scala.Unit
  ]
  
  type StrategyVerifyCallbackReq[TUser] = js.Function3[
    /* req */ typings.node.httpMod.IncomingMessage, 
    /* tokenset */ typings.openidClient.mod.TokenSet, 
    /* done */ js.Function2[/* err */ js.Any, /* user */ js.UndefOr[TUser], scala.Unit], 
    scala.Unit
  ]
  
  type StrategyVerifyCallbackReqUserInfo[TUser] = js.Function4[
    /* req */ typings.node.httpMod.IncomingMessage, 
    /* tokenset */ typings.openidClient.mod.TokenSet, 
    /* userinfo */ typings.openidClient.mod.UserinfoResponse, 
    /* done */ js.Function2[/* err */ js.Any, /* user */ js.UndefOr[TUser], scala.Unit], 
    scala.Unit
  ]
  
  type StrategyVerifyCallbackUserInfo[TUser] = js.Function3[
    /* tokenset */ typings.openidClient.mod.TokenSet, 
    /* userinfo */ typings.openidClient.mod.UserinfoResponse, 
    /* done */ js.Function2[/* err */ js.Any, /* user */ js.UndefOr[TUser], scala.Unit], 
    scala.Unit
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.openidClient.openidClientStrings.access_token
    - typings.openidClient.openidClientStrings.refresh_token
    - java.lang.String
  */
  type TokenTypeHint = typings.openidClient.mod._TokenTypeHint | java.lang.String
}

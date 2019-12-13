package typings.openidDashClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object openidDashClientMod {
  import typings.got.gotMod.GotOptions
  import typings.node.httpMod.IncomingMessage
  import typings.std.Error

  type CustomHttpOptionsProvider = js.Function1[/* options */ HttpOptions, HttpOptions]
  type HttpOptions = GotOptions[String | Null]
  type RetryFunction = js.Function2[/* retry */ Double, /* error */ Error, Double]
  type StrategyVerifyCallback[TUser] = js.Function2[
    /* tokenset */ TokenSet, 
    /* done */ js.Function2[/* err */ js.Any, /* user */ js.UndefOr[TUser], Unit], 
    Unit
  ]
  type StrategyVerifyCallbackReq[TUser] = js.Function3[
    /* req */ IncomingMessage, 
    /* tokenset */ TokenSet, 
    /* done */ js.Function2[/* err */ js.Any, /* user */ js.UndefOr[TUser], Unit], 
    Unit
  ]
  type StrategyVerifyCallbackReqUserInfo[TUser] = js.Function4[
    /* req */ IncomingMessage, 
    /* tokenset */ TokenSet, 
    /* userinfo */ UserinfoResponse, 
    /* done */ js.Function2[/* err */ js.Any, /* user */ js.UndefOr[TUser], Unit], 
    Unit
  ]
  type StrategyVerifyCallbackUserInfo[TUser] = js.Function3[
    /* tokenset */ TokenSet, 
    /* userinfo */ UserinfoResponse, 
    /* done */ js.Function2[/* err */ js.Any, /* user */ js.UndefOr[TUser], Unit], 
    Unit
  ]
  /* Rewritten from type alias, can be one of: 
    - typings.openidDashClient.openidDashClientStrings.access_token
    - typings.openidDashClient.openidDashClientStrings.refresh_token
    - java.lang.String
  */
  type TokenTypeHint = _TokenTypeHint | String
}

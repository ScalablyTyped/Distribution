package typings.passportDashAzureDashAd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object oidcDashStrategyMod {
  import typings.express.expressMod.Request
  import typings.passportDashAzureDashAd.commonMod.VerifyCallback

  type VerifyOIDCFunction = (js.Function2[/* profile */ IProfile, /* done */ VerifyCallback, Unit]) | (js.Function3[/* iss */ String, /* sub */ String, /* done */ VerifyCallback, Unit]) | (js.Function4[
    /* iss */ String, 
    /* sub */ String, 
    /* profile */ IProfile, 
    /* done */ VerifyCallback, 
    Unit
  ]) | (js.Function6[
    /* iss */ String, 
    /* sub */ String, 
    /* profile */ IProfile, 
    /* access_token */ String, 
    /* refresh_token */ String, 
    /* done */ VerifyCallback, 
    Unit
  ]) | (js.Function7[
    /* iss */ String, 
    /* sub */ String, 
    /* profile */ IProfile, 
    /* access_token */ String, 
    /* refresh_token */ String, 
    /* params */ js.Any, 
    /* done */ VerifyCallback, 
    Unit
  ]) | (js.Function8[
    /* iss */ String, 
    /* sub */ String, 
    /* profile */ IProfile, 
    /* jwtClaims */ js.Any, 
    /* access_token */ String, 
    /* refresh_token */ String, 
    /* params */ js.Any, 
    /* done */ VerifyCallback, 
    Unit
  ])
  type VerifyOIDCFunctionWithReq = (js.Function3[/* req */ Request, /* profile */ IProfile, /* done */ VerifyCallback, Unit]) | (js.Function4[/* req */ Request, /* iss */ String, /* sub */ String, /* done */ VerifyCallback, Unit]) | (js.Function5[
    /* req */ Request, 
    /* iss */ String, 
    /* sub */ String, 
    /* profile */ IProfile, 
    /* done */ VerifyCallback, 
    Unit
  ]) | (js.Function7[
    /* req */ Request, 
    /* iss */ String, 
    /* sub */ String, 
    /* profile */ IProfile, 
    /* access_token */ String, 
    /* refresh_token */ String, 
    /* done */ VerifyCallback, 
    Unit
  ]) | (js.Function8[
    /* req */ Request, 
    /* iss */ String, 
    /* sub */ String, 
    /* profile */ IProfile, 
    /* access_token */ String, 
    /* refresh_token */ String, 
    /* params */ js.Any, 
    /* done */ VerifyCallback, 
    Unit
  ]) | (js.Function9[
    /* req */ Request, 
    /* iss */ String, 
    /* sub */ String, 
    /* profile */ IProfile, 
    /* jwtClaims */ js.Any, 
    /* access_token */ String, 
    /* refresh_token */ String, 
    /* params */ js.Any, 
    /* done */ VerifyCallback, 
    Unit
  ])
}

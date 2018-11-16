package typings
package passportDashAzureDashAdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object oidcDashStrategyMod {
  type VerifyOIDCFunction = (js.Function2[
    /* profile */ IProfile, 
    /* done */ passportDashAzureDashAdLib.commonMod.VerifyCallback, 
    scala.Unit
  ]) | (js.Function3[
    /* iss */ java.lang.String, 
    /* sub */ java.lang.String, 
    /* done */ passportDashAzureDashAdLib.commonMod.VerifyCallback, 
    scala.Unit
  ]) | (js.Function4[
    /* iss */ java.lang.String, 
    /* sub */ java.lang.String, 
    /* profile */ IProfile, 
    /* done */ passportDashAzureDashAdLib.commonMod.VerifyCallback, 
    scala.Unit
  ]) | (js.Function6[
    /* iss */ java.lang.String, 
    /* sub */ java.lang.String, 
    /* profile */ IProfile, 
    /* access_token */ java.lang.String, 
    /* refresh_token */ java.lang.String, 
    /* done */ passportDashAzureDashAdLib.commonMod.VerifyCallback, 
    scala.Unit
  ]) | (js.Function7[
    /* iss */ java.lang.String, 
    /* sub */ java.lang.String, 
    /* profile */ IProfile, 
    /* access_token */ java.lang.String, 
    /* refresh_token */ java.lang.String, 
    /* params */ js.Any, 
    /* done */ passportDashAzureDashAdLib.commonMod.VerifyCallback, 
    scala.Unit
  ]) | (js.Function8[
    /* iss */ java.lang.String, 
    /* sub */ java.lang.String, 
    /* profile */ IProfile, 
    /* jwtClaims */ js.Any, 
    /* access_token */ java.lang.String, 
    /* refresh_token */ java.lang.String, 
    /* params */ js.Any, 
    /* done */ passportDashAzureDashAdLib.commonMod.VerifyCallback, 
    scala.Unit
  ])
  type VerifyOIDCFunctionWithReq = (js.Function3[
    /* req */ expressLib.expressMod.eNs.Request, 
    /* profile */ IProfile, 
    /* done */ passportDashAzureDashAdLib.commonMod.VerifyCallback, 
    scala.Unit
  ]) | (js.Function4[
    /* req */ expressLib.expressMod.eNs.Request, 
    /* iss */ java.lang.String, 
    /* sub */ java.lang.String, 
    /* done */ passportDashAzureDashAdLib.commonMod.VerifyCallback, 
    scala.Unit
  ]) | (js.Function5[
    /* req */ expressLib.expressMod.eNs.Request, 
    /* iss */ java.lang.String, 
    /* sub */ java.lang.String, 
    /* profile */ IProfile, 
    /* done */ passportDashAzureDashAdLib.commonMod.VerifyCallback, 
    scala.Unit
  ]) | (js.Function7[
    /* req */ expressLib.expressMod.eNs.Request, 
    /* iss */ java.lang.String, 
    /* sub */ java.lang.String, 
    /* profile */ IProfile, 
    /* access_token */ java.lang.String, 
    /* refresh_token */ java.lang.String, 
    /* done */ passportDashAzureDashAdLib.commonMod.VerifyCallback, 
    scala.Unit
  ]) | (js.Function8[
    /* req */ expressLib.expressMod.eNs.Request, 
    /* iss */ java.lang.String, 
    /* sub */ java.lang.String, 
    /* profile */ IProfile, 
    /* access_token */ java.lang.String, 
    /* refresh_token */ java.lang.String, 
    /* params */ js.Any, 
    /* done */ passportDashAzureDashAdLib.commonMod.VerifyCallback, 
    scala.Unit
  ]) | (js.Function9[
    /* req */ expressLib.expressMod.eNs.Request, 
    /* iss */ java.lang.String, 
    /* sub */ java.lang.String, 
    /* profile */ IProfile, 
    /* jwtClaims */ js.Any, 
    /* access_token */ java.lang.String, 
    /* refresh_token */ java.lang.String, 
    /* params */ js.Any, 
    /* done */ passportDashAzureDashAdLib.commonMod.VerifyCallback, 
    scala.Unit
  ])
}

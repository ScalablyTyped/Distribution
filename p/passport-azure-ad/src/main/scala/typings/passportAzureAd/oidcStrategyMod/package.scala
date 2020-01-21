package typings.passportAzureAd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object oidcStrategyMod {
  type VerifyOIDCFunction = (js.Function2[
    /* profile */ typings.passportAzureAd.oidcStrategyMod.IProfile, 
    /* done */ typings.passportAzureAd.commonMod.VerifyCallback, 
    scala.Unit
  ]) | (js.Function3[
    /* iss */ java.lang.String, 
    /* sub */ java.lang.String, 
    /* done */ typings.passportAzureAd.commonMod.VerifyCallback, 
    scala.Unit
  ]) | (js.Function4[
    /* iss */ java.lang.String, 
    /* sub */ java.lang.String, 
    /* profile */ typings.passportAzureAd.oidcStrategyMod.IProfile, 
    /* done */ typings.passportAzureAd.commonMod.VerifyCallback, 
    scala.Unit
  ]) | (js.Function6[
    /* iss */ java.lang.String, 
    /* sub */ java.lang.String, 
    /* profile */ typings.passportAzureAd.oidcStrategyMod.IProfile, 
    /* access_token */ java.lang.String, 
    /* refresh_token */ java.lang.String, 
    /* done */ typings.passportAzureAd.commonMod.VerifyCallback, 
    scala.Unit
  ]) | (js.Function7[
    /* iss */ java.lang.String, 
    /* sub */ java.lang.String, 
    /* profile */ typings.passportAzureAd.oidcStrategyMod.IProfile, 
    /* access_token */ java.lang.String, 
    /* refresh_token */ java.lang.String, 
    /* params */ js.Any, 
    /* done */ typings.passportAzureAd.commonMod.VerifyCallback, 
    scala.Unit
  ]) | (js.Function8[
    /* iss */ java.lang.String, 
    /* sub */ java.lang.String, 
    /* profile */ typings.passportAzureAd.oidcStrategyMod.IProfile, 
    /* jwtClaims */ js.Any, 
    /* access_token */ java.lang.String, 
    /* refresh_token */ java.lang.String, 
    /* params */ js.Any, 
    /* done */ typings.passportAzureAd.commonMod.VerifyCallback, 
    scala.Unit
  ])
  type VerifyOIDCFunctionWithReq = (js.Function3[
    /* req */ typings.express.mod.Request_[typings.expressServeStaticCore.mod.ParamsDictionary], 
    /* profile */ typings.passportAzureAd.oidcStrategyMod.IProfile, 
    /* done */ typings.passportAzureAd.commonMod.VerifyCallback, 
    scala.Unit
  ]) | (js.Function4[
    /* req */ typings.express.mod.Request_[typings.expressServeStaticCore.mod.ParamsDictionary], 
    /* iss */ java.lang.String, 
    /* sub */ java.lang.String, 
    /* done */ typings.passportAzureAd.commonMod.VerifyCallback, 
    scala.Unit
  ]) | (js.Function5[
    /* req */ typings.express.mod.Request_[typings.expressServeStaticCore.mod.ParamsDictionary], 
    /* iss */ java.lang.String, 
    /* sub */ java.lang.String, 
    /* profile */ typings.passportAzureAd.oidcStrategyMod.IProfile, 
    /* done */ typings.passportAzureAd.commonMod.VerifyCallback, 
    scala.Unit
  ]) | (js.Function7[
    /* req */ typings.express.mod.Request_[typings.expressServeStaticCore.mod.ParamsDictionary], 
    /* iss */ java.lang.String, 
    /* sub */ java.lang.String, 
    /* profile */ typings.passportAzureAd.oidcStrategyMod.IProfile, 
    /* access_token */ java.lang.String, 
    /* refresh_token */ java.lang.String, 
    /* done */ typings.passportAzureAd.commonMod.VerifyCallback, 
    scala.Unit
  ]) | (js.Function8[
    /* req */ typings.express.mod.Request_[typings.expressServeStaticCore.mod.ParamsDictionary], 
    /* iss */ java.lang.String, 
    /* sub */ java.lang.String, 
    /* profile */ typings.passportAzureAd.oidcStrategyMod.IProfile, 
    /* access_token */ java.lang.String, 
    /* refresh_token */ java.lang.String, 
    /* params */ js.Any, 
    /* done */ typings.passportAzureAd.commonMod.VerifyCallback, 
    scala.Unit
  ]) | (js.Function9[
    /* req */ typings.express.mod.Request_[typings.expressServeStaticCore.mod.ParamsDictionary], 
    /* iss */ java.lang.String, 
    /* sub */ java.lang.String, 
    /* profile */ typings.passportAzureAd.oidcStrategyMod.IProfile, 
    /* jwtClaims */ js.Any, 
    /* access_token */ java.lang.String, 
    /* refresh_token */ java.lang.String, 
    /* params */ js.Any, 
    /* done */ typings.passportAzureAd.commonMod.VerifyCallback, 
    scala.Unit
  ])
}

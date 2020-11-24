package typings.passportAzureAd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object bearerStrategyMod {
  
  type VerifyBearerFunction = js.Function2[
    /* token */ typings.passportAzureAd.commonMod.ITokenPayload, 
    /* done */ typings.passportAzureAd.commonMod.VerifyCallback, 
    scala.Unit
  ]
  
  type VerifyBearerFunctionWithReq = js.Function3[
    /* req */ typings.express.mod.Request_[
      typings.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typings.expressServeStaticCore.mod.Query
    ], 
    /* token */ typings.passportAzureAd.commonMod.ITokenPayload, 
    /* done */ typings.passportAzureAd.commonMod.VerifyCallback, 
    scala.Unit
  ]
}

package typings.passportTwitchLatest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Optional[T, K /* <: /* keyof T */ java.lang.String */] = (typings.std.Omit[T, K]) with typings.std.Partial[T]
  
  type VerifyFunction = js.Function4[
    /* accessToken */ java.lang.String, 
    /* refreshToken */ java.lang.String, 
    /* profile */ typings.passportTwitchLatest.mod.TwitchProfile, 
    /* verified */ typings.passportOauth2.mod.VerifyCallback, 
    scala.Unit
  ]
  
  type VerifyFunctionWithRequest = js.Function5[
    /* req */ typings.express.mod.Request_[
      typings.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typings.expressServeStaticCore.mod.Query
    ], 
    /* accessToken */ java.lang.String, 
    /* refreshToken */ java.lang.String, 
    /* profile */ typings.passportTwitchLatest.mod.TwitchProfile, 
    /* verified */ typings.passportOauth2.mod.VerifyCallback, 
    scala.Unit
  ]
  
  type VerifyFunctionWithRequestResults = js.Function6[
    /* req */ typings.express.mod.Request_[
      typings.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typings.expressServeStaticCore.mod.Query
    ], 
    /* accessToken */ java.lang.String, 
    /* refreshToken */ java.lang.String, 
    /* results */ js.Any, 
    /* profile */ typings.passportTwitchLatest.mod.TwitchProfile, 
    /* verified */ typings.passportOauth2.mod.VerifyCallback, 
    scala.Unit
  ]
  
  type VerifyFunctionWithResults = js.Function5[
    /* accessToken */ java.lang.String, 
    /* refreshToken */ java.lang.String, 
    /* results */ js.Any, 
    /* profile */ typings.passportTwitchLatest.mod.TwitchProfile, 
    /* verified */ typings.passportOauth2.mod.VerifyCallback, 
    scala.Unit
  ]
}

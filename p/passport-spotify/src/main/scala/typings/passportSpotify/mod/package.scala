package typings.passportSpotify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type VerifyCallback = js.Function3[
    /* error */ js.UndefOr[typings.std.Error | scala.Null], 
    /* user */ js.UndefOr[js.Object], 
    /* info */ js.UndefOr[js.Object], 
    scala.Unit
  ]
  
  type VerifyFunction = js.Function5[
    /* accessToken */ java.lang.String, 
    /* refreshToken */ java.lang.String, 
    /* profile */ typings.passportSpotify.mod.Profile, 
    /* done */ typings.passportSpotify.mod.VerifyCallback, 
    /* expires_in */ js.UndefOr[scala.Double], 
    scala.Unit
  ]
  
  type VerifyFunctionWithRequest = js.Function6[
    /* req */ typings.express.mod.Request_[
      typings.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typings.expressServeStaticCore.mod.Query
    ], 
    /* accessToken */ java.lang.String, 
    /* refreshToken */ java.lang.String, 
    /* profile */ typings.passportSpotify.mod.Profile, 
    /* done */ typings.passportSpotify.mod.VerifyCallback, 
    /* expires_in */ js.UndefOr[scala.Double], 
    scala.Unit
  ]
}

package typings.passportApple

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AppleAuthorizationParams = js.Object with typings.passportApple.anon.Responsemode
  
  type Profile = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type VerifyCallback = js.Function3[
    /* err */ js.UndefOr[typings.std.Error | scala.Null], 
    /* user */ js.UndefOr[js.Object], 
    /* info */ js.UndefOr[js.Object], 
    scala.Unit
  ]
  
  type VerifyFunction = js.Function5[
    /* accessToken */ java.lang.String, 
    /* refreshToken */ java.lang.String, 
    /* decodedIdToken */ typings.passportApple.mod.DecodedIdToken, 
    /* profile */ typings.passportApple.mod.Profile, 
    /* verified */ typings.passportApple.mod.VerifyCallback, 
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
    /* decodedIdToken */ typings.passportApple.mod.DecodedIdToken, 
    /* profile */ typings.passportApple.mod.Profile, 
    /* verified */ typings.passportApple.mod.VerifyCallback, 
    scala.Unit
  ]
}

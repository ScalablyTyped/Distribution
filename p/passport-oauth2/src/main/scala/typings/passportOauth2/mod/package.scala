package typings.passportOauth2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type StateStoreStoreCallback = js.Function2[/* err */ typings.std.Error | scala.Null, /* state */ js.Any, scala.Unit]
  
  type StateStoreVerifyCallback = js.Function3[/* err */ typings.std.Error, /* ok */ scala.Boolean, /* state */ js.Any, scala.Unit]
  
  type Strategy = typings.passportOauth2.mod.OAuth2Strategy
  
  type VerifyCallback = js.Function3[
    /* err */ js.UndefOr[typings.std.Error | scala.Null], 
    /* user */ js.UndefOr[js.Object], 
    /* info */ js.UndefOr[js.Object], 
    scala.Unit
  ]
  
  type VerifyFunction = (js.Function4[
    /* accessToken */ java.lang.String, 
    /* refreshToken */ java.lang.String, 
    /* profile */ js.Any, 
    /* verified */ typings.passportOauth2.mod.VerifyCallback, 
    scala.Unit
  ]) | (js.Function5[
    /* accessToken */ java.lang.String, 
    /* refreshToken */ java.lang.String, 
    /* results */ js.Any, 
    /* profile */ js.Any, 
    /* verified */ typings.passportOauth2.mod.VerifyCallback, 
    scala.Unit
  ])
  
  type VerifyFunctionWithRequest = (js.Function5[
    /* req */ typings.express.mod.Request_[
      typings.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typings.expressServeStaticCore.mod.Query
    ], 
    /* accessToken */ java.lang.String, 
    /* refreshToken */ java.lang.String, 
    /* profile */ js.Any, 
    /* verified */ typings.passportOauth2.mod.VerifyCallback, 
    scala.Unit
  ]) | (js.Function6[
    /* req */ typings.express.mod.Request_[
      typings.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typings.expressServeStaticCore.mod.Query
    ], 
    /* accessToken */ java.lang.String, 
    /* refreshToken */ java.lang.String, 
    /* results */ js.Any, 
    /* profile */ js.Any, 
    /* verified */ typings.passportOauth2.mod.VerifyCallback, 
    scala.Unit
  ])
}

package typings.passportGoogleOauth2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type VerifyCallback = js.Function3[
    /* error */ js.Any, 
    /* user */ js.UndefOr[js.Any], 
    /* options */ js.UndefOr[typings.passportGoogleOauth2.mod.VerifyOptions], 
    scala.Unit
  ]
  type VerifyFunction = js.Function4[
    /* accessToken */ java.lang.String, 
    /* refreshToken */ java.lang.String, 
    /* profile */ js.Any, 
    /* done */ typings.passportGoogleOauth2.mod.VerifyCallback, 
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
    /* profile */ js.Any, 
    /* done */ typings.passportGoogleOauth2.mod.VerifyCallback, 
    scala.Unit
  ]
  type VerifyFunctionWithRequestAndParams = js.Function6[
    /* req */ typings.express.mod.Request_[
      typings.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typings.expressServeStaticCore.mod.Query
    ], 
    /* accessToken */ java.lang.String, 
    /* refreshToken */ java.lang.String, 
    /* params */ typings.passportGoogleOauth2.anon.Accesstoken, 
    /* profile */ js.Any, 
    /* done */ typings.passportGoogleOauth2.mod.VerifyCallback, 
    scala.Unit
  ]
}

package typings
package passportDashAuth0Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object passportDashAuth0Mod {
  type VerifyFunction = js.Function5[
    /* accessToken */ java.lang.String, 
    /* refreshToken */ java.lang.String, 
    /* extraParams */ ExtraVerificationParams, 
    /* profile */ Profile, 
    /* done */ js.Function3[
      /* error */ js.Any, 
      /* user */ js.UndefOr[js.Any], 
      /* info */ js.UndefOr[js.Any], 
      scala.Unit
    ], 
    scala.Unit
  ]
  type VerifyFunctionWithRequest = js.Function5[
    /* req */ expressLib.expressMod.eNs.Request, 
    /* accessToken */ java.lang.String, 
    /* refreshToken */ java.lang.String, 
    /* profile */ Profile, 
    /* done */ js.Function3[
      /* error */ js.Any, 
      /* user */ js.UndefOr[js.Any], 
      /* info */ js.UndefOr[js.Any], 
      scala.Unit
    ], 
    scala.Unit
  ]
}

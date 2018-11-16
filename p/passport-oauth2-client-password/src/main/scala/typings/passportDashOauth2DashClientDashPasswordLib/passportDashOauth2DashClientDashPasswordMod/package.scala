package typings
package passportDashOauth2DashClientDashPasswordLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object passportDashOauth2DashClientDashPasswordMod {
  type VerifyFunction = js.Function3[
    /* clientId */ java.lang.String, 
    /* clientSecret */ java.lang.String, 
    /* done */ js.Function3[
      /* error */ js.Any, 
      /* client */ js.UndefOr[js.Any], 
      /* info */ js.UndefOr[js.Any], 
      scala.Unit
    ], 
    scala.Unit
  ]
  type VerifyFunctionWithRequest = js.Function4[
    /* req */ expressLib.expressMod.eNs.Request, 
    /* clientId */ java.lang.String, 
    /* clientSecret */ java.lang.String, 
    /* done */ js.Function3[
      /* error */ js.Any, 
      /* client */ js.UndefOr[js.Any], 
      /* info */ js.UndefOr[js.Any], 
      scala.Unit
    ], 
    scala.Unit
  ]
}

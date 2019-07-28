package typings.passportDashOauth2DashClientDashPassword

import typings.express.expressMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object passportDashOauth2DashClientDashPasswordMod {
  type VerifyFunction = js.Function3[
    /* clientId */ String, 
    /* clientSecret */ String, 
    /* done */ js.Function3[
      /* error */ js.Any, 
      /* client */ js.UndefOr[js.Any], 
      /* info */ js.UndefOr[js.Any], 
      Unit
    ], 
    Unit
  ]
  type VerifyFunctionWithRequest = js.Function4[
    /* req */ Request, 
    /* clientId */ String, 
    /* clientSecret */ String, 
    /* done */ js.Function3[
      /* error */ js.Any, 
      /* client */ js.UndefOr[js.Any], 
      /* info */ js.UndefOr[js.Any], 
      Unit
    ], 
    Unit
  ]
}

package typings.passportDashAuth0

import typings.express.expressMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object passportDashAuth0Mod {
  type VerifyFunction = js.Function5[
    /* accessToken */ String, 
    /* refreshToken */ String, 
    /* extraParams */ ExtraVerificationParams, 
    /* profile */ Profile, 
    /* done */ js.Function3[/* error */ js.Any, /* user */ js.UndefOr[js.Any], /* info */ js.UndefOr[js.Any], Unit], 
    Unit
  ]
  type VerifyFunctionWithRequest = js.Function5[
    /* req */ Request, 
    /* accessToken */ String, 
    /* refreshToken */ String, 
    /* profile */ Profile, 
    /* done */ js.Function3[/* error */ js.Any, /* user */ js.UndefOr[js.Any], /* info */ js.UndefOr[js.Any], Unit], 
    Unit
  ]
}

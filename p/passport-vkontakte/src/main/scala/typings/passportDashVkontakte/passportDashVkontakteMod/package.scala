package typings.passportDashVkontakte

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object passportDashVkontakteMod {
  type VerifyCallback = js.Function3[/* error */ js.Any, /* user */ js.UndefOr[js.Any], /* info */ js.UndefOr[js.Any], Unit]
  type VerifyFunction = js.Function4[
    /* accessToken */ String, 
    /* refreshToken */ String, 
    /* profile */ Profile, 
    /* done */ VerifyCallback, 
    Unit
  ]
  type VerifyFunctionWithParams = js.Function5[
    /* accessToken */ String, 
    /* refreshToken */ String, 
    /* params */ Params, 
    /* profile */ Profile, 
    /* done */ VerifyCallback, 
    Unit
  ]
}

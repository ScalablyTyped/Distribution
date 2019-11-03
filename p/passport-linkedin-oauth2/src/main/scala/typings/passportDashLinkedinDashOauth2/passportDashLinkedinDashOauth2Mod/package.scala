package typings.passportDashLinkedinDashOauth2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object passportDashLinkedinDashOauth2Mod {
  import typings.express.expressMod.Request
  import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary

  type VerifyFunction = js.Function4[
    /* accessToken */ String, 
    /* refreshToken */ String, 
    /* profile */ Profile, 
    /* done */ js.Function3[/* error */ js.Any, /* user */ js.UndefOr[js.Any], /* info */ js.UndefOr[js.Any], Unit], 
    Unit
  ]
  type VerifyFunctionWithRequest = js.Function5[
    /* req */ Request[ParamsDictionary], 
    /* accessToken */ String, 
    /* refreshToken */ String, 
    /* profile */ Profile, 
    /* done */ js.Function3[/* error */ js.Any, /* user */ js.UndefOr[js.Any], /* info */ js.UndefOr[js.Any], Unit], 
    Unit
  ]
}

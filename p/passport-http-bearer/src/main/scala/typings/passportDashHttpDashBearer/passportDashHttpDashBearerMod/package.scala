package typings.passportDashHttpDashBearer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object passportDashHttpDashBearerMod {
  import typings.express.expressMod.Request
  import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary

  type VerifyFunction = js.Function2[
    /* token */ String, 
    /* done */ js.Function3[
      /* error */ js.Any, 
      /* user */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[IVerifyOptions | String], 
      Unit
    ], 
    Unit
  ]
  type VerifyFunctionWithRequest = js.Function3[
    /* req */ Request[ParamsDictionary], 
    /* token */ String, 
    /* done */ js.Function3[
      /* error */ js.Any, 
      /* user */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[IVerifyOptions | String], 
      Unit
    ], 
    Unit
  ]
}

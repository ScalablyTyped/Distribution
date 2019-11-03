package typings.passportDashRememberDashMeDashExtended

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object passportDashRememberDashMeDashExtendedMod {
  import typings.express.expressMod.Request
  import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary

  type IssueFunction = js.Function2[
    /* user */ js.Any, 
    /* done */ js.Function2[/* err */ js.Any, /* token */ js.UndefOr[js.Any], Unit], 
    Unit
  ]
  type IssueFunctionWithRequest = js.Function3[
    /* req */ Request[ParamsDictionary], 
    /* user */ js.Any, 
    /* done */ js.Function2[/* err */ js.Any, /* token */ js.UndefOr[js.Any], Unit], 
    Unit
  ]
  type VerifyFunction = js.Function2[
    /* token */ js.Any, 
    /* done */ js.Function3[/* err */ js.Any, /* user */ js.UndefOr[js.Any], /* info */ js.UndefOr[js.Any], Unit], 
    Unit
  ]
  type VerifyFunctionWithRequest = js.Function3[
    /* req */ Request[ParamsDictionary], 
    /* token */ js.Any, 
    /* done */ js.Function3[/* err */ js.Any, /* user */ js.UndefOr[js.Any], /* info */ js.UndefOr[js.Any], Unit], 
    Unit
  ]
}

package typings.passportDashUniqueDashToken

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object passportDashUniqueDashTokenMod {
  import typings.express.expressMod.Request

  type VerifyFunction = js.Function2[
    /* token */ String, 
    /* done */ js.Function3[
      /* error */ js.Any, 
      /* user */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[VerifyOptions], 
      Unit
    ], 
    Unit
  ]
  type VerifyFunctionWithRequest = js.Function3[
    /* req */ Request, 
    /* token */ String, 
    /* done */ js.Function3[
      /* error */ js.Any, 
      /* user */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[VerifyOptions], 
      Unit
    ], 
    Unit
  ]
}

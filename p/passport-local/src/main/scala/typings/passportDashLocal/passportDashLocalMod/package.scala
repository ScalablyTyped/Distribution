package typings.passportDashLocal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object passportDashLocalMod {
  import typings.express.expressMod.Request

  type VerifyFunction = js.Function3[
    /* username */ String, 
    /* password */ String, 
    /* done */ js.Function3[
      /* error */ js.Any, 
      /* user */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[IVerifyOptions], 
      Unit
    ], 
    Unit
  ]
  type VerifyFunctionWithRequest = js.Function4[
    /* req */ Request, 
    /* username */ String, 
    /* password */ String, 
    /* done */ js.Function3[
      /* error */ js.Any, 
      /* user */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[IVerifyOptions], 
      Unit
    ], 
    Unit
  ]
}

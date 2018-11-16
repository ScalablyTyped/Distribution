package typings
package passportDashHttpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object passportDashHttpMod {
  type BasicVerifyFunction = js.Function3[
    /* username */ java.lang.String, 
    /* password */ java.lang.String, 
    /* done */ js.Function2[/* error */ js.Any, /* user */ js.UndefOr[js.Any], scala.Unit], 
    js.Any
  ]
  type BasicVerifyFunctionWithRequest = js.Function4[
    /* req */ expressLib.expressMod.eNs.Request, 
    /* username */ java.lang.String, 
    /* password */ java.lang.String, 
    /* done */ js.Function2[/* error */ js.Any, /* user */ js.UndefOr[js.Any], scala.Unit], 
    js.Any
  ]
  type DigestSecretFunction = js.Function2[
    /* username */ java.lang.String, 
    /* done */ js.Function3[
      /* error */ js.Any, 
      /* user */ js.UndefOr[js.Any], 
      /* password */ js.UndefOr[js.Any], 
      scala.Unit
    ], 
    js.Any
  ]
  type DigestValidateFunction = js.Function2[
    /* params */ DigestValidateOptions, 
    /* done */ js.Function2[/* error */ js.Any, /* valid */ scala.Boolean, scala.Unit], 
    js.Any
  ]
}

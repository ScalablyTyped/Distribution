package typings.passportDashHttp

import typings.express.expressMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object passportDashHttpMod {
  type BasicVerifyFunction = js.Function3[
    /* username */ String, 
    /* password */ String, 
    /* done */ js.Function2[/* error */ js.Any, /* user */ js.UndefOr[js.Any], Unit], 
    js.Any
  ]
  type BasicVerifyFunctionWithRequest = js.Function4[
    /* req */ Request, 
    /* username */ String, 
    /* password */ String, 
    /* done */ js.Function2[/* error */ js.Any, /* user */ js.UndefOr[js.Any], Unit], 
    js.Any
  ]
  type DigestSecretFunction = js.Function2[
    /* username */ String, 
    /* done */ js.Function3[
      /* error */ js.Any, 
      /* user */ js.UndefOr[js.Any], 
      /* password */ js.UndefOr[js.Any], 
      Unit
    ], 
    js.Any
  ]
  type DigestValidateFunction = js.Function2[
    /* params */ DigestValidateOptions, 
    /* done */ js.Function2[/* error */ js.Any, /* valid */ Boolean, Unit], 
    js.Any
  ]
}

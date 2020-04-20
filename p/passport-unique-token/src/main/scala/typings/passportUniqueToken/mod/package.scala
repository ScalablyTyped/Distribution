package typings.passportUniqueToken

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type VerifyFunction = js.Function2[
    /* token */ java.lang.String, 
    /* done */ js.Function3[
      /* error */ js.Any, 
      /* user */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[typings.passportUniqueToken.mod.VerifyOptions], 
      scala.Unit
    ], 
    scala.Unit
  ]
  type VerifyFunctionWithRequest = js.Function3[
    /* req */ typings.express.mod.Request_[
      typings.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typings.expressServeStaticCore.mod.Query
    ], 
    /* token */ java.lang.String, 
    /* done */ js.Function3[
      /* error */ js.Any, 
      /* user */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[typings.passportUniqueToken.mod.VerifyOptions], 
      scala.Unit
    ], 
    scala.Unit
  ]
}

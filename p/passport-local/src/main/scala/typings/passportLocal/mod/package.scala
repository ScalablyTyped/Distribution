package typings.passportLocal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type VerifyFunction = js.Function3[
    /* username */ java.lang.String, 
    /* password */ java.lang.String, 
    /* done */ js.Function3[
      /* error */ js.Any, 
      /* user */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[typings.passportLocal.mod.IVerifyOptions], 
      scala.Unit
    ], 
    scala.Unit
  ]
  type VerifyFunctionWithRequest = js.Function4[
    /* req */ typings.express.mod.Request_[
      typings.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typings.expressServeStaticCore.mod.Query
    ], 
    /* username */ java.lang.String, 
    /* password */ java.lang.String, 
    /* done */ js.Function3[
      /* error */ js.Any, 
      /* user */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[typings.passportLocal.mod.IVerifyOptions], 
      scala.Unit
    ], 
    scala.Unit
  ]
}

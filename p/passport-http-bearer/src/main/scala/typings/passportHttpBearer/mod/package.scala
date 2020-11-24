package typings.passportHttpBearer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type VerifyFunction = js.Function2[
    /* token */ java.lang.String, 
    /* done */ js.Function3[
      /* error */ js.Any, 
      /* user */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[typings.passportHttpBearer.mod.IVerifyOptions | java.lang.String], 
      scala.Unit
    ], 
    scala.Unit
  ]
  
  type VerifyFunctionWithContext = js.Function3[
    /* req */ typings.passportHttpBearer.mod.KoaPassportExpressRequestMock, 
    /* token */ java.lang.String, 
    /* done */ js.Function3[
      /* error */ js.Any, 
      /* user */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[typings.passportHttpBearer.mod.IVerifyOptions | java.lang.String], 
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
      /* options */ js.UndefOr[typings.passportHttpBearer.mod.IVerifyOptions | java.lang.String], 
      scala.Unit
    ], 
    scala.Unit
  ]
  
  type VerifyFunctions = typings.passportHttpBearer.mod.VerifyFunction | typings.passportHttpBearer.mod.VerifyFunctionWithRequest | typings.passportHttpBearer.mod.VerifyFunctionWithContext
}

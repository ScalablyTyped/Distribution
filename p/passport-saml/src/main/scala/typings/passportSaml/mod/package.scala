package typings.passportSaml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CertCallback = js.Function1[
    /* callback */ js.Function2[
      /* err */ typings.std.Error | scala.Null, 
      /* cert */ js.UndefOr[java.lang.String | js.Array[java.lang.String]], 
      scala.Unit
    ], 
    scala.Unit
  ]
  
  type VerifiedCallback = js.Function3[
    /* err */ typings.std.Error | scala.Null, 
    /* user */ js.UndefOr[js.Object], 
    /* info */ js.UndefOr[js.Object], 
    scala.Unit
  ]
  
  type VerifyWithRequest = js.Function3[
    /* req */ typings.express.mod.Request_[
      typings.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typings.expressServeStaticCore.mod.Query
    ], 
    /* profile */ typings.passportSaml.mod.Profile, 
    /* done */ typings.passportSaml.mod.VerifiedCallback, 
    scala.Unit
  ]
  
  type VerifyWithoutRequest = js.Function2[
    /* profile */ typings.passportSaml.mod.Profile, 
    /* done */ typings.passportSaml.mod.VerifiedCallback, 
    scala.Unit
  ]
}

package typings.passportOauth2ClientPassword

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type VerifyFunction = js.Function3[
    /* clientId */ java.lang.String, 
    /* clientSecret */ java.lang.String, 
    /* done */ js.Function3[
      /* error */ js.Any, 
      /* client */ js.UndefOr[js.Any], 
      /* info */ js.UndefOr[js.Any], 
      scala.Unit
    ], 
    scala.Unit
  ]
  type VerifyFunctionWithRequest = js.Function4[
    /* req */ typings.express.mod.Request_[typings.expressServeStaticCore.mod.ParamsDictionary], 
    /* clientId */ java.lang.String, 
    /* clientSecret */ java.lang.String, 
    /* done */ js.Function3[
      /* error */ js.Any, 
      /* client */ js.UndefOr[js.Any], 
      /* info */ js.UndefOr[js.Any], 
      scala.Unit
    ], 
    scala.Unit
  ]
}

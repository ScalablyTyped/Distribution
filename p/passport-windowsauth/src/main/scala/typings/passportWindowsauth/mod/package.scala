package typings.passportWindowsauth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Verified = js.Function3[
    /* err */ js.UndefOr[typings.std.Error | scala.Null], 
    /* user */ js.UndefOr[js.Object], 
    /* info */ js.UndefOr[js.Object], 
    scala.Unit
  ]
  type Verify = js.Function2[
    /* profile */ typings.passport.mod.Profile, 
    /* done */ typings.passportWindowsauth.mod.Verified, 
    scala.Unit
  ]
  type VerifyWithReq = js.Function3[
    /* req */ typings.express.mod.Request_[
      typings.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typings.expressServeStaticCore.mod.Query
    ], 
    /* profile */ typings.passport.mod.Profile, 
    /* done */ typings.passportWindowsauth.mod.Verified, 
    scala.Unit
  ]
  type windowsauth = typings.passport.mod.Strategy
}

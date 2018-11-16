package typings
package passportDashJwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object passportDashJwtMod {
  type JwtFromRequestFunction = js.Function1[/* req */ expressLib.expressMod.eNs.Request, java.lang.String]
  type VerifiedCallback = js.Function3[
    /* error */ js.Any, 
    /* user */ js.UndefOr[js.Any], 
    /* info */ js.UndefOr[js.Any], 
    scala.Unit
  ]
  type VerifyCallback = js.Function2[/* payload */ js.Any, /* done */ VerifiedCallback, scala.Unit]
  type VerifyCallbackWithRequest = js.Function3[
    /* req */ expressLib.expressMod.eNs.Request, 
    /* payload */ js.Any, 
    /* done */ VerifiedCallback, 
    scala.Unit
  ]
}

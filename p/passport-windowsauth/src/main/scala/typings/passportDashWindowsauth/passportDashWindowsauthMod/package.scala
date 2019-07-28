package typings.passportDashWindowsauth

import typings.express.expressMod.Request
import typings.passport.passportMod.Profile
import typings.passport.passportMod.Strategy
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object passportDashWindowsauthMod {
  type Verified = js.Function3[
    /* err */ js.UndefOr[Error | Null], 
    /* user */ js.UndefOr[js.Object], 
    /* info */ js.UndefOr[js.Object], 
    Unit
  ]
  type Verify = js.Function2[/* profile */ Profile, /* done */ Verified, Unit]
  type VerifyWithReq = js.Function3[/* req */ Request, /* profile */ Profile, /* done */ Verified, Unit]
  type windowsauth = Strategy
}

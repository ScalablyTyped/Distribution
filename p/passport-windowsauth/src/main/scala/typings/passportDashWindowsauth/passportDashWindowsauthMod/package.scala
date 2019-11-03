package typings.passportDashWindowsauth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object passportDashWindowsauthMod {
  import typings.express.expressMod.Request
  import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
  import typings.passport.passportMod.Profile
  import typings.passport.passportMod.Strategy
  import typings.std.Error

  type Verified = js.Function3[
    /* err */ js.UndefOr[Error | Null], 
    /* user */ js.UndefOr[js.Object], 
    /* info */ js.UndefOr[js.Object], 
    Unit
  ]
  type Verify = js.Function2[/* profile */ Profile, /* done */ Verified, Unit]
  type VerifyWithReq = js.Function3[/* req */ Request[ParamsDictionary], /* profile */ Profile, /* done */ Verified, Unit]
  type windowsauth = Strategy
}

package typings
package passportDashWindowsauthLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object passportDashWindowsauthMod {
  type Verified = js.Function3[
    /* err */ js.UndefOr[stdLib.Error | scala.Null], 
    /* user */ js.UndefOr[js.Object], 
    /* info */ js.UndefOr[js.Object], 
    scala.Unit
  ]
  type Verify = js.Function2[/* profile */ passportLib.passportMod.Profile, /* done */ Verified, scala.Unit]
  type VerifyWithReq = js.Function3[
    /* req */ expressLib.expressMod.Request, 
    /* profile */ passportLib.passportMod.Profile, 
    /* done */ Verified, 
    scala.Unit
  ]
  type windowsauth = passportLib.passportMod.Strategy
}

package typings
package passportDashWindowsauthLib.passportDashWindowsauthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object windowsauthNs {
  type Verified = js.Function3[
    /* err */ js.UndefOr[stdLib.Error | scala.Null], 
    /* user */ js.UndefOr[js.Object], 
    /* info */ js.UndefOr[js.Object], 
    scala.Unit
  ]
  type Verify = js.Function2[
    /* profile */ passportLib.passportMod.passportNs.Profile, 
    /* done */ Verified, 
    scala.Unit
  ]
  type VerifyWithReq = js.Function3[
    /* req */ expressLib.expressMod.eNs.Request, 
    /* profile */ passportLib.passportMod.passportNs.Profile, 
    /* done */ Verified, 
    scala.Unit
  ]
}

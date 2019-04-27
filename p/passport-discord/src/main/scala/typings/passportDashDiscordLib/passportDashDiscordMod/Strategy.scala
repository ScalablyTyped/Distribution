package typings
package passportDashDiscordLib.passportDashDiscordMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Strategy
  extends passportDashOauth2Lib.passportDashOauth2Mod.OAuth2Strategy {
  def checkScope(
    scope: java.lang.String,
    accessToken: java.lang.String,
    cb: js.Function2[
      /* err */ js.UndefOr[stdLib.Error | scala.Null], 
      /* value */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ): scala.Unit = js.native
}


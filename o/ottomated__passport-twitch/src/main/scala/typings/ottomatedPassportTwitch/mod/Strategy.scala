package typings.ottomatedPassportTwitch.mod

import typings.passportOauth2.mod.OAuth2Strategy
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Strategy extends OAuth2Strategy {
  
  def checkScope(
    scope: String,
    accessToken: String,
    cb: js.Function2[/* err */ js.UndefOr[Error | Null], /* value */ js.UndefOr[js.Any], Unit]
  ): Unit = js.native
}

package typings.passport.passportMod

import typings.express.expressMod.Handler
import typings.passport.Anon_Any
import typings.passport.Anon_Strategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PassportStatic
  extends Authenticator[Handler, js.Any, js.Any, AuthenticateOptions] {
  var Authenticator: Anon_Any = js.native
  var Passport: Anon_Any = js.native
  var Strategy: Anon_Strategy = js.native
}


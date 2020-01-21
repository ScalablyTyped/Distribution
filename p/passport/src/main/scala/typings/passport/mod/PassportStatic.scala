package typings.passport.mod

import typings.express.mod.Handler
import typings.passport.AnonAny
import typings.passport.AnonStrategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PassportStatic
  extends Authenticator[Handler, js.Any, js.Any, AuthenticateOptions] {
  var Authenticator: AnonAny = js.native
  var Passport: AnonAny = js.native
  var Strategy: AnonStrategy = js.native
}


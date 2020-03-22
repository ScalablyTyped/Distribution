package typings.passport.mod

import typings.express.mod.Handler
import typings.passport.Anon0
import typings.passport.AnonInstantiable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PassportStatic
  extends Authenticator[Handler, js.Any, js.Any, AuthenticateOptions] {
  var Authenticator: AnonInstantiable = js.native
  var Passport: AnonInstantiable = js.native
  var Strategy: Anon0 = js.native
}


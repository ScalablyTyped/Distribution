package typings.passportWindowsauth.mod

import typings.passport.mod.Strategy
import typings.passportWindowsauth.AnonPassReqToCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-windowsauth", JSImport.Namespace)
@js.native
class ^ protected () extends Strategy {
  def this(verify: Verify) = this()
  def this(options: Options with AnonPassReqToCallback, verify: VerifyWithReq) = this()
  def this(options: Options, verify: Verify) = this()
}


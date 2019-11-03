package typings.passportDashFacebookDashToken.passportDashFacebookDashTokenMod

import typings.express.expressMod.Request
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrategyInstance extends js.Object {
  var name: String = js.native
  def authenticate(req: Request[ParamsDictionary]): Unit = js.native
  def authenticate(req: Request[ParamsDictionary], options: js.Any): Unit = js.native
}


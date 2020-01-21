package typings.passportFacebookToken.mod

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrategyInstance extends js.Object {
  var name: String = js.native
  def authenticate(req: Request_[ParamsDictionary]): Unit = js.native
  def authenticate(req: Request_[ParamsDictionary], options: js.Any): Unit = js.native
}


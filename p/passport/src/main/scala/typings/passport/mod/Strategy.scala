package typings.passport.mod

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Strategy extends js.Object {
  var name: js.UndefOr[String] = js.native
  def authenticate(req: Request_[ParamsDictionary]): js.Any = js.native
  def authenticate(req: Request_[ParamsDictionary], options: js.Any): js.Any = js.native
}


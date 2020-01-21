package typings.oauthShim.mod

import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.oauthShim.AnonData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request
  extends typings.expressServeStaticCore.mod.Request[ParamsDictionary, js.Any, js.Any] {
  var oauthshim: js.UndefOr[AnonData] = js.native
}


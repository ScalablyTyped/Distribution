package typings.opticsDashAgent.opticsDashAgentMod

import typings.express.expressMod.Request
import typings.express.expressMod.Response
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("optics-agent", "middleware")
@js.native
object middleware extends js.Object {
  def apply(): js.Function3[
    /* req */ Request[ParamsDictionary], 
    /* res */ Response, 
    /* next */ js.UndefOr[js.Any], 
    Unit
  ] = js.native
}


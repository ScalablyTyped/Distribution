package typings.mockDashReqDashRes.mockDashReqDashResMod

import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Request
import typings.sinon.sinonMod.SinonStub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestOutput extends Request[ParamsDictionary] {
  @JSName("get")
  var get_Original: SinonStub = js.native
  // Methods
  def get(args: js.Any*): js.Any = js.native
}


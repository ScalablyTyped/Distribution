package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojrouterMod.Router
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParentRouter extends js.Object {
  var direction: String = js.native
  var parentRouter: Router = js.native
}

object ParentRouter {
  @scala.inline
  def apply(direction: String, parentRouter: Router): ParentRouter = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], parentRouter = parentRouter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParentRouter]
  }
  @scala.inline
  implicit class ParentRouterOps[Self <: ParentRouter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentRouter(value: Router): Self = this.set("parentRouter", value.asInstanceOf[js.Any])
  }
  
}


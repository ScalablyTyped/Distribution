package typings.nextServer.libUtilsMod

import typings.nextServer.routerMod.NextRouter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppContextType[R /* <: NextRouter */] extends js.Object {
  var AppTree: AppType = js.native
  var Component: NextComponentType[NextPageContext, js.Object, js.Object] = js.native
  var ctx: NextPageContext = js.native
  var router: R = js.native
}

object AppContextType {
  @scala.inline
  def apply[/* <: typings.nextServer.routerMod.NextRouter */ R](
    AppTree: AppType,
    Component: NextComponentType[NextPageContext, js.Object, js.Object],
    ctx: NextPageContext,
    router: R
  ): AppContextType[R] = {
    val __obj = js.Dynamic.literal(AppTree = AppTree.asInstanceOf[js.Any], Component = Component.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], router = router.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppContextType[R]]
  }
  @scala.inline
  implicit class AppContextTypeOps[Self <: AppContextType[_], /* <: typings.nextServer.routerMod.NextRouter */ R] (val x: Self with AppContextType[R]) extends AnyVal {
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
    def setAppTree(value: AppType): Self = this.set("AppTree", value.asInstanceOf[js.Any])
    @scala.inline
    def setComponent(value: NextComponentType[NextPageContext, js.Object, js.Object]): Self = this.set("Component", value.asInstanceOf[js.Any])
    @scala.inline
    def setCtx(value: NextPageContext): Self = this.set("ctx", value.asInstanceOf[js.Any])
    @scala.inline
    def setRouter(value: R): Self = this.set("router", value.asInstanceOf[js.Any])
  }
  
}


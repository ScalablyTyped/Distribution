package typings.next.utilsMod

import typings.next.routerMod.NextRouter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppContextType[R /* <: NextRouter */] extends js.Object {
  var AppTree: AppTreeType
  var Component: NextComponentType[NextPageContext, js.Object, js.Object]
  var ctx: NextPageContext
  var router: R
}

object AppContextType {
  @scala.inline
  def apply[R /* <: NextRouter */](
    AppTree: AppTreeType,
    Component: NextComponentType[NextPageContext, js.Object, js.Object],
    ctx: NextPageContext,
    router: R
  ): AppContextType[R] = {
    val __obj = js.Dynamic.literal(AppTree = AppTree.asInstanceOf[js.Any], Component = Component.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], router = router.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppContextType[R]]
  }
}


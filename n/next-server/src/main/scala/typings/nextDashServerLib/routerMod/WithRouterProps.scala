package typings
package nextDashServerLib.routerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithRouterProps[Q] extends js.Object {
  var router: js.UndefOr[SingletonRouter[Q]] = js.undefined
}

object WithRouterProps {
  @scala.inline
  def apply[Q](router: SingletonRouter[Q] = null): WithRouterProps[Q] = {
    val __obj = js.Dynamic.literal()
    if (router != null) __obj.updateDynamic("router")(router)
    __obj.asInstanceOf[WithRouterProps[Q]]
  }
}


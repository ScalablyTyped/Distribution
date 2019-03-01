package typings
package pathjsLib.pathjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPathRoutes extends js.Object {
  var current: js.UndefOr[java.lang.String] = js.undefined
  var defined: IDictionary[IPathRoute]
  var previous: js.UndefOr[java.lang.String] = js.undefined
  var rescue: js.UndefOr[js.Function] = js.undefined
  var root: js.UndefOr[java.lang.String] = js.undefined
}

object IPathRoutes {
  @scala.inline
  def apply(
    defined: IDictionary[IPathRoute],
    current: java.lang.String = null,
    previous: java.lang.String = null,
    rescue: js.Function = null,
    root: java.lang.String = null
  ): IPathRoutes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("defined")(defined)
    if (current != null) __obj.updateDynamic("current")(current)
    if (previous != null) __obj.updateDynamic("previous")(previous)
    if (rescue != null) __obj.updateDynamic("rescue")(rescue)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[IPathRoutes]
  }
}


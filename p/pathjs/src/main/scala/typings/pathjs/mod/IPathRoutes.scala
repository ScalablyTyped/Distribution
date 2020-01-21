package typings.pathjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPathRoutes extends js.Object {
  var current: js.UndefOr[String] = js.undefined
  var defined: IDictionary[IPathRoute]
  var previous: js.UndefOr[String] = js.undefined
  var rescue: js.UndefOr[js.Function] = js.undefined
  var root: js.UndefOr[String] = js.undefined
}

object IPathRoutes {
  @scala.inline
  def apply(
    defined: IDictionary[IPathRoute],
    current: String = null,
    previous: String = null,
    rescue: js.Function = null,
    root: String = null
  ): IPathRoutes = {
    val __obj = js.Dynamic.literal(defined = defined.asInstanceOf[js.Any])
    if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    if (previous != null) __obj.updateDynamic("previous")(previous.asInstanceOf[js.Any])
    if (rescue != null) __obj.updateDynamic("rescue")(rescue.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPathRoutes]
  }
}


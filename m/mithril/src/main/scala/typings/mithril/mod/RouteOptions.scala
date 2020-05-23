package typings.mithril.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteOptions extends js.Object {
  /** Routing parameters. If path has routing parameter slots, the properties of this object are interpolated into the path string. */
  var replace: js.UndefOr[Boolean] = js.undefined
  /** The state object to pass to the underlying history.pushState / history.replaceState call. */
  var state: js.UndefOr[js.Any] = js.undefined
  /** The title string to pass to the underlying history.pushState / history.replaceState call. */
  var title: js.UndefOr[String] = js.undefined
}

object RouteOptions {
  @scala.inline
  def apply(replace: js.UndefOr[Boolean] = js.undefined, state: js.Any = null, title: String = null): RouteOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(replace)) __obj.updateDynamic("replace")(replace.get.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteOptions]
  }
}


package typings.onsenui.onsenuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushPageOptions extends js.Object {
  var animation: js.UndefOr[String] = js.undefined
  var animationOptions: js.UndefOr[js.Object] = js.undefined
  var callback: js.UndefOr[js.Function] = js.undefined
  var data: js.UndefOr[js.Object] = js.undefined
  var page: js.UndefOr[js.Any] = js.undefined
  var pageHTML: js.UndefOr[String] = js.undefined
}

object PushPageOptions {
  @scala.inline
  def apply(
    animation: String = null,
    animationOptions: js.Object = null,
    callback: js.Function = null,
    data: js.Object = null,
    page: js.Any = null,
    pageHTML: String = null
  ): PushPageOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (animationOptions != null) __obj.updateDynamic("animationOptions")(animationOptions)
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (data != null) __obj.updateDynamic("data")(data)
    if (page != null) __obj.updateDynamic("page")(page)
    if (pageHTML != null) __obj.updateDynamic("pageHTML")(pageHTML)
    __obj.asInstanceOf[PushPageOptions]
  }
}


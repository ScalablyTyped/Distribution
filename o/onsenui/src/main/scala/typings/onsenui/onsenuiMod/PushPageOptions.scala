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
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (animationOptions != null) __obj.updateDynamic("animationOptions")(animationOptions.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (pageHTML != null) __obj.updateDynamic("pageHTML")(pageHTML.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushPageOptions]
  }
}


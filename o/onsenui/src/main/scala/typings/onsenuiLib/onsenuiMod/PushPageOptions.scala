package typings
package onsenuiLib.onsenuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushPageOptions extends js.Object {
  var animation: js.UndefOr[java.lang.String] = js.undefined
  var animationOptions: js.UndefOr[coreDashJsLib.Object] = js.undefined
  var callback: js.UndefOr[coreDashJsLib.Function] = js.undefined
  var data: js.UndefOr[coreDashJsLib.Object] = js.undefined
  var page: js.UndefOr[js.Any] = js.undefined
  var pageHTML: js.UndefOr[java.lang.String] = js.undefined
}

object PushPageOptions {
  @scala.inline
  def apply(
    animation: java.lang.String = null,
    animationOptions: coreDashJsLib.Object = null,
    callback: coreDashJsLib.Function = null,
    data: coreDashJsLib.Object = null,
    page: js.Any = null,
    pageHTML: java.lang.String = null
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


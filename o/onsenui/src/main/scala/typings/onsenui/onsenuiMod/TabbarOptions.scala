package typings.onsenui.onsenuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabbarOptions extends js.Object {
  /**
    * @description Animation name. Available animations are `"fade"`, `"slide"` and `"none"`.
    */
  var animation: js.UndefOr[String] = js.undefined
  /**
    * @description Specify the animation's duration, delay and timing. E.g. `{duration: 0.2, delay: 0.4, timing: 'ease-in'}`.
    */
  var animationOptions: js.UndefOr[String] = js.undefined
  /**
    *
    */
  var callback: js.UndefOr[js.Function] = js.undefined
  /**
    * @description If true the page will not be changed.
    */
  var keepPage: js.UndefOr[Boolean] = js.undefined
}

object TabbarOptions {
  @scala.inline
  def apply(
    animation: String = null,
    animationOptions: String = null,
    callback: js.Function = null,
    keepPage: js.UndefOr[Boolean] = js.undefined
  ): TabbarOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (animationOptions != null) __obj.updateDynamic("animationOptions")(animationOptions.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (!js.isUndefined(keepPage)) __obj.updateDynamic("keepPage")(keepPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabbarOptions]
  }
}


package typings.onsenui.onsenuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackButtonOptions extends js.Object {
  /**
    * @description Animation name. Available animations are "slide", "lift", "fade" and "none". These are platform based animations. For fixed animations, add "-ios" or "-md" suffix to the animation name. E.g. "lift-ios", "lift-md". Defaults values are "slide-ios" and "fade-md".
    */
  var animation: js.UndefOr[String] = js.undefined
  /**
    * @description Specify the animation's duration, delay and timing. E.g. `{duration: 0.2, delay: 0.4, timing: 'ease-in'}`.
    */
  var animationOptions: js.UndefOr[String] = js.undefined
  /**
    * @description Function that is called when the transition has ended.
    */
  var callback: js.UndefOr[js.Function] = js.undefined
}

object BackButtonOptions {
  @scala.inline
  def apply(animation: String = null, animationOptions: String = null, callback: js.Function = null): BackButtonOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (animationOptions != null) __obj.updateDynamic("animationOptions")(animationOptions.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackButtonOptions]
  }
}


package typings
package onsenuiLib.onsenuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigatorOptions extends js.Object {
  /**
    * @description Animation name. Available animations are `"slide"`, `"lift"`, `"fade"` and `"none"`. These are platform based animations. For fixed animations, add `"-ios"` or `"-md"` suffix to the animation name. E.g. `"lift-ios"`, `"lift-md"`. Defaults values are `"slide-ios"` and `"fade-md"`.
    */
  var animation: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @description Specify the animation's duration, delay and timing. E.g. `{duration: 0.2, delay: 0.4, timing: 'ease-in'}`.
    */
  var animationOptions: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @description Function that is called when the transition has ended.
    */
  var callback: js.UndefOr[js.Function] = js.undefined
}

object NavigatorOptions {
  @scala.inline
  def apply(
    animation: java.lang.String = null,
    animationOptions: java.lang.String = null,
    callback: js.Function = null
  ): NavigatorOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (animationOptions != null) __obj.updateDynamic("animationOptions")(animationOptions)
    if (callback != null) __obj.updateDynamic("callback")(callback)
    __obj.asInstanceOf[NavigatorOptions]
  }
}


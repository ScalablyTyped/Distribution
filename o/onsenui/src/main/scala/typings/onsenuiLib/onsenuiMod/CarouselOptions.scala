package typings
package onsenuiLib.onsenuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarouselOptions extends js.Object {
  var animation: js.UndefOr[nodeLib.String] = js.undefined
  var animationOptions: js.UndefOr[coreDashJsLib.Object] = js.undefined
  var callback: js.UndefOr[coreDashJsLib.Function] = js.undefined
}

object CarouselOptions {
  @scala.inline
  def apply(
    animation: nodeLib.String = null,
    animationOptions: coreDashJsLib.Object = null,
    callback: coreDashJsLib.Function = null
  ): CarouselOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (animationOptions != null) __obj.updateDynamic("animationOptions")(animationOptions)
    if (callback != null) __obj.updateDynamic("callback")(callback)
    __obj.asInstanceOf[CarouselOptions]
  }
}


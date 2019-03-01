package typings
package onsenuiLib.onsenuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogOptions extends js.Object {
  var animation: js.UndefOr[java.lang.String] = js.undefined
  var callback: js.UndefOr[coreDashJsLib.Function] = js.undefined
}

object DialogOptions {
  @scala.inline
  def apply(animation: java.lang.String = null, callback: coreDashJsLib.Function = null): DialogOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (callback != null) __obj.updateDynamic("callback")(callback)
    __obj.asInstanceOf[DialogOptions]
  }
}


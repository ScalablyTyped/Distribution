package typings
package phonegapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Keyboard extends js.Object {
  var automaticScrollToTopOnHiding: scala.Boolean
  var isVisible: scala.Boolean
  var onhide: js.Function
  var onhiding: js.Function
  var onshow: js.Function
  var onshowing: js.Function
  def disableScrollingInShrinkView(disable: scala.Boolean): scala.Unit
  def hideFormAccessoryBar(hide: scala.Boolean): scala.Unit
  def shrinkView(shrink: scala.Boolean): scala.Unit
}

object Keyboard {
  @scala.inline
  def apply(
    automaticScrollToTopOnHiding: scala.Boolean,
    disableScrollingInShrinkView: js.Function1[scala.Boolean, scala.Unit],
    hideFormAccessoryBar: js.Function1[scala.Boolean, scala.Unit],
    isVisible: scala.Boolean,
    onhide: js.Function,
    onhiding: js.Function,
    onshow: js.Function,
    onshowing: js.Function,
    shrinkView: js.Function1[scala.Boolean, scala.Unit]
  ): Keyboard = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("automaticScrollToTopOnHiding")(automaticScrollToTopOnHiding)
    __obj.updateDynamic("disableScrollingInShrinkView")(disableScrollingInShrinkView)
    __obj.updateDynamic("hideFormAccessoryBar")(hideFormAccessoryBar)
    __obj.updateDynamic("isVisible")(isVisible)
    __obj.updateDynamic("onhide")(onhide)
    __obj.updateDynamic("onhiding")(onhiding)
    __obj.updateDynamic("onshow")(onshow)
    __obj.updateDynamic("onshowing")(onshowing)
    __obj.updateDynamic("shrinkView")(shrinkView)
    __obj.asInstanceOf[Keyboard]
  }
}


package typings.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Keyboard extends js.Object {
  var automaticScrollToTopOnHiding: Boolean
  var isVisible: Boolean
  var onhide: js.Function
  var onhiding: js.Function
  var onshow: js.Function
  var onshowing: js.Function
  def disableScrollingInShrinkView(disable: Boolean): Unit
  def hideFormAccessoryBar(hide: Boolean): Unit
  def shrinkView(shrink: Boolean): Unit
}

object Keyboard {
  @scala.inline
  def apply(
    automaticScrollToTopOnHiding: Boolean,
    disableScrollingInShrinkView: Boolean => Unit,
    hideFormAccessoryBar: Boolean => Unit,
    isVisible: Boolean,
    onhide: js.Function,
    onhiding: js.Function,
    onshow: js.Function,
    onshowing: js.Function,
    shrinkView: Boolean => Unit
  ): Keyboard = {
    val __obj = js.Dynamic.literal(automaticScrollToTopOnHiding = automaticScrollToTopOnHiding.asInstanceOf[js.Any], disableScrollingInShrinkView = js.Any.fromFunction1(disableScrollingInShrinkView), hideFormAccessoryBar = js.Any.fromFunction1(hideFormAccessoryBar), isVisible = isVisible.asInstanceOf[js.Any], onhide = onhide.asInstanceOf[js.Any], onhiding = onhiding.asInstanceOf[js.Any], onshow = onshow.asInstanceOf[js.Any], onshowing = onshowing.asInstanceOf[js.Any], shrinkView = js.Any.fromFunction1(shrinkView))
    __obj.asInstanceOf[Keyboard]
  }
}


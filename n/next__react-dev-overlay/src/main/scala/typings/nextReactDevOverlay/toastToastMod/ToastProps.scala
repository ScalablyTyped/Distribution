package typings.nextReactDevOverlay.toastToastMod

import typings.std.HTMLDivElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[
    js.Function1[/* ev */ typings.react.mod.MouseEvent[HTMLDivElement, MouseEvent], Unit]
  ] = js.undefined
}

object ToastProps {
  @scala.inline
  def apply(
    className: String = null,
    onClick: /* ev */ typings.react.mod.MouseEvent[HTMLDivElement, MouseEvent] => Unit = null
  ): ToastProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    __obj.asInstanceOf[ToastProps]
  }
}


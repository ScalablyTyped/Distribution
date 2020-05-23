package typings.nextReactDevOverlay.leftRightDialogHeaderLeftRightDialogHeaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeftRightDialogHeaderProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var next: js.Function0[Unit] | Null
  var previous: js.Function0[Unit] | Null
  def close(): Unit
}

object LeftRightDialogHeaderProps {
  @scala.inline
  def apply(close: () => Unit, className: String = null, next: () => Unit = null, previous: () => Unit = null): LeftRightDialogHeaderProps = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), next = js.Any.fromFunction0(next), previous = js.Any.fromFunction0(previous))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeftRightDialogHeaderProps]
  }
}


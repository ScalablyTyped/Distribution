package typings.nextReactDevOverlay.leftRightDialogHeaderLeftRightDialogHeaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LeftRightDialogHeaderProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var next: js.Function0[Unit] | Null = js.native
  var previous: js.Function0[Unit] | Null = js.native
  def close(): Unit = js.native
}

object LeftRightDialogHeaderProps {
  @scala.inline
  def apply(close: () => Unit): LeftRightDialogHeaderProps = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close))
    __obj.asInstanceOf[LeftRightDialogHeaderProps]
  }
  @scala.inline
  implicit class LeftRightDialogHeaderPropsOps[Self <: LeftRightDialogHeaderProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setNext(value: () => Unit): Self = this.set("next", js.Any.fromFunction0(value))
    @scala.inline
    def setNextNull: Self = this.set("next", null)
    @scala.inline
    def setPrevious(value: () => Unit): Self = this.set("previous", js.Any.fromFunction0(value))
    @scala.inline
    def setPreviousNull: Self = this.set("previous", null)
  }
  
}


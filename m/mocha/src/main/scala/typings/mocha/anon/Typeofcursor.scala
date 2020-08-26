package typings.mocha.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofcursor extends js.Object {
  /**
    * Clears the line and moves to the beginning of the line.
    */
  def CR(): Unit = js.native
  /**
    * Moves to the beginning of the line
    */
  def beginningOfLine(): Unit = js.native
  /**
    * Deletes the current line
    */
  def deleteLine(): Unit = js.native
  /**
    * Hides the cursor
    */
  def hide(): Unit = js.native
  /**
    * Shows the cursor
    */
  def show(): Unit = js.native
}

object Typeofcursor {
  @scala.inline
  def apply(
    CR: () => Unit,
    beginningOfLine: () => Unit,
    deleteLine: () => Unit,
    hide: () => Unit,
    show: () => Unit
  ): Typeofcursor = {
    val __obj = js.Dynamic.literal(CR = js.Any.fromFunction0(CR), beginningOfLine = js.Any.fromFunction0(beginningOfLine), deleteLine = js.Any.fromFunction0(deleteLine), hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[Typeofcursor]
  }
  @scala.inline
  implicit class TypeofcursorOps[Self <: Typeofcursor] (val x: Self) extends AnyVal {
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
    def setCR(value: () => Unit): Self = this.set("CR", js.Any.fromFunction0(value))
    @scala.inline
    def setBeginningOfLine(value: () => Unit): Self = this.set("beginningOfLine", js.Any.fromFunction0(value))
    @scala.inline
    def setDeleteLine(value: () => Unit): Self = this.set("deleteLine", js.Any.fromFunction0(value))
    @scala.inline
    def setHide(value: () => Unit): Self = this.set("hide", js.Any.fromFunction0(value))
    @scala.inline
    def setShow(value: () => Unit): Self = this.set("show", js.Any.fromFunction0(value))
  }
  
}


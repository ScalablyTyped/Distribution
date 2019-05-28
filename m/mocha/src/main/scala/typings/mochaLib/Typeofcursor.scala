package typings
package mochaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofcursor extends js.Object {
  /**
    * Clears the line and moves to the beginning of the line.
    */
  def CR(): scala.Unit
  /**
    * Moves to the beginning of the line
    */
  def beginningOfLine(): scala.Unit
  /**
    * Deletes the current line
    */
  def deleteLine(): scala.Unit
  /**
    * Hides the cursor
    */
  def hide(): scala.Unit
  /**
    * Shows the cursor
    */
  def show(): scala.Unit
}

object Typeofcursor {
  @scala.inline
  def apply(
    CR: () => scala.Unit,
    beginningOfLine: () => scala.Unit,
    deleteLine: () => scala.Unit,
    hide: () => scala.Unit,
    show: () => scala.Unit
  ): Typeofcursor = {
    val __obj = js.Dynamic.literal(CR = js.Any.fromFunction0(CR), beginningOfLine = js.Any.fromFunction0(beginningOfLine), deleteLine = js.Any.fromFunction0(deleteLine), hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show))
  
    __obj.asInstanceOf[Typeofcursor]
  }
}


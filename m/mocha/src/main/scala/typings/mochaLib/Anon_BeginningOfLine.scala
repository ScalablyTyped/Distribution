package typings
package mochaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BeginningOfLine extends js.Object {
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

object Anon_BeginningOfLine {
  @scala.inline
  def apply(
    CR: js.Function0[scala.Unit],
    beginningOfLine: js.Function0[scala.Unit],
    deleteLine: js.Function0[scala.Unit],
    hide: js.Function0[scala.Unit],
    show: js.Function0[scala.Unit]
  ): Anon_BeginningOfLine = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CR")(CR)
    __obj.updateDynamic("beginningOfLine")(beginningOfLine)
    __obj.updateDynamic("deleteLine")(deleteLine)
    __obj.updateDynamic("hide")(hide)
    __obj.updateDynamic("show")(show)
    __obj.asInstanceOf[Anon_BeginningOfLine]
  }
}


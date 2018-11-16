package typings
package mochaLib.MochaNs.reportersNs.BaseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
             * ANSI TTY control sequences common among reporters.
             *
             * @see https://mochajs.org/api/module-base#.cursor
             */
@JSGlobal("Mocha.reporters.Base.cursor")
@js.native
object cursorNs extends js.Object {
  /**
                   * Clears the line and moves to the beginning of the line.
                   */
  def CR(): scala.Unit = js.native
  /**
                   * Moves to the beginning of the line
                   */
  def beginningOfLine(): scala.Unit = js.native
  /**
                   * Deletes the current line
                   */
  def deleteLine(): scala.Unit = js.native
  /**
                   * Hides the cursor
                   */
  def hide(): scala.Unit = js.native
  /**
                   * Shows the cursor
                   */
  def show(): scala.Unit = js.native
}


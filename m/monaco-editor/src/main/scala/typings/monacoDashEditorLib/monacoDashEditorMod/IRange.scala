package typings
package monacoDashEditorLib.monacoDashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRange extends js.Object {
  /**
    * Column on which the range ends in line `endLineNumber`.
    */
  val endColumn: scala.Double
  /**
    * Line number on which the range ends.
    */
  val endLineNumber: scala.Double
  /**
    * Column on which the range starts in line `startLineNumber` (starts at 1).
    */
  val startColumn: scala.Double
  /**
    * Line number on which the range starts (starts at 1).
    */
  val startLineNumber: scala.Double
}

object IRange {
  @scala.inline
  def apply(
    endColumn: scala.Double,
    endLineNumber: scala.Double,
    startColumn: scala.Double,
    startLineNumber: scala.Double
  ): IRange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("endColumn")(endColumn)
    __obj.updateDynamic("endLineNumber")(endLineNumber)
    __obj.updateDynamic("startColumn")(startColumn)
    __obj.updateDynamic("startLineNumber")(startLineNumber)
    __obj.asInstanceOf[IRange]
  }
}


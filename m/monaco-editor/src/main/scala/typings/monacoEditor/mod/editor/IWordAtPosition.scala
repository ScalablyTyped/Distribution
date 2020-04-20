package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWordAtPosition extends js.Object {
  /**
    * The column where the word ends.
    */
  val endColumn: Double
  /**
    * The column where the word starts.
    */
  val startColumn: Double
  /**
    * The word.
    */
  val word: String
}

object IWordAtPosition {
  @scala.inline
  def apply(endColumn: Double, startColumn: Double, word: String): IWordAtPosition = {
    val __obj = js.Dynamic.literal(endColumn = endColumn.asInstanceOf[js.Any], startColumn = startColumn.asInstanceOf[js.Any], word = word.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWordAtPosition]
  }
}


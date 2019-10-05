package typings.monacoDashEditor.monacoDashEditorMod.editor

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
    val __obj = js.Dynamic.literal(endColumn = endColumn, startColumn = startColumn, word = word)
  
    __obj.asInstanceOf[IWordAtPosition]
  }
}


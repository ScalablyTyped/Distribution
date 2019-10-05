package typings.monacoDashEditor.monacoDashEditorMod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICharChange extends IChange {
  val modifiedEndColumn: Double
  val modifiedStartColumn: Double
  val originalEndColumn: Double
  val originalStartColumn: Double
}

object ICharChange {
  @scala.inline
  def apply(
    modifiedEndColumn: Double,
    modifiedEndLineNumber: Double,
    modifiedStartColumn: Double,
    modifiedStartLineNumber: Double,
    originalEndColumn: Double,
    originalEndLineNumber: Double,
    originalStartColumn: Double,
    originalStartLineNumber: Double
  ): ICharChange = {
    val __obj = js.Dynamic.literal(modifiedEndColumn = modifiedEndColumn, modifiedEndLineNumber = modifiedEndLineNumber, modifiedStartColumn = modifiedStartColumn, modifiedStartLineNumber = modifiedStartLineNumber, originalEndColumn = originalEndColumn, originalEndLineNumber = originalEndLineNumber, originalStartColumn = originalStartColumn, originalStartLineNumber = originalStartLineNumber)
  
    __obj.asInstanceOf[ICharChange]
  }
}


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
    val __obj = js.Dynamic.literal(modifiedEndColumn = modifiedEndColumn.asInstanceOf[js.Any], modifiedEndLineNumber = modifiedEndLineNumber.asInstanceOf[js.Any], modifiedStartColumn = modifiedStartColumn.asInstanceOf[js.Any], modifiedStartLineNumber = modifiedStartLineNumber.asInstanceOf[js.Any], originalEndColumn = originalEndColumn.asInstanceOf[js.Any], originalEndLineNumber = originalEndLineNumber.asInstanceOf[js.Any], originalStartColumn = originalStartColumn.asInstanceOf[js.Any], originalStartLineNumber = originalStartLineNumber.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ICharChange]
  }
}


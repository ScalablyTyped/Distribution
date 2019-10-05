package typings.monacoDashEditor.monacoDashEditorMod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChange extends js.Object {
  val modifiedEndLineNumber: Double
  val modifiedStartLineNumber: Double
  val originalEndLineNumber: Double
  val originalStartLineNumber: Double
}

object IChange {
  @scala.inline
  def apply(
    modifiedEndLineNumber: Double,
    modifiedStartLineNumber: Double,
    originalEndLineNumber: Double,
    originalStartLineNumber: Double
  ): IChange = {
    val __obj = js.Dynamic.literal(modifiedEndLineNumber = modifiedEndLineNumber, modifiedStartLineNumber = modifiedStartLineNumber, originalEndLineNumber = originalEndLineNumber, originalStartLineNumber = originalStartLineNumber)
  
    __obj.asInstanceOf[IChange]
  }
}


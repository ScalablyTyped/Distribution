package typings.monacoDashEditor.monacoDashEditorMod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILineChange extends IChange {
  val charChanges: js.UndefOr[js.Array[ICharChange]] = js.undefined
}

object ILineChange {
  @scala.inline
  def apply(
    modifiedEndLineNumber: Double,
    modifiedStartLineNumber: Double,
    originalEndLineNumber: Double,
    originalStartLineNumber: Double,
    charChanges: js.Array[ICharChange] = null
  ): ILineChange = {
    val __obj = js.Dynamic.literal(modifiedEndLineNumber = modifiedEndLineNumber, modifiedStartLineNumber = modifiedStartLineNumber, originalEndLineNumber = originalEndLineNumber, originalStartLineNumber = originalStartLineNumber)
    if (charChanges != null) __obj.updateDynamic("charChanges")(charChanges)
    __obj.asInstanceOf[ILineChange]
  }
}


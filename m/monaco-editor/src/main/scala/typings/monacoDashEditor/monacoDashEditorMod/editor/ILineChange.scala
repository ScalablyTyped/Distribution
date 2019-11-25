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
    val __obj = js.Dynamic.literal(modifiedEndLineNumber = modifiedEndLineNumber.asInstanceOf[js.Any], modifiedStartLineNumber = modifiedStartLineNumber.asInstanceOf[js.Any], originalEndLineNumber = originalEndLineNumber.asInstanceOf[js.Any], originalStartLineNumber = originalStartLineNumber.asInstanceOf[js.Any])
    if (charChanges != null) __obj.updateDynamic("charChanges")(charChanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILineChange]
  }
}


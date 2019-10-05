package typings.monacoDashEditor.monacoDashEditorMod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDiffEditorModel extends IEditorModel {
  /**
    * Modified model.
    */
  var modified: ITextModel
  /**
    * Original model.
    */
  var original: ITextModel
}

object IDiffEditorModel {
  @scala.inline
  def apply(modified: ITextModel, original: ITextModel): IDiffEditorModel = {
    val __obj = js.Dynamic.literal(modified = modified, original = original)
  
    __obj.asInstanceOf[IDiffEditorModel]
  }
}


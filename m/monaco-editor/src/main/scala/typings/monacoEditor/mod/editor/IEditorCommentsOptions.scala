package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEditorCommentsOptions extends js.Object {
  /**
    * Insert a space after the line comment token and inside the block comments tokens.
    * Defaults to true.
    */
  var insertSpace: js.UndefOr[Boolean] = js.undefined
}

object IEditorCommentsOptions {
  @scala.inline
  def apply(insertSpace: js.UndefOr[Boolean] = js.undefined): IEditorCommentsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(insertSpace)) __obj.updateDynamic("insertSpace")(insertSpace.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEditorCommentsOptions]
  }
}


package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEditorLightbulbOptions extends js.Object {
  /**
    * Enable the lightbulb code action.
    * Defaults to true.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}

object IEditorLightbulbOptions {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined): IEditorLightbulbOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEditorLightbulbOptions]
  }
}


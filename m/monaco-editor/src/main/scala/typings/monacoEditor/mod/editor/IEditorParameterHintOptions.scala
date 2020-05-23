package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEditorParameterHintOptions extends js.Object {
  /**
    * Enable cycling of parameter hints.
    * Defaults to false.
    */
  var cycle: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable parameter hints.
    * Defaults to true.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}

object IEditorParameterHintOptions {
  @scala.inline
  def apply(cycle: js.UndefOr[Boolean] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined): IEditorParameterHintOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cycle)) __obj.updateDynamic("cycle")(cycle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEditorParameterHintOptions]
  }
}


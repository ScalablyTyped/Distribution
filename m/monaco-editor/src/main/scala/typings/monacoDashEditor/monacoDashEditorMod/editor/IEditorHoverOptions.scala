package typings.monacoDashEditor.monacoDashEditorMod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEditorHoverOptions extends js.Object {
  /**
    * Delay for showing the hover.
    * Defaults to 300.
    */
  var delay: js.UndefOr[Double] = js.undefined
  /**
    * Enable the hover.
    * Defaults to true.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Is the hover sticky such that it can be clicked and its contents selected?
    * Defaults to true.
    */
  var sticky: js.UndefOr[Boolean] = js.undefined
}

object IEditorHoverOptions {
  @scala.inline
  def apply(
    delay: Int | Double = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    sticky: js.UndefOr[Boolean] = js.undefined
  ): IEditorHoverOptions = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (!js.isUndefined(sticky)) __obj.updateDynamic("sticky")(sticky.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEditorHoverOptions]
  }
}


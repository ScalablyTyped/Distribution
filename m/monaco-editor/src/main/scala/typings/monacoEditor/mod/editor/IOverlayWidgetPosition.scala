package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOverlayWidgetPosition extends js.Object {
  /**
    * The position preference for the overlay widget.
    */
  var preference: OverlayWidgetPositionPreference | Null
}

object IOverlayWidgetPosition {
  @scala.inline
  def apply(preference: OverlayWidgetPositionPreference = null): IOverlayWidgetPosition = {
    val __obj = js.Dynamic.literal()
    if (preference != null) __obj.updateDynamic("preference")(preference.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOverlayWidgetPosition]
  }
}


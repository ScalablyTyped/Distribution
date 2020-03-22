package typings.openfin.viewViewMod

import typings.openfin.shapesMod.ContextMenuSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewOptions extends js.Object {
  var autoResize: js.UndefOr[AutoResizeOptions] = js.undefined
  var backgroundColor: js.UndefOr[String] = js.undefined
  var contextMenuSettings: js.UndefOr[ContextMenuSettings] = js.undefined
  var customContext: js.UndefOr[js.Any] = js.undefined
  var customData: js.UndefOr[js.Any] = js.undefined
}

object ViewOptions {
  @scala.inline
  def apply(
    autoResize: AutoResizeOptions = null,
    backgroundColor: String = null,
    contextMenuSettings: ContextMenuSettings = null,
    customContext: js.Any = null,
    customData: js.Any = null
  ): ViewOptions = {
    val __obj = js.Dynamic.literal()
    if (autoResize != null) __obj.updateDynamic("autoResize")(autoResize.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (contextMenuSettings != null) __obj.updateDynamic("contextMenuSettings")(contextMenuSettings.asInstanceOf[js.Any])
    if (customContext != null) __obj.updateDynamic("customContext")(customContext.asInstanceOf[js.Any])
    if (customData != null) __obj.updateDynamic("customData")(customData.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewOptions]
  }
}


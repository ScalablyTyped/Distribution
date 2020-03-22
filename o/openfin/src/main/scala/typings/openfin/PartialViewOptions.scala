package typings.openfin

import typings.openfin.shapesMod.ContextMenuSettings
import typings.openfin.viewViewMod.AutoResizeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<openfin.openfin.fin.ViewOptions> */
trait PartialViewOptions extends js.Object {
  var autoResize: js.UndefOr[AutoResizeOptions] = js.undefined
  var backgroundColor: js.UndefOr[String] = js.undefined
  var contextMenuSettings: js.UndefOr[ContextMenuSettings] = js.undefined
  var customContext: js.UndefOr[js.Any] = js.undefined
  var customData: js.UndefOr[js.Any] = js.undefined
}

object PartialViewOptions {
  @scala.inline
  def apply(
    autoResize: AutoResizeOptions = null,
    backgroundColor: String = null,
    contextMenuSettings: ContextMenuSettings = null,
    customContext: js.Any = null,
    customData: js.Any = null
  ): PartialViewOptions = {
    val __obj = js.Dynamic.literal()
    if (autoResize != null) __obj.updateDynamic("autoResize")(autoResize.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (contextMenuSettings != null) __obj.updateDynamic("contextMenuSettings")(contextMenuSettings.asInstanceOf[js.Any])
    if (customContext != null) __obj.updateDynamic("customContext")(customContext.asInstanceOf[js.Any])
    if (customData != null) __obj.updateDynamic("customData")(customData.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialViewOptions]
  }
}


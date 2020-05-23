package typings.openfin.anon

import typings.openfin.shapesMod.ContextMenuSettings
import typings.openfin.viewViewMod.AutoResizeOptions
import typings.openfin.windowOptionMod.Api
import typings.openfin.windowOptionMod.ContentNavigation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<openfin.openfin.fin.ViewOptions> */
trait PartialViewOptions extends js.Object {
  var api: js.UndefOr[Api] = js.undefined
  var autoResize: js.UndefOr[AutoResizeOptions] = js.undefined
  var backgroundColor: js.UndefOr[String] = js.undefined
  var contentNavigation: js.UndefOr[ContentNavigation] = js.undefined
  var contextMenuSettings: js.UndefOr[ContextMenuSettings] = js.undefined
  var customContext: js.UndefOr[js.Any] = js.undefined
  var customData: js.UndefOr[js.Any] = js.undefined
  var experimental: js.UndefOr[js.Any] = js.undefined
}

object PartialViewOptions {
  @scala.inline
  def apply(
    api: Api = null,
    autoResize: AutoResizeOptions = null,
    backgroundColor: String = null,
    contentNavigation: ContentNavigation = null,
    contextMenuSettings: ContextMenuSettings = null,
    customContext: js.Any = null,
    customData: js.Any = null,
    experimental: js.Any = null
  ): PartialViewOptions = {
    val __obj = js.Dynamic.literal()
    if (api != null) __obj.updateDynamic("api")(api.asInstanceOf[js.Any])
    if (autoResize != null) __obj.updateDynamic("autoResize")(autoResize.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (contentNavigation != null) __obj.updateDynamic("contentNavigation")(contentNavigation.asInstanceOf[js.Any])
    if (contextMenuSettings != null) __obj.updateDynamic("contextMenuSettings")(contextMenuSettings.asInstanceOf[js.Any])
    if (customContext != null) __obj.updateDynamic("customContext")(customContext.asInstanceOf[js.Any])
    if (customData != null) __obj.updateDynamic("customData")(customData.asInstanceOf[js.Any])
    if (experimental != null) __obj.updateDynamic("experimental")(experimental.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialViewOptions]
  }
}


package typings.openfin.viewViewMod

import typings.openfin.identityMod.Identity
import typings.openfin.shapesMod.ContextMenuSettings
import typings.openfin.shapesMod.ViewBounds
import typings.openfin.windowOptionMod.CustomRequestHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewCreationOptions extends ViewOptions {
  var bounds: js.UndefOr[ViewBounds] = js.undefined
  var customRequestHeaders: js.UndefOr[js.Array[CustomRequestHeaders]] = js.undefined
  var name: String
  var processAffinity: js.UndefOr[String] = js.undefined
  var target: Identity
  var url: String
}

object ViewCreationOptions {
  @scala.inline
  def apply(
    name: String,
    target: Identity,
    url: String,
    autoResize: AutoResizeOptions = null,
    backgroundColor: String = null,
    bounds: ViewBounds = null,
    contextMenuSettings: ContextMenuSettings = null,
    customContext: js.Any = null,
    customData: js.Any = null,
    customRequestHeaders: js.Array[CustomRequestHeaders] = null,
    processAffinity: String = null
  ): ViewCreationOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (autoResize != null) __obj.updateDynamic("autoResize")(autoResize.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (contextMenuSettings != null) __obj.updateDynamic("contextMenuSettings")(contextMenuSettings.asInstanceOf[js.Any])
    if (customContext != null) __obj.updateDynamic("customContext")(customContext.asInstanceOf[js.Any])
    if (customData != null) __obj.updateDynamic("customData")(customData.asInstanceOf[js.Any])
    if (customRequestHeaders != null) __obj.updateDynamic("customRequestHeaders")(customRequestHeaders.asInstanceOf[js.Any])
    if (processAffinity != null) __obj.updateDynamic("processAffinity")(processAffinity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewCreationOptions]
  }
}


package typings.overlayscrollbars.overlayscrollbarsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionInfo extends js.Object {
  var defaultOptions: js.UndefOr[js.Object] = js.undefined
  var name: String
  def extensionFactory(
    `this`: OverlayScrollbars,
    defaultOptions: js.Object,
    compatibility: Compatibility,
    framework: js.Any
  ): Extension
}

object ExtensionInfo {
  @scala.inline
  def apply(
    extensionFactory: (OverlayScrollbars, js.Object, Compatibility, js.Any) => Extension,
    name: String,
    defaultOptions: js.Object = null
  ): ExtensionInfo = {
    val __obj = js.Dynamic.literal(extensionFactory = js.Any.fromFunction4(extensionFactory), name = name)
    if (defaultOptions != null) __obj.updateDynamic("defaultOptions")(defaultOptions)
    __obj.asInstanceOf[ExtensionInfo]
  }
}


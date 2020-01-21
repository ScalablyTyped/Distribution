package typings.overlayscrollbars.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionInfo extends js.Object {
  var defaultOptions: js.UndefOr[js.Object] = js.undefined
  var name: String
  def extensionFactory(defaultOptions: js.Object, compatibility: Compatibility, framework: js.Any): Extension
}

object ExtensionInfo {
  @scala.inline
  def apply(
    extensionFactory: (js.Object, Compatibility, js.Any) => Extension,
    name: String,
    defaultOptions: js.Object = null
  ): ExtensionInfo = {
    val __obj = js.Dynamic.literal(extensionFactory = js.Any.fromFunction3(extensionFactory), name = name.asInstanceOf[js.Any])
    if (defaultOptions != null) __obj.updateDynamic("defaultOptions")(defaultOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionInfo]
  }
}


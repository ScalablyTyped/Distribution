package typings
package overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionInfo extends js.Object {
  var defaultOptions: js.UndefOr[js.Object] = js.undefined
  var name: java.lang.String
  def extensionFactory(
    `this`: overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbars,
    defaultOptions: js.Object,
    compatibility: Compatibility,
    framework: js.Any
  ): Extension
}

object ExtensionInfo {
  @scala.inline
  def apply(
    extensionFactory: js.Function4[
      overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbars, 
      js.Object, 
      Compatibility, 
      js.Any, 
      Extension
    ],
    name: java.lang.String,
    defaultOptions: js.Object = null
  ): ExtensionInfo = {
    val __obj = js.Dynamic.literal(extensionFactory = extensionFactory, name = name)
    if (defaultOptions != null) __obj.updateDynamic("defaultOptions")(defaultOptions)
    __obj.asInstanceOf[ExtensionInfo]
  }
}


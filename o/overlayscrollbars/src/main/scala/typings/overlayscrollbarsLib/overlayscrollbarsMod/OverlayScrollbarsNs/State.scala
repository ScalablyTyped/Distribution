package typings
package overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var autoUpdate: scala.Boolean
  var contentScrollSize: overlayscrollbarsLib.Anon_Height
  var documentMixed: scala.Boolean
  var hasOverflow: overlayscrollbarsLib.Anon_XYBoolean
  var heightAuto: scala.Boolean
  var hideOverflow: overlayscrollbarsLib.Anon_XXs
  var hostSize: overlayscrollbarsLib.Anon_Height
  var overflowAmount: overlayscrollbarsLib.Anon_XYNumber
  var padding: overlayscrollbarsLib.Anon_B
  var sleeping: scala.Boolean
  var viewportSize: overlayscrollbarsLib.Anon_Height
  var widthAuto: scala.Boolean
}

object State {
  @scala.inline
  def apply(
    autoUpdate: scala.Boolean,
    contentScrollSize: overlayscrollbarsLib.Anon_Height,
    documentMixed: scala.Boolean,
    hasOverflow: overlayscrollbarsLib.Anon_XYBoolean,
    heightAuto: scala.Boolean,
    hideOverflow: overlayscrollbarsLib.Anon_XXs,
    hostSize: overlayscrollbarsLib.Anon_Height,
    overflowAmount: overlayscrollbarsLib.Anon_XYNumber,
    padding: overlayscrollbarsLib.Anon_B,
    sleeping: scala.Boolean,
    viewportSize: overlayscrollbarsLib.Anon_Height,
    widthAuto: scala.Boolean
  ): State = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("autoUpdate")(autoUpdate)
    __obj.updateDynamic("contentScrollSize")(contentScrollSize)
    __obj.updateDynamic("documentMixed")(documentMixed)
    __obj.updateDynamic("hasOverflow")(hasOverflow)
    __obj.updateDynamic("heightAuto")(heightAuto)
    __obj.updateDynamic("hideOverflow")(hideOverflow)
    __obj.updateDynamic("hostSize")(hostSize)
    __obj.updateDynamic("overflowAmount")(overflowAmount)
    __obj.updateDynamic("padding")(padding)
    __obj.updateDynamic("sleeping")(sleeping)
    __obj.updateDynamic("viewportSize")(viewportSize)
    __obj.updateDynamic("widthAuto")(widthAuto)
    __obj.asInstanceOf[State]
  }
}


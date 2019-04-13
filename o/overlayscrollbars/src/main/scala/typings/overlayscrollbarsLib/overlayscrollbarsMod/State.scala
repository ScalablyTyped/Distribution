package typings
package overlayscrollbarsLib.overlayscrollbarsMod

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
    val __obj = js.Dynamic.literal(autoUpdate = autoUpdate, contentScrollSize = contentScrollSize, documentMixed = documentMixed, hasOverflow = hasOverflow, heightAuto = heightAuto, hideOverflow = hideOverflow, hostSize = hostSize, overflowAmount = overflowAmount, padding = padding, sleeping = sleeping, viewportSize = viewportSize, widthAuto = widthAuto)
  
    __obj.asInstanceOf[State]
  }
}


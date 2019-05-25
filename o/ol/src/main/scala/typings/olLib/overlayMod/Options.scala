package typings
package olLib.overlayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var autoPan: js.UndefOr[scala.Boolean] = js.undefined
  var autoPanAnimation: js.UndefOr[PanOptions] = js.undefined
  var autoPanMargin: js.UndefOr[scala.Double] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var element: js.UndefOr[stdLib.HTMLElement] = js.undefined
  var id: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var insertFirst: js.UndefOr[scala.Boolean] = js.undefined
  var offset: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var position: js.UndefOr[olLib.coordinateMod.Coordinate] = js.undefined
  var positioning: js.UndefOr[olLib.overlayPositioningMod.OverlayPositioning] = js.undefined
  var stopEvent: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    autoPan: js.UndefOr[scala.Boolean] = js.undefined,
    autoPanAnimation: PanOptions = null,
    autoPanMargin: scala.Int | scala.Double = null,
    className: java.lang.String = null,
    element: stdLib.HTMLElement = null,
    id: scala.Double | java.lang.String = null,
    insertFirst: js.UndefOr[scala.Boolean] = js.undefined,
    offset: js.Array[scala.Double] = null,
    position: olLib.coordinateMod.Coordinate = null,
    positioning: olLib.overlayPositioningMod.OverlayPositioning = null,
    stopEvent: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoPan)) __obj.updateDynamic("autoPan")(autoPan)
    if (autoPanAnimation != null) __obj.updateDynamic("autoPanAnimation")(autoPanAnimation)
    if (autoPanMargin != null) __obj.updateDynamic("autoPanMargin")(autoPanMargin.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (element != null) __obj.updateDynamic("element")(element)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(insertFirst)) __obj.updateDynamic("insertFirst")(insertFirst)
    if (offset != null) __obj.updateDynamic("offset")(offset)
    if (position != null) __obj.updateDynamic("position")(position)
    if (positioning != null) __obj.updateDynamic("positioning")(positioning)
    if (!js.isUndefined(stopEvent)) __obj.updateDynamic("stopEvent")(stopEvent)
    __obj.asInstanceOf[Options]
  }
}


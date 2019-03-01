package typings
package openlayersLib.openlayersMod.olxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object literal with config options for the overlay.
  */
trait OverlayOptions extends js.Object {
  var autoPan: js.UndefOr[scala.Boolean] = js.undefined
  var autoPanAnimation: js.UndefOr[openlayersLib.openlayersMod.olxNs.animationNs.PanOptions] = js.undefined
  var autoPanMargin: js.UndefOr[scala.Double] = js.undefined
  var element: js.UndefOr[stdLib.Element] = js.undefined
  var id: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var insertFirst: js.UndefOr[scala.Boolean] = js.undefined
  var offset: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var position: js.UndefOr[openlayersLib.openlayersMod.Coordinate] = js.undefined
  var positioning: js.UndefOr[openlayersLib.openlayersMod.OverlayPositioning | java.lang.String] = js.undefined
  var stopEvent: js.UndefOr[scala.Boolean] = js.undefined
}

object OverlayOptions {
  @scala.inline
  def apply(
    autoPan: js.UndefOr[scala.Boolean] = js.undefined,
    autoPanAnimation: openlayersLib.openlayersMod.olxNs.animationNs.PanOptions = null,
    autoPanMargin: scala.Int | scala.Double = null,
    element: stdLib.Element = null,
    id: scala.Double | java.lang.String = null,
    insertFirst: js.UndefOr[scala.Boolean] = js.undefined,
    offset: js.Array[scala.Double] = null,
    position: openlayersLib.openlayersMod.Coordinate = null,
    positioning: openlayersLib.openlayersMod.OverlayPositioning | java.lang.String = null,
    stopEvent: js.UndefOr[scala.Boolean] = js.undefined
  ): OverlayOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoPan)) __obj.updateDynamic("autoPan")(autoPan)
    if (autoPanAnimation != null) __obj.updateDynamic("autoPanAnimation")(autoPanAnimation)
    if (autoPanMargin != null) __obj.updateDynamic("autoPanMargin")(autoPanMargin.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(insertFirst)) __obj.updateDynamic("insertFirst")(insertFirst)
    if (offset != null) __obj.updateDynamic("offset")(offset)
    if (position != null) __obj.updateDynamic("position")(position)
    if (positioning != null) __obj.updateDynamic("positioning")(positioning.asInstanceOf[js.Any])
    if (!js.isUndefined(stopEvent)) __obj.updateDynamic("stopEvent")(stopEvent)
    __obj.asInstanceOf[OverlayOptions]
  }
}


package typings.openlayers.openlayersMod.olxNs

import typings.openlayers.openlayersMod.Coordinate
import typings.openlayers.openlayersMod.OverlayPositioning
import typings.openlayers.openlayersMod.olxNs.animationNs.PanOptions
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object literal with config options for the overlay.
  */
trait OverlayOptions extends js.Object {
  var autoPan: js.UndefOr[Boolean] = js.undefined
  var autoPanAnimation: js.UndefOr[PanOptions] = js.undefined
  var autoPanMargin: js.UndefOr[Double] = js.undefined
  var element: js.UndefOr[Element] = js.undefined
  var id: js.UndefOr[Double | String] = js.undefined
  var insertFirst: js.UndefOr[Boolean] = js.undefined
  var offset: js.UndefOr[js.Array[Double]] = js.undefined
  var position: js.UndefOr[Coordinate] = js.undefined
  var positioning: js.UndefOr[OverlayPositioning | String] = js.undefined
  var stopEvent: js.UndefOr[Boolean] = js.undefined
}

object OverlayOptions {
  @scala.inline
  def apply(
    autoPan: js.UndefOr[Boolean] = js.undefined,
    autoPanAnimation: PanOptions = null,
    autoPanMargin: Int | Double = null,
    element: Element = null,
    id: Double | String = null,
    insertFirst: js.UndefOr[Boolean] = js.undefined,
    offset: js.Array[Double] = null,
    position: Coordinate = null,
    positioning: OverlayPositioning | String = null,
    stopEvent: js.UndefOr[Boolean] = js.undefined
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


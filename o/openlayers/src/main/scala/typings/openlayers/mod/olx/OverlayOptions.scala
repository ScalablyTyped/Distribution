package typings.openlayers.mod.olx

import typings.openlayers.mod.Coordinate_
import typings.openlayers.mod.OverlayPositioning
import typings.openlayers.mod.olx.animation.PanOptions
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
  var position: js.UndefOr[Coordinate_] = js.undefined
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
    position: Coordinate_ = null,
    positioning: OverlayPositioning | String = null,
    stopEvent: js.UndefOr[Boolean] = js.undefined
  ): OverlayOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoPan)) __obj.updateDynamic("autoPan")(autoPan.asInstanceOf[js.Any])
    if (autoPanAnimation != null) __obj.updateDynamic("autoPanAnimation")(autoPanAnimation.asInstanceOf[js.Any])
    if (autoPanMargin != null) __obj.updateDynamic("autoPanMargin")(autoPanMargin.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(insertFirst)) __obj.updateDynamic("insertFirst")(insertFirst.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (positioning != null) __obj.updateDynamic("positioning")(positioning.asInstanceOf[js.Any])
    if (!js.isUndefined(stopEvent)) __obj.updateDynamic("stopEvent")(stopEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayOptions]
  }
}


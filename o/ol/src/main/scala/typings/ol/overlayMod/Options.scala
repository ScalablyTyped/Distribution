package typings.ol.overlayMod

import typings.ol.coordinateMod.Coordinate
import typings.ol.overlayPositioningMod.OverlayPositioning
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var autoPan: js.UndefOr[PanIntoViewOptions | Boolean] = js.undefined
  var autoPanAnimation: js.UndefOr[PanOptions] = js.undefined
  var autoPanMargin: js.UndefOr[Double] = js.undefined
  var autoPanOptions: js.UndefOr[PanIntoViewOptions] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var element: js.UndefOr[HTMLElement] = js.undefined
  var id: js.UndefOr[Double | String] = js.undefined
  var insertFirst: js.UndefOr[Boolean] = js.undefined
  var offset: js.UndefOr[js.Array[Double]] = js.undefined
  var position: js.UndefOr[Coordinate] = js.undefined
  var positioning: js.UndefOr[OverlayPositioning] = js.undefined
  var stopEvent: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    autoPan: PanIntoViewOptions | Boolean = null,
    autoPanAnimation: PanOptions = null,
    autoPanMargin: js.UndefOr[Double] = js.undefined,
    autoPanOptions: PanIntoViewOptions = null,
    className: String = null,
    element: HTMLElement = null,
    id: Double | String = null,
    insertFirst: js.UndefOr[Boolean] = js.undefined,
    offset: js.Array[Double] = null,
    position: Coordinate = null,
    positioning: OverlayPositioning = null,
    stopEvent: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (autoPan != null) __obj.updateDynamic("autoPan")(autoPan.asInstanceOf[js.Any])
    if (autoPanAnimation != null) __obj.updateDynamic("autoPanAnimation")(autoPanAnimation.asInstanceOf[js.Any])
    if (!js.isUndefined(autoPanMargin)) __obj.updateDynamic("autoPanMargin")(autoPanMargin.get.asInstanceOf[js.Any])
    if (autoPanOptions != null) __obj.updateDynamic("autoPanOptions")(autoPanOptions.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(insertFirst)) __obj.updateDynamic("insertFirst")(insertFirst.get.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (positioning != null) __obj.updateDynamic("positioning")(positioning.asInstanceOf[js.Any])
    if (!js.isUndefined(stopEvent)) __obj.updateDynamic("stopEvent")(stopEvent.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


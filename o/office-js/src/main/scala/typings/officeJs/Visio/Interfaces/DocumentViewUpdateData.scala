package typings.officeJs.Visio.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the DocumentView object, for use in "documentView.set({ ... })". */
trait DocumentViewUpdateData extends js.Object {
  /**
    *
    * Disable Hyperlinks.
    *
    * [Api set:  1.1]
    */
  var disableHyperlinks: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Disable Pan.
    *
    * [Api set:  1.1]
    */
  var disablePan: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Disable PanZoomWindow.
    *
    * [Api set:  1.1]
    */
  var disablePanZoomWindow: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Disable Zoom.
    *
    * [Api set:  1.1]
    */
  var disableZoom: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Hide Diagram Boundary.
    *
    * [Api set:  1.1]
    */
  var hideDiagramBoundary: js.UndefOr[Boolean] = js.undefined
}

object DocumentViewUpdateData {
  @scala.inline
  def apply(
    disableHyperlinks: js.UndefOr[Boolean] = js.undefined,
    disablePan: js.UndefOr[Boolean] = js.undefined,
    disablePanZoomWindow: js.UndefOr[Boolean] = js.undefined,
    disableZoom: js.UndefOr[Boolean] = js.undefined,
    hideDiagramBoundary: js.UndefOr[Boolean] = js.undefined
  ): DocumentViewUpdateData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableHyperlinks)) __obj.updateDynamic("disableHyperlinks")(disableHyperlinks.asInstanceOf[js.Any])
    if (!js.isUndefined(disablePan)) __obj.updateDynamic("disablePan")(disablePan.asInstanceOf[js.Any])
    if (!js.isUndefined(disablePanZoomWindow)) __obj.updateDynamic("disablePanZoomWindow")(disablePanZoomWindow.asInstanceOf[js.Any])
    if (!js.isUndefined(disableZoom)) __obj.updateDynamic("disableZoom")(disableZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(hideDiagramBoundary)) __obj.updateDynamic("hideDiagramBoundary")(hideDiagramBoundary.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentViewUpdateData]
  }
}


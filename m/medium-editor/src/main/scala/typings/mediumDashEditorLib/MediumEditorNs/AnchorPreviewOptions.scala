package typings
package mediumDashEditorLib.MediumEditorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnchorPreviewOptions extends js.Object {
  var hideDelay: js.UndefOr[scala.Double] = js.undefined
  var previewValueSelector: js.UndefOr[java.lang.String] = js.undefined
  var showOnEmptyLinks: js.UndefOr[scala.Boolean] = js.undefined
  var showWhenToolbarIsVisible: js.UndefOr[scala.Boolean] = js.undefined
}

object AnchorPreviewOptions {
  @scala.inline
  def apply(
    hideDelay: scala.Int | scala.Double = null,
    previewValueSelector: java.lang.String = null,
    showOnEmptyLinks: js.UndefOr[scala.Boolean] = js.undefined,
    showWhenToolbarIsVisible: js.UndefOr[scala.Boolean] = js.undefined
  ): AnchorPreviewOptions = {
    val __obj = js.Dynamic.literal()
    if (hideDelay != null) __obj.updateDynamic("hideDelay")(hideDelay.asInstanceOf[js.Any])
    if (previewValueSelector != null) __obj.updateDynamic("previewValueSelector")(previewValueSelector)
    if (!js.isUndefined(showOnEmptyLinks)) __obj.updateDynamic("showOnEmptyLinks")(showOnEmptyLinks)
    if (!js.isUndefined(showWhenToolbarIsVisible)) __obj.updateDynamic("showWhenToolbarIsVisible")(showWhenToolbarIsVisible)
    __obj.asInstanceOf[AnchorPreviewOptions]
  }
}


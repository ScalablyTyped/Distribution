package typings.mediumDashEditor.MediumEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnchorPreviewOptions extends js.Object {
  var hideDelay: js.UndefOr[Double] = js.undefined
  var previewValueSelector: js.UndefOr[String] = js.undefined
  var showOnEmptyLinks: js.UndefOr[Boolean] = js.undefined
  var showWhenToolbarIsVisible: js.UndefOr[Boolean] = js.undefined
}

object AnchorPreviewOptions {
  @scala.inline
  def apply(
    hideDelay: Int | Double = null,
    previewValueSelector: String = null,
    showOnEmptyLinks: js.UndefOr[Boolean] = js.undefined,
    showWhenToolbarIsVisible: js.UndefOr[Boolean] = js.undefined
  ): AnchorPreviewOptions = {
    val __obj = js.Dynamic.literal()
    if (hideDelay != null) __obj.updateDynamic("hideDelay")(hideDelay.asInstanceOf[js.Any])
    if (previewValueSelector != null) __obj.updateDynamic("previewValueSelector")(previewValueSelector.asInstanceOf[js.Any])
    if (!js.isUndefined(showOnEmptyLinks)) __obj.updateDynamic("showOnEmptyLinks")(showOnEmptyLinks.asInstanceOf[js.Any])
    if (!js.isUndefined(showWhenToolbarIsVisible)) __obj.updateDynamic("showWhenToolbarIsVisible")(showWhenToolbarIsVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnchorPreviewOptions]
  }
}


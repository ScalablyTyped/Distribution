package typings.mediumEditor.MediumEditor

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
    hideDelay: js.UndefOr[Double] = js.undefined,
    previewValueSelector: String = null,
    showOnEmptyLinks: js.UndefOr[Boolean] = js.undefined,
    showWhenToolbarIsVisible: js.UndefOr[Boolean] = js.undefined
  ): AnchorPreviewOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hideDelay)) __obj.updateDynamic("hideDelay")(hideDelay.get.asInstanceOf[js.Any])
    if (previewValueSelector != null) __obj.updateDynamic("previewValueSelector")(previewValueSelector.asInstanceOf[js.Any])
    if (!js.isUndefined(showOnEmptyLinks)) __obj.updateDynamic("showOnEmptyLinks")(showOnEmptyLinks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showWhenToolbarIsVisible)) __obj.updateDynamic("showWhenToolbarIsVisible")(showWhenToolbarIsVisible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnchorPreviewOptions]
  }
}


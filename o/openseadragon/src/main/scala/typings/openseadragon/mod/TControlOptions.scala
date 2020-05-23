package typings.openseadragon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TControlOptions extends js.Object {
  var anchor: js.UndefOr[ControlAnchor] = js.undefined
  var attachToViewer: js.UndefOr[Boolean] = js.undefined
  var autoFade: js.UndefOr[Boolean] = js.undefined
}

object TControlOptions {
  @scala.inline
  def apply(
    anchor: ControlAnchor = null,
    attachToViewer: js.UndefOr[Boolean] = js.undefined,
    autoFade: js.UndefOr[Boolean] = js.undefined
  ): TControlOptions = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (!js.isUndefined(attachToViewer)) __obj.updateDynamic("attachToViewer")(attachToViewer.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFade)) __obj.updateDynamic("autoFade")(autoFade.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TControlOptions]
  }
}


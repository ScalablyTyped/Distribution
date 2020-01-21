package typings.oracleOraclejet

import typings.oracleOraclejet.oracleOraclejetStrings.bottom
import typings.oracleOraclejet.oracleOraclejetStrings.end
import typings.oracleOraclejet.oracleOraclejetStrings.focusLoss
import typings.oracleOraclejet.oracleOraclejetStrings.modal
import typings.oracleOraclejet.oracleOraclejetStrings.modeless
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.overlay
import typings.oracleOraclejet.oracleOraclejetStrings.push
import typings.oracleOraclejet.oracleOraclejetStrings.start
import typings.oracleOraclejet.oracleOraclejetStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAutoDismiss extends js.Object {
  var autoDismiss: js.UndefOr[focusLoss | none] = js.undefined
  var content: String
  var displayMode: js.UndefOr[push | overlay] = js.undefined
  var edge: js.UndefOr[start | end | top | bottom] = js.undefined
  var modality: js.UndefOr[modal | modeless] = js.undefined
  var selector: String
  var size: js.UndefOr[String] = js.undefined
}

object AnonAutoDismiss {
  @scala.inline
  def apply(
    content: String,
    selector: String,
    autoDismiss: focusLoss | none = null,
    displayMode: push | overlay = null,
    edge: start | end | top | bottom = null,
    modality: modal | modeless = null,
    size: String = null
  ): AnonAutoDismiss = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    if (autoDismiss != null) __obj.updateDynamic("autoDismiss")(autoDismiss.asInstanceOf[js.Any])
    if (displayMode != null) __obj.updateDynamic("displayMode")(displayMode.asInstanceOf[js.Any])
    if (edge != null) __obj.updateDynamic("edge")(edge.asInstanceOf[js.Any])
    if (modality != null) __obj.updateDynamic("modality")(modality.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAutoDismiss]
  }
}


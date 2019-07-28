package typings.atOracleOraclejet

import typings.atOracleOraclejet.atOracleOraclejetStrings.bottom
import typings.atOracleOraclejet.atOracleOraclejetStrings.end
import typings.atOracleOraclejet.atOracleOraclejetStrings.focusLoss
import typings.atOracleOraclejet.atOracleOraclejetStrings.modal
import typings.atOracleOraclejet.atOracleOraclejetStrings.modeless
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.overlay
import typings.atOracleOraclejet.atOracleOraclejetStrings.push
import typings.atOracleOraclejet.atOracleOraclejetStrings.start
import typings.atOracleOraclejet.atOracleOraclejetStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoDismiss extends js.Object {
  var autoDismiss: js.UndefOr[focusLoss | none] = js.undefined
  var content: String
  var displayMode: js.UndefOr[push | overlay] = js.undefined
  var edge: js.UndefOr[start | end | top | bottom] = js.undefined
  var modality: js.UndefOr[modal | modeless] = js.undefined
  var selector: String
  var size: js.UndefOr[String] = js.undefined
}

object Anon_AutoDismiss {
  @scala.inline
  def apply(
    content: String,
    selector: String,
    autoDismiss: focusLoss | none = null,
    displayMode: push | overlay = null,
    edge: start | end | top | bottom = null,
    modality: modal | modeless = null,
    size: String = null
  ): Anon_AutoDismiss = {
    val __obj = js.Dynamic.literal(content = content, selector = selector)
    if (autoDismiss != null) __obj.updateDynamic("autoDismiss")(autoDismiss.asInstanceOf[js.Any])
    if (displayMode != null) __obj.updateDynamic("displayMode")(displayMode.asInstanceOf[js.Any])
    if (edge != null) __obj.updateDynamic("edge")(edge.asInstanceOf[js.Any])
    if (modality != null) __obj.updateDynamic("modality")(modality.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[Anon_AutoDismiss]
  }
}


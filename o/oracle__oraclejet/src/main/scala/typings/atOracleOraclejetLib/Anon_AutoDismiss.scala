package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoDismiss extends js.Object {
  var autoDismiss: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.focusLoss | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ] = js.undefined
  var content: java.lang.String
  var displayMode: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.push | atOracleOraclejetLib.atOracleOraclejetLibStrings.overlay
  ] = js.undefined
  var edge: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.start | atOracleOraclejetLib.atOracleOraclejetLibStrings.end | atOracleOraclejetLib.atOracleOraclejetLibStrings.top | atOracleOraclejetLib.atOracleOraclejetLibStrings.bottom
  ] = js.undefined
  var modality: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.modal | atOracleOraclejetLib.atOracleOraclejetLibStrings.modeless
  ] = js.undefined
  var selector: java.lang.String
  var size: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AutoDismiss {
  @scala.inline
  def apply(
    content: java.lang.String,
    selector: java.lang.String,
    autoDismiss: atOracleOraclejetLib.atOracleOraclejetLibStrings.focusLoss | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = null,
    displayMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.push | atOracleOraclejetLib.atOracleOraclejetLibStrings.overlay = null,
    edge: atOracleOraclejetLib.atOracleOraclejetLibStrings.start | atOracleOraclejetLib.atOracleOraclejetLibStrings.end | atOracleOraclejetLib.atOracleOraclejetLibStrings.top | atOracleOraclejetLib.atOracleOraclejetLibStrings.bottom = null,
    modality: atOracleOraclejetLib.atOracleOraclejetLibStrings.modal | atOracleOraclejetLib.atOracleOraclejetLibStrings.modeless = null,
    size: java.lang.String = null
  ): Anon_AutoDismiss = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("content")(content)
    __obj.updateDynamic("selector")(selector)
    if (autoDismiss != null) __obj.updateDynamic("autoDismiss")(autoDismiss.asInstanceOf[js.Any])
    if (displayMode != null) __obj.updateDynamic("displayMode")(displayMode.asInstanceOf[js.Any])
    if (edge != null) __obj.updateDynamic("edge")(edge.asInstanceOf[js.Any])
    if (modality != null) __obj.updateDynamic("modality")(modality.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[Anon_AutoDismiss]
  }
}


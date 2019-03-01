package typings
package atOracleOraclejetLib.ojpopupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojPopupSettableProperties
  extends atOracleOraclejetLib.atOracleOraclejetMod.baseComponentSettableProperties {
  var autoDismiss: atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.focusLoss
  var chrome: atOracleOraclejetLib.atOracleOraclejetLibStrings.default | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  var initialFocus: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.firstFocusable | atOracleOraclejetLib.atOracleOraclejetLibStrings.popup
  var modality: atOracleOraclejetLib.atOracleOraclejetLibStrings.modeless | atOracleOraclejetLib.atOracleOraclejetLibStrings.modal
  var position: atOracleOraclejetLib.ojpopupMod.ojPopupNs.Position
  var tail: atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.simple
  @JSName("translations")
  var translations_ojPopupSettableProperties: atOracleOraclejetLib.Anon_AriaCloseSkipLink
}

object ojPopupSettableProperties {
  @scala.inline
  def apply(
    autoDismiss: atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.focusLoss,
    chrome: atOracleOraclejetLib.atOracleOraclejetLibStrings.default | atOracleOraclejetLib.atOracleOraclejetLibStrings.none,
    initialFocus: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.firstFocusable | atOracleOraclejetLib.atOracleOraclejetLibStrings.popup,
    modality: atOracleOraclejetLib.atOracleOraclejetLibStrings.modeless | atOracleOraclejetLib.atOracleOraclejetLibStrings.modal,
    position: atOracleOraclejetLib.ojpopupMod.ojPopupNs.Position,
    tail: atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.simple,
    translations: atOracleOraclejetLib.Anon_AriaCloseSkipLink
  ): ojPopupSettableProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("autoDismiss")(autoDismiss.asInstanceOf[js.Any])
    __obj.updateDynamic("chrome")(chrome.asInstanceOf[js.Any])
    __obj.updateDynamic("initialFocus")(initialFocus.asInstanceOf[js.Any])
    __obj.updateDynamic("modality")(modality.asInstanceOf[js.Any])
    __obj.updateDynamic("position")(position)
    __obj.updateDynamic("tail")(tail.asInstanceOf[js.Any])
    __obj.updateDynamic("translations")(translations)
    __obj.asInstanceOf[ojPopupSettableProperties]
  }
}


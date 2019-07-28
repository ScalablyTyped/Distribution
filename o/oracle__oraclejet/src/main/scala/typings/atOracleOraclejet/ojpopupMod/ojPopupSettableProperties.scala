package typings.atOracleOraclejet.ojpopupMod

import typings.atOracleOraclejet.Anon_AriaCloseSkipLink
import typings.atOracleOraclejet.atOracleOraclejetMod.baseComponentSettableProperties
import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.default
import typings.atOracleOraclejet.atOracleOraclejetStrings.firstFocusable
import typings.atOracleOraclejet.atOracleOraclejetStrings.focusLoss
import typings.atOracleOraclejet.atOracleOraclejetStrings.modal
import typings.atOracleOraclejet.atOracleOraclejetStrings.modeless
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.popup
import typings.atOracleOraclejet.atOracleOraclejetStrings.simple
import typings.atOracleOraclejet.ojpopupMod.ojPopupNs.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojPopupSettableProperties extends baseComponentSettableProperties {
  var autoDismiss: none | focusLoss
  var chrome: default | none
  var initialFocus: auto | none | firstFocusable | popup
  var modality: modeless | modal
  var position: Position
  var tail: none | simple
  @JSName("translations")
  var translations_ojPopupSettableProperties: Anon_AriaCloseSkipLink
}

object ojPopupSettableProperties {
  @scala.inline
  def apply(
    autoDismiss: none | focusLoss,
    chrome: default | none,
    initialFocus: auto | none | firstFocusable | popup,
    modality: modeless | modal,
    position: Position,
    tail: none | simple,
    translations: Anon_AriaCloseSkipLink
  ): ojPopupSettableProperties = {
    val __obj = js.Dynamic.literal(autoDismiss = autoDismiss.asInstanceOf[js.Any], chrome = chrome.asInstanceOf[js.Any], initialFocus = initialFocus.asInstanceOf[js.Any], modality = modality.asInstanceOf[js.Any], position = position, tail = tail.asInstanceOf[js.Any], translations = translations)
  
    __obj.asInstanceOf[ojPopupSettableProperties]
  }
}


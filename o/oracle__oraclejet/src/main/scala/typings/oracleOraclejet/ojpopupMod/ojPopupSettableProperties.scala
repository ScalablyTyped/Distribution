package typings.oracleOraclejet.ojpopupMod

import typings.oracleOraclejet.anon.AriaCloseSkipLink
import typings.oracleOraclejet.mod.baseComponentSettableProperties
import typings.oracleOraclejet.ojpopupMod.ojPopup.Position
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.default
import typings.oracleOraclejet.oracleOraclejetStrings.firstFocusable
import typings.oracleOraclejet.oracleOraclejetStrings.focusLoss
import typings.oracleOraclejet.oracleOraclejetStrings.modal
import typings.oracleOraclejet.oracleOraclejetStrings.modeless
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.popup
import typings.oracleOraclejet.oracleOraclejetStrings.simple
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojPopupSettableProperties extends baseComponentSettableProperties {
  var autoDismiss: none | focusLoss = js.native
  var chrome: default | none = js.native
  var initialFocus: auto | none | firstFocusable | popup = js.native
  var modality: modeless | modal = js.native
  var position: Position = js.native
  var tail: none | simple = js.native
  @JSName("translations")
  var translations_ojPopupSettableProperties: AriaCloseSkipLink = js.native
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
    translations: AriaCloseSkipLink
  ): ojPopupSettableProperties = {
    val __obj = js.Dynamic.literal(autoDismiss = autoDismiss.asInstanceOf[js.Any], chrome = chrome.asInstanceOf[js.Any], initialFocus = initialFocus.asInstanceOf[js.Any], modality = modality.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], tail = tail.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojPopupSettableProperties]
  }
  @scala.inline
  implicit class ojPopupSettablePropertiesOps[Self <: ojPopupSettableProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutoDismiss(value: none | focusLoss): Self = this.set("autoDismiss", value.asInstanceOf[js.Any])
    @scala.inline
    def setChrome(value: default | none): Self = this.set("chrome", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitialFocus(value: auto | none | firstFocusable | popup): Self = this.set("initialFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def setModality(value: modeless | modal): Self = this.set("modality", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: Position): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setTail(value: none | simple): Self = this.set("tail", value.asInstanceOf[js.Any])
    @scala.inline
    def setTranslations(value: AriaCloseSkipLink): Self = this.set("translations", value.asInstanceOf[js.Any])
  }
  
}


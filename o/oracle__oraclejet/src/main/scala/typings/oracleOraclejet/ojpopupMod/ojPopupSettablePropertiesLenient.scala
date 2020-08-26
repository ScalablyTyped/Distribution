package typings.oracleOraclejet.ojpopupMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.AriaCloseSkipLink
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

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojpopup.ojPopupSettableProperties> */
@js.native
trait ojPopupSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var autoDismiss: js.UndefOr[none | focusLoss] = js.native
  var chrome: js.UndefOr[default | none] = js.native
  var initialFocus: js.UndefOr[auto | none | firstFocusable | popup] = js.native
  var modality: js.UndefOr[modeless | modal] = js.native
  var position: js.UndefOr[Position] = js.native
  var tail: js.UndefOr[none | simple] = js.native
  var translations: js.UndefOr[AriaCloseSkipLink] = js.native
}

object ojPopupSettablePropertiesLenient {
  @scala.inline
  def apply(): ojPopupSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojPopupSettablePropertiesLenient]
  }
  @scala.inline
  implicit class ojPopupSettablePropertiesLenientOps[Self <: ojPopupSettablePropertiesLenient] (val x: Self) extends AnyVal {
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
    def deleteAutoDismiss: Self = this.set("autoDismiss", js.undefined)
    @scala.inline
    def setChrome(value: default | none): Self = this.set("chrome", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChrome: Self = this.set("chrome", js.undefined)
    @scala.inline
    def setInitialFocus(value: auto | none | firstFocusable | popup): Self = this.set("initialFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialFocus: Self = this.set("initialFocus", js.undefined)
    @scala.inline
    def setModality(value: modeless | modal): Self = this.set("modality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModality: Self = this.set("modality", js.undefined)
    @scala.inline
    def setPosition(value: Position): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setTail(value: none | simple): Self = this.set("tail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTail: Self = this.set("tail", js.undefined)
    @scala.inline
    def setTranslations(value: AriaCloseSkipLink): Self = this.set("translations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslations: Self = this.set("translations", js.undefined)
  }
  
}


package typings.atOracleOraclejet.ojdialogMod

import typings.atOracleOraclejet.Anon_LabelCloseIcon
import typings.atOracleOraclejet.atOracleOraclejetMod.baseComponentSettableProperties
import typings.atOracleOraclejet.atOracleOraclejetStrings.`title-bar`
import typings.atOracleOraclejet.atOracleOraclejetStrings.escape
import typings.atOracleOraclejet.atOracleOraclejetStrings.hide
import typings.atOracleOraclejet.atOracleOraclejetStrings.icon
import typings.atOracleOraclejet.atOracleOraclejetStrings.modal
import typings.atOracleOraclejet.atOracleOraclejetStrings.modeless
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.resizable
import typings.atOracleOraclejet.atOracleOraclejetStrings.show
import typings.atOracleOraclejet.ojdialogMod.ojDialog.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojDialogSettableProperties extends baseComponentSettableProperties {
  var cancelBehavior: icon | escape | none
  var dialogTitle: String | Null
  var dragAffordance: `title-bar` | none
  var initialVisibility: hide | show
  var modality: modal | modeless
  var position: Position
  var resizeBehavior: resizable | none
  var role: String
  @JSName("translations")
  var translations_ojDialogSettableProperties: Anon_LabelCloseIcon
}

object ojDialogSettableProperties {
  @scala.inline
  def apply(
    cancelBehavior: icon | escape | none,
    dragAffordance: `title-bar` | none,
    initialVisibility: hide | show,
    modality: modal | modeless,
    position: Position,
    resizeBehavior: resizable | none,
    role: String,
    translations: Anon_LabelCloseIcon,
    dialogTitle: String = null
  ): ojDialogSettableProperties = {
    val __obj = js.Dynamic.literal(cancelBehavior = cancelBehavior.asInstanceOf[js.Any], dragAffordance = dragAffordance.asInstanceOf[js.Any], initialVisibility = initialVisibility.asInstanceOf[js.Any], modality = modality.asInstanceOf[js.Any], position = position, resizeBehavior = resizeBehavior.asInstanceOf[js.Any], role = role, translations = translations)
    if (dialogTitle != null) __obj.updateDynamic("dialogTitle")(dialogTitle)
    __obj.asInstanceOf[ojDialogSettableProperties]
  }
}


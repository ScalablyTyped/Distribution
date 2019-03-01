package typings
package atOracleOraclejetLib.ojdialogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojDialogSettableProperties
  extends atOracleOraclejetLib.atOracleOraclejetMod.baseComponentSettableProperties {
  var cancelBehavior: atOracleOraclejetLib.atOracleOraclejetLibStrings.icon | atOracleOraclejetLib.atOracleOraclejetLibStrings.escape | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  var dialogTitle: java.lang.String | scala.Null
  var dragAffordance: atOracleOraclejetLib.atOracleOraclejetLibStrings.`title-bar` | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  var initialVisibility: atOracleOraclejetLib.atOracleOraclejetLibStrings.hide | atOracleOraclejetLib.atOracleOraclejetLibStrings.show
  var modality: atOracleOraclejetLib.atOracleOraclejetLibStrings.modal | atOracleOraclejetLib.atOracleOraclejetLibStrings.modeless
  var position: atOracleOraclejetLib.ojdialogMod.ojDialogNs.Position
  var resizeBehavior: atOracleOraclejetLib.atOracleOraclejetLibStrings.resizable | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  var role: java.lang.String
  @JSName("translations")
  var translations_ojDialogSettableProperties: atOracleOraclejetLib.Anon_LabelCloseIcon
}

object ojDialogSettableProperties {
  @scala.inline
  def apply(
    cancelBehavior: atOracleOraclejetLib.atOracleOraclejetLibStrings.icon | atOracleOraclejetLib.atOracleOraclejetLibStrings.escape | atOracleOraclejetLib.atOracleOraclejetLibStrings.none,
    dragAffordance: atOracleOraclejetLib.atOracleOraclejetLibStrings.`title-bar` | atOracleOraclejetLib.atOracleOraclejetLibStrings.none,
    initialVisibility: atOracleOraclejetLib.atOracleOraclejetLibStrings.hide | atOracleOraclejetLib.atOracleOraclejetLibStrings.show,
    modality: atOracleOraclejetLib.atOracleOraclejetLibStrings.modal | atOracleOraclejetLib.atOracleOraclejetLibStrings.modeless,
    position: atOracleOraclejetLib.ojdialogMod.ojDialogNs.Position,
    resizeBehavior: atOracleOraclejetLib.atOracleOraclejetLibStrings.resizable | atOracleOraclejetLib.atOracleOraclejetLibStrings.none,
    role: java.lang.String,
    translations: atOracleOraclejetLib.Anon_LabelCloseIcon,
    dialogTitle: java.lang.String = null
  ): ojDialogSettableProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancelBehavior")(cancelBehavior.asInstanceOf[js.Any])
    __obj.updateDynamic("dragAffordance")(dragAffordance.asInstanceOf[js.Any])
    __obj.updateDynamic("initialVisibility")(initialVisibility.asInstanceOf[js.Any])
    __obj.updateDynamic("modality")(modality.asInstanceOf[js.Any])
    __obj.updateDynamic("position")(position)
    __obj.updateDynamic("resizeBehavior")(resizeBehavior.asInstanceOf[js.Any])
    __obj.updateDynamic("role")(role)
    __obj.updateDynamic("translations")(translations)
    if (dialogTitle != null) __obj.updateDynamic("dialogTitle")(dialogTitle)
    __obj.asInstanceOf[ojDialogSettableProperties]
  }
}


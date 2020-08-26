package typings.oracleOraclejet.ojdialogMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.LabelCloseIcon
import typings.oracleOraclejet.ojdialogMod.ojDialog.Position
import typings.oracleOraclejet.oracleOraclejetStrings.`title-bar`
import typings.oracleOraclejet.oracleOraclejetStrings.escape
import typings.oracleOraclejet.oracleOraclejetStrings.hide
import typings.oracleOraclejet.oracleOraclejetStrings.icon
import typings.oracleOraclejet.oracleOraclejetStrings.modal
import typings.oracleOraclejet.oracleOraclejetStrings.modeless
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.resizable
import typings.oracleOraclejet.oracleOraclejetStrings.show
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojdialog.ojDialogSettableProperties> */
@js.native
trait ojDialogSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var cancelBehavior: js.UndefOr[icon | escape | none] = js.native
  var dialogTitle: js.UndefOr[String | Null] = js.native
  var dragAffordance: js.UndefOr[`title-bar` | none] = js.native
  var initialVisibility: js.UndefOr[hide | show] = js.native
  var modality: js.UndefOr[modal | modeless] = js.native
  var position: js.UndefOr[Position] = js.native
  var resizeBehavior: js.UndefOr[resizable | none] = js.native
  var role: js.UndefOr[String] = js.native
  var translations: js.UndefOr[LabelCloseIcon] = js.native
}

object ojDialogSettablePropertiesLenient {
  @scala.inline
  def apply(): ojDialogSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojDialogSettablePropertiesLenient]
  }
  @scala.inline
  implicit class ojDialogSettablePropertiesLenientOps[Self <: ojDialogSettablePropertiesLenient] (val x: Self) extends AnyVal {
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
    def setCancelBehavior(value: icon | escape | none): Self = this.set("cancelBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancelBehavior: Self = this.set("cancelBehavior", js.undefined)
    @scala.inline
    def setDialogTitle(value: String): Self = this.set("dialogTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDialogTitle: Self = this.set("dialogTitle", js.undefined)
    @scala.inline
    def setDialogTitleNull: Self = this.set("dialogTitle", null)
    @scala.inline
    def setDragAffordance(value: `title-bar` | none): Self = this.set("dragAffordance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragAffordance: Self = this.set("dragAffordance", js.undefined)
    @scala.inline
    def setInitialVisibility(value: hide | show): Self = this.set("initialVisibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialVisibility: Self = this.set("initialVisibility", js.undefined)
    @scala.inline
    def setModality(value: modal | modeless): Self = this.set("modality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModality: Self = this.set("modality", js.undefined)
    @scala.inline
    def setPosition(value: Position): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setResizeBehavior(value: resizable | none): Self = this.set("resizeBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizeBehavior: Self = this.set("resizeBehavior", js.undefined)
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    @scala.inline
    def setTranslations(value: LabelCloseIcon): Self = this.set("translations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslations: Self = this.set("translations", js.undefined)
  }
  
}


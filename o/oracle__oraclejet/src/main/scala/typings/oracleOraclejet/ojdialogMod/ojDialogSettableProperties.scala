package typings.oracleOraclejet.ojdialogMod

import typings.oracleOraclejet.anon.LabelCloseIcon
import typings.oracleOraclejet.mod.baseComponentSettableProperties
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojDialogSettableProperties extends baseComponentSettableProperties {
  
  var cancelBehavior: icon | escape | none = js.native
  
  var dialogTitle: String | Null = js.native
  
  var dragAffordance: `title-bar` | none = js.native
  
  var initialVisibility: hide | show = js.native
  
  var modality: modal | modeless = js.native
  
  var position: Position = js.native
  
  var resizeBehavior: resizable | none = js.native
  
  var role: String = js.native
  
  @JSName("translations")
  var translations_ojDialogSettableProperties: LabelCloseIcon = js.native
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
    translations: LabelCloseIcon
  ): ojDialogSettableProperties = {
    val __obj = js.Dynamic.literal(cancelBehavior = cancelBehavior.asInstanceOf[js.Any], dragAffordance = dragAffordance.asInstanceOf[js.Any], initialVisibility = initialVisibility.asInstanceOf[js.Any], modality = modality.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], resizeBehavior = resizeBehavior.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojDialogSettableProperties]
  }
  
  @scala.inline
  implicit class ojDialogSettablePropertiesOps[Self <: ojDialogSettableProperties] (val x: Self) extends AnyVal {
    
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
    def setDragAffordance(value: `title-bar` | none): Self = this.set("dragAffordance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialVisibility(value: hide | show): Self = this.set("initialVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModality(value: modal | modeless): Self = this.set("modality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Position): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizeBehavior(value: resizable | none): Self = this.set("resizeBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslations(value: LabelCloseIcon): Self = this.set("translations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialogTitle(value: String): Self = this.set("dialogTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialogTitleNull: Self = this.set("dialogTitle", null)
  }
}

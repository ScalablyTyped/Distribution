package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStateAdmin extends js.Object {
  var ActionAssignToUser: Boolean = js.native
  var ActionAssignToUserDefinition: IActionCreateAssignment = js.native
  var ActionConvertToPDF: Boolean = js.native
  var ActionConvertToPDFDefinition: IActionConvertToPDF = js.native
  var ActionCreateSeparateAssignment: Boolean = js.native
  var ActionDefinitions: IActionDefinitions = js.native
  var ActionDelete: Boolean = js.native
  var ActionMarkForArchiving: Boolean = js.native
  var ActionRunVBScript: Boolean = js.native
  var ActionRunVBScriptDefinition: String = js.native
  var ActionSendNotification: Boolean = js.native
  var ActionSendNotificationDefinition: IActionSendNotification = js.native
  var ActionSetPermissions: Boolean = js.native
  var ActionSetPermissionsDetailedDefinition: IActionSetPermissions = js.native
  var ActionSetProperties: Boolean = js.native
  var ActionSetPropertiesDefinition: IActionSetProperties = js.native
  var CheckInOutPermissions: Boolean = js.native
  var Description: String = js.native
  var ID: Double = js.native
  var InOutPermissions: IAccessControlList = js.native
  var Name: String = js.native
  var Postconditions: IStateConditions = js.native
  var Preconditions: IStateConditions = js.native
  var SemanticAliases: ISemanticAliases = js.native
  var TransitionsRequireEditAccessToObject: Boolean = js.native
  def Clone(): IStateAdmin = js.native
}

object IStateAdmin {
  @scala.inline
  def apply(
    ActionAssignToUser: Boolean,
    ActionAssignToUserDefinition: IActionCreateAssignment,
    ActionConvertToPDF: Boolean,
    ActionConvertToPDFDefinition: IActionConvertToPDF,
    ActionCreateSeparateAssignment: Boolean,
    ActionDefinitions: IActionDefinitions,
    ActionDelete: Boolean,
    ActionMarkForArchiving: Boolean,
    ActionRunVBScript: Boolean,
    ActionRunVBScriptDefinition: String,
    ActionSendNotification: Boolean,
    ActionSendNotificationDefinition: IActionSendNotification,
    ActionSetPermissions: Boolean,
    ActionSetPermissionsDetailedDefinition: IActionSetPermissions,
    ActionSetProperties: Boolean,
    ActionSetPropertiesDefinition: IActionSetProperties,
    CheckInOutPermissions: Boolean,
    Clone: () => IStateAdmin,
    Description: String,
    ID: Double,
    InOutPermissions: IAccessControlList,
    Name: String,
    Postconditions: IStateConditions,
    Preconditions: IStateConditions,
    SemanticAliases: ISemanticAliases,
    TransitionsRequireEditAccessToObject: Boolean
  ): IStateAdmin = {
    val __obj = js.Dynamic.literal(ActionAssignToUser = ActionAssignToUser.asInstanceOf[js.Any], ActionAssignToUserDefinition = ActionAssignToUserDefinition.asInstanceOf[js.Any], ActionConvertToPDF = ActionConvertToPDF.asInstanceOf[js.Any], ActionConvertToPDFDefinition = ActionConvertToPDFDefinition.asInstanceOf[js.Any], ActionCreateSeparateAssignment = ActionCreateSeparateAssignment.asInstanceOf[js.Any], ActionDefinitions = ActionDefinitions.asInstanceOf[js.Any], ActionDelete = ActionDelete.asInstanceOf[js.Any], ActionMarkForArchiving = ActionMarkForArchiving.asInstanceOf[js.Any], ActionRunVBScript = ActionRunVBScript.asInstanceOf[js.Any], ActionRunVBScriptDefinition = ActionRunVBScriptDefinition.asInstanceOf[js.Any], ActionSendNotification = ActionSendNotification.asInstanceOf[js.Any], ActionSendNotificationDefinition = ActionSendNotificationDefinition.asInstanceOf[js.Any], ActionSetPermissions = ActionSetPermissions.asInstanceOf[js.Any], ActionSetPermissionsDetailedDefinition = ActionSetPermissionsDetailedDefinition.asInstanceOf[js.Any], ActionSetProperties = ActionSetProperties.asInstanceOf[js.Any], ActionSetPropertiesDefinition = ActionSetPropertiesDefinition.asInstanceOf[js.Any], CheckInOutPermissions = CheckInOutPermissions.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), Description = Description.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], InOutPermissions = InOutPermissions.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Postconditions = Postconditions.asInstanceOf[js.Any], Preconditions = Preconditions.asInstanceOf[js.Any], SemanticAliases = SemanticAliases.asInstanceOf[js.Any], TransitionsRequireEditAccessToObject = TransitionsRequireEditAccessToObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStateAdmin]
  }
  @scala.inline
  implicit class IStateAdminOps[Self <: IStateAdmin] (val x: Self) extends AnyVal {
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
    def setActionAssignToUser(value: Boolean): Self = this.set("ActionAssignToUser", value.asInstanceOf[js.Any])
    @scala.inline
    def setActionAssignToUserDefinition(value: IActionCreateAssignment): Self = this.set("ActionAssignToUserDefinition", value.asInstanceOf[js.Any])
    @scala.inline
    def setActionConvertToPDF(value: Boolean): Self = this.set("ActionConvertToPDF", value.asInstanceOf[js.Any])
    @scala.inline
    def setActionConvertToPDFDefinition(value: IActionConvertToPDF): Self = this.set("ActionConvertToPDFDefinition", value.asInstanceOf[js.Any])
    @scala.inline
    def setActionCreateSeparateAssignment(value: Boolean): Self = this.set("ActionCreateSeparateAssignment", value.asInstanceOf[js.Any])
    @scala.inline
    def setActionDefinitions(value: IActionDefinitions): Self = this.set("ActionDefinitions", value.asInstanceOf[js.Any])
    @scala.inline
    def setActionDelete(value: Boolean): Self = this.set("ActionDelete", value.asInstanceOf[js.Any])
    @scala.inline
    def setActionMarkForArchiving(value: Boolean): Self = this.set("ActionMarkForArchiving", value.asInstanceOf[js.Any])
    @scala.inline
    def setActionRunVBScript(value: Boolean): Self = this.set("ActionRunVBScript", value.asInstanceOf[js.Any])
    @scala.inline
    def setActionRunVBScriptDefinition(value: String): Self = this.set("ActionRunVBScriptDefinition", value.asInstanceOf[js.Any])
    @scala.inline
    def setActionSendNotification(value: Boolean): Self = this.set("ActionSendNotification", value.asInstanceOf[js.Any])
    @scala.inline
    def setActionSendNotificationDefinition(value: IActionSendNotification): Self = this.set("ActionSendNotificationDefinition", value.asInstanceOf[js.Any])
    @scala.inline
    def setActionSetPermissions(value: Boolean): Self = this.set("ActionSetPermissions", value.asInstanceOf[js.Any])
    @scala.inline
    def setActionSetPermissionsDetailedDefinition(value: IActionSetPermissions): Self = this.set("ActionSetPermissionsDetailedDefinition", value.asInstanceOf[js.Any])
    @scala.inline
    def setActionSetProperties(value: Boolean): Self = this.set("ActionSetProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def setActionSetPropertiesDefinition(value: IActionSetProperties): Self = this.set("ActionSetPropertiesDefinition", value.asInstanceOf[js.Any])
    @scala.inline
    def setCheckInOutPermissions(value: Boolean): Self = this.set("CheckInOutPermissions", value.asInstanceOf[js.Any])
    @scala.inline
    def setClone(value: () => IStateAdmin): Self = this.set("Clone", js.Any.fromFunction0(value))
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def setID(value: Double): Self = this.set("ID", value.asInstanceOf[js.Any])
    @scala.inline
    def setInOutPermissions(value: IAccessControlList): Self = this.set("InOutPermissions", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPostconditions(value: IStateConditions): Self = this.set("Postconditions", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreconditions(value: IStateConditions): Self = this.set("Preconditions", value.asInstanceOf[js.Any])
    @scala.inline
    def setSemanticAliases(value: ISemanticAliases): Self = this.set("SemanticAliases", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransitionsRequireEditAccessToObject(value: Boolean): Self = this.set("TransitionsRequireEditAccessToObject", value.asInstanceOf[js.Any])
  }
  
}


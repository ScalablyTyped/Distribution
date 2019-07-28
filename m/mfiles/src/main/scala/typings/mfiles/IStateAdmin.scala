package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStateAdmin extends js.Object {
  var ActionAssignToUser: Boolean
  var ActionAssignToUserDefinition: IActionCreateAssignment
  var ActionConvertToPDF: Boolean
  var ActionConvertToPDFDefinition: IActionConvertToPDF
  var ActionCreateSeparateAssignment: Boolean
  var ActionDefinitions: IActionDefinitions
  var ActionDelete: Boolean
  var ActionMarkForArchiving: Boolean
  var ActionRunVBScript: Boolean
  var ActionRunVBScriptDefinition: String
  var ActionSendNotification: Boolean
  var ActionSendNotificationDefinition: IActionSendNotification
  var ActionSetPermissions: Boolean
  var ActionSetPermissionsDetailedDefinition: IActionSetPermissions
  var ActionSetProperties: Boolean
  var ActionSetPropertiesDefinition: IActionSetProperties
  var CheckInOutPermissions: Boolean
  var Description: String
  var ID: Double
  var InOutPermissions: IAccessControlList
  var Name: String
  var Postconditions: IStateConditions
  var Preconditions: IStateConditions
  var SemanticAliases: ISemanticAliases
  var TransitionsRequireEditAccessToObject: Boolean
  def Clone(): IStateAdmin
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
    val __obj = js.Dynamic.literal(ActionAssignToUser = ActionAssignToUser, ActionAssignToUserDefinition = ActionAssignToUserDefinition, ActionConvertToPDF = ActionConvertToPDF, ActionConvertToPDFDefinition = ActionConvertToPDFDefinition, ActionCreateSeparateAssignment = ActionCreateSeparateAssignment, ActionDefinitions = ActionDefinitions, ActionDelete = ActionDelete, ActionMarkForArchiving = ActionMarkForArchiving, ActionRunVBScript = ActionRunVBScript, ActionRunVBScriptDefinition = ActionRunVBScriptDefinition, ActionSendNotification = ActionSendNotification, ActionSendNotificationDefinition = ActionSendNotificationDefinition, ActionSetPermissions = ActionSetPermissions, ActionSetPermissionsDetailedDefinition = ActionSetPermissionsDetailedDefinition, ActionSetProperties = ActionSetProperties, ActionSetPropertiesDefinition = ActionSetPropertiesDefinition, CheckInOutPermissions = CheckInOutPermissions, Clone = js.Any.fromFunction0(Clone), Description = Description, ID = ID, InOutPermissions = InOutPermissions, Name = Name, Postconditions = Postconditions, Preconditions = Preconditions, SemanticAliases = SemanticAliases, TransitionsRequireEditAccessToObject = TransitionsRequireEditAccessToObject)
  
    __obj.asInstanceOf[IStateAdmin]
  }
}


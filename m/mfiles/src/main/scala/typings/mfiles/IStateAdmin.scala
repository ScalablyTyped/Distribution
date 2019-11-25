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
    val __obj = js.Dynamic.literal(ActionAssignToUser = ActionAssignToUser.asInstanceOf[js.Any], ActionAssignToUserDefinition = ActionAssignToUserDefinition.asInstanceOf[js.Any], ActionConvertToPDF = ActionConvertToPDF.asInstanceOf[js.Any], ActionConvertToPDFDefinition = ActionConvertToPDFDefinition.asInstanceOf[js.Any], ActionCreateSeparateAssignment = ActionCreateSeparateAssignment.asInstanceOf[js.Any], ActionDefinitions = ActionDefinitions.asInstanceOf[js.Any], ActionDelete = ActionDelete.asInstanceOf[js.Any], ActionMarkForArchiving = ActionMarkForArchiving.asInstanceOf[js.Any], ActionRunVBScript = ActionRunVBScript.asInstanceOf[js.Any], ActionRunVBScriptDefinition = ActionRunVBScriptDefinition.asInstanceOf[js.Any], ActionSendNotification = ActionSendNotification.asInstanceOf[js.Any], ActionSendNotificationDefinition = ActionSendNotificationDefinition.asInstanceOf[js.Any], ActionSetPermissions = ActionSetPermissions.asInstanceOf[js.Any], ActionSetPermissionsDetailedDefinition = ActionSetPermissionsDetailedDefinition.asInstanceOf[js.Any], ActionSetProperties = ActionSetProperties.asInstanceOf[js.Any], ActionSetPropertiesDefinition = ActionSetPropertiesDefinition.asInstanceOf[js.Any], CheckInOutPermissions = CheckInOutPermissions.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), Description = Description.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], InOutPermissions = InOutPermissions.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Postconditions = Postconditions.asInstanceOf[js.Any], Preconditions = Preconditions.asInstanceOf[js.Any], SemanticAliases = SemanticAliases.asInstanceOf[js.Any], TransitionsRequireEditAccessToObject = TransitionsRequireEditAccessToObject.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IStateAdmin]
  }
}


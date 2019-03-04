package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStateAdmin extends js.Object {
  var ActionAssignToUser: scala.Boolean
  var ActionAssignToUserDefinition: IActionCreateAssignment
  var ActionConvertToPDF: scala.Boolean
  var ActionConvertToPDFDefinition: IActionConvertToPDF
  var ActionCreateSeparateAssignment: scala.Boolean
  var ActionDefinitions: IActionDefinitions
  var ActionDelete: scala.Boolean
  var ActionMarkForArchiving: scala.Boolean
  var ActionRunVBScript: scala.Boolean
  var ActionRunVBScriptDefinition: java.lang.String
  var ActionSendNotification: scala.Boolean
  var ActionSendNotificationDefinition: IActionSendNotification
  var ActionSetPermissions: scala.Boolean
  var ActionSetPermissionsDetailedDefinition: IActionSetPermissions
  var ActionSetProperties: scala.Boolean
  var ActionSetPropertiesDefinition: IActionSetProperties
  var CheckInOutPermissions: scala.Boolean
  var Description: java.lang.String
  var ID: scala.Double
  var InOutPermissions: IAccessControlList
  var Name: java.lang.String
  var Postconditions: IStateConditions
  var Preconditions: IStateConditions
  var SemanticAliases: ISemanticAliases
  var TransitionsRequireEditAccessToObject: scala.Boolean
  def Clone(): IStateAdmin
}

object IStateAdmin {
  @scala.inline
  def apply(
    ActionAssignToUser: scala.Boolean,
    ActionAssignToUserDefinition: IActionCreateAssignment,
    ActionConvertToPDF: scala.Boolean,
    ActionConvertToPDFDefinition: IActionConvertToPDF,
    ActionCreateSeparateAssignment: scala.Boolean,
    ActionDefinitions: IActionDefinitions,
    ActionDelete: scala.Boolean,
    ActionMarkForArchiving: scala.Boolean,
    ActionRunVBScript: scala.Boolean,
    ActionRunVBScriptDefinition: java.lang.String,
    ActionSendNotification: scala.Boolean,
    ActionSendNotificationDefinition: IActionSendNotification,
    ActionSetPermissions: scala.Boolean,
    ActionSetPermissionsDetailedDefinition: IActionSetPermissions,
    ActionSetProperties: scala.Boolean,
    ActionSetPropertiesDefinition: IActionSetProperties,
    CheckInOutPermissions: scala.Boolean,
    Clone: js.Function0[IStateAdmin],
    Description: java.lang.String,
    ID: scala.Double,
    InOutPermissions: IAccessControlList,
    Name: java.lang.String,
    Postconditions: IStateConditions,
    Preconditions: IStateConditions,
    SemanticAliases: ISemanticAliases,
    TransitionsRequireEditAccessToObject: scala.Boolean
  ): IStateAdmin = {
    val __obj = js.Dynamic.literal(ActionAssignToUser = ActionAssignToUser, ActionAssignToUserDefinition = ActionAssignToUserDefinition, ActionConvertToPDF = ActionConvertToPDF, ActionConvertToPDFDefinition = ActionConvertToPDFDefinition, ActionCreateSeparateAssignment = ActionCreateSeparateAssignment, ActionDefinitions = ActionDefinitions, ActionDelete = ActionDelete, ActionMarkForArchiving = ActionMarkForArchiving, ActionRunVBScript = ActionRunVBScript, ActionRunVBScriptDefinition = ActionRunVBScriptDefinition, ActionSendNotification = ActionSendNotification, ActionSendNotificationDefinition = ActionSendNotificationDefinition, ActionSetPermissions = ActionSetPermissions, ActionSetPermissionsDetailedDefinition = ActionSetPermissionsDetailedDefinition, ActionSetProperties = ActionSetProperties, ActionSetPropertiesDefinition = ActionSetPropertiesDefinition, CheckInOutPermissions = CheckInOutPermissions, Clone = Clone, Description = Description, ID = ID, InOutPermissions = InOutPermissions, Name = Name, Postconditions = Postconditions, Preconditions = Preconditions, SemanticAliases = SemanticAliases, TransitionsRequireEditAccessToObject = TransitionsRequireEditAccessToObject)
  
    __obj.asInstanceOf[IStateAdmin]
  }
}


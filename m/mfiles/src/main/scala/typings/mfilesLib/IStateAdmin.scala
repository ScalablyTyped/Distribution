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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ActionAssignToUser")(ActionAssignToUser)
    __obj.updateDynamic("ActionAssignToUserDefinition")(ActionAssignToUserDefinition)
    __obj.updateDynamic("ActionConvertToPDF")(ActionConvertToPDF)
    __obj.updateDynamic("ActionConvertToPDFDefinition")(ActionConvertToPDFDefinition)
    __obj.updateDynamic("ActionCreateSeparateAssignment")(ActionCreateSeparateAssignment)
    __obj.updateDynamic("ActionDefinitions")(ActionDefinitions)
    __obj.updateDynamic("ActionDelete")(ActionDelete)
    __obj.updateDynamic("ActionMarkForArchiving")(ActionMarkForArchiving)
    __obj.updateDynamic("ActionRunVBScript")(ActionRunVBScript)
    __obj.updateDynamic("ActionRunVBScriptDefinition")(ActionRunVBScriptDefinition)
    __obj.updateDynamic("ActionSendNotification")(ActionSendNotification)
    __obj.updateDynamic("ActionSendNotificationDefinition")(ActionSendNotificationDefinition)
    __obj.updateDynamic("ActionSetPermissions")(ActionSetPermissions)
    __obj.updateDynamic("ActionSetPermissionsDetailedDefinition")(ActionSetPermissionsDetailedDefinition)
    __obj.updateDynamic("ActionSetProperties")(ActionSetProperties)
    __obj.updateDynamic("ActionSetPropertiesDefinition")(ActionSetPropertiesDefinition)
    __obj.updateDynamic("CheckInOutPermissions")(CheckInOutPermissions)
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("Description")(Description)
    __obj.updateDynamic("ID")(ID)
    __obj.updateDynamic("InOutPermissions")(InOutPermissions)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("Postconditions")(Postconditions)
    __obj.updateDynamic("Preconditions")(Preconditions)
    __obj.updateDynamic("SemanticAliases")(SemanticAliases)
    __obj.updateDynamic("TransitionsRequireEditAccessToObject")(TransitionsRequireEditAccessToObject)
    __obj.asInstanceOf[IStateAdmin]
  }
}


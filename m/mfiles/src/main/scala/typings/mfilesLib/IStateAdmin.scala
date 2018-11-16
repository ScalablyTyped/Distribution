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


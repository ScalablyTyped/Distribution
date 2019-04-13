package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.StateAdmin")
@js.native
class StateAdmin ()
  extends mfilesLib.IStateAdmin {
  /* CompleteClass */
  override var ActionAssignToUser: scala.Boolean = js.native
  /* CompleteClass */
  override var ActionAssignToUserDefinition: mfilesLib.IActionCreateAssignment = js.native
  /* CompleteClass */
  override var ActionConvertToPDF: scala.Boolean = js.native
  /* CompleteClass */
  override var ActionConvertToPDFDefinition: mfilesLib.IActionConvertToPDF = js.native
  /* CompleteClass */
  override var ActionCreateSeparateAssignment: scala.Boolean = js.native
  /* CompleteClass */
  override var ActionDefinitions: mfilesLib.IActionDefinitions = js.native
  /* CompleteClass */
  override var ActionDelete: scala.Boolean = js.native
  /* CompleteClass */
  override var ActionMarkForArchiving: scala.Boolean = js.native
  /* CompleteClass */
  override var ActionRunVBScript: scala.Boolean = js.native
  /* CompleteClass */
  override var ActionRunVBScriptDefinition: java.lang.String = js.native
  /* CompleteClass */
  override var ActionSendNotification: scala.Boolean = js.native
  /* CompleteClass */
  override var ActionSendNotificationDefinition: mfilesLib.IActionSendNotification = js.native
  /* CompleteClass */
  override var ActionSetPermissions: scala.Boolean = js.native
  /* CompleteClass */
  override var ActionSetPermissionsDetailedDefinition: mfilesLib.IActionSetPermissions = js.native
  /* CompleteClass */
  override var ActionSetProperties: scala.Boolean = js.native
  /* CompleteClass */
  override var ActionSetPropertiesDefinition: mfilesLib.IActionSetProperties = js.native
  /* CompleteClass */
  override var CheckInOutPermissions: scala.Boolean = js.native
  /* CompleteClass */
  override var Description: java.lang.String = js.native
  /* CompleteClass */
  override var ID: scala.Double = js.native
  /* CompleteClass */
  override var InOutPermissions: mfilesLib.IAccessControlList = js.native
  /* CompleteClass */
  override var Name: java.lang.String = js.native
  /* CompleteClass */
  override var Postconditions: mfilesLib.IStateConditions = js.native
  /* CompleteClass */
  override var Preconditions: mfilesLib.IStateConditions = js.native
  /* CompleteClass */
  override var SemanticAliases: mfilesLib.ISemanticAliases = js.native
  /* CompleteClass */
  override var TransitionsRequireEditAccessToObject: scala.Boolean = js.native
  /* CompleteClass */
  override def Clone(): mfilesLib.IStateAdmin = js.native
}

@JSGlobal("MFiles.StateAdmin")
@js.native
object StateAdmin
  extends org.scalablytyped.runtime.Instantiable0[mfilesLib.IStateAdmin]


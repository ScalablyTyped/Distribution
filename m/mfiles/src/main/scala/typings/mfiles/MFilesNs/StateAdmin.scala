package typings.mfiles.MFilesNs

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.IAccessControlList
import typings.mfiles.IActionConvertToPDF
import typings.mfiles.IActionCreateAssignment
import typings.mfiles.IActionDefinitions
import typings.mfiles.IActionSendNotification
import typings.mfiles.IActionSetPermissions
import typings.mfiles.IActionSetProperties
import typings.mfiles.ISemanticAliases
import typings.mfiles.IStateAdmin
import typings.mfiles.IStateConditions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.StateAdmin")
@js.native
class StateAdmin () extends IStateAdmin {
  /* CompleteClass */
  override var ActionAssignToUser: Boolean = js.native
  /* CompleteClass */
  override var ActionAssignToUserDefinition: IActionCreateAssignment = js.native
  /* CompleteClass */
  override var ActionConvertToPDF: Boolean = js.native
  /* CompleteClass */
  override var ActionConvertToPDFDefinition: IActionConvertToPDF = js.native
  /* CompleteClass */
  override var ActionCreateSeparateAssignment: Boolean = js.native
  /* CompleteClass */
  override var ActionDefinitions: IActionDefinitions = js.native
  /* CompleteClass */
  override var ActionDelete: Boolean = js.native
  /* CompleteClass */
  override var ActionMarkForArchiving: Boolean = js.native
  /* CompleteClass */
  override var ActionRunVBScript: Boolean = js.native
  /* CompleteClass */
  override var ActionRunVBScriptDefinition: String = js.native
  /* CompleteClass */
  override var ActionSendNotification: Boolean = js.native
  /* CompleteClass */
  override var ActionSendNotificationDefinition: IActionSendNotification = js.native
  /* CompleteClass */
  override var ActionSetPermissions: Boolean = js.native
  /* CompleteClass */
  override var ActionSetPermissionsDetailedDefinition: IActionSetPermissions = js.native
  /* CompleteClass */
  override var ActionSetProperties: Boolean = js.native
  /* CompleteClass */
  override var ActionSetPropertiesDefinition: IActionSetProperties = js.native
  /* CompleteClass */
  override var CheckInOutPermissions: Boolean = js.native
  /* CompleteClass */
  override var Description: String = js.native
  /* CompleteClass */
  override var ID: Double = js.native
  /* CompleteClass */
  override var InOutPermissions: IAccessControlList = js.native
  /* CompleteClass */
  override var Name: String = js.native
  /* CompleteClass */
  override var Postconditions: IStateConditions = js.native
  /* CompleteClass */
  override var Preconditions: IStateConditions = js.native
  /* CompleteClass */
  override var SemanticAliases: ISemanticAliases = js.native
  /* CompleteClass */
  override var TransitionsRequireEditAccessToObject: Boolean = js.native
  /* CompleteClass */
  override def Clone(): IStateAdmin = js.native
}

@JSGlobal("MFiles.StateAdmin")
@js.native
object StateAdmin extends Instantiable0[IStateAdmin]


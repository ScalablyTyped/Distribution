package typings.mfiles.global.MFiles

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.StateAdmin")
@js.native
class StateAdmin ()
  extends StObject
     with IStateAdmin {
  
  /* CompleteClass */
  var ActionAssignToUser: Boolean = js.native
  
  /* CompleteClass */
  var ActionAssignToUserDefinition: IActionCreateAssignment = js.native
  
  /* CompleteClass */
  var ActionConvertToPDF: Boolean = js.native
  
  /* CompleteClass */
  var ActionConvertToPDFDefinition: IActionConvertToPDF = js.native
  
  /* CompleteClass */
  var ActionCreateSeparateAssignment: Boolean = js.native
  
  /* CompleteClass */
  var ActionDefinitions: IActionDefinitions = js.native
  
  /* CompleteClass */
  var ActionDelete: Boolean = js.native
  
  /* CompleteClass */
  var ActionMarkForArchiving: Boolean = js.native
  
  /* CompleteClass */
  var ActionRunVBScript: Boolean = js.native
  
  /* CompleteClass */
  var ActionRunVBScriptDefinition: String = js.native
  
  /* CompleteClass */
  var ActionSendNotification: Boolean = js.native
  
  /* CompleteClass */
  var ActionSendNotificationDefinition: IActionSendNotification = js.native
  
  /* CompleteClass */
  var ActionSetPermissions: Boolean = js.native
  
  /* CompleteClass */
  var ActionSetPermissionsDetailedDefinition: IActionSetPermissions = js.native
  
  /* CompleteClass */
  var ActionSetProperties: Boolean = js.native
  
  /* CompleteClass */
  var ActionSetPropertiesDefinition: IActionSetProperties = js.native
  
  /* CompleteClass */
  var CheckInOutPermissions: Boolean = js.native
  
  /* CompleteClass */
  override def Clone(): IStateAdmin = js.native
  
  /* CompleteClass */
  var Description: String = js.native
  
  /* CompleteClass */
  var ID: Double = js.native
  
  /* CompleteClass */
  var InOutPermissions: IAccessControlList = js.native
  
  /* CompleteClass */
  var Name: String = js.native
  
  /* CompleteClass */
  var Postconditions: IStateConditions = js.native
  
  /* CompleteClass */
  var Preconditions: IStateConditions = js.native
  
  /* CompleteClass */
  var SemanticAliases: ISemanticAliases = js.native
  
  /* CompleteClass */
  var TransitionsRequireEditAccessToObject: Boolean = js.native
}

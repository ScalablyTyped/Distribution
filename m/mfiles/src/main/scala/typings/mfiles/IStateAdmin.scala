package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStateAdmin extends StObject {
  
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
  
  def Clone(): IStateAdmin = js.native
  
  var Description: String = js.native
  
  var ID: Double = js.native
  
  var InOutPermissions: IAccessControlList = js.native
  
  var Name: String = js.native
  
  var Postconditions: IStateConditions = js.native
  
  var Preconditions: IStateConditions = js.native
  
  var SemanticAliases: ISemanticAliases = js.native
  
  var TransitionsRequireEditAccessToObject: Boolean = js.native
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
  implicit class IStateAdminMutableBuilder[Self <: IStateAdmin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionAssignToUser(value: Boolean): Self = StObject.set(x, "ActionAssignToUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionAssignToUserDefinition(value: IActionCreateAssignment): Self = StObject.set(x, "ActionAssignToUserDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionConvertToPDF(value: Boolean): Self = StObject.set(x, "ActionConvertToPDF", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionConvertToPDFDefinition(value: IActionConvertToPDF): Self = StObject.set(x, "ActionConvertToPDFDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionCreateSeparateAssignment(value: Boolean): Self = StObject.set(x, "ActionCreateSeparateAssignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionDefinitions(value: IActionDefinitions): Self = StObject.set(x, "ActionDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionDelete(value: Boolean): Self = StObject.set(x, "ActionDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionMarkForArchiving(value: Boolean): Self = StObject.set(x, "ActionMarkForArchiving", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionRunVBScript(value: Boolean): Self = StObject.set(x, "ActionRunVBScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionRunVBScriptDefinition(value: String): Self = StObject.set(x, "ActionRunVBScriptDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionSendNotification(value: Boolean): Self = StObject.set(x, "ActionSendNotification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionSendNotificationDefinition(value: IActionSendNotification): Self = StObject.set(x, "ActionSendNotificationDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionSetPermissions(value: Boolean): Self = StObject.set(x, "ActionSetPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionSetPermissionsDetailedDefinition(value: IActionSetPermissions): Self = StObject.set(x, "ActionSetPermissionsDetailedDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionSetProperties(value: Boolean): Self = StObject.set(x, "ActionSetProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionSetPropertiesDefinition(value: IActionSetProperties): Self = StObject.set(x, "ActionSetPropertiesDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckInOutPermissions(value: Boolean): Self = StObject.set(x, "CheckInOutPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClone(value: () => IStateAdmin): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInOutPermissions(value: IAccessControlList): Self = StObject.set(x, "InOutPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostconditions(value: IStateConditions): Self = StObject.set(x, "Postconditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreconditions(value: IStateConditions): Self = StObject.set(x, "Preconditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSemanticAliases(value: ISemanticAliases): Self = StObject.set(x, "SemanticAliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionsRequireEditAccessToObject(value: Boolean): Self = StObject.set(x, "TransitionsRequireEditAccessToObject", value.asInstanceOf[js.Any])
  }
}

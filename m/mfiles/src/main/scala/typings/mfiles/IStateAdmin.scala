package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStateAdmin extends StObject {
  
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
  
  def Clone(): IStateAdmin
  
  var Description: String
  
  var ID: Double
  
  var InOutPermissions: IAccessControlList
  
  var Name: String
  
  var Postconditions: IStateConditions
  
  var Preconditions: IStateConditions
  
  var SemanticAliases: ISemanticAliases
  
  var TransitionsRequireEditAccessToObject: Boolean
}
object IStateAdmin {
  
  inline def apply(
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
  
  extension [Self <: IStateAdmin](x: Self) {
    
    inline def setActionAssignToUser(value: Boolean): Self = StObject.set(x, "ActionAssignToUser", value.asInstanceOf[js.Any])
    
    inline def setActionAssignToUserDefinition(value: IActionCreateAssignment): Self = StObject.set(x, "ActionAssignToUserDefinition", value.asInstanceOf[js.Any])
    
    inline def setActionConvertToPDF(value: Boolean): Self = StObject.set(x, "ActionConvertToPDF", value.asInstanceOf[js.Any])
    
    inline def setActionConvertToPDFDefinition(value: IActionConvertToPDF): Self = StObject.set(x, "ActionConvertToPDFDefinition", value.asInstanceOf[js.Any])
    
    inline def setActionCreateSeparateAssignment(value: Boolean): Self = StObject.set(x, "ActionCreateSeparateAssignment", value.asInstanceOf[js.Any])
    
    inline def setActionDefinitions(value: IActionDefinitions): Self = StObject.set(x, "ActionDefinitions", value.asInstanceOf[js.Any])
    
    inline def setActionDelete(value: Boolean): Self = StObject.set(x, "ActionDelete", value.asInstanceOf[js.Any])
    
    inline def setActionMarkForArchiving(value: Boolean): Self = StObject.set(x, "ActionMarkForArchiving", value.asInstanceOf[js.Any])
    
    inline def setActionRunVBScript(value: Boolean): Self = StObject.set(x, "ActionRunVBScript", value.asInstanceOf[js.Any])
    
    inline def setActionRunVBScriptDefinition(value: String): Self = StObject.set(x, "ActionRunVBScriptDefinition", value.asInstanceOf[js.Any])
    
    inline def setActionSendNotification(value: Boolean): Self = StObject.set(x, "ActionSendNotification", value.asInstanceOf[js.Any])
    
    inline def setActionSendNotificationDefinition(value: IActionSendNotification): Self = StObject.set(x, "ActionSendNotificationDefinition", value.asInstanceOf[js.Any])
    
    inline def setActionSetPermissions(value: Boolean): Self = StObject.set(x, "ActionSetPermissions", value.asInstanceOf[js.Any])
    
    inline def setActionSetPermissionsDetailedDefinition(value: IActionSetPermissions): Self = StObject.set(x, "ActionSetPermissionsDetailedDefinition", value.asInstanceOf[js.Any])
    
    inline def setActionSetProperties(value: Boolean): Self = StObject.set(x, "ActionSetProperties", value.asInstanceOf[js.Any])
    
    inline def setActionSetPropertiesDefinition(value: IActionSetProperties): Self = StObject.set(x, "ActionSetPropertiesDefinition", value.asInstanceOf[js.Any])
    
    inline def setCheckInOutPermissions(value: Boolean): Self = StObject.set(x, "CheckInOutPermissions", value.asInstanceOf[js.Any])
    
    inline def setClone(value: () => IStateAdmin): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setInOutPermissions(value: IAccessControlList): Self = StObject.set(x, "InOutPermissions", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPostconditions(value: IStateConditions): Self = StObject.set(x, "Postconditions", value.asInstanceOf[js.Any])
    
    inline def setPreconditions(value: IStateConditions): Self = StObject.set(x, "Preconditions", value.asInstanceOf[js.Any])
    
    inline def setSemanticAliases(value: ISemanticAliases): Self = StObject.set(x, "SemanticAliases", value.asInstanceOf[js.Any])
    
    inline def setTransitionsRequireEditAccessToObject(value: Boolean): Self = StObject.set(x, "TransitionsRequireEditAccessToObject", value.asInstanceOf[js.Any])
  }
}

package typings.mfiles

import typings.mfiles.MFiles.MFBuiltInObjectType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IObjectClassAdmin extends StObject {
  
  val AdditionalClassInfo: IAdditionalClassInfo
  
  var AssociatedPropertyDefs: IAssociatedPropertyDefs
  
  var AutomaticPermissionsForObjects: IAutomaticPermissions
  
  def Clone(): IObjectClassAdmin
  
  var ForceWorkflow: Boolean
  
  var ID: Double
  
  var Name: String
  
  var NamePropertyDef: Double
  
  var ObjectType: MFBuiltInObjectType | Double
  
  var Predefined: Boolean
  
  var SemanticAliases: ISemanticAliases
  
  var Workflow: Double
}
object IObjectClassAdmin {
  
  inline def apply(
    AdditionalClassInfo: IAdditionalClassInfo,
    AssociatedPropertyDefs: IAssociatedPropertyDefs,
    AutomaticPermissionsForObjects: IAutomaticPermissions,
    Clone: () => IObjectClassAdmin,
    ForceWorkflow: Boolean,
    ID: Double,
    Name: String,
    NamePropertyDef: Double,
    ObjectType: MFBuiltInObjectType | Double,
    Predefined: Boolean,
    SemanticAliases: ISemanticAliases,
    Workflow: Double
  ): IObjectClassAdmin = {
    val __obj = js.Dynamic.literal(AdditionalClassInfo = AdditionalClassInfo.asInstanceOf[js.Any], AssociatedPropertyDefs = AssociatedPropertyDefs.asInstanceOf[js.Any], AutomaticPermissionsForObjects = AutomaticPermissionsForObjects.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), ForceWorkflow = ForceWorkflow.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NamePropertyDef = NamePropertyDef.asInstanceOf[js.Any], ObjectType = ObjectType.asInstanceOf[js.Any], Predefined = Predefined.asInstanceOf[js.Any], SemanticAliases = SemanticAliases.asInstanceOf[js.Any], Workflow = Workflow.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjectClassAdmin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IObjectClassAdmin] (val x: Self) extends AnyVal {
    
    inline def setAdditionalClassInfo(value: IAdditionalClassInfo): Self = StObject.set(x, "AdditionalClassInfo", value.asInstanceOf[js.Any])
    
    inline def setAssociatedPropertyDefs(value: IAssociatedPropertyDefs): Self = StObject.set(x, "AssociatedPropertyDefs", value.asInstanceOf[js.Any])
    
    inline def setAutomaticPermissionsForObjects(value: IAutomaticPermissions): Self = StObject.set(x, "AutomaticPermissionsForObjects", value.asInstanceOf[js.Any])
    
    inline def setClone(value: () => IObjectClassAdmin): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setForceWorkflow(value: Boolean): Self = StObject.set(x, "ForceWorkflow", value.asInstanceOf[js.Any])
    
    inline def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNamePropertyDef(value: Double): Self = StObject.set(x, "NamePropertyDef", value.asInstanceOf[js.Any])
    
    inline def setObjectType(value: MFBuiltInObjectType | Double): Self = StObject.set(x, "ObjectType", value.asInstanceOf[js.Any])
    
    inline def setPredefined(value: Boolean): Self = StObject.set(x, "Predefined", value.asInstanceOf[js.Any])
    
    inline def setSemanticAliases(value: ISemanticAliases): Self = StObject.set(x, "SemanticAliases", value.asInstanceOf[js.Any])
    
    inline def setWorkflow(value: Double): Self = StObject.set(x, "Workflow", value.asInstanceOf[js.Any])
  }
}

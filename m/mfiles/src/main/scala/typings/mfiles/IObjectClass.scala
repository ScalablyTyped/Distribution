package typings.mfiles

import typings.mfiles.MFiles.MFBuiltInObjectType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IObjectClass extends StObject {
  
  var AccessControlList: IAccessControlList
  
  val AdditionalClassInfo: IAdditionalClassInfo
  
  var AssociatedPropertyDefs: IAssociatedPropertyDefs
  
  var AutomaticPermissionsForObjects: IAutomaticPermissions
  
  def Clone(): IObjectClass
  
  var ForceWorkflow: Boolean
  
  var ID: Double
  
  var Name: String
  
  var NamePropertyDef: Double
  
  var ObjectType: MFBuiltInObjectType | Double
  
  var Workflow: Double
}
object IObjectClass {
  
  @scala.inline
  def apply(
    AccessControlList: IAccessControlList,
    AdditionalClassInfo: IAdditionalClassInfo,
    AssociatedPropertyDefs: IAssociatedPropertyDefs,
    AutomaticPermissionsForObjects: IAutomaticPermissions,
    Clone: () => IObjectClass,
    ForceWorkflow: Boolean,
    ID: Double,
    Name: String,
    NamePropertyDef: Double,
    ObjectType: MFBuiltInObjectType | Double,
    Workflow: Double
  ): IObjectClass = {
    val __obj = js.Dynamic.literal(AccessControlList = AccessControlList.asInstanceOf[js.Any], AdditionalClassInfo = AdditionalClassInfo.asInstanceOf[js.Any], AssociatedPropertyDefs = AssociatedPropertyDefs.asInstanceOf[js.Any], AutomaticPermissionsForObjects = AutomaticPermissionsForObjects.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), ForceWorkflow = ForceWorkflow.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NamePropertyDef = NamePropertyDef.asInstanceOf[js.Any], ObjectType = ObjectType.asInstanceOf[js.Any], Workflow = Workflow.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjectClass]
  }
  
  @scala.inline
  implicit class IObjectClassMutableBuilder[Self <: IObjectClass] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessControlList(value: IAccessControlList): Self = StObject.set(x, "AccessControlList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalClassInfo(value: IAdditionalClassInfo): Self = StObject.set(x, "AdditionalClassInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociatedPropertyDefs(value: IAssociatedPropertyDefs): Self = StObject.set(x, "AssociatedPropertyDefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomaticPermissionsForObjects(value: IAutomaticPermissions): Self = StObject.set(x, "AutomaticPermissionsForObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClone(value: () => IObjectClass): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setForceWorkflow(value: Boolean): Self = StObject.set(x, "ForceWorkflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamePropertyDef(value: Double): Self = StObject.set(x, "NamePropertyDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectType(value: MFBuiltInObjectType | Double): Self = StObject.set(x, "ObjectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflow(value: Double): Self = StObject.set(x, "Workflow", value.asInstanceOf[js.Any])
  }
}

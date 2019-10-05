package typings.mfiles

import typings.mfiles.MFiles.MFBuiltInObjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectClass extends js.Object {
  var AccessControlList: IAccessControlList
  val AdditionalClassInfo: IAdditionalClassInfo
  var AssociatedPropertyDefs: IAssociatedPropertyDefs
  var AutomaticPermissionsForObjects: IAutomaticPermissions
  var ForceWorkflow: Boolean
  var ID: Double
  var Name: String
  var NamePropertyDef: Double
  var ObjectType: MFBuiltInObjectType | Double
  var Workflow: Double
  def Clone(): IObjectClass
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
    val __obj = js.Dynamic.literal(AccessControlList = AccessControlList, AdditionalClassInfo = AdditionalClassInfo, AssociatedPropertyDefs = AssociatedPropertyDefs, AutomaticPermissionsForObjects = AutomaticPermissionsForObjects, Clone = js.Any.fromFunction0(Clone), ForceWorkflow = ForceWorkflow, ID = ID, Name = Name, NamePropertyDef = NamePropertyDef, ObjectType = ObjectType.asInstanceOf[js.Any], Workflow = Workflow)
  
    __obj.asInstanceOf[IObjectClass]
  }
}


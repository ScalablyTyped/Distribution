package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectClass extends js.Object {
  var AccessControlList: IAccessControlList
  val AdditionalClassInfo: IAdditionalClassInfo
  var AssociatedPropertyDefs: IAssociatedPropertyDefs
  var AutomaticPermissionsForObjects: IAutomaticPermissions
  var ForceWorkflow: scala.Boolean
  var ID: scala.Double
  var Name: java.lang.String
  var NamePropertyDef: scala.Double
  var ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType | scala.Double
  var Workflow: scala.Double
  def Clone(): IObjectClass
}

object IObjectClass {
  @scala.inline
  def apply(
    AccessControlList: IAccessControlList,
    AdditionalClassInfo: IAdditionalClassInfo,
    AssociatedPropertyDefs: IAssociatedPropertyDefs,
    AutomaticPermissionsForObjects: IAutomaticPermissions,
    Clone: js.Function0[IObjectClass],
    ForceWorkflow: scala.Boolean,
    ID: scala.Double,
    Name: java.lang.String,
    NamePropertyDef: scala.Double,
    ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType | scala.Double,
    Workflow: scala.Double
  ): IObjectClass = {
    val __obj = js.Dynamic.literal(AccessControlList = AccessControlList, AdditionalClassInfo = AdditionalClassInfo, AssociatedPropertyDefs = AssociatedPropertyDefs, AutomaticPermissionsForObjects = AutomaticPermissionsForObjects, Clone = Clone, ForceWorkflow = ForceWorkflow, ID = ID, Name = Name, NamePropertyDef = NamePropertyDef, ObjectType = ObjectType.asInstanceOf[js.Any], Workflow = Workflow)
  
    __obj.asInstanceOf[IObjectClass]
  }
}


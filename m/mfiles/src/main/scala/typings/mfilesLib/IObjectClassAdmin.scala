package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectClassAdmin extends js.Object {
  val AdditionalClassInfo: IAdditionalClassInfo
  var AssociatedPropertyDefs: IAssociatedPropertyDefs
  var AutomaticPermissionsForObjects: IAutomaticPermissions
  var ForceWorkflow: scala.Boolean
  var ID: scala.Double
  var Name: java.lang.String
  var NamePropertyDef: scala.Double
  var ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType | scala.Double
  var Predefined: scala.Boolean
  var SemanticAliases: ISemanticAliases
  var Workflow: scala.Double
  def Clone(): IObjectClassAdmin
}

object IObjectClassAdmin {
  @scala.inline
  def apply(
    AdditionalClassInfo: IAdditionalClassInfo,
    AssociatedPropertyDefs: IAssociatedPropertyDefs,
    AutomaticPermissionsForObjects: IAutomaticPermissions,
    Clone: js.Function0[IObjectClassAdmin],
    ForceWorkflow: scala.Boolean,
    ID: scala.Double,
    Name: java.lang.String,
    NamePropertyDef: scala.Double,
    ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType | scala.Double,
    Predefined: scala.Boolean,
    SemanticAliases: ISemanticAliases,
    Workflow: scala.Double
  ): IObjectClassAdmin = {
    val __obj = js.Dynamic.literal(AdditionalClassInfo = AdditionalClassInfo, AssociatedPropertyDefs = AssociatedPropertyDefs, AutomaticPermissionsForObjects = AutomaticPermissionsForObjects, Clone = Clone, ForceWorkflow = ForceWorkflow, ID = ID, Name = Name, NamePropertyDef = NamePropertyDef, ObjectType = ObjectType.asInstanceOf[js.Any], Predefined = Predefined, SemanticAliases = SemanticAliases, Workflow = Workflow)
  
    __obj.asInstanceOf[IObjectClassAdmin]
  }
}


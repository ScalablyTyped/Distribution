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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AdditionalClassInfo")(AdditionalClassInfo)
    __obj.updateDynamic("AssociatedPropertyDefs")(AssociatedPropertyDefs)
    __obj.updateDynamic("AutomaticPermissionsForObjects")(AutomaticPermissionsForObjects)
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("ForceWorkflow")(ForceWorkflow)
    __obj.updateDynamic("ID")(ID)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("NamePropertyDef")(NamePropertyDef)
    __obj.updateDynamic("ObjectType")(ObjectType.asInstanceOf[js.Any])
    __obj.updateDynamic("Predefined")(Predefined)
    __obj.updateDynamic("SemanticAliases")(SemanticAliases)
    __obj.updateDynamic("Workflow")(Workflow)
    __obj.asInstanceOf[IObjectClassAdmin]
  }
}


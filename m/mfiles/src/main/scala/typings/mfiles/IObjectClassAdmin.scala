package typings.mfiles

import typings.mfiles.MFiles.MFBuiltInObjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectClassAdmin extends js.Object {
  val AdditionalClassInfo: IAdditionalClassInfo
  var AssociatedPropertyDefs: IAssociatedPropertyDefs
  var AutomaticPermissionsForObjects: IAutomaticPermissions
  var ForceWorkflow: Boolean
  var ID: Double
  var Name: String
  var NamePropertyDef: Double
  var ObjectType: MFBuiltInObjectType | Double
  var Predefined: Boolean
  var SemanticAliases: ISemanticAliases
  var Workflow: Double
  def Clone(): IObjectClassAdmin
}

object IObjectClassAdmin {
  @scala.inline
  def apply(
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
}


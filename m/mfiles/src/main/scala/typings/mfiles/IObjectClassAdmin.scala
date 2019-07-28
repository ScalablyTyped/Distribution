package typings.mfiles

import typings.mfiles.MFilesNs.MFBuiltInObjectType
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
    val __obj = js.Dynamic.literal(AdditionalClassInfo = AdditionalClassInfo, AssociatedPropertyDefs = AssociatedPropertyDefs, AutomaticPermissionsForObjects = AutomaticPermissionsForObjects, Clone = js.Any.fromFunction0(Clone), ForceWorkflow = ForceWorkflow, ID = ID, Name = Name, NamePropertyDef = NamePropertyDef, ObjectType = ObjectType.asInstanceOf[js.Any], Predefined = Predefined, SemanticAliases = SemanticAliases, Workflow = Workflow)
  
    __obj.asInstanceOf[IObjectClassAdmin]
  }
}


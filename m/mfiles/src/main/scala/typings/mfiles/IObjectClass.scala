package typings.mfiles

import typings.mfiles.MFiles.MFBuiltInObjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObjectClass extends js.Object {
  var AccessControlList: IAccessControlList = js.native
  val AdditionalClassInfo: IAdditionalClassInfo = js.native
  var AssociatedPropertyDefs: IAssociatedPropertyDefs = js.native
  var AutomaticPermissionsForObjects: IAutomaticPermissions = js.native
  var ForceWorkflow: Boolean = js.native
  var ID: Double = js.native
  var Name: String = js.native
  var NamePropertyDef: Double = js.native
  var ObjectType: MFBuiltInObjectType | Double = js.native
  var Workflow: Double = js.native
  def Clone(): IObjectClass = js.native
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
  implicit class IObjectClassOps[Self <: IObjectClass] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccessControlList(value: IAccessControlList): Self = this.set("AccessControlList", value.asInstanceOf[js.Any])
    @scala.inline
    def setAdditionalClassInfo(value: IAdditionalClassInfo): Self = this.set("AdditionalClassInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setAssociatedPropertyDefs(value: IAssociatedPropertyDefs): Self = this.set("AssociatedPropertyDefs", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutomaticPermissionsForObjects(value: IAutomaticPermissions): Self = this.set("AutomaticPermissionsForObjects", value.asInstanceOf[js.Any])
    @scala.inline
    def setClone(value: () => IObjectClass): Self = this.set("Clone", js.Any.fromFunction0(value))
    @scala.inline
    def setForceWorkflow(value: Boolean): Self = this.set("ForceWorkflow", value.asInstanceOf[js.Any])
    @scala.inline
    def setID(value: Double): Self = this.set("ID", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamePropertyDef(value: Double): Self = this.set("NamePropertyDef", value.asInstanceOf[js.Any])
    @scala.inline
    def setObjectType(value: MFBuiltInObjectType | Double): Self = this.set("ObjectType", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorkflow(value: Double): Self = this.set("Workflow", value.asInstanceOf[js.Any])
  }
  
}


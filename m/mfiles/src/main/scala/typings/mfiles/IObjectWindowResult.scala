package typings.mfiles

import typings.mfiles.MFiles.MFObjectWindowResultCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObjectWindowResult extends js.Object {
  val AccessControlList: IAccessControlList = js.native
  val ObjVer: IObjVer = js.native
  val Properties: IPropertyValues = js.native
  val Result: MFObjectWindowResultCode = js.native
  val SelectedFileClass: IFileClass = js.native
  val UseAsDefaults: Boolean = js.native
  val Visible: Boolean = js.native
}

object IObjectWindowResult {
  @scala.inline
  def apply(
    AccessControlList: IAccessControlList,
    ObjVer: IObjVer,
    Properties: IPropertyValues,
    Result: MFObjectWindowResultCode,
    SelectedFileClass: IFileClass,
    UseAsDefaults: Boolean,
    Visible: Boolean
  ): IObjectWindowResult = {
    val __obj = js.Dynamic.literal(AccessControlList = AccessControlList.asInstanceOf[js.Any], ObjVer = ObjVer.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any], Result = Result.asInstanceOf[js.Any], SelectedFileClass = SelectedFileClass.asInstanceOf[js.Any], UseAsDefaults = UseAsDefaults.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjectWindowResult]
  }
  @scala.inline
  implicit class IObjectWindowResultOps[Self <: IObjectWindowResult] (val x: Self) extends AnyVal {
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
    def setObjVer(value: IObjVer): Self = this.set("ObjVer", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperties(value: IPropertyValues): Self = this.set("Properties", value.asInstanceOf[js.Any])
    @scala.inline
    def setResult(value: MFObjectWindowResultCode): Self = this.set("Result", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectedFileClass(value: IFileClass): Self = this.set("SelectedFileClass", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseAsDefaults(value: Boolean): Self = this.set("UseAsDefaults", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("Visible", value.asInstanceOf[js.Any])
  }
  
}


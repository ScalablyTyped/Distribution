package typings.mfiles

import typings.mfiles.MFiles.MFAdditionalClassInfoType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAdditionalClassInfo extends js.Object {
  var AssignmentClassInfo: IAssignmentClassInfo = js.native
  val InfoType: MFAdditionalClassInfoType = js.native
  def Clear(): Unit = js.native
  def Clone(): IAdditionalClassInfo = js.native
}

object IAdditionalClassInfo {
  @scala.inline
  def apply(
    AssignmentClassInfo: IAssignmentClassInfo,
    Clear: () => Unit,
    Clone: () => IAdditionalClassInfo,
    InfoType: MFAdditionalClassInfoType
  ): IAdditionalClassInfo = {
    val __obj = js.Dynamic.literal(AssignmentClassInfo = AssignmentClassInfo.asInstanceOf[js.Any], Clear = js.Any.fromFunction0(Clear), Clone = js.Any.fromFunction0(Clone), InfoType = InfoType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAdditionalClassInfo]
  }
  @scala.inline
  implicit class IAdditionalClassInfoOps[Self <: IAdditionalClassInfo] (val x: Self) extends AnyVal {
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
    def setAssignmentClassInfo(value: IAssignmentClassInfo): Self = this.set("AssignmentClassInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("Clear", js.Any.fromFunction0(value))
    @scala.inline
    def setClone(value: () => IAdditionalClassInfo): Self = this.set("Clone", js.Any.fromFunction0(value))
    @scala.inline
    def setInfoType(value: MFAdditionalClassInfoType): Self = this.set("InfoType", value.asInstanceOf[js.Any])
  }
  
}


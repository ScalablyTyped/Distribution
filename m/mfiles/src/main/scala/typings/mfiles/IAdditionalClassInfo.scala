package typings.mfiles

import typings.mfiles.MFiles.MFAdditionalClassInfoType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAdditionalClassInfo extends js.Object {
  var AssignmentClassInfo: IAssignmentClassInfo
  val InfoType: MFAdditionalClassInfoType
  def Clear(): Unit
  def Clone(): IAdditionalClassInfo
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
}


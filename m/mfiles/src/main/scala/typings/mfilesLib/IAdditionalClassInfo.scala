package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAdditionalClassInfo extends js.Object {
  var AssignmentClassInfo: IAssignmentClassInfo
  val InfoType: mfilesLib.MFilesNs.MFAdditionalClassInfoType
  def Clear(): scala.Unit
  def Clone(): IAdditionalClassInfo
}

object IAdditionalClassInfo {
  @scala.inline
  def apply(
    AssignmentClassInfo: IAssignmentClassInfo,
    Clear: js.Function0[scala.Unit],
    Clone: js.Function0[IAdditionalClassInfo],
    InfoType: mfilesLib.MFilesNs.MFAdditionalClassInfoType
  ): IAdditionalClassInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AssignmentClassInfo")(AssignmentClassInfo)
    __obj.updateDynamic("Clear")(Clear)
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("InfoType")(InfoType)
    __obj.asInstanceOf[IAdditionalClassInfo]
  }
}


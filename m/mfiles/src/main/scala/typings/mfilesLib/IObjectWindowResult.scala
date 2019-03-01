package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectWindowResult extends js.Object {
  val AccessControlList: IAccessControlList
  val ObjVer: IObjVer
  val Properties: IPropertyValues
  val Result: mfilesLib.MFilesNs.MFObjectWindowResultCode
  val SelectedFileClass: IFileClass
  val UseAsDefaults: scala.Boolean
  val Visible: scala.Boolean
}

object IObjectWindowResult {
  @scala.inline
  def apply(
    AccessControlList: IAccessControlList,
    ObjVer: IObjVer,
    Properties: IPropertyValues,
    Result: mfilesLib.MFilesNs.MFObjectWindowResultCode,
    SelectedFileClass: IFileClass,
    UseAsDefaults: scala.Boolean,
    Visible: scala.Boolean
  ): IObjectWindowResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AccessControlList")(AccessControlList)
    __obj.updateDynamic("ObjVer")(ObjVer)
    __obj.updateDynamic("Properties")(Properties)
    __obj.updateDynamic("Result")(Result)
    __obj.updateDynamic("SelectedFileClass")(SelectedFileClass)
    __obj.updateDynamic("UseAsDefaults")(UseAsDefaults)
    __obj.updateDynamic("Visible")(Visible)
    __obj.asInstanceOf[IObjectWindowResult]
  }
}


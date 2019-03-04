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
    val __obj = js.Dynamic.literal(AccessControlList = AccessControlList, ObjVer = ObjVer, Properties = Properties, Result = Result, SelectedFileClass = SelectedFileClass, UseAsDefaults = UseAsDefaults, Visible = Visible)
  
    __obj.asInstanceOf[IObjectWindowResult]
  }
}


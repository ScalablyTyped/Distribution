package typings.mfiles

import typings.mfiles.MFiles.MFObjectWindowResultCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectWindowResult extends js.Object {
  val AccessControlList: IAccessControlList
  val ObjVer: IObjVer
  val Properties: IPropertyValues
  val Result: MFObjectWindowResultCode
  val SelectedFileClass: IFileClass
  val UseAsDefaults: Boolean
  val Visible: Boolean
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
}


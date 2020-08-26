package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObjectVersionPermissions extends js.Object {
  val AccessControlList: IAccessControlList = js.native
  val CustomACL: Boolean = js.native
  val NamedACL: INamedACL = js.native
  val ObjVer: IObjVer = js.native
}

object IObjectVersionPermissions {
  @scala.inline
  def apply(AccessControlList: IAccessControlList, CustomACL: Boolean, NamedACL: INamedACL, ObjVer: IObjVer): IObjectVersionPermissions = {
    val __obj = js.Dynamic.literal(AccessControlList = AccessControlList.asInstanceOf[js.Any], CustomACL = CustomACL.asInstanceOf[js.Any], NamedACL = NamedACL.asInstanceOf[js.Any], ObjVer = ObjVer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjectVersionPermissions]
  }
  @scala.inline
  implicit class IObjectVersionPermissionsOps[Self <: IObjectVersionPermissions] (val x: Self) extends AnyVal {
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
    def setCustomACL(value: Boolean): Self = this.set("CustomACL", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamedACL(value: INamedACL): Self = this.set("NamedACL", value.asInstanceOf[js.Any])
    @scala.inline
    def setObjVer(value: IObjVer): Self = this.set("ObjVer", value.asInstanceOf[js.Any])
  }
  
}


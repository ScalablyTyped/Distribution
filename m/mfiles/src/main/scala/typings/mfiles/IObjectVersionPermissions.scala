package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectVersionPermissions extends js.Object {
  val AccessControlList: IAccessControlList
  val CustomACL: Boolean
  val NamedACL: INamedACL
  val ObjVer: IObjVer
}

object IObjectVersionPermissions {
  @scala.inline
  def apply(AccessControlList: IAccessControlList, CustomACL: Boolean, NamedACL: INamedACL, ObjVer: IObjVer): IObjectVersionPermissions = {
    val __obj = js.Dynamic.literal(AccessControlList = AccessControlList.asInstanceOf[js.Any], CustomACL = CustomACL.asInstanceOf[js.Any], NamedACL = NamedACL.asInstanceOf[js.Any], ObjVer = ObjVer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjectVersionPermissions]
  }
}


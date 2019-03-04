package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectVersionPermissions extends js.Object {
  val AccessControlList: IAccessControlList
  val CustomACL: scala.Boolean
  val NamedACL: INamedACL
  val ObjVer: IObjVer
}

object IObjectVersionPermissions {
  @scala.inline
  def apply(
    AccessControlList: IAccessControlList,
    CustomACL: scala.Boolean,
    NamedACL: INamedACL,
    ObjVer: IObjVer
  ): IObjectVersionPermissions = {
    val __obj = js.Dynamic.literal(AccessControlList = AccessControlList, CustomACL = CustomACL, NamedACL = NamedACL, ObjVer = ObjVer)
  
    __obj.asInstanceOf[IObjectVersionPermissions]
  }
}


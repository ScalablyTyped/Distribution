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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AccessControlList")(AccessControlList)
    __obj.updateDynamic("CustomACL")(CustomACL)
    __obj.updateDynamic("NamedACL")(NamedACL)
    __obj.updateDynamic("ObjVer")(ObjVer)
    __obj.asInstanceOf[IObjectVersionPermissions]
  }
}


package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVersionComment extends js.Object {
  val LastModifiedBy: IPropertyValue
  val ObjVer: IObjVer
  val StatusChanged: IPropertyValue
  val VersionComment: IPropertyValue
}

object IVersionComment {
  @scala.inline
  def apply(
    LastModifiedBy: IPropertyValue,
    ObjVer: IObjVer,
    StatusChanged: IPropertyValue,
    VersionComment: IPropertyValue
  ): IVersionComment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("LastModifiedBy")(LastModifiedBy)
    __obj.updateDynamic("ObjVer")(ObjVer)
    __obj.updateDynamic("StatusChanged")(StatusChanged)
    __obj.updateDynamic("VersionComment")(VersionComment)
    __obj.asInstanceOf[IVersionComment]
  }
}


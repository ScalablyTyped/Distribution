package typings.mfiles

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
    val __obj = js.Dynamic.literal(LastModifiedBy = LastModifiedBy.asInstanceOf[js.Any], ObjVer = ObjVer.asInstanceOf[js.Any], StatusChanged = StatusChanged.asInstanceOf[js.Any], VersionComment = VersionComment.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IVersionComment]
  }
}


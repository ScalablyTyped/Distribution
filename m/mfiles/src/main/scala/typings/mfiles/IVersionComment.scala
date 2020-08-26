package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVersionComment extends js.Object {
  val LastModifiedBy: IPropertyValue = js.native
  val ObjVer: IObjVer = js.native
  val StatusChanged: IPropertyValue = js.native
  val VersionComment: IPropertyValue = js.native
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
  @scala.inline
  implicit class IVersionCommentOps[Self <: IVersionComment] (val x: Self) extends AnyVal {
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
    def setLastModifiedBy(value: IPropertyValue): Self = this.set("LastModifiedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def setObjVer(value: IObjVer): Self = this.set("ObjVer", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusChanged(value: IPropertyValue): Self = this.set("StatusChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersionComment(value: IPropertyValue): Self = this.set("VersionComment", value.asInstanceOf[js.Any])
  }
  
}


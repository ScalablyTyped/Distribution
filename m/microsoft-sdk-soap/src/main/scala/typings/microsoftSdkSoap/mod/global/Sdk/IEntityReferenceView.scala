package typings.microsoftSdkSoap.mod.global.Sdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEntityReferenceView extends js.Object {
  var Id: java.lang.String = js.native
  var Name: java.lang.String = js.native
  var Type: java.lang.String = js.native
}

object IEntityReferenceView {
  @scala.inline
  def apply(Id: java.lang.String, Name: java.lang.String, Type: java.lang.String): IEntityReferenceView = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEntityReferenceView]
  }
  @scala.inline
  implicit class IEntityReferenceViewOps[Self <: IEntityReferenceView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: java.lang.String): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: java.lang.String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: java.lang.String): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
  
}


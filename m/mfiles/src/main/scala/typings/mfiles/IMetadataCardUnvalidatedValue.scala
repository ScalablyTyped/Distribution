package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMetadataCardUnvalidatedValue extends js.Object {
  val ID: String = js.native
  val IsMultiValue: Boolean = js.native
  val IsUnvalidated: Boolean = js.native
  val Name: String = js.native
}

object IMetadataCardUnvalidatedValue {
  @scala.inline
  def apply(ID: String, IsMultiValue: Boolean, IsUnvalidated: Boolean, Name: String): IMetadataCardUnvalidatedValue = {
    val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any], IsMultiValue = IsMultiValue.asInstanceOf[js.Any], IsUnvalidated = IsUnvalidated.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMetadataCardUnvalidatedValue]
  }
  @scala.inline
  implicit class IMetadataCardUnvalidatedValueOps[Self <: IMetadataCardUnvalidatedValue] (val x: Self) extends AnyVal {
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
    def setID(value: String): Self = this.set("ID", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsMultiValue(value: Boolean): Self = this.set("IsMultiValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsUnvalidated(value: Boolean): Self = this.set("IsUnvalidated", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
  }
  
}


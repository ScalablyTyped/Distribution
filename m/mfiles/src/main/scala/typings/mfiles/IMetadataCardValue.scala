package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMetadataCardValue extends js.Object {
  val HasIcon: Boolean = js.native
  val ID: String = js.native
  val IconURL: String = js.native
  val IsMultiValue: Boolean = js.native
  val Item: Double = js.native
  val Name: String = js.native
  val State: js.Any = js.native
  val Version: Double = js.native
  def IsDeleted(): Boolean = js.native
  def IsHidden(): Boolean = js.native
}

object IMetadataCardValue {
  @scala.inline
  def apply(
    HasIcon: Boolean,
    ID: String,
    IconURL: String,
    IsDeleted: () => Boolean,
    IsHidden: () => Boolean,
    IsMultiValue: Boolean,
    Item: Double,
    Name: String,
    State: js.Any,
    Version: Double
  ): IMetadataCardValue = {
    val __obj = js.Dynamic.literal(HasIcon = HasIcon.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], IconURL = IconURL.asInstanceOf[js.Any], IsDeleted = js.Any.fromFunction0(IsDeleted), IsHidden = js.Any.fromFunction0(IsHidden), IsMultiValue = IsMultiValue.asInstanceOf[js.Any], Item = Item.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMetadataCardValue]
  }
  @scala.inline
  implicit class IMetadataCardValueOps[Self <: IMetadataCardValue] (val x: Self) extends AnyVal {
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
    def setHasIcon(value: Boolean): Self = this.set("HasIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setID(value: String): Self = this.set("ID", value.asInstanceOf[js.Any])
    @scala.inline
    def setIconURL(value: String): Self = this.set("IconURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsDeleted(value: () => Boolean): Self = this.set("IsDeleted", js.Any.fromFunction0(value))
    @scala.inline
    def setIsHidden(value: () => Boolean): Self = this.set("IsHidden", js.Any.fromFunction0(value))
    @scala.inline
    def setIsMultiValue(value: Boolean): Self = this.set("IsMultiValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: Double): Self = this.set("Item", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: js.Any): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: Double): Self = this.set("Version", value.asInstanceOf[js.Any])
  }
  
}


package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMetadataCardValue extends js.Object {
  val HasIcon: Boolean
  val ID: String
  val IconURL: String
  val IsMultiValue: Boolean
  val Item: Double
  val Name: String
  val State: js.Any
  val Version: Double
  def IsDeleted(): Boolean
  def IsHidden(): Boolean
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
}


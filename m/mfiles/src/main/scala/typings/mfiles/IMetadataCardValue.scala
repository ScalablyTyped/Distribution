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
    val __obj = js.Dynamic.literal(HasIcon = HasIcon, ID = ID, IconURL = IconURL, IsDeleted = js.Any.fromFunction0(IsDeleted), IsHidden = js.Any.fromFunction0(IsHidden), IsMultiValue = IsMultiValue, Item = Item, Name = Name, State = State, Version = Version)
  
    __obj.asInstanceOf[IMetadataCardValue]
  }
}


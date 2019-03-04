package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMetadataCardValue extends js.Object {
  val HasIcon: scala.Boolean
  val ID: java.lang.String
  val IconURL: java.lang.String
  val IsMultiValue: scala.Boolean
  val Item: scala.Double
  val Name: java.lang.String
  val State: js.Any
  val Version: scala.Double
  def IsDeleted(): scala.Boolean
  def IsHidden(): scala.Boolean
}

object IMetadataCardValue {
  @scala.inline
  def apply(
    HasIcon: scala.Boolean,
    ID: java.lang.String,
    IconURL: java.lang.String,
    IsDeleted: js.Function0[scala.Boolean],
    IsHidden: js.Function0[scala.Boolean],
    IsMultiValue: scala.Boolean,
    Item: scala.Double,
    Name: java.lang.String,
    State: js.Any,
    Version: scala.Double
  ): IMetadataCardValue = {
    val __obj = js.Dynamic.literal(HasIcon = HasIcon, ID = ID, IconURL = IconURL, IsDeleted = IsDeleted, IsHidden = IsHidden, IsMultiValue = IsMultiValue, Item = Item, Name = Name, State = State, Version = Version)
  
    __obj.asInstanceOf[IMetadataCardValue]
  }
}


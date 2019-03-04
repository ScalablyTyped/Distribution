package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMetadataCardUnvalidatedValue extends js.Object {
  val ID: java.lang.String
  val IsMultiValue: scala.Boolean
  val IsUnvalidated: scala.Boolean
  val Name: java.lang.String
}

object IMetadataCardUnvalidatedValue {
  @scala.inline
  def apply(
    ID: java.lang.String,
    IsMultiValue: scala.Boolean,
    IsUnvalidated: scala.Boolean,
    Name: java.lang.String
  ): IMetadataCardUnvalidatedValue = {
    val __obj = js.Dynamic.literal(ID = ID, IsMultiValue = IsMultiValue, IsUnvalidated = IsUnvalidated, Name = Name)
  
    __obj.asInstanceOf[IMetadataCardUnvalidatedValue]
  }
}


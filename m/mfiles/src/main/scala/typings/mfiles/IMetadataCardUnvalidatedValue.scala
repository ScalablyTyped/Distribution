package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMetadataCardUnvalidatedValue extends js.Object {
  val ID: String
  val IsMultiValue: Boolean
  val IsUnvalidated: Boolean
  val Name: String
}

object IMetadataCardUnvalidatedValue {
  @scala.inline
  def apply(ID: String, IsMultiValue: Boolean, IsUnvalidated: Boolean, Name: String): IMetadataCardUnvalidatedValue = {
    val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any], IsMultiValue = IsMultiValue.asInstanceOf[js.Any], IsUnvalidated = IsUnvalidated.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMetadataCardUnvalidatedValue]
  }
}


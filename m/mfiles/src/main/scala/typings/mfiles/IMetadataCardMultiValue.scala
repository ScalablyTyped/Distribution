package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMetadataCardMultiValue extends js.Object {
  val ID: String
  val IsMultiValue: Boolean
  val State: js.Any
  val ValueParts: js.Any
}

object IMetadataCardMultiValue {
  @scala.inline
  def apply(ID: String, IsMultiValue: Boolean, State: js.Any, ValueParts: js.Any): IMetadataCardMultiValue = {
    val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any], IsMultiValue = IsMultiValue.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], ValueParts = ValueParts.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMetadataCardMultiValue]
  }
}


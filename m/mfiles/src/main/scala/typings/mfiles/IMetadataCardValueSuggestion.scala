package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMetadataCardValueSuggestion extends js.Object {
  val IsNewValue: Boolean
  val Name: String
  val Value: js.Any
}

object IMetadataCardValueSuggestion {
  @scala.inline
  def apply(IsNewValue: Boolean, Name: String, Value: js.Any): IMetadataCardValueSuggestion = {
    val __obj = js.Dynamic.literal(IsNewValue = IsNewValue, Name = Name, Value = Value)
  
    __obj.asInstanceOf[IMetadataCardValueSuggestion]
  }
}


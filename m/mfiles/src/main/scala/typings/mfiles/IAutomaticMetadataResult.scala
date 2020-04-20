package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAutomaticMetadataResult extends js.Object {
  val PropertyValueSuggestions: IPropertyValueSuggestions
  def Clone(): IAutomaticMetadataResult
}

object IAutomaticMetadataResult {
  @scala.inline
  def apply(Clone: () => IAutomaticMetadataResult, PropertyValueSuggestions: IPropertyValueSuggestions): IAutomaticMetadataResult = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), PropertyValueSuggestions = PropertyValueSuggestions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAutomaticMetadataResult]
  }
}


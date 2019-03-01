package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAutomaticMetadataResult extends js.Object {
  val PropertyValueSuggestions: IPropertyValueSuggestions
  def Clone(): IAutomaticMetadataResult
}

object IAutomaticMetadataResult {
  @scala.inline
  def apply(Clone: js.Function0[IAutomaticMetadataResult], PropertyValueSuggestions: IPropertyValueSuggestions): IAutomaticMetadataResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("PropertyValueSuggestions")(PropertyValueSuggestions)
    __obj.asInstanceOf[IAutomaticMetadataResult]
  }
}


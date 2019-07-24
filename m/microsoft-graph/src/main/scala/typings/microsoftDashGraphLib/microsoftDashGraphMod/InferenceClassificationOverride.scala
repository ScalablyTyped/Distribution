package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InferenceClassificationOverride extends Entity {
  /**
    * Specifies how incoming messages from a specific sender should always be classified as. The possible values are:
    * focused, other.
    */
  var classifyAs: js.UndefOr[InferenceClassificationType] = js.undefined
  // The email address information of the sender for whom the override is created.
  var senderEmailAddress: js.UndefOr[EmailAddress] = js.undefined
}

object InferenceClassificationOverride {
  @scala.inline
  def apply(
    classifyAs: InferenceClassificationType = null,
    id: java.lang.String = null,
    senderEmailAddress: EmailAddress = null
  ): InferenceClassificationOverride = {
    val __obj = js.Dynamic.literal()
    if (classifyAs != null) __obj.updateDynamic("classifyAs")(classifyAs)
    if (id != null) __obj.updateDynamic("id")(id)
    if (senderEmailAddress != null) __obj.updateDynamic("senderEmailAddress")(senderEmailAddress)
    __obj.asInstanceOf[InferenceClassificationOverride]
  }
}


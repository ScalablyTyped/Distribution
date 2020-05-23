package typings.openidClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions extends js.Object {
  var additionalAuthorizedParties: js.UndefOr[String | js.Array[String]] = js.undefined
}

object ClientOptions {
  @scala.inline
  def apply(additionalAuthorizedParties: String | js.Array[String] = null): ClientOptions = {
    val __obj = js.Dynamic.literal()
    if (additionalAuthorizedParties != null) __obj.updateDynamic("additionalAuthorizedParties")(additionalAuthorizedParties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
}


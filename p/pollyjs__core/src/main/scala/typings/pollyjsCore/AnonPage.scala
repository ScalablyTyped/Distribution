package typings.pollyjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPage extends js.Object {
  var page: js.UndefOr[js.Any] = js.undefined
  var requestResourceTypes: js.UndefOr[js.Array[String]] = js.undefined
}

object AnonPage {
  @scala.inline
  def apply(page: js.Any = null, requestResourceTypes: js.Array[String] = null): AnonPage = {
    val __obj = js.Dynamic.literal()
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (requestResourceTypes != null) __obj.updateDynamic("requestResourceTypes")(requestResourceTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPage]
  }
}


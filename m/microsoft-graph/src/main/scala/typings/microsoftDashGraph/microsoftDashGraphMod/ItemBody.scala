package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemBody extends js.Object {
  // The content of the item.
  var content: js.UndefOr[String] = js.undefined
  // The type of the content. Possible values are text and HTML.
  var contentType: js.UndefOr[BodyType] = js.undefined
}

object ItemBody {
  @scala.inline
  def apply(content: String = null, contentType: BodyType = null): ItemBody = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemBody]
  }
}


package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnenoteResource extends OnenoteEntityBaseModel {
  // The content stream
  var content: js.UndefOr[js.Any] = js.undefined
  // The URL for downloading the content
  var contentUrl: js.UndefOr[java.lang.String] = js.undefined
}

object OnenoteResource {
  @scala.inline
  def apply(
    content: js.Any = null,
    contentUrl: java.lang.String = null,
    id: java.lang.String = null,
    self: java.lang.String = null
  ): OnenoteResource = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    if (contentUrl != null) __obj.updateDynamic("contentUrl")(contentUrl)
    if (id != null) __obj.updateDynamic("id")(id)
    if (self != null) __obj.updateDynamic("self")(self)
    __obj.asInstanceOf[OnenoteResource]
  }
}


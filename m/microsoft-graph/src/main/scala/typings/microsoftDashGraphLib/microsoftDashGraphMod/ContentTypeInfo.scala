package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentTypeInfo extends js.Object {
  // The id of the content type.
  var id: js.UndefOr[java.lang.String] = js.undefined
}

object ContentTypeInfo {
  @scala.inline
  def apply(id: java.lang.String = null): ContentTypeInfo = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[ContentTypeInfo]
  }
}


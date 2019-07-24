package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnenoteEntityBaseModel extends Entity {
  // The endpoint where you can get details about the page. Read-only.
  var self: js.UndefOr[java.lang.String] = js.undefined
}

object OnenoteEntityBaseModel {
  @scala.inline
  def apply(id: java.lang.String = null, self: java.lang.String = null): OnenoteEntityBaseModel = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (self != null) __obj.updateDynamic("self")(self)
    __obj.asInstanceOf[OnenoteEntityBaseModel]
  }
}


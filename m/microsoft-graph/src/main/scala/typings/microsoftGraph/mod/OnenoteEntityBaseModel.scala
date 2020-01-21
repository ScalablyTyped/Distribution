package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnenoteEntityBaseModel extends Entity {
  // The endpoint where you can get details about the page. Read-only.
  var self: js.UndefOr[String] = js.undefined
}

object OnenoteEntityBaseModel {
  @scala.inline
  def apply(id: String = null, self: String = null): OnenoteEntityBaseModel = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnenoteEntityBaseModel]
  }
}


package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entity extends js.Object {
  // Read-only.
  var id: js.UndefOr[String] = js.undefined
}

object Entity {
  @scala.inline
  def apply(id: String = null): Entity = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[Entity]
  }
}


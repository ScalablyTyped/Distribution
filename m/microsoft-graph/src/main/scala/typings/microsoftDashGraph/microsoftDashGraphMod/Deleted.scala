package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deleted extends js.Object {
  // Represents the state of the deleted item.
  var state: js.UndefOr[String] = js.undefined
}

object Deleted {
  @scala.inline
  def apply(state: String = null): Deleted = {
    val __obj = js.Dynamic.literal()
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[Deleted]
  }
}


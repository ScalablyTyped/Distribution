package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpecialFolder extends js.Object {
  // The unique identifier for this item in the /drive/special collection
  var name: js.UndefOr[String] = js.undefined
}

object SpecialFolder {
  @scala.inline
  def apply(name: String = null): SpecialFolder = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpecialFolder]
  }
}


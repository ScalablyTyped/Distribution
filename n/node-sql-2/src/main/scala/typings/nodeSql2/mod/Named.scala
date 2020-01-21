package typings.nodeSql2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Named[Name /* <: String */] extends js.Object {
  var name: js.UndefOr[Name] = js.undefined
}

object Named {
  @scala.inline
  def apply[Name /* <: String */](name: Name = null): Named[Name] = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Named[Name]]
  }
}


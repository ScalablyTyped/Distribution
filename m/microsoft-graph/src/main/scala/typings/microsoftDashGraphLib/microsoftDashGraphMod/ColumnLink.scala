package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnLink extends Entity {
  // The name of the column in this content type.
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object ColumnLink {
  @scala.inline
  def apply(id: java.lang.String = null, name: java.lang.String = null): ColumnLink = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ColumnLink]
  }
}


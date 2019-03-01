package typings
package neo4jLib.neo4jMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstraintOptions extends js.Object {
  var label: js.UndefOr[js.Any] = js.undefined
  var property: js.UndefOr[js.Any] = js.undefined
}

object ConstraintOptions {
  @scala.inline
  def apply(label: js.Any = null, property: js.Any = null): ConstraintOptions = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label)
    if (property != null) __obj.updateDynamic("property")(property)
    __obj.asInstanceOf[ConstraintOptions]
  }
}


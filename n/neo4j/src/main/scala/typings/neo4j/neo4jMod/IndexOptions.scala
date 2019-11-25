package typings.neo4j.neo4jMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexOptions extends js.Object {
  var label: js.UndefOr[js.Any] = js.undefined
  var property: js.UndefOr[js.Any] = js.undefined
}

object IndexOptions {
  @scala.inline
  def apply(label: js.Any = null, property: js.Any = null): IndexOptions = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexOptions]
  }
}


package typings.nodeWit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WitEntity extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var values: js.UndefOr[js.Array[WitEntityValue]] = js.undefined
}

object WitEntity {
  @scala.inline
  def apply(id: String = null, values: js.Array[WitEntityValue] = null): WitEntity = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[WitEntity]
  }
}


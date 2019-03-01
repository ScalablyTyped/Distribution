package typings
package nodeDashWitLib.nodeDashWitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WitEntity extends js.Object {
  var id: js.UndefOr[java.lang.String] = js.undefined
  var values: js.UndefOr[js.Array[WitEntityValue]] = js.undefined
}

object WitEntity {
  @scala.inline
  def apply(id: java.lang.String = null, values: js.Array[WitEntityValue] = null): WitEntity = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[WitEntity]
  }
}


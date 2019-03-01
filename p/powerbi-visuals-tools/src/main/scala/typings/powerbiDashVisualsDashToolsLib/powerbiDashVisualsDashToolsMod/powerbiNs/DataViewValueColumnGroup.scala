package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataViewValueColumnGroup extends js.Object {
  var identity: js.UndefOr[DataViewScopeIdentity] = js.undefined
  var name: js.UndefOr[PrimitiveValue] = js.undefined
  /** The data repetition objects. */
  var objects: js.UndefOr[DataViewObjects] = js.undefined
  var values: js.Array[DataViewValueColumn]
}

object DataViewValueColumnGroup {
  @scala.inline
  def apply(
    values: js.Array[DataViewValueColumn],
    identity: DataViewScopeIdentity = null,
    name: PrimitiveValue = null,
    objects: DataViewObjects = null
  ): DataViewValueColumnGroup = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("values")(values)
    if (identity != null) __obj.updateDynamic("identity")(identity)
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (objects != null) __obj.updateDynamic("objects")(objects)
    __obj.asInstanceOf[DataViewValueColumnGroup]
  }
}


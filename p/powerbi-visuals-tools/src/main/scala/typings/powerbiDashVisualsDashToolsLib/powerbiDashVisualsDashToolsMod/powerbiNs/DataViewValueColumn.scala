package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataViewValueColumn extends DataViewCategoricalColumn {
  var highlights: js.UndefOr[js.Array[PrimitiveValue]] = js.undefined
  var identity: js.UndefOr[DataViewScopeIdentity] = js.undefined
  var values: js.Array[PrimitiveValue]
}

object DataViewValueColumn {
  @scala.inline
  def apply(
    source: DataViewMetadataColumn,
    values: js.Array[PrimitiveValue],
    highlights: js.Array[PrimitiveValue] = null,
    identity: DataViewScopeIdentity = null,
    objects: js.Array[DataViewObjects] = null
  ): DataViewValueColumn = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("source")(source)
    __obj.updateDynamic("values")(values)
    if (highlights != null) __obj.updateDynamic("highlights")(highlights)
    if (identity != null) __obj.updateDynamic("identity")(identity)
    if (objects != null) __obj.updateDynamic("objects")(objects)
    __obj.asInstanceOf[DataViewValueColumn]
  }
}


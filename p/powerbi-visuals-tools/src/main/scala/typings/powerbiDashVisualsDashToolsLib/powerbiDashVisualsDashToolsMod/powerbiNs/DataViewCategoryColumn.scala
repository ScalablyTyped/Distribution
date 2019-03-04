package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataViewCategoryColumn extends DataViewCategoricalColumn {
  var identity: js.UndefOr[js.Array[DataViewScopeIdentity]] = js.undefined
  /** The set of expressions that define the identity for instances of the category.  This must match items in the DataViewScopeIdentity in the identity. */
  var identityFields: js.UndefOr[
    js.Array[
      powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.dataNs.ISQExpr
    ]
  ] = js.undefined
  var values: js.Array[PrimitiveValue]
}

object DataViewCategoryColumn {
  @scala.inline
  def apply(
    source: DataViewMetadataColumn,
    values: js.Array[PrimitiveValue],
    identity: js.Array[DataViewScopeIdentity] = null,
    identityFields: js.Array[
      powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.dataNs.ISQExpr
    ] = null,
    objects: js.Array[DataViewObjects] = null
  ): DataViewCategoryColumn = {
    val __obj = js.Dynamic.literal(source = source, values = values)
    if (identity != null) __obj.updateDynamic("identity")(identity)
    if (identityFields != null) __obj.updateDynamic("identityFields")(identityFields)
    if (objects != null) __obj.updateDynamic("objects")(objects)
    __obj.asInstanceOf[DataViewCategoryColumn]
  }
}


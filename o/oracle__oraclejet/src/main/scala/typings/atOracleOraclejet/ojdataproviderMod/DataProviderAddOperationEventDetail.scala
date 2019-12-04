package typings.atOracleOraclejet.ojdataproviderMod

import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataProviderAddOperationEventDetail[K, D] extends DataProviderOperationEventDetail[K, D] {
  var addBeforeKeys: js.UndefOr[js.Array[K]] = js.undefined
  var parentKeys: js.UndefOr[js.Array[K]] = js.undefined
}

object DataProviderAddOperationEventDetail {
  @scala.inline
  def apply[K, D](
    keys: Set[K],
    addBeforeKeys: js.Array[K] = null,
    data: js.Array[D] = null,
    indexes: js.Array[Double] = null,
    metadata: js.Array[ItemMetadata[K]] = null,
    parentKeys: js.Array[K] = null
  ): DataProviderAddOperationEventDetail[K, D] = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
    if (addBeforeKeys != null) __obj.updateDynamic("addBeforeKeys")(addBeforeKeys.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (indexes != null) __obj.updateDynamic("indexes")(indexes.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (parentKeys != null) __obj.updateDynamic("parentKeys")(parentKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataProviderAddOperationEventDetail[K, D]]
  }
}


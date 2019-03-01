package typings
package atOracleOraclejetLib.ojdataproviderMod

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
    keys: stdLib.Set[K],
    addBeforeKeys: js.Array[K] = null,
    data: js.Array[D] = null,
    indexes: js.Array[scala.Double] = null,
    metadata: js.Array[ItemMetadata[K]] = null,
    parentKeys: js.Array[K] = null
  ): DataProviderAddOperationEventDetail[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("keys")(keys)
    if (addBeforeKeys != null) __obj.updateDynamic("addBeforeKeys")(addBeforeKeys)
    if (data != null) __obj.updateDynamic("data")(data)
    if (indexes != null) __obj.updateDynamic("indexes")(indexes)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (parentKeys != null) __obj.updateDynamic("parentKeys")(parentKeys)
    __obj.asInstanceOf[DataProviderAddOperationEventDetail[K, D]]
  }
}


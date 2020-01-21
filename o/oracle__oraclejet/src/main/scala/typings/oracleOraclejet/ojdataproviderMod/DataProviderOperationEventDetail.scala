package typings.oracleOraclejet.ojdataproviderMod

import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataProviderOperationEventDetail[K, D] extends js.Object {
  var data: js.UndefOr[js.Array[D]] = js.undefined
  var indexes: js.UndefOr[js.Array[Double]] = js.undefined
  var keys: Set[K]
  var metadata: js.UndefOr[js.Array[ItemMetadata[K]]] = js.undefined
}

object DataProviderOperationEventDetail {
  @scala.inline
  def apply[K, D](
    keys: Set[K],
    data: js.Array[D] = null,
    indexes: js.Array[Double] = null,
    metadata: js.Array[ItemMetadata[K]] = null
  ): DataProviderOperationEventDetail[K, D] = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (indexes != null) __obj.updateDynamic("indexes")(indexes.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataProviderOperationEventDetail[K, D]]
  }
}


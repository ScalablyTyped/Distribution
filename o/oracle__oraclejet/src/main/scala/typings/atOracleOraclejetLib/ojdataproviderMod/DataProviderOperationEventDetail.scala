package typings
package atOracleOraclejetLib.ojdataproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataProviderOperationEventDetail[K, D] extends js.Object {
  var data: js.UndefOr[js.Array[D]] = js.undefined
  var indexes: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var keys: stdLib.Set[K]
  var metadata: js.UndefOr[js.Array[ItemMetadata[K]]] = js.undefined
}

object DataProviderOperationEventDetail {
  @scala.inline
  def apply[K, D](
    keys: stdLib.Set[K],
    data: js.Array[D] = null,
    indexes: js.Array[scala.Double] = null,
    metadata: js.Array[ItemMetadata[K]] = null
  ): DataProviderOperationEventDetail[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("keys")(keys)
    if (data != null) __obj.updateDynamic("data")(data)
    if (indexes != null) __obj.updateDynamic("indexes")(indexes)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    __obj.asInstanceOf[DataProviderOperationEventDetail[K, D]]
  }
}


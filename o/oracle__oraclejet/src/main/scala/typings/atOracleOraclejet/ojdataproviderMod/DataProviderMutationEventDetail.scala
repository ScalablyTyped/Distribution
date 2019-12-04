package typings.atOracleOraclejet.ojdataproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataProviderMutationEventDetail[K, D] extends js.Object {
  var add: js.UndefOr[DataProviderAddOperationEventDetail[K, D]] = js.undefined
  var remove: js.UndefOr[DataProviderOperationEventDetail[K, D]] = js.undefined
  var update: js.UndefOr[DataProviderOperationEventDetail[K, D]] = js.undefined
}

object DataProviderMutationEventDetail {
  @scala.inline
  def apply[K, D](
    add: DataProviderAddOperationEventDetail[K, D] = null,
    remove: DataProviderOperationEventDetail[K, D] = null,
    update: DataProviderOperationEventDetail[K, D] = null
  ): DataProviderMutationEventDetail[K, D] = {
    val __obj = js.Dynamic.literal()
    if (add != null) __obj.updateDynamic("add")(add.asInstanceOf[js.Any])
    if (remove != null) __obj.updateDynamic("remove")(remove.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataProviderMutationEventDetail[K, D]]
  }
}


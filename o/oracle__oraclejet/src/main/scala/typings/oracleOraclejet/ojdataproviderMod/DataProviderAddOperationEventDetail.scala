package typings.oracleOraclejet.ojdataproviderMod

import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataProviderAddOperationEventDetail[K, D] extends DataProviderOperationEventDetail[K, D] {
  var addBeforeKeys: js.UndefOr[js.Array[K]] = js.native
  var parentKeys: js.UndefOr[js.Array[K]] = js.native
}

object DataProviderAddOperationEventDetail {
  @scala.inline
  def apply[K, D](keys: Set[K]): DataProviderAddOperationEventDetail[K, D] = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataProviderAddOperationEventDetail[K, D]]
  }
  @scala.inline
  implicit class DataProviderAddOperationEventDetailOps[Self <: DataProviderAddOperationEventDetail[_, _], K, D] (val x: Self with (DataProviderAddOperationEventDetail[K, D])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddBeforeKeysVarargs(value: K*): Self = this.set("addBeforeKeys", js.Array(value :_*))
    @scala.inline
    def setAddBeforeKeys(value: js.Array[K]): Self = this.set("addBeforeKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddBeforeKeys: Self = this.set("addBeforeKeys", js.undefined)
    @scala.inline
    def setParentKeysVarargs(value: K*): Self = this.set("parentKeys", js.Array(value :_*))
    @scala.inline
    def setParentKeys(value: js.Array[K]): Self = this.set("parentKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentKeys: Self = this.set("parentKeys", js.undefined)
  }
  
}


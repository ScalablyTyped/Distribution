package typings.oracleOraclejet.ojdataproviderMod

import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataProviderOperationEventDetail[K, D] extends js.Object {
  var data: js.UndefOr[js.Array[D]] = js.native
  var indexes: js.UndefOr[js.Array[Double]] = js.native
  var keys: Set[K] = js.native
  var metadata: js.UndefOr[js.Array[ItemMetadata[K]]] = js.native
}

object DataProviderOperationEventDetail {
  @scala.inline
  def apply[K, D](keys: Set[K]): DataProviderOperationEventDetail[K, D] = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataProviderOperationEventDetail[K, D]]
  }
  @scala.inline
  implicit class DataProviderOperationEventDetailOps[Self <: DataProviderOperationEventDetail[_, _], K, D] (val x: Self with (DataProviderOperationEventDetail[K, D])) extends AnyVal {
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
    def setKeys(value: Set[K]): Self = this.set("keys", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataVarargs(value: D*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[D]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setIndexesVarargs(value: Double*): Self = this.set("indexes", js.Array(value :_*))
    @scala.inline
    def setIndexes(value: js.Array[Double]): Self = this.set("indexes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndexes: Self = this.set("indexes", js.undefined)
    @scala.inline
    def setMetadataVarargs(value: ItemMetadata[K]*): Self = this.set("metadata", js.Array(value :_*))
    @scala.inline
    def setMetadata(value: js.Array[ItemMetadata[K]]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
  }
  
}


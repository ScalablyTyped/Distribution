package typings.oracleOraclejet.ojdataproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataProviderMutationEventDetail[K, D] extends js.Object {
  
  var add: js.UndefOr[DataProviderAddOperationEventDetail[K, D]] = js.native
  
  var remove: js.UndefOr[DataProviderOperationEventDetail[K, D]] = js.native
  
  var update: js.UndefOr[DataProviderOperationEventDetail[K, D]] = js.native
}
object DataProviderMutationEventDetail {
  
  @scala.inline
  def apply[K, D](): DataProviderMutationEventDetail[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataProviderMutationEventDetail[K, D]]
  }
  
  @scala.inline
  implicit class DataProviderMutationEventDetailOps[Self <: DataProviderMutationEventDetail[_, _], K, D] (val x: Self with (DataProviderMutationEventDetail[K, D])) extends AnyVal {
    
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
    def setAdd(value: DataProviderAddOperationEventDetail[K, D]): Self = this.set("add", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdd: Self = this.set("add", js.undefined)
    
    @scala.inline
    def setRemove(value: DataProviderOperationEventDetail[K, D]): Self = this.set("remove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    
    @scala.inline
    def setUpdate(value: DataProviderOperationEventDetail[K, D]): Self = this.set("update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
  }
}

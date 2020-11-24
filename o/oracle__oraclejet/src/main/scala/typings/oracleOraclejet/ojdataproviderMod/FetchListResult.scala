package typings.oracleOraclejet.ojdataproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FetchListResult[K, D] extends js.Object {
  
  var data: js.Array[D] = js.native
  
  var fetchParameters: FetchListParameters[D] = js.native
  
  var metadata: js.Array[ItemMetadata[K]] = js.native
}
object FetchListResult {
  
  @scala.inline
  def apply[K, D](data: js.Array[D], fetchParameters: FetchListParameters[D], metadata: js.Array[ItemMetadata[K]]): FetchListResult[K, D] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], fetchParameters = fetchParameters.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchListResult[K, D]]
  }
  
  @scala.inline
  implicit class FetchListResultOps[Self <: FetchListResult[_, _], K, D] (val x: Self with (FetchListResult[K, D])) extends AnyVal {
    
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
    def setDataVarargs(value: D*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[D]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchParameters(value: FetchListParameters[D]): Self = this.set("fetchParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataVarargs(value: ItemMetadata[K]*): Self = this.set("metadata", js.Array(value :_*))
    
    @scala.inline
    def setMetadata(value: js.Array[ItemMetadata[K]]): Self = this.set("metadata", value.asInstanceOf[js.Any])
  }
}

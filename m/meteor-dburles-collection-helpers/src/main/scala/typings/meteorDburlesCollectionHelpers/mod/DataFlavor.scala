package typings.meteorDburlesCollectionHelpers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataFlavor[T] extends js.Object {
  
  var _meteor_dburles_collection_helpers_isData: js.UndefOr[js.Tuple2[Flavor, T]] = js.native
}
object DataFlavor {
  
  @scala.inline
  def apply[T](): DataFlavor[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataFlavor[T]]
  }
  
  @scala.inline
  implicit class DataFlavorOps[Self <: DataFlavor[_], T] (val x: Self with DataFlavor[T]) extends AnyVal {
    
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
    def set_meteor_dburles_collection_helpers_isData(value: js.Tuple2[Flavor, T]): Self = this.set("_meteor_dburles_collection_helpers_isData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_meteor_dburles_collection_helpers_isData: Self = this.set("_meteor_dburles_collection_helpers_isData", js.undefined)
  }
}

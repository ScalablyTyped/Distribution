package typings.meteorDburlesCollectionHelpers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// used to flavor Helpers<T> so we can get back to the original T if needed
// not to be confused with HelperFlavor
@js.native
trait HelpersFlavor[T] extends js.Object {
  
  var _meteor_dburles_collection_helpers_isHelpersOf: js.UndefOr[js.Tuple2[Flavor, T]] = js.native
}
object HelpersFlavor {
  
  @scala.inline
  def apply[T](): HelpersFlavor[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HelpersFlavor[T]]
  }
  
  @scala.inline
  implicit class HelpersFlavorOps[Self <: HelpersFlavor[_], T] (val x: Self with HelpersFlavor[T]) extends AnyVal {
    
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
    def set_meteor_dburles_collection_helpers_isHelpersOf(value: js.Tuple2[Flavor, T]): Self = this.set("_meteor_dburles_collection_helpers_isHelpersOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_meteor_dburles_collection_helpers_isHelpersOf: Self = this.set("_meteor_dburles_collection_helpers_isHelpersOf", js.undefined)
  }
}

package typings.meteorDburlesCollectionHelpers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// for types where (T & HelperFlavor) === never, (T | HelperBrand) is used instead,
// and the HelperBrand is stripped off in HelpersOf
// this is less preferable, because it means:
// - on a value of the original interface type TInterface, Helper<null> and Helper<T | null> properties will
//   not be assignable to null or to (T | null) respectively
// - Helpers<Helpers<T>> !== Helpers<T> when T has Helper<null> or Helper<T | null> properties
// however, this appears to be a limitation of Typescript (with strict null checks on, null and undefined
// simply *can't* extend anything besides themselves (and void in undefined's case), so there's no way to
// flavor them)
@js.native
trait HelperBrand
  extends _OptionalHelper[js.Any] {
  
  var _meteor_dburles_collection_helpers_isBrandUnsupportedHelper: Brand = js.native
}
object HelperBrand {
  
  @scala.inline
  def apply(_meteor_dburles_collection_helpers_isBrandUnsupportedHelper: Brand): HelperBrand = {
    val __obj = js.Dynamic.literal(_meteor_dburles_collection_helpers_isBrandUnsupportedHelper = _meteor_dburles_collection_helpers_isBrandUnsupportedHelper.asInstanceOf[js.Any])
    __obj.asInstanceOf[HelperBrand]
  }
  
  @scala.inline
  implicit class HelperBrandOps[Self <: HelperBrand] (val x: Self) extends AnyVal {
    
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
    def set_meteor_dburles_collection_helpers_isBrandUnsupportedHelper(value: Brand): Self = this.set("_meteor_dburles_collection_helpers_isBrandUnsupportedHelper", value.asInstanceOf[js.Any])
  }
}

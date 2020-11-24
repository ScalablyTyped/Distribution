package typings.meteorDburlesCollectionHelpers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionalHelperFlavor extends js.Object {
  
  var _meteor_dburles_collection_helpers_isOptionalHelper: js.UndefOr[Flavor] = js.native
}
object OptionalHelperFlavor {
  
  @scala.inline
  def apply(): OptionalHelperFlavor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionalHelperFlavor]
  }
  
  @scala.inline
  implicit class OptionalHelperFlavorOps[Self <: OptionalHelperFlavor] (val x: Self) extends AnyVal {
    
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
    def set_meteor_dburles_collection_helpers_isOptionalHelper(value: Flavor): Self = this.set("_meteor_dburles_collection_helpers_isOptionalHelper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_meteor_dburles_collection_helpers_isOptionalHelper: Self = this.set("_meteor_dburles_collection_helpers_isOptionalHelper", js.undefined)
  }
}

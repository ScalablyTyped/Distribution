package typings.meteorDburlesCollectionHelpers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// where possible, helpers are tagged as (T & HelperFlavor)
// this is a technique called "flavoring" - (T & HelperFlavor) is assignable both to and from T for most T,
// but the presence of the flavor can be checked since (T & HelperFlavor) is also assignable to HelperFlavor
// (note that HelperFlavor is a "weak type" - since all its properties are optional, you might think anything
// would be assignable to it, but Typescript prohibits assigning any type that doesn't share at least one
// property with it)
// weirdly, ({} & HelperFlavor) still accepts {}!
@js.native
trait HelperFlavor extends js.Object {
  
  var _meteor_dburles_collection_helpers_isHelper: js.UndefOr[Flavor] = js.native
}
object HelperFlavor {
  
  @scala.inline
  def apply(): HelperFlavor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HelperFlavor]
  }
  
  @scala.inline
  implicit class HelperFlavorOps[Self <: HelperFlavor] (val x: Self) extends AnyVal {
    
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
    def set_meteor_dburles_collection_helpers_isHelper(value: Flavor): Self = this.set("_meteor_dburles_collection_helpers_isHelper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_meteor_dburles_collection_helpers_isHelper: Self = this.set("_meteor_dburles_collection_helpers_isHelper", js.undefined)
  }
}

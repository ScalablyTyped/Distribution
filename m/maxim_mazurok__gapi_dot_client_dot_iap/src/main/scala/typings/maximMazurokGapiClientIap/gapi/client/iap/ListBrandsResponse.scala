package typings.maximMazurokGapiClientIap.gapi.client.iap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBrandsResponse extends js.Object {
  
  /** Brands existing in the project. */
  var brands: js.UndefOr[js.Array[Brand]] = js.native
}
object ListBrandsResponse {
  
  @scala.inline
  def apply(): ListBrandsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBrandsResponse]
  }
  
  @scala.inline
  implicit class ListBrandsResponseOps[Self <: ListBrandsResponse] (val x: Self) extends AnyVal {
    
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
    def setBrandsVarargs(value: Brand*): Self = this.set("brands", js.Array(value :_*))
    
    @scala.inline
    def setBrands(value: js.Array[Brand]): Self = this.set("brands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrands: Self = this.set("brands", js.undefined)
  }
}

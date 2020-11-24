package typings.paypalRestSdk.anon

import typings.paypalRestSdk.mod.Phone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Brandname extends js.Object {
  
  var brand_name: js.UndefOr[String] = js.native
  
  var display_phone: js.UndefOr[Phone] = js.native
  
  var email: js.UndefOr[String] = js.native
}
object Brandname {
  
  @scala.inline
  def apply(): Brandname = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Brandname]
  }
  
  @scala.inline
  implicit class BrandnameOps[Self <: Brandname] (val x: Self) extends AnyVal {
    
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
    def setBrand_name(value: String): Self = this.set("brand_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrand_name: Self = this.set("brand_name", js.undefined)
    
    @scala.inline
    def setDisplay_phone(value: Phone): Self = this.set("display_phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplay_phone: Self = this.set("display_phone", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
  }
}

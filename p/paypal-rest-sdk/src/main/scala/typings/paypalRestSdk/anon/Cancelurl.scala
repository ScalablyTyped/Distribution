package typings.paypalRestSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cancelurl extends js.Object {
  
  var cancel_url: js.UndefOr[String] = js.native
  
  var return_url: js.UndefOr[String] = js.native
}
object Cancelurl {
  
  @scala.inline
  def apply(): Cancelurl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cancelurl]
  }
  
  @scala.inline
  implicit class CancelurlOps[Self <: Cancelurl] (val x: Self) extends AnyVal {
    
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
    def setCancel_url(value: String): Self = this.set("cancel_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancel_url: Self = this.set("cancel_url", js.undefined)
    
    @scala.inline
    def setReturn_url(value: String): Self = this.set("return_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturn_url: Self = this.set("return_url", js.undefined)
  }
}

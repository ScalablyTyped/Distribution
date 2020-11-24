package typings.next.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Permanent extends js.Object {
  
  var permanent: js.UndefOr[Boolean] = js.native
  
  var statusCode: js.UndefOr[Double] = js.native
}
object Permanent {
  
  @scala.inline
  def apply(): Permanent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Permanent]
  }
  
  @scala.inline
  implicit class PermanentOps[Self <: Permanent] (val x: Self) extends AnyVal {
    
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
    def setPermanent(value: Boolean): Self = this.set("permanent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermanent: Self = this.set("permanent", js.undefined)
    
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusCode: Self = this.set("statusCode", js.undefined)
  }
}

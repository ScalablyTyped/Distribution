package typings.parseCacheControl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Header extends js.Object {
  
  var `max-age`: js.UndefOr[Double] = js.native
  
  var `must-revalidate`: js.UndefOr[Boolean] = js.native
  
  var `no-cache`: js.UndefOr[Boolean] = js.native
  
  var `no-store`: js.UndefOr[Boolean] = js.native
  
  var `private`: js.UndefOr[Boolean] = js.native
}
object Header {
  
  @scala.inline
  def apply(): Header = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Header]
  }
  
  @scala.inline
  implicit class HeaderOps[Self <: Header] (val x: Self) extends AnyVal {
    
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
    def `setMax-age`(value: Double): Self = this.set("max-age", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMax-age`: Self = this.set("max-age", js.undefined)
    
    @scala.inline
    def `setMust-revalidate`(value: Boolean): Self = this.set("must-revalidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMust-revalidate`: Self = this.set("must-revalidate", js.undefined)
    
    @scala.inline
    def `setNo-cache`(value: Boolean): Self = this.set("no-cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteNo-cache`: Self = this.set("no-cache", js.undefined)
    
    @scala.inline
    def `setNo-store`(value: Boolean): Self = this.set("no-store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteNo-store`: Self = this.set("no-store", js.undefined)
    
    @scala.inline
    def setPrivate(value: Boolean): Self = this.set("private", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivate: Self = this.set("private", js.undefined)
  }
}

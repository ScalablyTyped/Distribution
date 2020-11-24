package typings.postmark.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Desktop extends js.Object {
  
  var Date: String = js.native
  
  var Desktop: js.UndefOr[Double] = js.native
  
  var Mobile: js.UndefOr[Double] = js.native
  
  var Unknown: js.UndefOr[Double] = js.native
  
  var WebMail: js.UndefOr[Double] = js.native
}
object Desktop {
  
  @scala.inline
  def apply(Date: String): Desktop = {
    val __obj = js.Dynamic.literal(Date = Date.asInstanceOf[js.Any])
    __obj.asInstanceOf[Desktop]
  }
  
  @scala.inline
  implicit class DesktopOps[Self <: Desktop] (val x: Self) extends AnyVal {
    
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
    def setDate(value: String): Self = this.set("Date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesktop(value: Double): Self = this.set("Desktop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDesktop: Self = this.set("Desktop", js.undefined)
    
    @scala.inline
    def setMobile(value: Double): Self = this.set("Mobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMobile: Self = this.set("Mobile", js.undefined)
    
    @scala.inline
    def setUnknown(value: Double): Self = this.set("Unknown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnknown: Self = this.set("Unknown", js.undefined)
    
    @scala.inline
    def setWebMail(value: Double): Self = this.set("WebMail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebMail: Self = this.set("WebMail", js.undefined)
  }
}

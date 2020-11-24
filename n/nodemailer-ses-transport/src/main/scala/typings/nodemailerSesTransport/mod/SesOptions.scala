package typings.nodemailerSesTransport.mod

import typings.awsSdk.mod.SES
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SesOptions extends js.Object {
  
  var SES: typings.awsSdk.mod.SES = js.native
  
  var component: js.UndefOr[String] = js.native
  
  var maxConnections: js.UndefOr[Double] = js.native
  
  var sendingRate: js.UndefOr[Double] = js.native
}
object SesOptions {
  
  @scala.inline
  def apply(SES: SES): SesOptions = {
    val __obj = js.Dynamic.literal(SES = SES.asInstanceOf[js.Any])
    __obj.asInstanceOf[SesOptions]
  }
  
  @scala.inline
  implicit class SesOptionsOps[Self <: SesOptions] (val x: Self) extends AnyVal {
    
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
    def setSES(value: SES): Self = this.set("SES", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponent(value: String): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    
    @scala.inline
    def setMaxConnections(value: Double): Self = this.set("maxConnections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxConnections: Self = this.set("maxConnections", js.undefined)
    
    @scala.inline
    def setSendingRate(value: Double): Self = this.set("sendingRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSendingRate: Self = this.set("sendingRate", js.undefined)
  }
}

package typings.nodemailer.sesTransportMod

import typings.nodemailer.mod.TransportOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options
  extends MailOptions
     with TransportOptions {
  
  /** is an option that expects an instantiated aws.SES object */
  var SES: js.Any = js.native
  
   // aws-sdk.SES object
  /** How many messages per second is allowed to be delivered to SES */
  var maxConnections: js.UndefOr[Double] = js.native
  
  /** How many parallel connections to allow towards SES */
  var sendingRate: js.UndefOr[Double] = js.native
}
object Options {
  
  @scala.inline
  def apply(SES: js.Any): Options = {
    val __obj = js.Dynamic.literal(SES = SES.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setSES(value: js.Any): Self = this.set("SES", value.asInstanceOf[js.Any])
    
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

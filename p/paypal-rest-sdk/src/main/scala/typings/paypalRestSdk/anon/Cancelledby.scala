package typings.paypalRestSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cancelledby extends js.Object {
  
  var cancelled_by: js.UndefOr[String] = js.native
  
  var cancelled_date: js.UndefOr[String] = js.native
  
  var created_by: js.UndefOr[String] = js.native
  
  var created_date: js.UndefOr[String] = js.native
  
  var first_sent_date: js.UndefOr[String] = js.native
  
  var last_sent_by: js.UndefOr[String] = js.native
  
  var last_sent_date: js.UndefOr[String] = js.native
  
  var last_updated_by: js.UndefOr[String] = js.native
  
  var last_updated_date: js.UndefOr[String] = js.native
  
  var payer_view_url: js.UndefOr[String] = js.native
}
object Cancelledby {
  
  @scala.inline
  def apply(): Cancelledby = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cancelledby]
  }
  
  @scala.inline
  implicit class CancelledbyOps[Self <: Cancelledby] (val x: Self) extends AnyVal {
    
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
    def setCancelled_by(value: String): Self = this.set("cancelled_by", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelled_by: Self = this.set("cancelled_by", js.undefined)
    
    @scala.inline
    def setCancelled_date(value: String): Self = this.set("cancelled_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelled_date: Self = this.set("cancelled_date", js.undefined)
    
    @scala.inline
    def setCreated_by(value: String): Self = this.set("created_by", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreated_by: Self = this.set("created_by", js.undefined)
    
    @scala.inline
    def setCreated_date(value: String): Self = this.set("created_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreated_date: Self = this.set("created_date", js.undefined)
    
    @scala.inline
    def setFirst_sent_date(value: String): Self = this.set("first_sent_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirst_sent_date: Self = this.set("first_sent_date", js.undefined)
    
    @scala.inline
    def setLast_sent_by(value: String): Self = this.set("last_sent_by", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLast_sent_by: Self = this.set("last_sent_by", js.undefined)
    
    @scala.inline
    def setLast_sent_date(value: String): Self = this.set("last_sent_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLast_sent_date: Self = this.set("last_sent_date", js.undefined)
    
    @scala.inline
    def setLast_updated_by(value: String): Self = this.set("last_updated_by", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLast_updated_by: Self = this.set("last_updated_by", js.undefined)
    
    @scala.inline
    def setLast_updated_date(value: String): Self = this.set("last_updated_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLast_updated_date: Self = this.set("last_updated_date", js.undefined)
    
    @scala.inline
    def setPayer_view_url(value: String): Self = this.set("payer_view_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayer_view_url: Self = this.set("payer_view_url", js.undefined)
  }
}

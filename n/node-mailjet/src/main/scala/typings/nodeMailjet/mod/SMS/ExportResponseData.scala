package typings.nodeMailjet.mod.SMS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportResponseData extends js.Object {
  
  val CreationTS: js.UndefOr[Double] = js.native
  
  val ExpirationTS: js.UndefOr[Double] = js.native
  
  val FromTs: js.UndefOr[Double] = js.native
  
  val ID: Double = js.native
  
  val Status: ResponseStatus = js.native
  
  val ToTs: js.UndefOr[Double] = js.native
  
  val URL: js.UndefOr[String] = js.native
}
object ExportResponseData {
  
  @scala.inline
  def apply(ID: Double, Status: ResponseStatus): ExportResponseData = {
    val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportResponseData]
  }
  
  @scala.inline
  implicit class ExportResponseDataOps[Self <: ExportResponseData] (val x: Self) extends AnyVal {
    
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
    def setID(value: Double): Self = this.set("ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: ResponseStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTS(value: Double): Self = this.set("CreationTS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTS: Self = this.set("CreationTS", js.undefined)
    
    @scala.inline
    def setExpirationTS(value: Double): Self = this.set("ExpirationTS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpirationTS: Self = this.set("ExpirationTS", js.undefined)
    
    @scala.inline
    def setFromTs(value: Double): Self = this.set("FromTs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromTs: Self = this.set("FromTs", js.undefined)
    
    @scala.inline
    def setToTs(value: Double): Self = this.set("ToTs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToTs: Self = this.set("ToTs", js.undefined)
    
    @scala.inline
    def setURL(value: String): Self = this.set("URL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteURL: Self = this.set("URL", js.undefined)
  }
}

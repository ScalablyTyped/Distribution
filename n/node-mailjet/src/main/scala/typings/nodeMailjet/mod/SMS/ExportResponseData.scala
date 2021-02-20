package typings.nodeMailjet.mod.SMS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportResponseData extends StObject {
  
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
  implicit class ExportResponseDataMutableBuilder[Self <: ExportResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTS(value: Double): Self = StObject.set(x, "CreationTS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTSUndefined: Self = StObject.set(x, "CreationTS", js.undefined)
    
    @scala.inline
    def setExpirationTS(value: Double): Self = StObject.set(x, "ExpirationTS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationTSUndefined: Self = StObject.set(x, "ExpirationTS", js.undefined)
    
    @scala.inline
    def setFromTs(value: Double): Self = StObject.set(x, "FromTs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromTsUndefined: Self = StObject.set(x, "FromTs", js.undefined)
    
    @scala.inline
    def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: ResponseStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToTs(value: Double): Self = StObject.set(x, "ToTs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToTsUndefined: Self = StObject.set(x, "ToTs", js.undefined)
    
    @scala.inline
    def setURL(value: String): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setURLUndefined: Self = StObject.set(x, "URL", js.undefined)
  }
}

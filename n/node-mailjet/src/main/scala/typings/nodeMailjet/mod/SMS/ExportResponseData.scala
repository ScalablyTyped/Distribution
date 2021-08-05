package typings.nodeMailjet.mod.SMS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportResponseData extends StObject {
  
  val CreationTS: js.UndefOr[Double] = js.undefined
  
  val ExpirationTS: js.UndefOr[Double] = js.undefined
  
  val FromTs: js.UndefOr[Double] = js.undefined
  
  val ID: Double
  
  val Status: ResponseStatus
  
  val ToTs: js.UndefOr[Double] = js.undefined
  
  val URL: js.UndefOr[String] = js.undefined
}
object ExportResponseData {
  
  inline def apply(ID: Double, Status: ResponseStatus): ExportResponseData = {
    val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportResponseData]
  }
  
  extension [Self <: ExportResponseData](x: Self) {
    
    inline def setCreationTS(value: Double): Self = StObject.set(x, "CreationTS", value.asInstanceOf[js.Any])
    
    inline def setCreationTSUndefined: Self = StObject.set(x, "CreationTS", js.undefined)
    
    inline def setExpirationTS(value: Double): Self = StObject.set(x, "ExpirationTS", value.asInstanceOf[js.Any])
    
    inline def setExpirationTSUndefined: Self = StObject.set(x, "ExpirationTS", js.undefined)
    
    inline def setFromTs(value: Double): Self = StObject.set(x, "FromTs", value.asInstanceOf[js.Any])
    
    inline def setFromTsUndefined: Self = StObject.set(x, "FromTs", js.undefined)
    
    inline def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ResponseStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setToTs(value: Double): Self = StObject.set(x, "ToTs", value.asInstanceOf[js.Any])
    
    inline def setToTsUndefined: Self = StObject.set(x, "ToTs", js.undefined)
    
    inline def setURL(value: String): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
    
    inline def setURLUndefined: Self = StObject.set(x, "URL", js.undefined)
  }
}

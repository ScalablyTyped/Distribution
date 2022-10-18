package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PcpFields extends StObject {
  
  /**
    * Received data from the server.
    */
  var data: js.UndefOr[String] = js.undefined
  
  /**
    * Received pcpFields as a key-value map.
    */
  var pcpFields: js.UndefOr[String] = js.undefined
}
object PcpFields {
  
  inline def apply(): PcpFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PcpFields]
  }
  
  extension [Self <: PcpFields](x: Self) {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setPcpFields(value: String): Self = StObject.set(x, "pcpFields", value.asInstanceOf[js.Any])
    
    inline def setPcpFieldsUndefined: Self = StObject.set(x, "pcpFields", js.undefined)
  }
}

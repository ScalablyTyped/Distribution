package typings.maximMazurokGapiClientManufacturers.gapi.client.manufacturers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DestinationStatus extends StObject {
  
  /** The name of the destination. */
  var destination: js.UndefOr[String] = js.undefined
  
  /** The status of the destination. */
  var status: js.UndefOr[String] = js.undefined
}
object DestinationStatus {
  
  inline def apply(): DestinationStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestinationStatus]
  }
  
  extension [Self <: DestinationStatus](x: Self) {
    
    inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}

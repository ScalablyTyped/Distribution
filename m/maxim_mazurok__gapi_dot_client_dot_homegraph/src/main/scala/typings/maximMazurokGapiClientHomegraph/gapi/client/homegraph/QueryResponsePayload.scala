package typings.maximMazurokGapiClientHomegraph.gapi.client.homegraph

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryResponsePayload extends StObject {
  
  /** States of the devices. Map of third-party device ID to struct of device states. */
  var devices: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: {[ P in string ]: any}} */ js.Any
  ] = js.undefined
}
object QueryResponsePayload {
  
  inline def apply(): QueryResponsePayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryResponsePayload]
  }
  
  extension [Self <: QueryResponsePayload](x: Self) {
    
    inline def setDevices(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: {[ P in string ]: any}} */ js.Any
    ): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    inline def setDevicesUndefined: Self = StObject.set(x, "devices", js.undefined)
  }
}

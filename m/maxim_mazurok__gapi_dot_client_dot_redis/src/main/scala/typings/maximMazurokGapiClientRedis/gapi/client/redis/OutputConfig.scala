package typings.maximMazurokGapiClientRedis.gapi.client.redis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputConfig extends StObject {
  
  /** Google Cloud Storage destination for output content. */
  var gcsDestination: js.UndefOr[GcsDestination] = js.undefined
}
object OutputConfig {
  
  inline def apply(): OutputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputConfig]
  }
  
  extension [Self <: OutputConfig](x: Self) {
    
    inline def setGcsDestination(value: GcsDestination): Self = StObject.set(x, "gcsDestination", value.asInstanceOf[js.Any])
    
    inline def setGcsDestinationUndefined: Self = StObject.set(x, "gcsDestination", js.undefined)
  }
}

package typings.maximMazurokGapiClientRedis.gapi.client.redis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportInstanceRequest extends StObject {
  
  /** Required. Specify data to be imported. */
  var inputConfig: js.UndefOr[InputConfig] = js.undefined
}
object ImportInstanceRequest {
  
  inline def apply(): ImportInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportInstanceRequest]
  }
  
  extension [Self <: ImportInstanceRequest](x: Self) {
    
    inline def setInputConfig(value: InputConfig): Self = StObject.set(x, "inputConfig", value.asInstanceOf[js.Any])
    
    inline def setInputConfigUndefined: Self = StObject.set(x, "inputConfig", js.undefined)
  }
}

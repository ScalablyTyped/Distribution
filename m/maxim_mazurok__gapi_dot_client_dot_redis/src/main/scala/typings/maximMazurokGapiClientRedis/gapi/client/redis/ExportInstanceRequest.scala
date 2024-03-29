package typings.maximMazurokGapiClientRedis.gapi.client.redis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportInstanceRequest extends StObject {
  
  /** Required. Specify data to be exported. */
  var outputConfig: js.UndefOr[OutputConfig] = js.undefined
}
object ExportInstanceRequest {
  
  inline def apply(): ExportInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportInstanceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportInstanceRequest] (val x: Self) extends AnyVal {
    
    inline def setOutputConfig(value: OutputConfig): Self = StObject.set(x, "outputConfig", value.asInstanceOf[js.Any])
    
    inline def setOutputConfigUndefined: Self = StObject.set(x, "outputConfig", js.undefined)
  }
}

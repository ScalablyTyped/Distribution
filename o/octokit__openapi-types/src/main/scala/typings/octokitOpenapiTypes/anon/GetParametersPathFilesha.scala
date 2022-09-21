package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathFilesha extends StObject {
  
  /**
    * The `content` in the response will always be Base64 encoded.
    *
    * _Note_: This API supports blobs up to 100 megabytes in size.
    */
  var get: ParametersPathFilesha
}
object GetParametersPathFilesha {
  
  inline def apply(get: ParametersPathFilesha): GetParametersPathFilesha = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathFilesha]
  }
  
  extension [Self <: GetParametersPathFilesha](x: Self) {
    
    inline def setGet(value: ParametersPathFilesha): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

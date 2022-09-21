package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathNameString extends StObject {
  
  /**
    * The API also allows fetching the source of a single template.
    * Use the raw [media type](https://docs.github.com/rest/overview/media-types/) to get the raw contents.
    */
  var get: ParametersPathNameString
}
object GetParametersPathNameString {
  
  inline def apply(get: ParametersPathNameString): GetParametersPathNameString = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathNameString]
  }
  
  extension [Self <: GetParametersPathNameString](x: Self) {
    
    inline def setGet(value: ParametersPathNameString): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

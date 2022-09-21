package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathTag extends StObject {
  
  /** Get a published release with the specified tag. */
  var get: ParametersPathTag
}
object GetParametersPathTag {
  
  inline def apply(get: ParametersPathTag): GetParametersPathTag = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathTag]
  }
  
  extension [Self <: GetParametersPathTag](x: Self) {
    
    inline def setGet(value: ParametersPathTag): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

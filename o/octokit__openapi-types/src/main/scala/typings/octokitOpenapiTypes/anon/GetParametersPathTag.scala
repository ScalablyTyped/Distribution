package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathTag extends StObject {
  
  /**
    * Get a release by tag name
    * @description Get a published release with the specified tag.
    */
  var get: ParametersPathTag
}
object GetParametersPathTag {
  
  inline def apply(get: ParametersPathTag): GetParametersPathTag = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathTag]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathTag] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathTag): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

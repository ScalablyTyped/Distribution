package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathName extends StObject {
  
  /**
    * Get a gitignore template
    * @description The API also allows fetching the source of a single template.
    * Use the raw [media type](https://docs.github.com/rest/overview/media-types/) to get the raw contents.
    */
  var get: ParametersPathName
}
object GetParametersPathName {
  
  inline def apply(get: ParametersPathName): GetParametersPathName = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathName] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathName): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

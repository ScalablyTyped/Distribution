package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathDir extends StObject {
  
  /**
    * Gets the README from a repository directory.
    *
    * READMEs support [custom media types](https://docs.github.com/rest/reference/repos#custom-media-types) for retrieving the raw content or rendered HTML.
    */
  var get: ParametersPathDir
}
object GetParametersPathDir {
  
  inline def apply(get: ParametersPathDir): GetParametersPathDir = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathDir]
  }
  
  extension [Self <: GetParametersPathDir](x: Self) {
    
    inline def setGet(value: ParametersPathDir): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathDirOwner extends StObject {
  
  /**
    * Gets the README from a repository directory.
    *
    * READMEs support [custom media types](https://docs.github.com/rest/reference/repos#custom-media-types) for retrieving the raw content or rendered HTML.
    */
  var get: ParametersPathDirOwner
}
object GetParametersPathDirOwner {
  
  inline def apply(get: ParametersPathDirOwner): GetParametersPathDirOwner = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathDirOwner]
  }
  
  extension [Self <: GetParametersPathDirOwner](x: Self) {
    
    inline def setGet(value: ParametersPathDirOwner): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

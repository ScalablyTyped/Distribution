package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQuery197 extends StObject {
  
  /**
    * List any syntax errors that are detected in the CODEOWNERS
    * file.
    *
    * For more information about the correct CODEOWNERS syntax,
    * see "[About code owners](https://docs.github.com/repositories/managing-your-repositorys-settings-and-features/customizing-your-repository/about-code-owners)."
    */
  var get: ParametersQuery197
}
object GetParametersQuery197 {
  
  inline def apply(get: ParametersQuery197): GetParametersQuery197 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQuery197]
  }
  
  extension [Self <: GetParametersQuery197](x: Self) {
    
    inline def setGet(value: ParametersQuery197): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

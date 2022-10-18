package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath292Query107 extends StObject {
  
  /**
    * List any syntax errors that are detected in the CODEOWNERS
    * file.
    *
    * For more information about the correct CODEOWNERS syntax,
    * see "[About code owners](https://docs.github.com/repositories/managing-your-repositorys-settings-and-features/customizing-your-repository/about-code-owners)."
    */
  var get: ParametersPath292Query107
}
object GetParametersPath292Query107 {
  
  inline def apply(get: ParametersPath292Query107): GetParametersPath292Query107 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath292Query107]
  }
  
  extension [Self <: GetParametersPath292Query107](x: Self) {
    
    inline def setGet(value: ParametersPath292Query107): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

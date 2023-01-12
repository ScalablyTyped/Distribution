package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQuery188 extends StObject {
  
  /**
    * List any syntax errors that are detected in the CODEOWNERS
    * file.
    *
    * For more information about the correct CODEOWNERS syntax,
    * see "[About code owners](https://docs.github.com/repositories/managing-your-repositorys-settings-and-features/customizing-your-repository/about-code-owners)."
    */
  var get: ParametersQuery188
}
object GetParametersQuery188 {
  
  inline def apply(get: ParametersQuery188): GetParametersQuery188 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQuery188]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersQuery188] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersQuery188): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters238 extends StObject {
  
  /**
    * List CODEOWNERS errors
    * @description List any syntax errors that are detected in the CODEOWNERS
    * file.
    *
    * For more information about the correct CODEOWNERS syntax,
    * see "[About code owners](https://docs.github.com/repositories/managing-your-repositorys-settings-and-features/customizing-your-repository/about-code-owners)."
    */
  var get: Parameters238
}
object GetParameters238 {
  
  inline def apply(get: Parameters238): GetParameters238 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters238]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters238] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters238): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

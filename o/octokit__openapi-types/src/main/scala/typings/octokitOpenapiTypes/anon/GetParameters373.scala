package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters373 extends StObject {
  
  /**
    * List commits on a pull request
    * @description Lists a maximum of 250 commits for a pull request. To receive a complete commit list for pull requests with more than 250 commits, use the [List commits](https://docs.github.com/rest/reference/repos#list-commits) endpoint.
    */
  var get: Parameters373
}
object GetParameters373 {
  
  inline def apply(get: Parameters373): GetParameters373 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters373]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters373] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters373): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

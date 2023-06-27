package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters321 extends StObject {
  
  /**
    * List issue comments for a repository
    * @description You can use the REST API to list comments on issues and pull requests for a repository. Every pull request is an issue, but not every issue is a pull request.
    *
    * By default, issue comments are ordered by ascending ID.
    */
  var get: Parameters321
}
object GetParameters321 {
  
  inline def apply(get: Parameters321): GetParameters321 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters321]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters321] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters321): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

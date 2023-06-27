package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters367 extends StObject {
  
  /**
    * List review comments in a repository
    * @description Lists review comments for all pull requests in a repository. By default, review comments are in ascending order by ID.
    */
  var get: Parameters367
}
object GetParameters367 {
  
  inline def apply(get: Parameters367): GetParameters367 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters367]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters367] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters367): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

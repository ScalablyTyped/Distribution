package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters6 extends StObject {
  
  /**
    * List installations for the authenticated app
    * @description You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    *
    * The permissions the installation has are included under the `permissions` key.
    */
  var get: Parameters6
}
object GetParameters6 {
  
  inline def apply(get: Parameters6): GetParameters6 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters6]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters6] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters6): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters141Responses200Content61 extends StObject {
  
  /**
    * List runner applications for a repository
    * @description Lists binaries for the runner application that you can download and run.
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint.
    */
  var get: Parameters141Responses200Content61
}
object GetParameters141Responses200Content61 {
  
  inline def apply(get: Parameters141Responses200Content61): GetParameters141Responses200Content61 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters141Responses200Content61]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters141Responses200Content61] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters141Responses200Content61): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

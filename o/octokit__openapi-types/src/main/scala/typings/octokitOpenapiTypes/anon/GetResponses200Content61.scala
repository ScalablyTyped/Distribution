package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content61 extends StObject {
  
  /**
    * List runner applications for an organization
    * @description Lists binaries for the runner application that you can download and run.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  var get: Responses200Content61
}
object GetResponses200Content61 {
  
  inline def apply(get: Responses200Content61): GetResponses200Content61 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content61]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content61] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content61): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

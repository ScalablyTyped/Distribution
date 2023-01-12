package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters135Responses200Content20 extends StObject {
  
  /**
    * Lists binaries for the runner application that you can download and run.
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint.
    */
  var get: Parameters135Responses200Content20
}
object GetParameters135Responses200Content20 {
  
  inline def apply(get: Parameters135Responses200Content20): GetParameters135Responses200Content20 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters135Responses200Content20]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters135Responses200Content20] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters135Responses200Content20): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters395Responses200Content257 extends StObject {
  
  /**
    * Lists binaries for the runner application that you can download and run.
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint.
    */
  var get: Parameters395Responses200Content257
}
object GetParameters395Responses200Content257 {
  
  inline def apply(get: Parameters395Responses200Content257): GetParameters395Responses200Content257 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters395Responses200Content257]
  }
  
  extension [Self <: GetParameters395Responses200Content257](x: Self) {
    
    inline def setGet(value: Parameters395Responses200Content257): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

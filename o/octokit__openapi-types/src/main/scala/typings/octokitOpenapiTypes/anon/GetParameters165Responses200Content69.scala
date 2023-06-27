package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters165Responses200Content69 extends StObject {
  
  /**
    * List runner applications for a repository
    * @description Lists binaries for the runner application that you can download and run.
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint.
    */
  var get: Parameters165Responses200Content69
}
object GetParameters165Responses200Content69 {
  
  inline def apply(get: Parameters165Responses200Content69): GetParameters165Responses200Content69 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters165Responses200Content69]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters165Responses200Content69] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters165Responses200Content69): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

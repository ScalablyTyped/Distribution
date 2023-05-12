package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses412 extends StObject {
  
  /**
    * List GPG keys for a user
    * @description Lists the GPG keys for a user. This information is accessible by anyone.
    */
  var get: Responses412
}
object GetResponses412 {
  
  inline def apply(get: Responses412): GetResponses412 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses412]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses412] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses412): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

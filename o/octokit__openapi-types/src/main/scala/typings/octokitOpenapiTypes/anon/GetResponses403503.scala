package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses403503 extends StObject {
  
  /**
    * List public events
    * @description We delay the public events feed by five minutes, which means the most recent event returned by the public events API actually occurred at least five minutes ago.
    */
  var get: Responses403503
}
object GetResponses403503 {
  
  inline def apply(get: Responses403503): GetResponses403503 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses403503]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses403503] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses403503): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

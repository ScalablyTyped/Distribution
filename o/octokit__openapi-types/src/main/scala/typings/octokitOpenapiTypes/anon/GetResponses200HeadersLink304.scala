package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200HeadersLink304 extends StObject {
  
  /**
    * List the people the authenticated user follows
    * @description Lists the people who the authenticated user follows.
    */
  var get: Responses200HeadersLink304
}
object GetResponses200HeadersLink304 {
  
  inline def apply(get: Responses200HeadersLink304): GetResponses200HeadersLink304 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200HeadersLink304]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200HeadersLink304] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200HeadersLink304): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

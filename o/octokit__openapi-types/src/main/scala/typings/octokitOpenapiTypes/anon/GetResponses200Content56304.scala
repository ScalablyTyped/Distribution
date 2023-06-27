package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content56304 extends StObject {
  
  /**
    * List repositories watched by the authenticated user
    * @description Lists repositories the authenticated user is watching.
    */
  var get: Responses200Content56304
}
object GetResponses200Content56304 {
  
  inline def apply(get: Responses200Content56304): GetResponses200Content56304 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content56304]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content56304] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content56304): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

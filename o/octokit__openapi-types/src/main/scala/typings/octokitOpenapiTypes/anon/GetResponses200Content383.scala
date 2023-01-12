package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content383 extends StObject {
  
  /** Lists the _verified_ public SSH keys for a user. This is accessible by anyone. */
  var get: Responses200Content383
}
object GetResponses200Content383 {
  
  inline def apply(get: Responses200Content383): GetResponses200Content383 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content383]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content383] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content383): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content252 extends StObject {
  
  /** List files larger than 100MB found during the import */
  var get: Responses200Content252
}
object GetResponses200Content252 {
  
  inline def apply(get: Responses200Content252): GetResponses200Content252 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content252]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content252] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content252): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

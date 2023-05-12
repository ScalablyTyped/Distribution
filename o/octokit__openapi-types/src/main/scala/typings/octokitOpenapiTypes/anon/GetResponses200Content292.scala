package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content292 extends StObject {
  
  /**
    * List repository languages
    * @description Lists languages for the specified repository. The value shown for each language is the number of bytes of code written in that language.
    */
  var get: Responses200Content292
}
object GetResponses200Content292 {
  
  inline def apply(get: Responses200Content292): GetResponses200Content292 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content292]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content292] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content292): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

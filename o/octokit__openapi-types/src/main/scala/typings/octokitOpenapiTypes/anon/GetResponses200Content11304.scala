package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content11304 extends StObject {
  
  /** Lists all the emojis available to use on GitHub. */
  var get: Responses200Content11304
}
object GetResponses200Content11304 {
  
  inline def apply(get: Responses200Content11304): GetResponses200Content11304 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content11304]
  }
  
  extension [Self <: GetResponses200Content11304](x: Self) {
    
    inline def setGet(value: Responses200Content11304): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

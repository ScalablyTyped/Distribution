package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200ContentTextplainString extends StObject {
  
  /** Get a random sentence from the Zen of GitHub */
  var get: Responses200ContentTextplainString
}
object GetResponses200ContentTextplainString {
  
  inline def apply(get: Responses200ContentTextplainString): GetResponses200ContentTextplainString = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200ContentTextplainString]
  }
  
  extension [Self <: GetResponses200ContentTextplainString](x: Self) {
    
    inline def setGet(value: Responses200ContentTextplainString): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `601` extends StObject {
  
  var responses: `200ContentApplicationjsonKeyKeyid`
}
object `601` {
  
  inline def apply(responses: `200ContentApplicationjsonKeyKeyid`): `601` = {
    val __obj = js.Dynamic.literal(responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[`601`]
  }
  
  extension [Self <: `601`](x: Self) {
    
    inline def setResponses(value: `200ContentApplicationjsonKeyKeyid`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

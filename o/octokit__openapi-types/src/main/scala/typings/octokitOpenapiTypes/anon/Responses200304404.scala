package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200304404 extends StObject {
  
  var responses: `200304404`
}
object Responses200304404 {
  
  inline def apply(responses: `200304404`): Responses200304404 = {
    val __obj = js.Dynamic.literal(responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200304404]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200304404] (val x: Self) extends AnyVal {
    
    inline def setResponses(value: `200304404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

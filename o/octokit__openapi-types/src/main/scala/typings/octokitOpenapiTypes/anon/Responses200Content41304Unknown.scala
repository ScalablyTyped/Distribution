package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content41304Unknown extends StObject {
  
  var responses: `200Content41304Unknown`
}
object Responses200Content41304Unknown {
  
  inline def apply(responses: `200Content41304Unknown`): Responses200Content41304Unknown = {
    val __obj = js.Dynamic.literal(responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content41304Unknown]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content41304Unknown] (val x: Self) extends AnyVal {
    
    inline def setResponses(value: `200Content41304Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

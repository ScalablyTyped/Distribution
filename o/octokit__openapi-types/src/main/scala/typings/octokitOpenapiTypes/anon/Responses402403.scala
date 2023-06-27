package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses402403 extends StObject {
  
  var parameters: PathCodespacenameString
  
  var responses: `402403`
}
object Responses402403 {
  
  inline def apply(parameters: PathCodespacenameString, responses: `402403`): Responses402403 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses402403]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses402403] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCodespacenameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `402403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

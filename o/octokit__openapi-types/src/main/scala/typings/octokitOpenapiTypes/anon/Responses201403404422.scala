package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201403404422 extends StObject {
  
  var parameters: PathCheckrunid
  
  var responses: `201403404422`
}
object Responses201403404422 {
  
  inline def apply(parameters: PathCheckrunid, responses: `201403404422`): Responses201403404422 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201403404422]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201403404422] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCheckrunid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201403404422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

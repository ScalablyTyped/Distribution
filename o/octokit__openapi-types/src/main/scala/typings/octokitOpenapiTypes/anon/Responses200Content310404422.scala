package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content310404422 extends StObject {
  
  var parameters: PathReviewid
  
  var responses: `200Content310404422`
}
object Responses200Content310404422 {
  
  inline def apply(parameters: PathReviewid, responses: `200Content310404422`): Responses200Content310404422 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content310404422]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content310404422] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathReviewid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content310404422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

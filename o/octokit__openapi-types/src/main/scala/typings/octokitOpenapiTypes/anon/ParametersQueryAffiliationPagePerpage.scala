package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryAffiliationPagePerpage extends StObject {
  
  var parameters: QueryAffiliationPagePerpage
  
  var responses: `200Content440Headers304Unknown`
}
object ParametersQueryAffiliationPagePerpage {
  
  inline def apply(parameters: QueryAffiliationPagePerpage, responses: `200Content440Headers304Unknown`): ParametersQueryAffiliationPagePerpage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryAffiliationPagePerpage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryAffiliationPagePerpage] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryAffiliationPagePerpage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content440Headers304Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

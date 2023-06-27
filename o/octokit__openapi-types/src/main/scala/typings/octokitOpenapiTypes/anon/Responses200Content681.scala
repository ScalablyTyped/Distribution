package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content681 extends StObject {
  
  var parameters: PathCommitshaOwnerQuery
  
  var responses: `200Content681`
}
object Responses200Content681 {
  
  inline def apply(parameters: PathCommitshaOwnerQuery, responses: `200Content681`): Responses200Content681 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content681]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content681] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCommitshaOwnerQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content681`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

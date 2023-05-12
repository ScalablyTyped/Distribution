package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses7 extends StObject {
  
  var parameters: PathInstallationid
  
  var responses: `7`
}
object Responses7 {
  
  inline def apply(parameters: PathInstallationid, responses: `7`): Responses7 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses7]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses7] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathInstallationid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `7`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

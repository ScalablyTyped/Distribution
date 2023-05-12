package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses404Content36422Content346 extends StObject {
  
  var parameters: PathOrgRepositoryidSecretname
  
  var responses: `404Content36422Content346`
}
object Responses404Content36422Content346 {
  
  inline def apply(parameters: PathOrgRepositoryidSecretname, responses: `404Content36422Content346`): Responses404Content36422Content346 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses404Content36422Content346]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses404Content36422Content346] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgRepositoryidSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404Content36422Content346`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}

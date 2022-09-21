package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pullrequestnumber extends StObject {
  
  /** @description Pull request number */
  var pull_request_number: Double
  
  /** @description Repository id for this codespace */
  var repository_id: Double
}
object Pullrequestnumber {
  
  inline def apply(pull_request_number: Double, repository_id: Double): Pullrequestnumber = {
    val __obj = js.Dynamic.literal(pull_request_number = pull_request_number.asInstanceOf[js.Any], repository_id = repository_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pullrequestnumber]
  }
  
  extension [Self <: Pullrequestnumber](x: Self) {
    
    inline def setPull_request_number(value: Double): Self = StObject.set(x, "pull_request_number", value.asInstanceOf[js.Any])
    
    inline def setRepository_id(value: Double): Self = StObject.set(x, "repository_id", value.asInstanceOf[js.Any])
  }
}

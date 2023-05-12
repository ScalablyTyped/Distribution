package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttemptnumberOwner extends StObject {
  
  var attempt_number: Double
  
  var owner: String
  
  var repo: String
  
  var run_id: Double
}
object AttemptnumberOwner {
  
  inline def apply(attempt_number: Double, owner: String, repo: String, run_id: Double): AttemptnumberOwner = {
    val __obj = js.Dynamic.literal(attempt_number = attempt_number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], run_id = run_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttemptnumberOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttemptnumberOwner] (val x: Self) extends AnyVal {
    
    inline def setAttempt_number(value: Double): Self = StObject.set(x, "attempt_number", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    inline def setRun_id(value: Double): Self = StObject.set(x, "run_id", value.asInstanceOf[js.Any])
  }
}

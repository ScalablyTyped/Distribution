package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pullnumber extends StObject {
  
  /** The account owner of the repository. The name is not case sensitive. */
  var owner: String
  
  /** The number that identifies the pull request. */
  var pull_number: Double
  
  /** The name of the repository. The name is not case sensitive. */
  var repo: String
}
object Pullnumber {
  
  inline def apply(owner: String, pull_number: Double, repo: String): Pullnumber = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pullnumber]
  }
  
  extension [Self <: Pullnumber](x: Self) {
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setPull_number(value: Double): Self = StObject.set(x, "pull_number", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}

package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IssuenumberOwnerRepo extends StObject {
  
  var issue_number: Double
  
  var owner: String
  
  var repo: String
}
object IssuenumberOwnerRepo {
  
  inline def apply(issue_number: Double, owner: String, repo: String): IssuenumberOwnerRepo = {
    val __obj = js.Dynamic.literal(issue_number = issue_number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuenumberOwnerRepo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IssuenumberOwnerRepo] (val x: Self) extends AnyVal {
    
    inline def setIssue_number(value: Double): Self = StObject.set(x, "issue_number", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}

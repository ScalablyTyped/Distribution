package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MigrationsMapCommitAuthorEndpoint extends StObject {
  
  var author_id: Double
  
  /**
    * The new Git author email.
    */
  var email: js.UndefOr[String] = js.undefined
  
  /**
    * The new Git author name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  var owner: String
  
  var repo: String
}
object MigrationsMapCommitAuthorEndpoint {
  
  inline def apply(author_id: Double, owner: String, repo: String): MigrationsMapCommitAuthorEndpoint = {
    val __obj = js.Dynamic.literal(author_id = author_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationsMapCommitAuthorEndpoint]
  }
  
  extension [Self <: MigrationsMapCommitAuthorEndpoint](x: Self) {
    
    inline def setAuthor_id(value: Double): Self = StObject.set(x, "author_id", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}

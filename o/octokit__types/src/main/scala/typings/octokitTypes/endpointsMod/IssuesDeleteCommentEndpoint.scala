package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IssuesDeleteCommentEndpoint extends StObject {
  
  var comment_id: Double
  
  var owner: String
  
  var repo: String
}
object IssuesDeleteCommentEndpoint {
  
  inline def apply(comment_id: Double, owner: String, repo: String): IssuesDeleteCommentEndpoint = {
    val __obj = js.Dynamic.literal(comment_id = comment_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesDeleteCommentEndpoint]
  }
  
  extension [Self <: IssuesDeleteCommentEndpoint](x: Self) {
    
    inline def setComment_id(value: Double): Self = StObject.set(x, "comment_id", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}

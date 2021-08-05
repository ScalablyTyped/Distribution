package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IssuesGetEventEndpoint extends StObject {
  
  var event_id: Double
  
  var owner: String
  
  var repo: String
}
object IssuesGetEventEndpoint {
  
  inline def apply(event_id: Double, owner: String, repo: String): IssuesGetEventEndpoint = {
    val __obj = js.Dynamic.literal(event_id = event_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesGetEventEndpoint]
  }
  
  extension [Self <: IssuesGetEventEndpoint](x: Self) {
    
    inline def setEvent_id(value: Double): Self = StObject.set(x, "event_id", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}

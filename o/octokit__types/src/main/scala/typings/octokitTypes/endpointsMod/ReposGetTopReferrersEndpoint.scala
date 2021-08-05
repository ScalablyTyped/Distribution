package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposGetTopReferrersEndpoint extends StObject {
  
  var owner: String
  
  var repo: String
}
object ReposGetTopReferrersEndpoint {
  
  inline def apply(owner: String, repo: String): ReposGetTopReferrersEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetTopReferrersEndpoint]
  }
  
  extension [Self <: ReposGetTopReferrersEndpoint](x: Self) {
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}

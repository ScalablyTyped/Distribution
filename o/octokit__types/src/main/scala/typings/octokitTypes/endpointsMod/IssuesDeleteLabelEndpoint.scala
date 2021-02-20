package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IssuesDeleteLabelEndpoint extends StObject {
  
  var name: String = js.native
  
  var owner: String = js.native
  
  var repo: String = js.native
}
object IssuesDeleteLabelEndpoint {
  
  @scala.inline
  def apply(name: String, owner: String, repo: String): IssuesDeleteLabelEndpoint = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesDeleteLabelEndpoint]
  }
  
  @scala.inline
  implicit class IssuesDeleteLabelEndpointMutableBuilder[Self <: IssuesDeleteLabelEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}

package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MigrationsGetCommitAuthorsEndpoint extends StObject {
  
  var owner: String = js.native
  
  var repo: String = js.native
  
  /**
    * Only authors found after this id are returned. Provide the highest author ID you've seen so far. New authors may be added to the list at any point while the importer is performing the `raw` step.
    */
  var since: js.UndefOr[String] = js.native
}
object MigrationsGetCommitAuthorsEndpoint {
  
  @scala.inline
  def apply(owner: String, repo: String): MigrationsGetCommitAuthorsEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationsGetCommitAuthorsEndpoint]
  }
  
  @scala.inline
  implicit class MigrationsGetCommitAuthorsEndpointMutableBuilder[Self <: MigrationsGetCommitAuthorsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSince(value: String): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSinceUndefined: Self = StObject.set(x, "since", js.undefined)
  }
}

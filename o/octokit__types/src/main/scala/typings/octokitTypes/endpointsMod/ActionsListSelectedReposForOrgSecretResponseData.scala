package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Archiveurl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionsListSelectedReposForOrgSecretResponseData extends StObject {
  
  var repositories: js.Array[Archiveurl]
  
  var total_count: Double
}
object ActionsListSelectedReposForOrgSecretResponseData {
  
  @scala.inline
  def apply(repositories: js.Array[Archiveurl], total_count: Double): ActionsListSelectedReposForOrgSecretResponseData = {
    val __obj = js.Dynamic.literal(repositories = repositories.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsListSelectedReposForOrgSecretResponseData]
  }
  
  @scala.inline
  implicit class ActionsListSelectedReposForOrgSecretResponseDataMutableBuilder[Self <: ActionsListSelectedReposForOrgSecretResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRepositories(value: js.Array[Archiveurl]): Self = StObject.set(x, "repositories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoriesVarargs(value: Archiveurl*): Self = StObject.set(x, "repositories", js.Array(value :_*))
    
    @scala.inline
    def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}

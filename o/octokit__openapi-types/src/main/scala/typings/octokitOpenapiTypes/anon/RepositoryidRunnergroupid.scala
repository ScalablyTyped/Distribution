package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepositoryidRunnergroupid extends StObject {
  
  /** The organization name. The name is not case sensitive. */
  @JSName("org")
  var org_ : String
  
  /** The unique identifier of the repository. */
  var repository_id: Double
  
  /** Unique identifier of the self-hosted runner group. */
  var runner_group_id: Double
}
object RepositoryidRunnergroupid {
  
  inline def apply(org_ : String, repository_id: Double, runner_group_id: Double): RepositoryidRunnergroupid = {
    val __obj = js.Dynamic.literal(repository_id = repository_id.asInstanceOf[js.Any], runner_group_id = runner_group_id.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryidRunnergroupid]
  }
  
  extension [Self <: RepositoryidRunnergroupid](x: Self) {
    
    inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    inline def setRepository_id(value: Double): Self = StObject.set(x, "repository_id", value.asInstanceOf[js.Any])
    
    inline def setRunner_group_id(value: Double): Self = StObject.set(x, "runner_group_id", value.asInstanceOf[js.Any])
  }
}

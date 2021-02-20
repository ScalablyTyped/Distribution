package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MigrationsGetLargeFilesEndpoint extends StObject {
  
  var owner: String = js.native
  
  var repo: String = js.native
}
object MigrationsGetLargeFilesEndpoint {
  
  @scala.inline
  def apply(owner: String, repo: String): MigrationsGetLargeFilesEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationsGetLargeFilesEndpoint]
  }
  
  @scala.inline
  implicit class MigrationsGetLargeFilesEndpointMutableBuilder[Self <: MigrationsGetLargeFilesEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}

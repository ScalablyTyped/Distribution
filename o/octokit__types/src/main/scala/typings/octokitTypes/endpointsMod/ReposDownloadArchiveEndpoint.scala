package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposDownloadArchiveEndpoint extends StObject {
  
  var archive_format: String = js.native
  
  var owner: String = js.native
  
  var ref: String = js.native
  
  var repo: String = js.native
}
object ReposDownloadArchiveEndpoint {
  
  @scala.inline
  def apply(archive_format: String, owner: String, ref: String, repo: String): ReposDownloadArchiveEndpoint = {
    val __obj = js.Dynamic.literal(archive_format = archive_format.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposDownloadArchiveEndpoint]
  }
  
  @scala.inline
  implicit class ReposDownloadArchiveEndpointMutableBuilder[Self <: ReposDownloadArchiveEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArchive_format(value: String): Self = StObject.set(x, "archive_format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}

package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`0`
import typings.octokitTypes.octokitTypesStrings.mercy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposGetAllTopicsEndpoint
  extends StObject
     with RequiredPreview[mercy] {
  
  var owner: String
  
  var repo: String
}
object ReposGetAllTopicsEndpoint {
  
  @scala.inline
  def apply(mediaType: `0`[mercy], owner: String, repo: String): ReposGetAllTopicsEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetAllTopicsEndpoint]
  }
  
  @scala.inline
  implicit class ReposGetAllTopicsEndpointMutableBuilder[Self <: ReposGetAllTopicsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}

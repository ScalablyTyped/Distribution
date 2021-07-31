package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`0`
import typings.octokitTypes.octokitTypesStrings.`scarlet-witch`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodesOfConductGetForRepoEndpoint
  extends StObject
     with RequiredPreview[`scarlet-witch`] {
  
  var owner: String
  
  var repo: String
}
object CodesOfConductGetForRepoEndpoint {
  
  @scala.inline
  def apply(mediaType: `0`[`scarlet-witch`], owner: String, repo: String): CodesOfConductGetForRepoEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodesOfConductGetForRepoEndpoint]
  }
  
  @scala.inline
  implicit class CodesOfConductGetForRepoEndpointMutableBuilder[Self <: CodesOfConductGetForRepoEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}

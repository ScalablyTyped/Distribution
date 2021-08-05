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
  
  inline def apply(mediaType: `0`[`scarlet-witch`], owner: String, repo: String): CodesOfConductGetForRepoEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodesOfConductGetForRepoEndpoint]
  }
  
  extension [Self <: CodesOfConductGetForRepoEndpoint](x: Self) {
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}

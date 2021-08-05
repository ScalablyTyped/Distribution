package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`0`
import typings.octokitTypes.octokitTypesStrings.sombra
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InteractionsGetRestrictionsForRepoEndpoint
  extends StObject
     with RequiredPreview[sombra] {
  
  var owner: String
  
  var repo: String
}
object InteractionsGetRestrictionsForRepoEndpoint {
  
  inline def apply(mediaType: `0`[sombra], owner: String, repo: String): InteractionsGetRestrictionsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionsGetRestrictionsForRepoEndpoint]
  }
  
  extension [Self <: InteractionsGetRestrictionsForRepoEndpoint](x: Self) {
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}

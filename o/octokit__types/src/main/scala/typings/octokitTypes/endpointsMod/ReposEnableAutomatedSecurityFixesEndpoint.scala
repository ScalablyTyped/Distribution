package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`0`
import typings.octokitTypes.octokitTypesStrings.london
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposEnableAutomatedSecurityFixesEndpoint
  extends StObject
     with RequiredPreview[london] {
  
  var owner: String
  
  var repo: String
}
object ReposEnableAutomatedSecurityFixesEndpoint {
  
  inline def apply(mediaType: `0`[london], owner: String, repo: String): ReposEnableAutomatedSecurityFixesEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposEnableAutomatedSecurityFixesEndpoint]
  }
  
  extension [Self <: ReposEnableAutomatedSecurityFixesEndpoint](x: Self) {
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}

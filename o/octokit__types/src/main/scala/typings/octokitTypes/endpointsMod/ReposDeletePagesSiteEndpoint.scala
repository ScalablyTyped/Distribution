package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`0`
import typings.octokitTypes.octokitTypesStrings.switcheroo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposDeletePagesSiteEndpoint
  extends StObject
     with RequiredPreview[switcheroo] {
  
  var owner: String
  
  var repo: String
}
object ReposDeletePagesSiteEndpoint {
  
  inline def apply(mediaType: `0`[switcheroo], owner: String, repo: String): ReposDeletePagesSiteEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposDeletePagesSiteEndpoint]
  }
  
  extension [Self <: ReposDeletePagesSiteEndpoint](x: Self) {
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}

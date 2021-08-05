package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`0`
import typings.octokitTypes.octokitTypesStrings.`black-panther`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposGetCommunityProfileMetricsEndpoint
  extends StObject
     with RequiredPreview[`black-panther`] {
  
  var owner: String
  
  var repo: String
}
object ReposGetCommunityProfileMetricsEndpoint {
  
  inline def apply(mediaType: `0`[`black-panther`], owner: String, repo: String): ReposGetCommunityProfileMetricsEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetCommunityProfileMetricsEndpoint]
  }
  
  extension [Self <: ReposGetCommunityProfileMetricsEndpoint](x: Self) {
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}

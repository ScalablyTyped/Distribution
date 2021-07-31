package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`0`
import typings.octokitTypes.octokitTypesStrings.switcheroo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposCreatePagesSiteEndpoint
  extends StObject
     with RequiredPreview[switcheroo] {
  
  var owner: String
  
  var repo: String
  
  /**
    * The source branch and directory used to publish your Pages site.
    */
  var source: ReposCreatePagesSiteParamsSource
}
object ReposCreatePagesSiteEndpoint {
  
  @scala.inline
  def apply(mediaType: `0`[switcheroo], owner: String, repo: String, source: ReposCreatePagesSiteParamsSource): ReposCreatePagesSiteEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreatePagesSiteEndpoint]
  }
  
  @scala.inline
  implicit class ReposCreatePagesSiteEndpointMutableBuilder[Self <: ReposCreatePagesSiteEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: ReposCreatePagesSiteParamsSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}

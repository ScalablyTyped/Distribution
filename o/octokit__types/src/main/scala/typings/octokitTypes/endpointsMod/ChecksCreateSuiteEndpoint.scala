package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`0`
import typings.octokitTypes.octokitTypesStrings.antiope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChecksCreateSuiteEndpoint
  extends StObject
     with RequiredPreview[antiope] {
  
  /**
    * The sha of the head commit.
    */
  var head_sha: String
  
  var owner: String
  
  var repo: String
}
object ChecksCreateSuiteEndpoint {
  
  @scala.inline
  def apply(head_sha: String, mediaType: `0`[antiope], owner: String, repo: String): ChecksCreateSuiteEndpoint = {
    val __obj = js.Dynamic.literal(head_sha = head_sha.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksCreateSuiteEndpoint]
  }
  
  @scala.inline
  implicit class ChecksCreateSuiteEndpointMutableBuilder[Self <: ChecksCreateSuiteEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHead_sha(value: String): Self = StObject.set(x, "head_sha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}

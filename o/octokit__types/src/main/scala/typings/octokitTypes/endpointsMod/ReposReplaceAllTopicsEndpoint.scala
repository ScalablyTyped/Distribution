package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`15`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  owner :string,   repo :string,   names :std.Array<string>} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'mercy'> */
@js.native
trait ReposReplaceAllTopicsEndpoint extends StObject {
  
  var mediaType: `15` = js.native
  
  /**
    * An array of topics to add to the repository. Pass one or more topics to _replace_ the set of existing topics. Send an empty array (`[]`) to clear all topics from the repository. **Note:** Topic `names` cannot contain uppercase letters.
    */
  var names: js.Array[String] = js.native
  
  var owner: String = js.native
  
  var repo: String = js.native
}
object ReposReplaceAllTopicsEndpoint {
  
  @scala.inline
  def apply(mediaType: `15`, names: js.Array[String], owner: String, repo: String): ReposReplaceAllTopicsEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposReplaceAllTopicsEndpoint]
  }
  
  @scala.inline
  implicit class ReposReplaceAllTopicsEndpointMutableBuilder[Self <: ReposReplaceAllTopicsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMediaType(value: `15`): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value :_*))
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}

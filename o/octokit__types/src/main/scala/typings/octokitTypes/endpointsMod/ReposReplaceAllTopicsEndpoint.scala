package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`17`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  owner  :string,   repo  :string,   names  :std.Array<string>} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'mercy'> */
trait ReposReplaceAllTopicsEndpoint extends js.Object {
  var mediaType: `17`
  /**
    * An array of topics to add to the repository. Pass one or more topics to _replace_ the set of existing topics. Send an empty array (`[]`) to clear all topics from the repository. **Note:** Topic `names` cannot contain uppercase letters.
    */
  var names: js.Array[String]
  var owner: String
  var repo: String
}

object ReposReplaceAllTopicsEndpoint {
  @scala.inline
  def apply(mediaType: `17`, names: js.Array[String], owner: String, repo: String): ReposReplaceAllTopicsEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposReplaceAllTopicsEndpoint]
  }
}


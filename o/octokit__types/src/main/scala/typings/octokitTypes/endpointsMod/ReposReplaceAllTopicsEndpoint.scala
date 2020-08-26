package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`18`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  owner :string,   repo :string,   names :std.Array<string>} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'mercy'> */
@js.native
trait ReposReplaceAllTopicsEndpoint extends js.Object {
  var mediaType: `18` = js.native
  /**
    * An array of topics to add to the repository. Pass one or more topics to _replace_ the set of existing topics. Send an empty array (`[]`) to clear all topics from the repository. **Note:** Topic `names` cannot contain uppercase letters.
    */
  var names: js.Array[String] = js.native
  var owner: String = js.native
  var repo: String = js.native
}

object ReposReplaceAllTopicsEndpoint {
  @scala.inline
  def apply(mediaType: `18`, names: js.Array[String], owner: String, repo: String): ReposReplaceAllTopicsEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposReplaceAllTopicsEndpoint]
  }
  @scala.inline
  implicit class ReposReplaceAllTopicsEndpointOps[Self <: ReposReplaceAllTopicsEndpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMediaType(value: `18`): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamesVarargs(value: String*): Self = this.set("names", js.Array(value :_*))
    @scala.inline
    def setNames(value: js.Array[String]): Self = this.set("names", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
  }
  
}


package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposReplaceTopicsParams extends js.Object {
  /**
    * An array of topics to add to the repository. Pass one or more topics to _replace_ the set of existing topics. Send an empty array (`[]`) to clear all topics from the repository. **Note:** Topic `names` cannot contain uppercase letters.
    */
  var names: js.Array[String]
  var owner: String
  var repo: String
}

object ReposReplaceTopicsParams {
  @scala.inline
  def apply(names: js.Array[String], owner: String, repo: String): ReposReplaceTopicsParams = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposReplaceTopicsParams]
  }
}


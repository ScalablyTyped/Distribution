package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposReplaceTopicsParams extends js.Object {
  /**
    * An array of topics to add to the repository. Pass one or more topics to _replace_ the set of existing topics. Send an empty array (`[]`) to clear all topics from the repository. **Note:** Topic `names` cannot contain uppercase letters.
    */
  var names: js.Array[java.lang.String]
  var owner: java.lang.String
  var repo: java.lang.String
}

object ReposReplaceTopicsParams {
  @scala.inline
  def apply(names: js.Array[java.lang.String], owner: java.lang.String, repo: java.lang.String): ReposReplaceTopicsParams = {
    val __obj = js.Dynamic.literal(names = names, owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposReplaceTopicsParams]
  }
}


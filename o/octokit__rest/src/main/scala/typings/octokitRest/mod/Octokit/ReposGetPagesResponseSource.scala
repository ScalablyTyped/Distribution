package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetPagesResponseSource extends js.Object {
  var branch: String
  var directory: String
}

object ReposGetPagesResponseSource {
  @scala.inline
  def apply(branch: String, directory: String): ReposGetPagesResponseSource = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], directory = directory.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposGetPagesResponseSource]
  }
}


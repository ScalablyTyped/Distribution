package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Branch extends js.Object {
  var branch: String
  var directory: String
}

object Branch {
  @scala.inline
  def apply(branch: String, directory: String): Branch = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], directory = directory.asInstanceOf[js.Any])
    __obj.asInstanceOf[Branch]
  }
}


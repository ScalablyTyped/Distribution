package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Issues extends js.Object {
  var contents: String
  var issues: String
}

object Issues {
  @scala.inline
  def apply(contents: String, issues: String): Issues = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], issues = issues.asInstanceOf[js.Any])
    __obj.asInstanceOf[Issues]
  }
}


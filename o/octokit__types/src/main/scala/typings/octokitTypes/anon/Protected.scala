package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Protected extends js.Object {
  var commit: Sha
  var name: String
  var `protected`: Boolean
}

object Protected {
  @scala.inline
  def apply(commit: Sha, name: String, `protected`: Boolean): Protected = {
    val __obj = js.Dynamic.literal(commit = commit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("protected")(`protected`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Protected]
  }
}


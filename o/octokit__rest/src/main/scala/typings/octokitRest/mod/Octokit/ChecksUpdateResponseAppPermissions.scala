package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksUpdateResponseAppPermissions extends js.Object {
  var contents: String
  var issues: String
  var metadata: String
  var single_file: String
}

object ChecksUpdateResponseAppPermissions {
  @scala.inline
  def apply(contents: String, issues: String, metadata: String, single_file: String): ChecksUpdateResponseAppPermissions = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], issues = issues.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], single_file = single_file.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChecksUpdateResponseAppPermissions]
  }
}


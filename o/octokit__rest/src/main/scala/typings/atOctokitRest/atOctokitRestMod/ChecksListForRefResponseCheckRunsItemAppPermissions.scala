package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksListForRefResponseCheckRunsItemAppPermissions extends js.Object {
  var contents: String
  var issues: String
  var metadata: String
  var single_file: String
}

object ChecksListForRefResponseCheckRunsItemAppPermissions {
  @scala.inline
  def apply(contents: String, issues: String, metadata: String, single_file: String): ChecksListForRefResponseCheckRunsItemAppPermissions = {
    val __obj = js.Dynamic.literal(contents = contents, issues = issues, metadata = metadata, single_file = single_file)
  
    __obj.asInstanceOf[ChecksListForRefResponseCheckRunsItemAppPermissions]
  }
}


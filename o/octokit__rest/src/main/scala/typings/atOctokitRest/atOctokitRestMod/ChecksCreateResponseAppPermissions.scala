package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksCreateResponseAppPermissions extends js.Object {
  var contents: String
  var issues: String
  var metadata: String
  var single_file: String
}

object ChecksCreateResponseAppPermissions {
  @scala.inline
  def apply(contents: String, issues: String, metadata: String, single_file: String): ChecksCreateResponseAppPermissions = {
    val __obj = js.Dynamic.literal(contents = contents, issues = issues, metadata = metadata, single_file = single_file)
  
    __obj.asInstanceOf[ChecksCreateResponseAppPermissions]
  }
}


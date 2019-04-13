package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsGetInstallationResponsePermissions extends js.Object {
  var contents: java.lang.String
  var issues: java.lang.String
  var metadata: java.lang.String
  var single_file: java.lang.String
}

object AppsGetInstallationResponsePermissions {
  @scala.inline
  def apply(
    contents: java.lang.String,
    issues: java.lang.String,
    metadata: java.lang.String,
    single_file: java.lang.String
  ): AppsGetInstallationResponsePermissions = {
    val __obj = js.Dynamic.literal(contents = contents, issues = issues, metadata = metadata, single_file = single_file)
  
    __obj.asInstanceOf[AppsGetInstallationResponsePermissions]
  }
}


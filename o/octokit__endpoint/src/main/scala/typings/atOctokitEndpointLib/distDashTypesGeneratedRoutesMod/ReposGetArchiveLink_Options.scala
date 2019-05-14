package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetArchiveLink_Options extends js.Object {
  var archive_format: java.lang.String
  var owner: java.lang.String
  var ref: java.lang.String
  var repo: java.lang.String
}

object ReposGetArchiveLink_Options {
  @scala.inline
  def apply(
    archive_format: java.lang.String,
    owner: java.lang.String,
    ref: java.lang.String,
    repo: java.lang.String
  ): ReposGetArchiveLink_Options = {
    val __obj = js.Dynamic.literal(archive_format = archive_format, owner = owner, ref = ref, repo = repo)
  
    __obj.asInstanceOf[ReposGetArchiveLink_Options]
  }
}


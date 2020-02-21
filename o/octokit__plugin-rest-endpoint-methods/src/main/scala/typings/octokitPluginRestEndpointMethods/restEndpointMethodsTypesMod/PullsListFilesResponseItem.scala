package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsListFilesResponseItem extends js.Object {
  var additions: Double
  var blob_url: String
  var changes: Double
  var contents_url: String
  var deletions: Double
  var filename: String
  var patch: String
  var raw_url: String
  var sha: String
  var status: String
}

object PullsListFilesResponseItem {
  @scala.inline
  def apply(
    additions: Double,
    blob_url: String,
    changes: Double,
    contents_url: String,
    deletions: Double,
    filename: String,
    patch: String,
    raw_url: String,
    sha: String,
    status: String
  ): PullsListFilesResponseItem = {
    val __obj = js.Dynamic.literal(additions = additions.asInstanceOf[js.Any], blob_url = blob_url.asInstanceOf[js.Any], changes = changes.asInstanceOf[js.Any], contents_url = contents_url.asInstanceOf[js.Any], deletions = deletions.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any], raw_url = raw_url.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PullsListFilesResponseItem]
  }
}


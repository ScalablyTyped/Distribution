package typings.atOctokitRest.atOctokitRestMod

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
    val __obj = js.Dynamic.literal(additions = additions, blob_url = blob_url, changes = changes, contents_url = contents_url, deletions = deletions, filename = filename, patch = patch, raw_url = raw_url, sha = sha, status = status)
  
    __obj.asInstanceOf[PullsListFilesResponseItem]
  }
}


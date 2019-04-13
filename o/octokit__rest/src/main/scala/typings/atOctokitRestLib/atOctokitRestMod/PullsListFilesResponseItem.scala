package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsListFilesResponseItem extends js.Object {
  var additions: scala.Double
  var blob_url: java.lang.String
  var changes: scala.Double
  var contents_url: java.lang.String
  var deletions: scala.Double
  var filename: java.lang.String
  var patch: java.lang.String
  var raw_url: java.lang.String
  var sha: java.lang.String
  var status: java.lang.String
}

object PullsListFilesResponseItem {
  @scala.inline
  def apply(
    additions: scala.Double,
    blob_url: java.lang.String,
    changes: scala.Double,
    contents_url: java.lang.String,
    deletions: scala.Double,
    filename: java.lang.String,
    patch: java.lang.String,
    raw_url: java.lang.String,
    sha: java.lang.String,
    status: java.lang.String
  ): PullsListFilesResponseItem = {
    val __obj = js.Dynamic.literal(additions = additions, blob_url = blob_url, changes = changes, contents_url = contents_url, deletions = deletions, filename = filename, patch = patch, raw_url = raw_url, sha = sha, status = status)
  
    __obj.asInstanceOf[PullsListFilesResponseItem]
  }
}


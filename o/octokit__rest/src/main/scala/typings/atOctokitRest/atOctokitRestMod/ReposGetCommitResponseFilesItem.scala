package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetCommitResponseFilesItem extends js.Object {
  var additions: Double
  var blob_url: String
  var changes: Double
  var deletions: Double
  var filename: String
  var patch: String
  var raw_url: String
  var status: String
}

object ReposGetCommitResponseFilesItem {
  @scala.inline
  def apply(
    additions: Double,
    blob_url: String,
    changes: Double,
    deletions: Double,
    filename: String,
    patch: String,
    raw_url: String,
    status: String
  ): ReposGetCommitResponseFilesItem = {
    val __obj = js.Dynamic.literal(additions = additions, blob_url = blob_url, changes = changes, deletions = deletions, filename = filename, patch = patch, raw_url = raw_url, status = status)
  
    __obj.asInstanceOf[ReposGetCommitResponseFilesItem]
  }
}


package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bloburl extends js.Object {
  var additions: Double = js.native
  var blob_url: String = js.native
  var changes: Double = js.native
  var contents_url: String = js.native
  var deletions: Double = js.native
  var filename: String = js.native
  var patch: String = js.native
  var raw_url: String = js.native
  var sha: String = js.native
  var status: String = js.native
}

object Bloburl {
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
  ): Bloburl = {
    val __obj = js.Dynamic.literal(additions = additions.asInstanceOf[js.Any], blob_url = blob_url.asInstanceOf[js.Any], changes = changes.asInstanceOf[js.Any], contents_url = contents_url.asInstanceOf[js.Any], deletions = deletions.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any], raw_url = raw_url.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bloburl]
  }
  @scala.inline
  implicit class BloburlOps[Self <: Bloburl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdditions(value: Double): Self = this.set("additions", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlob_url(value: String): Self = this.set("blob_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setChanges(value: Double): Self = this.set("changes", value.asInstanceOf[js.Any])
    @scala.inline
    def setContents_url(value: String): Self = this.set("contents_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeletions(value: Double): Self = this.set("deletions", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def setPatch(value: String): Self = this.set("patch", value.asInstanceOf[js.Any])
    @scala.inline
    def setRaw_url(value: String): Self = this.set("raw_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setSha(value: String): Self = this.set("sha", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}


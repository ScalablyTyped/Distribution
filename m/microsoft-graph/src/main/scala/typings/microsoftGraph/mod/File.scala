package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait File extends js.Object {
  // Hashes of the file's binary content, if available. Read-only.
  var hashes: js.UndefOr[Hashes] = js.native
  /**
    * The MIME type for the file. This is determined by logic on the server and might not be the value provided when the file
    * was uploaded. Read-only.
    */
  var mimeType: js.UndefOr[String] = js.native
  var processingMetadata: js.UndefOr[Boolean] = js.native
}

object File {
  @scala.inline
  def apply(): File = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[File]
  }
  @scala.inline
  implicit class FileOps[Self <: File] (val x: Self) extends AnyVal {
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
    def setHashes(value: Hashes): Self = this.set("hashes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHashes: Self = this.set("hashes", js.undefined)
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMimeType: Self = this.set("mimeType", js.undefined)
    @scala.inline
    def setProcessingMetadata(value: Boolean): Self = this.set("processingMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessingMetadata: Self = this.set("processingMetadata", js.undefined)
  }
  
}


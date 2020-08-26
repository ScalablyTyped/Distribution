package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridFSBucketWriteStreamOptions extends WriteConcern {
  /**
    * The chunk size to use, in bytes
    */
  var chunkSizeBytes: js.UndefOr[scala.Double] = js.native
  /**
    * Default false; If true, disables adding an md5 field to file data
    */
  var disableMD5: js.UndefOr[Boolean] = js.native
  /**
    * Custom file id for the GridFS file.
    */
  var id: js.UndefOr[GridFSBucketWriteStreamId] = js.native
}

object GridFSBucketWriteStreamOptions {
  @scala.inline
  def apply(): GridFSBucketWriteStreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridFSBucketWriteStreamOptions]
  }
  @scala.inline
  implicit class GridFSBucketWriteStreamOptionsOps[Self <: GridFSBucketWriteStreamOptions] (val x: Self) extends AnyVal {
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
    def setChunkSizeBytes(value: scala.Double): Self = this.set("chunkSizeBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChunkSizeBytes: Self = this.set("chunkSizeBytes", js.undefined)
    @scala.inline
    def setDisableMD5(value: Boolean): Self = this.set("disableMD5", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableMD5: Self = this.set("disableMD5", js.undefined)
    @scala.inline
    def setId(value: GridFSBucketWriteStreamId): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
  
}


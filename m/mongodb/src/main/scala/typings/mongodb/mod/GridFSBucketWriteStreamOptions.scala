package typings.mongodb.mod

import typings.mongodb.mongodbStrings.majority
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridFSBucketWriteStreamOptions extends WriteConcern {
  /**
    * The chunk size to use, in bytes
    */
  var chunkSizeBytes: js.UndefOr[scala.Double] = js.undefined
  /**
    * Default false; If true, disables adding an md5 field to file data
    */
  var disableMD5: js.UndefOr[Boolean] = js.undefined
  /**
    * Custom file id for the GridFS file.
    */
  var id: js.UndefOr[GridFSBucketWriteStreamId] = js.undefined
}

object GridFSBucketWriteStreamOptions {
  @scala.inline
  def apply(
    chunkSizeBytes: js.UndefOr[scala.Double] = js.undefined,
    disableMD5: js.UndefOr[Boolean] = js.undefined,
    id: GridFSBucketWriteStreamId = null,
    j: js.UndefOr[Boolean] = js.undefined,
    w: scala.Double | majority | String = null,
    wtimeout: js.UndefOr[scala.Double] = js.undefined
  ): GridFSBucketWriteStreamOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(chunkSizeBytes)) __obj.updateDynamic("chunkSizeBytes")(chunkSizeBytes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableMD5)) __obj.updateDynamic("disableMD5")(disableMD5.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(j)) __obj.updateDynamic("j")(j.get.asInstanceOf[js.Any])
    if (w != null) __obj.updateDynamic("w")(w.asInstanceOf[js.Any])
    if (!js.isUndefined(wtimeout)) __obj.updateDynamic("wtimeout")(wtimeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridFSBucketWriteStreamOptions]
  }
}


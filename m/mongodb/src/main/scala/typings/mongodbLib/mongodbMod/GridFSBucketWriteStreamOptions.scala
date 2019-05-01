package typings
package mongodbLib.mongodbMod

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
  var disableMD5: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Custom file id for the GridFS file.
    */
  var id: js.UndefOr[GridFSBucketWriteStreamId] = js.undefined
}

object GridFSBucketWriteStreamOptions {
  @scala.inline
  def apply(
    chunkSizeBytes: scala.Int | scala.Double = null,
    disableMD5: js.UndefOr[scala.Boolean] = js.undefined,
    id: GridFSBucketWriteStreamId = null,
    j: js.UndefOr[scala.Boolean] = js.undefined,
    w: scala.Double | mongodbLib.mongodbLibStrings.majority | java.lang.String = null,
    wtimeout: scala.Int | scala.Double = null
  ): GridFSBucketWriteStreamOptions = {
    val __obj = js.Dynamic.literal()
    if (chunkSizeBytes != null) __obj.updateDynamic("chunkSizeBytes")(chunkSizeBytes.asInstanceOf[js.Any])
    if (!js.isUndefined(disableMD5)) __obj.updateDynamic("disableMD5")(disableMD5)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(j)) __obj.updateDynamic("j")(j)
    if (w != null) __obj.updateDynamic("w")(w.asInstanceOf[js.Any])
    if (wtimeout != null) __obj.updateDynamic("wtimeout")(wtimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridFSBucketWriteStreamOptions]
  }
}


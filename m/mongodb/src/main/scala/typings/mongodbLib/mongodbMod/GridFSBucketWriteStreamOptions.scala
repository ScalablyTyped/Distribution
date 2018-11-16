package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GridFSBucketWriteStreamOptions extends js.Object {
  /** The chunk size to use, in bytes */
  var chunkSizeBytes: js.UndefOr[scala.Double] = js.undefined
  /** Default false; If true, disables adding an md5 field to file data */
  var disableMD5: js.UndefOr[scala.Boolean] = js.undefined
  /** Custom file id for the GridFS file. */
  var id: js.UndefOr[mongodbLib.GridFSBucketWriteStreamId] = js.undefined
  /** The journal write concern */
  var j: js.UndefOr[scala.Double] = js.undefined
  /** The write concern */
  var w: js.UndefOr[scala.Double] = js.undefined
  /** The write concern timeout */
  var wtimeout: js.UndefOr[scala.Double] = js.undefined
}


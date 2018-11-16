package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongodb", "GridFSBucketWriteStream")
@js.native
class GridFSBucketWriteStream protected ()
  extends nodeLib.streamMod.Writable {
  def this(bucket: GridFSBucket, filename: java.lang.String) = this()
  def this(bucket: GridFSBucket, filename: java.lang.String, options: GridFSBucketWriteStreamOptions) = this()
  var id: mongodbLib.GridFSBucketWriteStreamId = js.native
}


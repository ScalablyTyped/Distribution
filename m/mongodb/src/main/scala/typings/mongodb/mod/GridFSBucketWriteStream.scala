package typings.mongodb.mod

import typings.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongodb", "GridFSBucketWriteStream")
@js.native
class GridFSBucketWriteStream protected () extends Writable {
  def this(bucket: GridFSBucket, filename: String) = this()
  def this(bucket: GridFSBucket, filename: String, options: GridFSBucketWriteStreamOptions) = this()
  var id: GridFSBucketWriteStreamId = js.native
}


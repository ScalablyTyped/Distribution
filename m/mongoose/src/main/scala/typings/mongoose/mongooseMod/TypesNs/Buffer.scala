package typings.mongoose.mongooseMod.TypesNs

import typings.mongodb.mongodbMod.Binary
import typings.mongoose.mongooseMod.NativeBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * section types/buffer.js
  * http://mongoosejs.com/docs/api.html#types-buffer-js
  */
@js.native
trait Buffer
  extends typings.node.TypeofClassBuffer {
  /**
    * Copies the buffer.
    * Buffer#copy does not mark target as modified so you must copy
    * from a MongooseBuffer for it to work as expected. This is a
    * work around since copy modifies the target, not this.
    */
  def copy(target: NativeBuffer, nodeBufferArgs: js.Any*): Double = js.native
  /** Determines if this buffer is equals to other buffer */
  def equals(other: NativeBuffer): Boolean = js.native
  /** Sets the subtype option and marks the buffer modified. */
  def subtype(subtype: Double): Unit = js.native
  /** Converts this buffer to its Binary type representation. */
  def toObject(): Binary = js.native
  def toObject(subtype: Double): Binary = js.native
  /** Writes the buffer. */
  def write(string: String, nodeBufferArgs: js.Any*): Double = js.native
}


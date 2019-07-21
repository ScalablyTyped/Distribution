package typings
package mongooseLib.mongooseMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * section types/buffer.js
  * http://mongoosejs.com/docs/api.html#types-buffer-js
  */
@js.native
trait Buffer
  extends nodeLib.TypeofClassBuffer {
  /**
    * Copies the buffer.
    * Buffer#copy does not mark target as modified so you must copy
    * from a MongooseBuffer for it to work as expected. This is a
    * work around since copy modifies the target, not this.
    */
  def copy(target: mongooseLib.mongooseMod.NativeBuffer, nodeBufferArgs: js.Any*): scala.Double = js.native
  /** Determines if this buffer is equals to other buffer */
  def equals(other: mongooseLib.mongooseMod.NativeBuffer): scala.Boolean = js.native
  /** Sets the subtype option and marks the buffer modified. */
  def subtype(subtype: scala.Double): scala.Unit = js.native
  /** Converts this buffer to its Binary type representation. */
  def toObject(): mongodbLib.mongodbMod.Binary = js.native
  def toObject(subtype: scala.Double): mongodbLib.mongodbMod.Binary = js.native
  /** Writes the buffer. */
  def write(string: java.lang.String, nodeBufferArgs: js.Any*): scala.Double = js.native
}


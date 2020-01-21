package typings.oracledb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used with connection.executeMany() to define a bind variable's types, sizes and directions.
  */
trait BindDefinition extends js.Object {
  /**
    * The direction of the bind. One of the Execute Bind Direction Constants.
    *
    * @default BIND_IN
    */
  var dir: js.UndefOr[Double] = js.undefined
  /**
    * Required for Strings and Buffers. Ignored for other types. Specifies the maximum number of bytes
    * allocated when processing each value of this bind variable. When data is being passed into the database,
    * maxSize should be at least the size of the longest value. When data is being returned from the database,
    * maxSize should be the size of the longest value. If maxSize is too small, executeMany() will throw an
    * error that is not handled by batchErrors.
    */
  var maxSize: js.UndefOr[Double] = js.undefined
  /**
    * The node-oracledb or JavaScript data type to be bound. One of the Node-oracledb Type Constants.
    */
  var `type`: js.UndefOr[Double] = js.undefined
}

object BindDefinition {
  @scala.inline
  def apply(dir: Int | Double = null, maxSize: Int | Double = null, `type`: Int | Double = null): BindDefinition = {
    val __obj = js.Dynamic.literal()
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindDefinition]
  }
}


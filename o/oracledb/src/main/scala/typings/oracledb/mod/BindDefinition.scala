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
  def apply(
    dir: js.UndefOr[Double] = js.undefined,
    maxSize: js.UndefOr[Double] = js.undefined,
    `type`: js.UndefOr[Double] = js.undefined
  ): BindDefinition = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dir)) __obj.updateDynamic("dir")(dir.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxSize)) __obj.updateDynamic("maxSize")(maxSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindDefinition]
  }
}


package typings.oracledb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloseConnectionOptions extends js.Object {
  /**
    * If drop is false, then the connection is returned to the pool for reuse.
    *
    * If drop is true, the connection will be completely dropped from the connection pool
    *
    * @default false
    */
  var drop: Boolean
}

object CloseConnectionOptions {
  @scala.inline
  def apply(drop: Boolean): CloseConnectionOptions = {
    val __obj = js.Dynamic.literal(drop = drop.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseConnectionOptions]
  }
}


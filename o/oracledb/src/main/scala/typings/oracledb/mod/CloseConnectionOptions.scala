package typings.oracledb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloseConnectionOptions extends js.Object {
  /**
    * If drop is false, then the connection is returned to the pool for reuse.
    *
    * If drop is true, the connection will be completely dropped from the connection pool
    *
    * @default false
    */
  var drop: Boolean = js.native
}

object CloseConnectionOptions {
  @scala.inline
  def apply(drop: Boolean): CloseConnectionOptions = {
    val __obj = js.Dynamic.literal(drop = drop.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseConnectionOptions]
  }
  @scala.inline
  implicit class CloseConnectionOptionsOps[Self <: CloseConnectionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDrop(value: Boolean): Self = this.set("drop", value.asInstanceOf[js.Any])
  }
  
}


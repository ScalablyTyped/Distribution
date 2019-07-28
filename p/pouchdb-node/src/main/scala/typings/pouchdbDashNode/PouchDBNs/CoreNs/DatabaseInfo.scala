package typings.pouchdbDashNode.PouchDBNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatabaseInfo extends js.Object {
  /** The backend *DOWN adapter being used (MemDOWN, RiakDOWN, …). */
  var backend_adapter: js.UndefOr[String] = js.undefined
}

object DatabaseInfo {
  @scala.inline
  def apply(backend_adapter: String = null): DatabaseInfo = {
    val __obj = js.Dynamic.literal()
    if (backend_adapter != null) __obj.updateDynamic("backend_adapter")(backend_adapter)
    __obj.asInstanceOf[DatabaseInfo]
  }
}


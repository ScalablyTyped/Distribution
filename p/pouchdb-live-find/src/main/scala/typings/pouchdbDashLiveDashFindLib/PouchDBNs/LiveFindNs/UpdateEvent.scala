package typings
package pouchdbDashLiveDashFindLib.PouchDBNs.LiveFindNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateEvent extends js.Object {
  var action: pouchdbDashLiveDashFindLib.pouchdbDashLiveDashFindLibStrings.REMOVE | pouchdbDashLiveDashFindLib.pouchdbDashLiveDashFindLibStrings.ADD | pouchdbDashLiveDashFindLib.pouchdbDashLiveDashFindLibStrings.UPDATE
  var doc: js.Any
  var id: js.Any
  var rev: js.Any
}

object UpdateEvent {
  @scala.inline
  def apply(
    action: pouchdbDashLiveDashFindLib.pouchdbDashLiveDashFindLibStrings.REMOVE | pouchdbDashLiveDashFindLib.pouchdbDashLiveDashFindLibStrings.ADD | pouchdbDashLiveDashFindLib.pouchdbDashLiveDashFindLibStrings.UPDATE,
    doc: js.Any,
    id: js.Any,
    rev: js.Any
  ): UpdateEvent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], doc = doc, id = id, rev = rev)
  
    __obj.asInstanceOf[UpdateEvent]
  }
}


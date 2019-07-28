package typings.pouchdbDashLiveDashFind.PouchDBNs.LiveFindNs

import typings.pouchdbDashLiveDashFind.pouchdbDashLiveDashFindStrings.ADD
import typings.pouchdbDashLiveDashFind.pouchdbDashLiveDashFindStrings.REMOVE
import typings.pouchdbDashLiveDashFind.pouchdbDashLiveDashFindStrings.UPDATE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateEvent extends js.Object {
  var action: REMOVE | ADD | UPDATE
  var doc: js.Any
  var id: js.Any
  var rev: js.Any
}

object UpdateEvent {
  @scala.inline
  def apply(action: REMOVE | ADD | UPDATE, doc: js.Any, id: js.Any, rev: js.Any): UpdateEvent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], doc = doc, id = id, rev = rev)
  
    __obj.asInstanceOf[UpdateEvent]
  }
}


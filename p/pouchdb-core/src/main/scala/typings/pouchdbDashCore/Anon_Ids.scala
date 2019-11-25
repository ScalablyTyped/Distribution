package typings.pouchdbDashCore

import typings.pouchdbDashCore.PouchDB.Core.RevisionId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ids extends js.Object {
  var ids: js.Array[RevisionId]
  var start: Double
}

object Anon_Ids {
  @scala.inline
  def apply(ids: js.Array[RevisionId], start: Double): Anon_Ids = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Ids]
  }
}


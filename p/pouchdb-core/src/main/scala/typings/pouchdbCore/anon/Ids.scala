package typings.pouchdbCore.anon

import typings.pouchdbCore.PouchDB.Core.RevisionId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ids extends js.Object {
  var ids: js.Array[RevisionId]
  var start: Double
}

object Ids {
  @scala.inline
  def apply(ids: js.Array[RevisionId], start: Double): Ids = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ids]
  }
}


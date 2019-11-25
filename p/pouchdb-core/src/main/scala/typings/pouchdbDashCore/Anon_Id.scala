package typings.pouchdbDashCore

import typings.pouchdbDashCore.PouchDB.Core.DocumentId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  var _id: js.UndefOr[DocumentId] = js.undefined
}

object Anon_Id {
  @scala.inline
  def apply(_id: DocumentId = null): Anon_Id = {
    val __obj = js.Dynamic.literal()
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Id]
  }
}


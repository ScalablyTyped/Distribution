package typings.pouchdbCore.anon

import typings.pouchdbCore.PouchDB.Core.DocumentId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Id extends js.Object {
  var _id: js.UndefOr[DocumentId] = js.undefined
}

object Id {
  @scala.inline
  def apply(_id: DocumentId = null): Id = {
    val __obj = js.Dynamic.literal()
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
}


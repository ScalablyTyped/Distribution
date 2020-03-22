package typings.pouchdbUpsert

import typings.pouchdbCore.PouchDB.Core.DocumentId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<pouchdb-core.PouchDB.Core.IdMeta> */
trait PartialIdMeta extends js.Object {
  var _id: js.UndefOr[DocumentId] = js.undefined
}

object PartialIdMeta {
  @scala.inline
  def apply(_id: DocumentId = null): PartialIdMeta = {
    val __obj = js.Dynamic.literal()
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialIdMeta]
  }
}


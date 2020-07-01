package typings.pouchdbCore.anon

import typings.pouchdbCore.PouchDB.Core.AllDocsMeta
import typings.pouchdbCore.PouchDB.Core.DocumentId
import typings.pouchdbCore.PouchDB.Core.DocumentKey
import typings.pouchdbCore.PouchDB.Core.ExistingDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Doc[Content /* <: js.Object */] extends js.Object {
  /** Only present if `include_docs` was `true`. */
  var doc: js.UndefOr[ExistingDocument[Content with AllDocsMeta]] = js.undefined
  var id: DocumentId
  var key: DocumentKey
  var value: Deleted
}

object Doc {
  @scala.inline
  def apply[/* <: js.Object */ Content](
    id: DocumentId,
    key: DocumentKey,
    value: Deleted,
    doc: ExistingDocument[Content with AllDocsMeta] = null
  ): Doc[Content] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (doc != null) __obj.updateDynamic("doc")(doc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Doc[Content]]
  }
}


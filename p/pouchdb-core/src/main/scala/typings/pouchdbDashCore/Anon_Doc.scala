package typings.pouchdbDashCore

import typings.pouchdbDashCore.PouchDBNs.CoreNs.AllDocsMeta
import typings.pouchdbDashCore.PouchDBNs.CoreNs.DocumentId
import typings.pouchdbDashCore.PouchDBNs.CoreNs.DocumentKey
import typings.pouchdbDashCore.PouchDBNs.CoreNs.ExistingDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Doc[Content /* <: js.Object */] extends js.Object {
  /** Only present if `include_docs` was `true`. */
  var doc: js.UndefOr[ExistingDocument[Content with AllDocsMeta]] = js.undefined
  var id: DocumentId
  var key: DocumentKey
  var value: Anon_Deleted
}

object Anon_Doc {
  @scala.inline
  def apply[Content /* <: js.Object */](
    id: DocumentId,
    key: DocumentKey,
    value: Anon_Deleted,
    doc: ExistingDocument[Content with AllDocsMeta] = null
  ): Anon_Doc[Content] = {
    val __obj = js.Dynamic.literal(id = id, key = key, value = value)
    if (doc != null) __obj.updateDynamic("doc")(doc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Doc[Content]]
  }
}


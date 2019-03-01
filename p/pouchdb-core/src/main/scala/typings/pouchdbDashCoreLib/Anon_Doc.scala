package typings
package pouchdbDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Doc[Content /* <: js.Object */] extends js.Object {
  /** Only present if `include_docs` was `true`. */
  var doc: js.UndefOr[
    pouchdbDashCoreLib.PouchDBNs.CoreNs.ExistingDocument[Content with pouchdbDashCoreLib.PouchDBNs.CoreNs.AllDocsMeta]
  ] = js.undefined
  var id: pouchdbDashCoreLib.PouchDBNs.CoreNs.DocumentId
  var key: pouchdbDashCoreLib.PouchDBNs.CoreNs.DocumentKey
  var value: Anon_Deleted
}

object Anon_Doc {
  @scala.inline
  def apply[Content /* <: js.Object */](
    id: pouchdbDashCoreLib.PouchDBNs.CoreNs.DocumentId,
    key: pouchdbDashCoreLib.PouchDBNs.CoreNs.DocumentKey,
    value: Anon_Deleted,
    doc: pouchdbDashCoreLib.PouchDBNs.CoreNs.ExistingDocument[Content with pouchdbDashCoreLib.PouchDBNs.CoreNs.AllDocsMeta] = null
  ): Anon_Doc[Content] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("value")(value)
    if (doc != null) __obj.updateDynamic("doc")(doc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Doc[Content]]
  }
}


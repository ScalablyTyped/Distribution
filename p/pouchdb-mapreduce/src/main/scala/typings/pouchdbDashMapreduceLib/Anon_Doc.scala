package typings
package pouchdbDashMapreduceLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Doc[Content /* <: js.Object */] extends js.Object {
  var doc: js.UndefOr[
    pouchdbDashCoreLib.PouchDBNs.CoreNs.ExistingDocument[Content with pouchdbDashCoreLib.PouchDBNs.CoreNs.AllDocsMeta]
  ] = js.undefined
  var id: js.Any
  var key: js.Any
  var value: js.Any
}

object Anon_Doc {
  @scala.inline
  def apply[Content /* <: js.Object */](
    id: js.Any,
    key: js.Any,
    value: js.Any,
    doc: pouchdbDashCoreLib.PouchDBNs.CoreNs.ExistingDocument[Content with pouchdbDashCoreLib.PouchDBNs.CoreNs.AllDocsMeta] = null
  ): Anon_Doc[Content] = {
    val __obj = js.Dynamic.literal(id = id, key = key, value = value)
    if (doc != null) __obj.updateDynamic("doc")(doc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Doc[Content]]
  }
}


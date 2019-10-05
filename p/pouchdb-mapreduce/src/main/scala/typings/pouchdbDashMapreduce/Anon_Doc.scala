package typings.pouchdbDashMapreduce

import typings.pouchdbDashCore.PouchDB.Core.AllDocsMeta
import typings.pouchdbDashCore.PouchDB.Core.ExistingDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Doc[Content /* <: js.Object */] extends js.Object {
  var doc: js.UndefOr[ExistingDocument[Content with AllDocsMeta]] = js.undefined
  var id: js.Any
  var key: js.Any
  var value: js.Any
}

object Anon_Doc {
  @scala.inline
  def apply[Content /* <: js.Object */](id: js.Any, key: js.Any, value: js.Any, doc: ExistingDocument[Content with AllDocsMeta] = null): Anon_Doc[Content] = {
    val __obj = js.Dynamic.literal(id = id, key = key, value = value)
    if (doc != null) __obj.updateDynamic("doc")(doc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Doc[Content]]
  }
}


package typings.pouchdbMapreduce.anon

import typings.pouchdbCore.PouchDB.Core.AllDocsMeta
import typings.pouchdbCore.PouchDB.Core.ExistingDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Doc[Content /* <: js.Object */] extends js.Object {
  var doc: js.UndefOr[ExistingDocument[Content with AllDocsMeta]] = js.undefined
  var id: js.Any
  var key: js.Any
  var value: js.Any
}

object Doc {
  @scala.inline
  def apply[/* <: js.Object */ Content](id: js.Any, key: js.Any, value: js.Any, doc: ExistingDocument[Content with AllDocsMeta] = null): Doc[Content] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (doc != null) __obj.updateDynamic("doc")(doc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Doc[Content]]
  }
}


package typings.nano.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Doc[V] extends js.Object {
  var doc: js.UndefOr[V] = js.undefined
  var fields: js.Object
  var id: String
  var key: String
  var order: js.Array[Double]
}

object Doc {
  @scala.inline
  def apply[V](fields: js.Object, id: String, key: String, order: js.Array[Double], doc: V = null): Doc[V] = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
    if (doc != null) __obj.updateDynamic("doc")(doc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Doc[V]]
  }
}


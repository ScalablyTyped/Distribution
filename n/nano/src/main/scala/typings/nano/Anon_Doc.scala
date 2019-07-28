package typings.nano

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Doc[V] extends js.Object {
  var doc: js.UndefOr[V] = js.undefined
  var fields: js.Object
  var id: String
  var key: String
  var order: js.Array[Double]
}

object Anon_Doc {
  @scala.inline
  def apply[V](fields: js.Object, id: String, key: String, order: js.Array[Double], doc: V = null): Anon_Doc[V] = {
    val __obj = js.Dynamic.literal(fields = fields, id = id, key = key, order = order)
    if (doc != null) __obj.updateDynamic("doc")(doc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Doc[V]]
  }
}


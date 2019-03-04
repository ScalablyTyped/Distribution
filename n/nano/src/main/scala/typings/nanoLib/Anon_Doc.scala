package typings
package nanoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Doc[V] extends js.Object {
  var doc: js.UndefOr[V] = js.undefined
  var fields: js.Object
  var id: java.lang.String
  var key: java.lang.String
  var order: js.Array[scala.Double]
}

object Anon_Doc {
  @scala.inline
  def apply[V](
    fields: js.Object,
    id: java.lang.String,
    key: java.lang.String,
    order: js.Array[scala.Double],
    doc: V = null
  ): Anon_Doc[V] = {
    val __obj = js.Dynamic.literal(fields = fields, id = id, key = key, order = order)
    if (doc != null) __obj.updateDynamic("doc")(doc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Doc[V]]
  }
}


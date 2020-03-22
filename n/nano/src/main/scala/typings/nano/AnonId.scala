package typings.nano

import typings.nano.mod.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonId[V, D] extends js.Object {
  var doc: js.UndefOr[D with Document] = js.undefined
  var id: String
  var key: String
  var value: V
}

object AnonId {
  @scala.inline
  def apply[V, D](id: String, key: String, value: V, doc: D with Document = null): AnonId[V, D] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (doc != null) __obj.updateDynamic("doc")(doc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonId[V, D]]
  }
}


package typings
package nanoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DocId[V, D] extends js.Object {
  var doc: js.UndefOr[D with nanoLib.nanoMod.Document] = js.undefined
  var id: java.lang.String
  var key: java.lang.String
  var value: V
}

object Anon_DocId {
  @scala.inline
  def apply[V, D](id: java.lang.String, key: java.lang.String, value: V, doc: D with nanoLib.nanoMod.Document = null): Anon_DocId[V, D] = {
    val __obj = js.Dynamic.literal(id = id, key = key, value = value.asInstanceOf[js.Any])
    if (doc != null) __obj.updateDynamic("doc")(doc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DocId[V, D]]
  }
}


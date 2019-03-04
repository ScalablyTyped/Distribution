package typings
package parseLib.ParseNs.OpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Relation
  extends parseLib.ParseNs.IBaseObject {
  var removed: js.Array[parseLib.ParseNs.Object]
  def added(): js.Array[parseLib.ParseNs.Object]
}

object Relation {
  @scala.inline
  def apply(
    added: js.Function0[js.Array[parseLib.ParseNs.Object]],
    removed: js.Array[parseLib.ParseNs.Object],
    toJSON: js.Function0[js.Any]
  ): Relation = {
    val __obj = js.Dynamic.literal(added = added, removed = removed, toJSON = toJSON)
  
    __obj.asInstanceOf[Relation]
  }
}


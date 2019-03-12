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
    added: () => js.Array[parseLib.ParseNs.Object],
    removed: js.Array[parseLib.ParseNs.Object],
    toJSON: () => js.Any
  ): Relation = {
    val __obj = js.Dynamic.literal(added = js.Any.fromFunction0(added), removed = removed, toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[Relation]
  }
}


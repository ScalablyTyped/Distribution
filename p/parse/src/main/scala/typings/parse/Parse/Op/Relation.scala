package typings.parse.Parse.Op

import typings.parse.Parse.Attributes
import typings.parse.Parse.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Relation extends js.Object {
  var removed: js.Array[Object[Attributes]]
  def added(): js.Array[Object[Attributes]]
  def toJSON(): js.Any
}

object Relation {
  @scala.inline
  def apply(
    added: () => js.Array[Object[Attributes]],
    removed: js.Array[Object[Attributes]],
    toJSON: () => js.Any
  ): Relation = {
    val __obj = js.Dynamic.literal(added = js.Any.fromFunction0(added), removed = removed.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[Relation]
  }
}


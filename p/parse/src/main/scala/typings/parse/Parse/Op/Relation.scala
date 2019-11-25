package typings.parse.Parse.Op

import typings.parse.Parse.IBaseObject
import typings.parse.Parse.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Relation extends IBaseObject {
  var removed: js.Array[Object[_]]
  def added(): js.Array[Object[_]]
}

object Relation {
  @scala.inline
  def apply(added: () => js.Array[Object[_]], removed: js.Array[Object[_]], toJSON: () => js.Any): Relation = {
    val __obj = js.Dynamic.literal(added = js.Any.fromFunction0(added), removed = removed.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[Relation]
  }
}


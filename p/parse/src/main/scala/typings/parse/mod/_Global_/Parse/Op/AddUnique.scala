package typings.parse.mod._Global_.Parse.Op

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddUnique extends BaseOperation {
  def toJSON(): js.Any
}

object AddUnique {
  @scala.inline
  def apply(objects: () => js.Array[_], toJSON: () => js.Any): AddUnique = {
    val __obj = js.Dynamic.literal(objects = js.Any.fromFunction0(objects), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[AddUnique]
  }
}


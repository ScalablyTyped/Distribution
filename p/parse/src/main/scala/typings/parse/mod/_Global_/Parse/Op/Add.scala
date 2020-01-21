package typings.parse.mod._Global_.Parse.Op

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Add extends BaseOperation {
  def toJSON(): js.Any
}

object Add {
  @scala.inline
  def apply(objects: () => js.Array[_], toJSON: () => js.Any): Add = {
    val __obj = js.Dynamic.literal(objects = js.Any.fromFunction0(objects), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[Add]
  }
}


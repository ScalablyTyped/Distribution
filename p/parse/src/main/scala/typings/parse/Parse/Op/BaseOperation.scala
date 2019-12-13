package typings.parse.Parse.Op

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseOperation extends js.Object {
  def objects(): js.Array[_]
}

object BaseOperation {
  @scala.inline
  def apply(objects: () => js.Array[_]): BaseOperation = {
    val __obj = js.Dynamic.literal(objects = js.Any.fromFunction0(objects))
  
    __obj.asInstanceOf[BaseOperation]
  }
}


package typings.parse.Parse.Op

import typings.parse.Parse.IBaseObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseOperation extends IBaseObject {
  def objects(): js.Array[_]
}

object BaseOperation {
  @scala.inline
  def apply(objects: () => js.Array[_], toJSON: () => js.Any): BaseOperation = {
    val __obj = js.Dynamic.literal(objects = js.Any.fromFunction0(objects), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[BaseOperation]
  }
}


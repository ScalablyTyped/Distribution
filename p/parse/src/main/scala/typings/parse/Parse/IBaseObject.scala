package typings.parse.Parse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBaseObject extends js.Object {
  def toJSON(): js.Any
}

object IBaseObject {
  @scala.inline
  def apply(toJSON: () => js.Any): IBaseObject = {
    val __obj = js.Dynamic.literal(toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[IBaseObject]
  }
}


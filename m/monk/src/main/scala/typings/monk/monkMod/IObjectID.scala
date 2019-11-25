package typings.monk.monkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectID extends js.Object {
  def toHexString(): String
}

object IObjectID {
  @scala.inline
  def apply(toHexString: () => String): IObjectID = {
    val __obj = js.Dynamic.literal(toHexString = js.Any.fromFunction0(toHexString))
  
    __obj.asInstanceOf[IObjectID]
  }
}


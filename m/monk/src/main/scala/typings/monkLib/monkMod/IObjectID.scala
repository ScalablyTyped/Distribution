package typings
package monkLib.monkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectID extends js.Object {
  def toHexString(): java.lang.String
}

object IObjectID {
  @scala.inline
  def apply(toHexString: () => java.lang.String, toString: () => java.lang.String): IObjectID = {
    val __obj = js.Dynamic.literal(toHexString = js.Any.fromFunction0(toHexString), toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[IObjectID]
  }
}


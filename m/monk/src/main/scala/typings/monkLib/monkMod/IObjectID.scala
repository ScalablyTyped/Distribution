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
  def apply(toHexString: js.Function0[java.lang.String], toString: js.Function0[java.lang.String]): IObjectID = {
    val __obj = js.Dynamic.literal(toHexString = toHexString, toString = toString)
  
    __obj.asInstanceOf[IObjectID]
  }
}


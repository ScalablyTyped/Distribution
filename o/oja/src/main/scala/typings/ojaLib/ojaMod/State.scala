package typings
package ojaLib.ojaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var pending: js.Array[java.lang.String]
  var queue: js.Array[java.lang.String]
}

object State {
  @scala.inline
  def apply(pending: js.Array[java.lang.String], queue: js.Array[java.lang.String]): State = {
    val __obj = js.Dynamic.literal(pending = pending, queue = queue)
  
    __obj.asInstanceOf[State]
  }
}


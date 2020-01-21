package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAttached extends js.Object {
  def attached(param0: js.Object): Unit
}

object AnonAttached {
  @scala.inline
  def apply(attached: js.Object => Unit): AnonAttached = {
    val __obj = js.Dynamic.literal(attached = js.Any.fromFunction1(attached))
  
    __obj.asInstanceOf[AnonAttached]
  }
}


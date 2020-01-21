package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAttachedParam0 extends js.Object {
  def attached(param0: String): Unit
}

object AnonAttachedParam0 {
  @scala.inline
  def apply(attached: String => Unit): AnonAttachedParam0 = {
    val __obj = js.Dynamic.literal(attached = js.Any.fromFunction1(attached))
  
    __obj.asInstanceOf[AnonAttachedParam0]
  }
}


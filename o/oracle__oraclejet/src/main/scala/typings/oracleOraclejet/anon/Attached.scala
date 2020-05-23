package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attached extends js.Object {
  def attached(param0: js.Object): Unit
}

object Attached {
  @scala.inline
  def apply(attached: js.Object => Unit): Attached = {
    val __obj = js.Dynamic.literal(attached = js.Any.fromFunction1(attached))
    __obj.asInstanceOf[Attached]
  }
}


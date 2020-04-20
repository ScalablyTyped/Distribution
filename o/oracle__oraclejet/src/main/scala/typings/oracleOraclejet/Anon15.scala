package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon15 extends js.Object {
  def attached(param0: String): Unit
}

object Anon15 {
  @scala.inline
  def apply(attached: String => Unit): Anon15 = {
    val __obj = js.Dynamic.literal(attached = js.Any.fromFunction1(attached))
    __obj.asInstanceOf[Anon15]
  }
}


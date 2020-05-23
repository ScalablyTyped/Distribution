package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `15` extends js.Object {
  def attached(param0: String): Unit
}

object `15` {
  @scala.inline
  def apply(attached: String => Unit): `15` = {
    val __obj = js.Dynamic.literal(attached = js.Any.fromFunction1(attached))
    __obj.asInstanceOf[`15`]
  }
}


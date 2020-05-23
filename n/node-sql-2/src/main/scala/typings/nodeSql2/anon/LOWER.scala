package typings.nodeSql2.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LOWER extends js.Object {
  def LOWER[Name](c: typings.nodeSql2.mod.Column[Name, String]): typings.nodeSql2.mod.Column[Name, String]
}

object LOWER {
  @scala.inline
  def apply(LOWER: typings.nodeSql2.mod.Column[js.Any, String] => typings.nodeSql2.mod.Column[js.Any, String]): LOWER = {
    val __obj = js.Dynamic.literal(LOWER = js.Any.fromFunction1(LOWER))
    __obj.asInstanceOf[LOWER]
  }
}

